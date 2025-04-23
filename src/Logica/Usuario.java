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
    private static int contadorUsuarios = 1;

    public Usuario(String nombre, String email, String contrasena) {
        super();
        this.id = "USR-" + contadorUsuarios++;
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

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public static void setContadorUsuarios(int contadorUsuarios) {
        Usuario.contadorUsuarios = contadorUsuarios;
    }
    
}
