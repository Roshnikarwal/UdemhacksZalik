package udemhacksZalik.Zalik.models;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {
    public final JdbcTemplate jdbcTemplate;

    public UserService(JdbcTemplate bob) {
        jdbcTemplate = bob;
    }

}
