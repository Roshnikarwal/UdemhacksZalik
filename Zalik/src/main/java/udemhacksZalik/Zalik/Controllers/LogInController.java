package udemhacksZalik.Zalik.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import udemhacksZalik.Zalik.models.Patient;
import udemhacksZalik.Zalik.models.Doctor;
import udemhacksZalik.Zalik.Controllers.PatientController;
import udemhacksZalik.Zalik.Controllers.DoctorController;

@RestController
@RequestMapping("/auth")
public class LogInController {
    private PatientController pController = new PatientController(new JdbcTemplate());
    private DoctorController dController = new DoctorController(new JdbcTemplate());
    private List<Patient> patientList = pController.getPatients();
    private List<Doctor> doctorList = dController.getDoctors();
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        // Extract data from the request
        String email = request.getEmail();
        String password = request.getPassword();
        String role = request.getRole();

        // Validate the input
        if (email == null || email.isEmpty() || password == null || password.isEmpty() || role == null || role.isEmpty()) {
            return ResponseEntity.badRequest().body("Email, password, and role are required.");
        }

        // Authenticate the user based on role
        boolean isAuthenticated = false;
        if ("patient".equalsIgnoreCase(role)) {
            isAuthenticated = authenticateUser(email, password, patientList);
        } else if ("doctor".equalsIgnoreCase(role)) {
            isAuthenticated = authenticateUser(email, password, doctorList);
        } else {
            return ResponseEntity.badRequest().body("Invalid role. Role must be 'patient' or 'doctor'.");
        }

        if (isAuthenticated) {
            // If authenticated, return a success response
            String token = generateToken(email); // Generate a token (dummy implementation)
            AuthResponse authResponse = new AuthResponse(token, role);
            return ResponseEntity.ok(authResponse);
        } else {
            // If authentication fails, return an error response
            return ResponseEntity.status(401).body("Invalid email, password, or role.");
        }
    }

    // Generic method to authenticate user against a list of users
    private <T> boolean authenticateUser(String email, String password, List<T> users) {
        for (T user : users) {
            if (user instanceof Patient) {
                Patient patient = (Patient) user;
                if (patient.getEmail().equals(email) && patient.getPassword().equals(password)) {
                    return true;
                }
            } else if (user instanceof Doctor) {
                Doctor doctor = (Doctor) user;
                if (doctor.getEmail().equals(email) && doctor.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Dummy token generation (replace with JWT or similar)
    private String generateToken(String email) {
        return "dummy-token-for-" + email;
    }
}

class LoginRequest {
    private String email;
    private String password;
    private String role;

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

class AuthResponse {
    private String token;
    private String role;

    // Constructor
    public AuthResponse(String token, String role) {
        this.token = token;
        this.role = role;
    }

    // Getters and Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}