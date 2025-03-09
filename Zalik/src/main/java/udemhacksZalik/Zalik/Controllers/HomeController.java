package udemhacksZalik.Zalik.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Refers to src/main/resources/templates/index.html
    }

    @GetMapping("/login")
    public String login() {
        return "index";
    }

    @GetMapping("/doctor")
    public String doctor() {
        return "doctor-page";
    }

    @GetMapping("/patient")
    public String patient() {
        return "patient-page";
    }

}