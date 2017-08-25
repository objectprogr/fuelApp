package com.fuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@SpringBootApplication
@RestController
public class FuelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelApplication.class, args);
    }
}
