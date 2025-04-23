/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mario
 */
public class Notificacion {
    private Usuario destinatario;
    private String mensaje;

    public Notificacion(Usuario destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    public void enviar() {
        System.out.println("\nNotificacion para " + destinatario.getNombre() + ":");
        System.out.println(mensaje);
        System.out.println("-----------------------------------");
    }
}
