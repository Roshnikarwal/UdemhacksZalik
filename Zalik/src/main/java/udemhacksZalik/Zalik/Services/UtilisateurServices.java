package udemhacksZalik.Zalik.Services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class UtilisateurServices {
    private final JdbcTemplate jdbcTemplate;

    public UtilisateurServices(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public User verifyUser()
}
