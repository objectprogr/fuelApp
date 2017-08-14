package com.fuel;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import java.sql.DriverManager;
import java.sql.SQLException;


@SpringBootApplication
@EncryptablePropertySource(name = "EncryptedProperties", value = "classpath:encrypted.properties")
@EnableEncryptableProperties
@RestController
public class Connection {
//    Statement statement = null;

    @Autowired
    ApplicationContext apctx;

    @RequestMapping(value = "/conn")
    public void conn() throws SQLException {
        try {
            Environment environment = apctx.getEnvironment();
            Class.forName("org.postgresql.Driver");

            java.sql.Connection connection = null;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/server2016", "postgres", environment.getProperty("secret.property"));

            connection.close();
            System.out.println("Connection!");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
            System.out.append("Nie masz sterownika");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.append("Zle dane");
        }
    }
}

