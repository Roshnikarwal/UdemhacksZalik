package udemhacksZalik.Zalik.Services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import udemhacksZalik.Zalik.models.Doctor;
import udemhacksZalik.Zalik.models.Patient;

import java.util.List;


public class ClinicsServices {
    private final JdbcTemplate jdbcTemplate;

    public ClinicsServices(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Doctor> getAllDoctors() {
        String sql = "SELECT * FROM doctors";
        List<Patient> currentPatients = jdbcTemplate.query(sql,rs -> {new List<Patient>()});
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Doctor(
                rs.getInt("doctorId"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("clinic"),
                rs.getString("phone"),
                rs.getString("clinic_adress"),
               currentPatients,
                rs.getBoolean("is_available")
        ));
    }

}
