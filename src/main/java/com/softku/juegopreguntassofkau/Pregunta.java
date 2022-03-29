/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

import java.util.ArrayList;

/**
 *
 * @author DIDIER JAVIER
 */
public class Pregunta {
    private ArrayList<Respuesta> respuestasPorCadaPregunta;
    private int idPregunta;
    private String pregunta;
    private static int contadorPreguntas;

    public Pregunta() {
        this.idPregunta = ++Pregunta.contadorPreguntas;
        this.respuestasPorCadaPregunta = new ArrayList<>();
    }

    public Pregunta(String pregunta) {
        this();
        this.pregunta = pregunta;
    }

    public ArrayList<Respuesta> getRespuestasPorCadaPregunta() {
        return respuestasPorCadaPregunta;
    }

    public void setRespuestasPorCadaPregunta(ArrayList<Respuesta> respuestasPorCadaPregunta) {
        this.respuestasPorCadaPregunta = respuestasPorCadaPregunta;
    }


    public int getIdPregunta() {
        return idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public static int getContadorPreguntas() {
        return contadorPreguntas;
    }

    public static void setContadorPreguntas(int contadorPreguntas) {
        Pregunta.contadorPreguntas = contadorPreguntas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\npregunta=").append(pregunta);
        sb.append("\n").append(respuestasPorCadaPregunta);
        return sb.toString();
    }
}

