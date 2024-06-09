/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puntoventa.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dbpan
 */
public class clientes {

    private String ced_cliente;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String telefono;
    private String direccion;

    public clientes() {
    }

    public clientes(String ced_cliente, String nombre, String apellido, int edad, String correo, String telefono, String direccion) {
        this.ced_cliente = ced_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCed_cliente() {
        return ced_cliente;
    }

    public void setCed_cliente(String ced_cliente) {
        this.ced_cliente = ced_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // Método para insertar un cliente en la base de datos

    public int insertCliente(Connection conexion) {
        String query = "INSERT INTO tbl_cliente (ced_cliente, Nombre, apellido, Edad, email, telefono, direccion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, this.ced_cliente);
            statement.setString(2, this.nombre);
            statement.setString(3, this.apellido);
            statement.setInt(4, this.edad);
            statement.setString(5, this.correo);
            statement.setString(6, this.telefono);
            statement.setString(7, this.direccion);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

}
