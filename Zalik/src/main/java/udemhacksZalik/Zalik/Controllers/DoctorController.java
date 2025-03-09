package udemhacksZalik.Zalik.Controllers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import udemhacksZalik.Zalik.models.Doctor;
import java.util.List;

import udemhacksZalik.Zalik.models.Patient;
import udemhacksZalik.Zalik.models.UserService;

public class DoctorController {
    private UserService userService;

    public List<Doctor> getPatients() {
        String sql = "SELECT * FROM doctors";
        return userService.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Doctor.class));
    }
}
