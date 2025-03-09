package udemhacksZalik.Zalik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udemhacksZalik.Zalik.Controllers.GeminiController;

@SpringBootApplication
public class ZalikApplication {
	public static GeminiController bob;

	public static void main(String[] args) {
		SpringApplication.run(ZalikApplication.class, args);
	}

}
