package com.application.api;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.application.api.entity.FormationEntity;
import com.application.api.repository.FormationRepository;

@SpringBootApplication
public class ServiceFormationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFormationApplication.class, args);
	}

	@Bean
	CommandLineRunner start (FormationRepository formationRepository) {
		
		return args -> {
			
			formationRepository.save(new FormationEntity(null, "JAVA", "java JEE", new Date(), new Date(), "33456 DH", false));
			formationRepository.save(new FormationEntity(null, "PHP", "Larave", new Date(), new Date(), "33456 DH", false));
			formationRepository.save(new FormationEntity(null, "Javascript", "VueJs", new Date(), new Date(), "33456 DH", false));
			
		};
	}
	 

}
