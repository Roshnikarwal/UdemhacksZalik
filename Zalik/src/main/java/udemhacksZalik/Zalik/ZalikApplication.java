package udemhacksZalik.Zalik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udemhacksZalik.Zalik.Controllers.PatientController;
import udemhacksZalik.Zalik.config.DataSourceConfig;

@SpringBootApplication
public class ZalikApplication {
	public static DataSourceConfig dataSourceConfig;
	public static PatientController patientController;
	public static void main(String[] args) {
		SpringApplication.run(ZalikApplication.class, args);
		dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.dataSource();

		patientController = new PatientController(dataSourceConfig.jdbcTemplate());
		System.out.println(patientController.getPatients());
	}


}
