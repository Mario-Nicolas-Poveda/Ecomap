/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mario
 */
public class Localizacion {
    private double latitud;
    private double longitud;
    private String direccion;

    public Localizacion(double latitud, double longitud, String direccion) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
    }

    public void mostrarUbicacion() {
        System.out.println("\nUbicacion:");
        System.out.println("Direccion: " + direccion);
        System.out.println("Coordenadas: " + latitud + ", " + longitud);
    }

    public double getLatitud() { 
        return latitud; 
    }
    
    public double getLongitud() {
        return longitud; 
    }
    
    public String getDireccion() {
        return direccion; 
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
