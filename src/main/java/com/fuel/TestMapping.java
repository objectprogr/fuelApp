package com.fuel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

@RestController
public class TestMapping {

    @RequestMapping(value = "/fuel", method = RequestMethod.GET)
    public String printDatabaseFuel() throws SQLException {
        Statement statement = null;
        Connection connection = new Connection();

        String selectTableSQL = "SELECT * FROM public.tankowanie";
//            statement = connection.createStatement;

//            System.out.println(selectTableSQL);

            // wykonywanie SQL
//            statement.setFetchSize(100);
            ResultSet rs = statement.executeQuery(selectTableSQL);
            while(rs.next()){
                String data = rs.getString(1);
                String rodzaj = rs.getString(2);
                double kwota = rs.getDouble(3);
//                System.out.println(data + "\t" + rodzaj + "\t" + kwota + " zł");
                String print = data + "\t" + rodzaj + "\t" + kwota + " zł";
            }
            rs.close();
        return String.valueOf(rs);
    }
}
