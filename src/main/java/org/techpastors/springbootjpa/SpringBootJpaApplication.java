package org.techpastors.springbootjpa;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.techpastors.springbootjpa.model.Automobile;
import org.techpastors.springbootjpa.repository.AutomobileRepository;

@SpringBootApplication
public class SpringBootJpaApplication {

    @Bean
    ApplicationRunner runner(AutomobileRepository repository) {
        return args -> {
            Automobile a = new Automobile(1001, "Audi", "SUV");
            repository.save(a);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

}
