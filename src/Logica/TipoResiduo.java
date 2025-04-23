/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mario
 */
public class TipoResiduo {
    private String nombre;
    private String descripcion;
    private String nivelRiesgo;

    public TipoResiduo(String nombre, String descripcion, String nivelRiesgo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
    }

    public void mostrarDetalles() {
        System.out.println("\nTipo de Residuo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Nivel de Riesgo: " + nivelRiesgo);
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion; 
    }
    
    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
    
    
}
