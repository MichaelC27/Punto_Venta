package com.puntoventa.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestConexion {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // Establecer la conexión
            con = conexion.getConnection();
            
            // Verificar si la conexión se estableció correctamente
            if (con != null) {
                System.out.println("¡Conexión exitosa!");

                // Ejecutar una consulta simple para verificar la conexión
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1");
                if (rs.next()) {
                    System.out.println("Consulta ejecutada correctamente");
                } else {
                    System.out.println("Error al ejecutar la consulta");
                }
            } else {
                System.out.println("¡Error al conectar a la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
