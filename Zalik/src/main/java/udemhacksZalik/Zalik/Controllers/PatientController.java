package udemhacksZalik.Zalik.Controllers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import udemhacksZalik.Zalik.models.Patient;
import java.util.List;
import udemhacksZalik.Zalik.models.UserService;

public class PatientController {
    private UserService userService;

    public List<Patient> getPatients() {
        String sql = "SELECT * FROM patients";
        return userService.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Patient.class));
    }
}
