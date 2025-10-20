package com.ilyas.Conference_service;

import com.ilyas.Conference_service.entities.Conference;
import com.ilyas.Conference_service.enums.Type;
import com.ilyas.Conference_service.respository.ConferenceRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConferenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ConferenceRepo conferenceRepo) {
		return args -> {
			conferenceRepo.save(new Conference().builder()
					.title("Microservices Architecture")
					.date(java.time.LocalDateTime.now().plusDays(10))
					.type(Type.ACADEMIC)
					.duration(120L)
					.participantNumber(150L)
					.score(0L)
					.build());
			conferenceRepo.save(new Conference().builder().title("Cloud Computing Trends")
					.date(java.time.LocalDateTime.now().plusDays(20))
					.type(Type.ACADEMIC)
					.duration(90L)
					.participantNumber(200L)
					.score(0L)
					.build());

			conferenceRepo.save(new Conference().builder().title("AI in Healthcare")
					.date(java.time.LocalDateTime.now().plusDays(15))
					.type(Type.COMMERCIAL)
					.duration(60L)
					.participantNumber(300L)
					.score(0L)
					.build());

			System.out.println("************ All Conferences ************");
			conferenceRepo.findAll().forEach(System.out::println);

			System.out.println("************ Academic Conferences ************");
			conferenceRepo.findAllByType(Type.ACADEMIC).forEach(System.out::println);

			System.out.println("************ Conferences with more than 180 participants ************");
			conferenceRepo.findAllByParticipantNumberGreaterThan(180L).forEach(System.out::println);
		};
	}
}
