package dev.graczykmateusz.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dev.graczykmateusz.presentation")
@EnableJpaRepositories(basePackages="dev.graczykmateusz.domain")
@EntityScan(basePackages="dev.graczykmateusz.domain")
public class CompanyParkingSystemApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CompanyParkingSystemApplication.class, args);
    }
    
}
