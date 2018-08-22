package pl.superfarmer.game.superfarmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties")
public class SuperFarmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperFarmerApplication.class, args);
	}
}
