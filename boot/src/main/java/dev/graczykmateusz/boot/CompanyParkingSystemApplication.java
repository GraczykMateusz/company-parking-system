package dev.graczykmateusz.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dev.graczykmateusz.presentation")
@ComponentScan(basePackages = "dev.graczykmateusz.infrastructure")
@EnableJpaRepositories(basePackages="dev.graczykmateusz.infrastructure")
@EntityScan(basePackages="dev.graczykmateusz.domain")
public class CompanyParkingSystemApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CompanyParkingSystemApplication.class, args);
    }
    
}
