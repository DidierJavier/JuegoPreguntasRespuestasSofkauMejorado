/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

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

    public Usuario() {
        this.idUsuario = ++Usuario.contadorUsuarios;
    }

    public Usuario(String nombreUsuario, int puntos, String fechaDeIngreso) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
        this.fechaDeIngreso = fechaDeIngreso;
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
  
    
}
