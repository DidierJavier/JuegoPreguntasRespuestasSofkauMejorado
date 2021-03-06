/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

/**
 *
 * @author DIDIER JAVIER
 */
public class Respuesta {
    private int idRespuesta;
    private String respuesta;
    private char caracterABCD;
    private boolean acierto;
    private static int contadorRespuestas;

    public Respuesta() {
        this.idRespuesta = ++Respuesta.contadorRespuestas;
    }

    public Respuesta(String respuesta, char caracterABCD, boolean acierto) {
        this();
        this.respuesta = respuesta;
        this.caracterABCD = caracterABCD;
        this.acierto = acierto;
        
    }
    
    public int getIdRespuesta() {
        return idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public char getCaracterABCD() {
        return caracterABCD;
    }

    public boolean isAcierto() {
        return acierto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(caracterABCD);
        sb.append(". ").append(respuesta);
        return sb.toString();
    }

}

