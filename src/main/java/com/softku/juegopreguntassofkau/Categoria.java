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
public class Categoria {
    private ArrayList<Pregunta> preguntasPorCategoria;
    private int idCategoria;
    private String nombreCategoria;
    private static int contadorCategorias;

    public Categoria() {
        this.idCategoria = ++Categoria.contadorCategorias;
        this.preguntasPorCategoria = new ArrayList<>();
    }

    public Categoria(String nombreCategoria) {
        this();
        this.nombreCategoria = nombreCategoria;
    }

    public ArrayList<Pregunta> getPreguntasPorCategoria() {
        return preguntasPorCategoria;
    }

    public void setPreguntasPorCategoria(ArrayList<Pregunta> preguntasPorCategoria) {
        this.preguntasPorCategoria = preguntasPorCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public static int getContadorCategorias() {
        return contadorCategorias;
    }

    public static void setContadorCategorias(int contadorCategorias) {
        Categoria.contadorCategorias = contadorCategorias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Categoria{");
        sb.append("preguntasPorCategoria=").append(preguntasPorCategoria);
        sb.append(", idCategoria=").append(idCategoria);
        sb.append(", nombreCategoria=").append(nombreCategoria);
        sb.append('}');
        return sb.toString();
    }
    
    
}
