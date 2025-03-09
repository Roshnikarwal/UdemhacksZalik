package udemhacksZalik.Zalik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udemhacksZalik.Zalik.Controllers.PatientController;

@SpringBootApplication
public class ZalikApplication {
	public static PatientController patientController;
	public static void main(String[] args) {
		SpringApplication.run(ZalikApplication.class, args);
		patientController = new PatientController();
		System.out.println(patientController.getPatients());
	}


}
