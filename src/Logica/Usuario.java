/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Logica.Entidad;

/**
 *
 * @author mario
 */
public class Usuario extends Entidad {
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(String id, String nombre, String email, String contrasena) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformacion de Usuario");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Fecha Registro: " + fechaCreacion);
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getEmail() {
        return email; 
    }
    
    public String getContrasena() {
        return contrasena; 
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
}
