package udemhacksZalik.Zalik.Controllers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import udemhacksZalik.Zalik.models.Doctor;
import java.util.List;

import udemhacksZalik.Zalik.models.Patient;
import udemhacksZalik.Zalik.models.UserService;

public class DoctorController {
    private UserService userService;
    public DoctorController(JdbcTemplate bob) {
        this.userService = new UserService(bob);
    }

    public List<Doctor> getDoctors() {
        String sql = "SELECT * FROM doctors";
        return userService.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Doctor.class));
    }
}
