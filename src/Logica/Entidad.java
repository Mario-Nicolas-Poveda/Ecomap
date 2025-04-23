/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;

/**
 *
 * @author mario
 */
public abstract class Entidad implements Informable {
    protected String id;
    protected Date fechaCreacion;

    public Entidad() {
        this.fechaCreacion = new Date();
    }

    public String getId() {
        return id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public abstract void mostrarInformacion();
}
