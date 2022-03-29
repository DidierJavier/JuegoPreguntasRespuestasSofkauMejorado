/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

import java.util.Scanner;

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
    char opcionValida;
    boolean ganaPuntos;
    boolean inicioJuego;

    public Usuario() {
        this.idUsuario = ++Usuario.contadorUsuarios;
    }

    public Usuario(char opcionValida) {
        this.opcionValida = opcionValida;
    }
    
    public Usuario(String nombreUsuario, int puntos, String fechaDeIngreso, boolean ganaPuntos, boolean inicioJuego) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
        this.fechaDeIngreso = fechaDeIngreso;
        this.ganaPuntos = ganaPuntos;
        this.inicioJuego = inicioJuego;
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

    
    public void setOpcionValida(char opcionValida) {
        this.opcionValida = opcionValida;
    }

    public char getOpcionValida() {
        return opcionValida;
    }

    public int getIdUsuario() {
        return idUsuario;
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
  
    public void validarNombreUsuario(Usuario usuario) {
        int nombreLengthSinEspacios;
        do {
            System.out.println("\nIngresa tu nombre (Como minimo debe contener 7 letras):\n");
            Scanner sc = new Scanner(System.in);
            usuario.setNombreUsuario(sc.nextLine());
            nombreLengthSinEspacios = usuario.getNombreUsuario().replace(" ", "").length();
        } while (nombreLengthSinEspacios < 7);
    }
    
    public void iniciarJuegoContinuar (Usuario usuario, int usuarioIniciaJuegoOSale) {
        switch (usuarioIniciaJuegoOSale) {
            case 1 -> {
                usuario.setInicioJuego(true);
                System.out.println("Estamos listos " + usuario.getNombreUsuario()); //+ usuarioEnJuego.getNombreUsuario()
                System.out.println("\n¿Eres capaz de responder las 5 preguntas sin equivocarte?."
                        + "\nRecuerda que si te retiras quedas con los puntos que hayas ganado.\n"
                        + "Si respondes y pierdes en cualquier ronda pierdes todos los puntos.\n"
                        + "Ganas si respondes todas las preguntas de forma correcta.");
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
    }
}
