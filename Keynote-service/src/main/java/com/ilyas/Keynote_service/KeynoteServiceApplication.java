package com.ilyas.Keynote_service;

import com.ilyas.Keynote_service.entities.Keynote;
import com.ilyas.Keynote_service.repository.KeynoteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepo keynoteRepo) {
        return args -> {
            keynoteRepo.save(Keynote.builder().firstName("ilyas").lastName("grid").email("ilyas@grid.com").profession("student").build());
            keynoteRepo.save(Keynote.builder().firstName("Ismail").lastName("Zabiri").email("test@example.com").profession("Footballer").build());
            keynoteRepo.save(Keynote.builder().firstName("Mohammed").lastName("Youssfi").email("youssefi@enset.ma").profession("professor").build());

            System.out.println("*************************");
            keynoteRepo.findAll().forEach(System.out::println);
        };
    }
}
