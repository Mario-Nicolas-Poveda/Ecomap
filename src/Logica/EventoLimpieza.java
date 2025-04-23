/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Logica.Entidad;
import java.util.Date;

/**
 *
 * @author mario
 */
public class EventoLimpieza extends Entidad {
    private Localizacion ubicacion;
    private Date fechaEvento;
    private String estado;
    private static int contadorEventos = 1;

    public EventoLimpieza(Localizacion ubicacion, Date fechaEvento) {
        super();
        this.id = "EVT-" + contadorEventos++;
        this.ubicacion = ubicacion;
        this.fechaEvento = fechaEvento;
        this.estado = "Planificado";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n Detalles de Evento");
        System.out.println("ID: " + id);
        System.out.println("Fecha Creacion: " + fechaCreacion);
        System.out.println("Fecha Evento: " + fechaEvento);
        System.out.println("Estado: " + estado);
        ubicacion.mostrarUbicacion();
    }

    public Date getFechaEvento() { 
        return fechaEvento;
    }
    
    public String getEstado() {
        return estado; 
    }

    public Localizacion getUbicacion() {
        return ubicacion;
    }

    public static int getContadorEventos() {
        return contadorEventos;
    }

    public static void setContadorEventos(int contadorEventos) {
        EventoLimpieza.contadorEventos = contadorEventos;
    }
    
    
}
