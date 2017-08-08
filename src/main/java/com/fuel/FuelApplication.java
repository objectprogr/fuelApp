package com.fuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class FuelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelApplication.class, args);
//		Connection connection = new Connection();
//        try {
//            connection.conn();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        TestMapping tm = new TestMapping();
//        tm.sum();
    }
}
