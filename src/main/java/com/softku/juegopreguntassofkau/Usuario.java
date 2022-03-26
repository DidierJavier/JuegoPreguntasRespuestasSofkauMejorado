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

    public Usuario() {
        this.idUsuario = ++Usuario.contadorUsuarios;
    }

    public Usuario(char opcionValida) {
        this.opcionValida = opcionValida;
    }
    
    public Usuario(String nombreUsuario, int puntos, String fechaDeIngreso) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
        this.fechaDeIngreso = fechaDeIngreso;
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
    
    //Método para darle al usuario la opción de retirarse o continuar respondiendo
    public void continuarJugando_O_Retirarse(Usuario usuario) {
        //char opcionValida = 'E';
        usuario.setOpcionValida('E');
        char respuesta;
        do {
            System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
            System.out.println("Digite otra letra si desea retirarse");
            Scanner sc = new Scanner(System.in);
            respuesta = Character.toUpperCase(sc.nextLine().charAt(0));
            //usuario.setOpcionValida(Character.toUpperCase(sc.nextLine().charAt(0)));
            switch (respuesta) {
                case 'A', 'B', 'C', 'D' -> {
                    usuario.setOpcionValida(respuesta);
                    respuesta = 'E';
                }
                default -> {
                    System.out.println("\nHasta la proxima ocasion\n");
                    if (usuario.getPuntos() == 1) {
                        usuario.setPuntos(0);
                    }
                    //salir(usuario.getPuntos());
                    System.exit(0);
                }
            }
        } while (respuesta != 'E');
        //return usuario.getOpcionValida();
    }
}
