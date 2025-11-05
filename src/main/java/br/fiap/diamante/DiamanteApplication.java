package br.fiap.diamante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiamanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiamanteApplication.class, args);
	}
}
