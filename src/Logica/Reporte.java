/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Logica.Localizacion;
import Logica.Entidad;

/**
 *
 * @author mario
 */
public class Reporte extends Entidad {
    private Localizacion ubicacion;
    private TipoResiduo tipoResiduo;
    private String estado;
    private static int contadorReportes = 1;

    public Reporte(Localizacion ubicacion, TipoResiduo tipoResiduo) {
        super();
        this.id = "REP-" + contadorReportes++;
        this.ubicacion = ubicacion;
        this.tipoResiduo = tipoResiduo;
        this.estado = "Pendiente";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n Detalles de Reporte");
        System.out.println("ID: " + id);
        System.out.println("Fecha Creacion: " + fechaCreacion);
        System.out.println("Estado: " + estado);
        ubicacion.mostrarUbicacion();
        tipoResiduo.mostrarDetalles();
    }

    public Localizacion getUbicacion() {
        return ubicacion;
    }
    
    public TipoResiduo getTipoResiduo() {
        return tipoResiduo;
    }
    
    public String getEstado() {
        return estado;
    }

    public static int getContadorReportes() {
        return contadorReportes;
    }

    public static void setContadorReportes(int contadorReportes) {
        Reporte.contadorReportes = contadorReportes;
    }
    
    
}

    
