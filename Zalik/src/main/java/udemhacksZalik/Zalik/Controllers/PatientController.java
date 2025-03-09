package udemhacksZalik.Zalik.Controllers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sqlite.JDBC;
import udemhacksZalik.Zalik.Services.PatientService;
import udemhacksZalik.Zalik.models.Patient;
import java.util.List;
import udemhacksZalik.Zalik.models.UserService;

@Controller
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/view-patients")
    public String getPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "view-patients-list";
    }
}
