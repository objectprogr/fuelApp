package com.fuel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

@RestController
public class Connection {
//    Statement statement = null;

@RequestMapping(value = "/conn")
    public void conn() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");

            java.sql.Connection connection = null;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/server2016","postgres", "xxx");

//            String selectTableSQL = "SELECT * FROM public.tankowanie";
//            statement = connection.createStatement();
//
//            System.out.println(selectTableSQL);
//
//            // wykonywanie SQL
////            statement.setFetchSize(100);
//            ResultSet rs = statement.executeQuery(selectTableSQL);
//            while(rs.next()){
//                String data = rs.getString(1);
//                String rodzaj = rs.getString(2);
//                double kwota = rs.getDouble(3);
//                System.out.println(data + "\t" + rodzaj + "\t" + kwota + " zł");
//            }
//            rs.close();

            connection.close();
            System.out.println("Connection!");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
            System.out.append("Nie masz sterownika");
        }
        catch (SQLException e )
        {
            e.printStackTrace();
            System.out.append("Zle dane");
        }
    }
    }

