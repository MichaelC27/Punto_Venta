package com.puntoventa.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    public static Connection getConnection() {
        Connection con = null;
        String dbName = "db_puntoVenta";
        String user = "root";
        String password = "dbpanama27";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + dbName + "?useSSL=false";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("¡Conexión exitosa!"); // Se imprime si la conexión es exitosa
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace(); // Se imprime la traza del error en la consola
        }

        return con;
    }

}
