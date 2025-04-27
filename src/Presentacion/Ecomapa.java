/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Logica.EventoLimpieza;
import Logica.Localizacion;
import Logica.Reporte;
import Logica.TipoResiduo;
import Logica.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mario
 */

public class Ecomapa {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Reporte> reportes = new ArrayList<>();
    private static List<EventoLimpieza> eventos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Usuario usuarioActual = null;

    public static void main(String[] args) throws Exception {
        while (true) {
            if (usuarioActual == null) {
                mostrarMenuInicio();
            } else {
                mostrarMenuUsuario();
            }
        }
    }

    private static void mostrarMenuInicio() throws Exception {
        System.out.println(" MENU PRINCIPAL ");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Iniciar sesion");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> registrarUsuario();
            case 2 -> iniciarSesion();
            case 3 -> System.exit(0);
            default -> System.out.println("Opcion invalida");
        }
    }

    private static void mostrarMenuUsuario() throws Exception {
        System.out.println("\n MENU DE USUARIO");
        System.out.println("1. Crear reporte");
        System.out.println("2. Ver reportes");
        System.out.println("3. Crear evento de limpieza");
        System.out.println("4. Ver eventos");
        System.out.println("5. Cerrar sesion");
        System.out.print("Seleccione una opcion: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> crearReporte();
            case 2 -> mostrarReportes();
            case 3 -> crearEventoLimpieza();
            case 4 -> mostrarEventos();
            case 5 -> {
                usuarioActual = null;
                System.out.println("Sesion cerrada");
            }
            default -> System.out.println("Opcion invalida");
        }
    }

    private static void registrarUsuario() {
        System.out.print("\nRegistrar Usuario");
        System.out.print("\nID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Contrasena: ");
        String contrasena = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(id, nombre, email, contrasena);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado correctamente");
    }

    private static void iniciarSesion() {
        System.out.print("\nEmail: ");
        String email = scanner.nextLine();
        System.out.print("Contrasena: ");
        String contrasena = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
                usuarioActual = usuario;
                System.out.println("Bienvenido " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Usuario o contrasena incorrecta");
    }

    private static void crearReporte() {
        System.out.println("\n NUEVO REPORTE");
        System.out.print("Latitud: ");
        double latitud = scanner.nextDouble();
        System.out.print("Longitud: ");
        double longitud = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();

        System.out.print("Tipo de residuo: ");
        String tipo = scanner.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.print("Nivel de riesgo: ");
        String riesgo = scanner.nextLine();

        Localizacion loc = new Localizacion(latitud, longitud, direccion);
        TipoResiduo residuo = new TipoResiduo(tipo, descripcion, riesgo);
        Reporte nuevoReporte = new Reporte(loc, residuo);
        reportes.add(nuevoReporte); 

        System.out.println("Reporte creado con ID: " + nuevoReporte.getId());
    }

    private static void mostrarReportes() {
        System.out.println("\n LISTA DE REPORTES");

        if (reportes.isEmpty()) {
            System.out.println("No hay reportes registrados.");
            return;
        }

        for (Reporte reporte : reportes) {
            System.out.println("ID: " + reporte.getId());
            System.out.println("Ubicacion: " + reporte.getUbicacion().getDireccion());
            System.out.println("Estado: " + reporte.getEstado());
            System.out.println("Tipo: " + reporte.getTipoResiduo().getNombre());
            System.out.println("-----------------------------");
        }
    }

    private static void crearEventoLimpieza() {
    System.out.println("\n NUEVO EVENTO");
    
    if (reportes.isEmpty()) {
        System.out.println("No hay reportes disponibles para crear eventos.");
        return;
    }

    System.out.println("\nReportes disponibles:");
    for (int i = 0; i < reportes.size(); i++) {
        Reporte r = reportes.get(i);
        System.out.println((i + 1) + ". ID: " + r.getId() + 
                         " | Ubicacion: " + r.getUbicacion().getDireccion() + 
                         " | Tipo: " + r.getTipoResiduo().getNombre());
    }

    int seleccion = -1;
    while (seleccion < 0 || seleccion >= reportes.size()) {
        try {
            System.out.print("\nSeleccione el numero del reporte: ");
            seleccion = scanner.nextInt() - 1;
            scanner.nextLine();
            
            if (seleccion < 0 || seleccion >= reportes.size()) {
                System.out.println("Error ingrese un numero entre 1 y " + reportes.size());
            }
        } catch (Exception e) {
            System.out.println("Error debe ser un numero");
            scanner.nextLine(); 
            seleccion = -1;
        }
    }

    Reporte reporteSeleccionado = reportes.get(seleccion);
    Localizacion loc = reporteSeleccionado.getUbicacion();

    Date fecha = null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    while (fecha == null) {
        try {
            System.out.print("Fecha del evento (dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            fecha = sdf.parse(fechaStr);
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto Ej:(11/10/2002)");
        }
    }

    EventoLimpieza nuevoEvento = new EventoLimpieza(loc, fecha);
    eventos.add(nuevoEvento);
    
    System.out.println("Evento creado con ID: " + nuevoEvento.getId());
    System.out.println("Asociado al reporte: " + reporteSeleccionado.getId());
}

    private static void mostrarEventos() {
        System.out.println("\n LISTA DE EVENTOS");

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        for (EventoLimpieza evento : eventos) {
            System.out.println("ID: " + evento.getId());
            System.out.println("Ubicacion: " + evento.getUbicacion().getDireccion());
            System.out.println("Fecha: " + evento.getFechaEvento());
            System.out.println("Estado: " + evento.getEstado());
            System.out.println("-----------------------------");
        }
    }
}
