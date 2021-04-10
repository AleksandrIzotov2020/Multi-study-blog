package ru.izotov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.izotov.*"})
//@ComponentScan(basePackages = {"org.izotov.*"})
@EntityScan(basePackages = {"org.izotov.*"})
@EnableJpaRepositories(basePackages = {"org.izotov.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
