package udemhacksZalik.Zalik.Services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import udemhacksZalik.Zalik.models.Patient;

import java.util.List;

@Service
public class PatientService {

    private final JdbcTemplate jdbcTemplate;

    public PatientService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Patient> getAllPatients() {
        String sql = "SELECT * FROM patients";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Patient(
                rs.getInt("patientId"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getBoolean("has_a_doctor"),
                rs.getString("postal_code"),
                rs.getInt("doctorId")
        ));
    }
}
