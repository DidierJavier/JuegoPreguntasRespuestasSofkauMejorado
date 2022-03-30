/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

import java.util.Scanner;
import ui.menu.UIMenu;

/**
 *
 * @author DIDIER JAVIER
 */
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private int puntos;
    private String fechaDeIngreso;
    private static int contadorUsuarios;
    boolean ganaPuntos;
    boolean inicioJuego;

    public Usuario() {
        this.idUsuario = ++Usuario.contadorUsuarios;
        this.ganaPuntos = false;     
        this.inicioJuego = false;
    }

    public Usuario(String nombreUsuario, int puntos) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
    }

    public Usuario(String nombreUsuario, int puntos, String fechaDeIngreso) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public boolean isInicioJuego() {
        return inicioJuego;
    }

    public void setInicioJuego(boolean inicioJuego) {
        this.inicioJuego = inicioJuego;
    }
    
    public boolean isGanaPuntos() {
        return ganaPuntos;
    }

    public void setGanaPuntos(boolean ganaPuntos) {
        this.ganaPuntos = ganaPuntos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public static void setContadorUsuarios(int contadorUsuarios) {
        Usuario.contadorUsuarios = contadorUsuarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", puntos=").append(puntos);
        sb.append(", fechaDeIngreso=").append(fechaDeIngreso);
        sb.append('}');
        return sb.toString();
    }
  
    //Metodo que se repite hasta que el usuario ingrese un nombre de al menos 7 letras
    public void validarNombreUsuario(Usuario usuario) {
        int nombreLengthSinEspacios;
        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("\nIngresa tu nombre (Como minimo debe contener 7 letras):\n");
            Scanner sc = new Scanner(System.in);
            usuario.setNombreUsuario(sc.nextLine());
            nombreLengthSinEspacios = usuario.getNombreUsuario().replace(" ", "").length();
        } while (nombreLengthSinEspacios < 7);
    }
    
    
    //Metodo para validar si el usuario quiere jugar o si desea retirarse
    public void iniciarJuegoContinuar (Usuario usuario, int usuarioIniciaJuegoOSale) {
        switch (usuarioIniciaJuegoOSale) {
            case 1 -> {
                usuario.setInicioJuego(true);
                System.out.println("\nEstamos listos " + usuario.getNombreUsuario()); 
                System.out.println("---------------------------------------------------------------");
                System.out.println("""
                                   
                                   \u00bfEres capaz de responder las 5 preguntas sin equivocarte?.
                                   Recuerda que si te retiras quedas con los puntos que hayas ganado.
                                   Si respondes y pierdes en cualquier ronda pierdes todos los puntos.
                                   Ganas si respondes todas las preguntas de forma correcta.""");
                System.out.println("-----------------------------------------------------------------");
            }
            case 2 -> {
                usuario.setInicioJuego(false);
                System.out.println("Hasta la proxima ocasion");
                salir(usuario);
            }
            default ->
                System.out.println("Selecciona una opcion valida");
        }
    }
    
    public static void salir (Usuario usuario) {
        System.out.println("usuario nombre  = " + usuario.getNombreUsuario());
        System.out.println("usuario puntos = " + usuario.puntos);
        System.out.println("usuario gano o perdio = " + usuario.ganaPuntos);
        System.out.println("Fin del juego");
        UIMenu.enlazarUsuarioA_conexion(usuario);
    }
}
