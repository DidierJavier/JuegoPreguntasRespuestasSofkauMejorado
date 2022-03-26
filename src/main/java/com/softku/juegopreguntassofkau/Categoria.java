/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DIDIER JAVIER
 */
public class Categoria {

    private static final int MAX_POSIBLES_PREGUNTAS = 5;
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
    
    //Método para mostrar las preguntas de acuerdo a la categoría y de forma aleatoria
    public static int mostrarPreguntasAleatoriaPorCategoria() {
        System.out.println();
        Random random = new Random();
        int aleatorio = random.nextInt(Categoria.MAX_POSIBLES_PREGUNTAS);
        System.out.println("aleatorio = " + aleatorio);
        return aleatorio;
    }
    
    public static void obtenerCategoriaPreguntaYrespuestas(ArrayList<Categoria> categorias) {
//        System.out.println();
//        Random random = new Random();
//        int aleatorio = random.nextInt(Categoria.MAX_POSIBLES_PREGUNTAS);
//        System.out.println("aleatorio = " + aleatorio);
        for (int i = 0; i < 5; i++) {
            Categoria categoriaDeLista = categorias.get(i);
            //System.out.println("Tipo de categoria= " + categoriaDeLista);

            //int idPreguntaAleatoria = categoriaDeLista.mostrarPreguntasAleatoriaPorCategoria();
            int idPreguntaAleatoria = Categoria.mostrarPreguntasAleatoriaPorCategoria();
            System.out.println("Este es el id de categoría: " + categoriaDeLista.getIdCategoria());
            //System.out.println(categoriaDeLista.getIdCategoria());
            Pregunta guardarPregunta = categoriaDeLista.getPreguntasPorCategoria().get(idPreguntaAleatoria);
            System.out.println("guardarPregunta = " + guardarPregunta);
            System.out.println("guardarPregunta = " + guardarPregunta);//Se muestran las opciones de 
            //preguntas y respuestas de forma correcta
    }
}
}
