/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softku.juegopreguntassofkau;

import static com.softku.juegopreguntassofkau.Usuario.salir;
import java.util.ArrayList;
import java.util.Random;
import ui.menu.UIMenu;
/**
 *
 * @author DIDIER JAVIER
 */
public class Categoria {

    private static final int MAX_POSIBLES_PREGUNTAS = 5;//Constante para agregar 5 preguntas por categoria
    private ArrayList<Pregunta> preguntasPorCategoria;//Array para agregar 5 preguntas en cada categoria
    private int idCategoria;                        //identifica la categoria en la que se encuentra el usuario
    private String nombreCategoria;                 
    private static int contadorCategorias;

    //Constructor para ir sumando el id de Categoria y crear el ArrayList de preguntasPorCategoria
    public Categoria() {
        this.idCategoria = ++Categoria.contadorCategorias;
        this.preguntasPorCategoria = new ArrayList<>();
    }
    //Constructor para llamar al constructor vacio y crear el nombre de la categoria
    public Categoria(String nombreCategoria) {
        this();
        this.nombreCategoria = nombreCategoria;
    }

    //Metodos get y set
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
        return aleatorio;
    }

    //Metodo para obtener las respuestas de acuerdo a la pregunta y a la categoria
    public static void obtenerCategoriaPreguntaYrespuestas(ArrayList<Categoria> categorias, int usuarioEmpiezaJuegoOSale) {
        Usuario usuario = new Usuario();      //Se crea un objeto de tipo Usuario
        if (usuarioEmpiezaJuegoOSale == 1) {  //Si el usuario decide jugar
            usuario.validarNombreUsuario(usuario);//Se llama al metodo <validarNombreUsuario de la clase Usuario
            usuario.iniciarJuegoContinuar(usuario, usuarioEmpiezaJuegoOSale);//El llamado a este metodo 
                                    //es para que al mostrar la pregunta, el usuario decida si se retira o continua
            int i = 0;
            //Este ciclo se repite hasta que el usuario gane las cinco rondas o pierda en alguna de ellas
            do {
                Categoria categoriaDeLista = categorias.get(i);//Se guarda la categoria segun la ronda 
                int idPreguntaAleatoria = Categoria.mostrarPreguntasAleatoriaPorCategoria();//Se guarda el numero de la 
                        //de la pregunta, llamando al metodo <mostrarPreguntasPorCategoria>
                System.out.println("Este es el id de categoría: " + categoriaDeLista.getIdCategoria());
                Pregunta guardarPregunta = categoriaDeLista.getPreguntasPorCategoria().get(idPreguntaAleatoria);//Se guarda
                //la pregunta que se genero de forma aleatoria
                System.out.println("------------------------------------------------------------------");
                System.out.println(guardarPregunta);//Se muestra la pregunta y las opciones de respuesta
                System.out.println("-------------------------------------------------------------------");
                UIMenu.continuarJugando_O_retirarse_puntos(guardarPregunta, usuario);
                i ++;
            }while (i < 5 && usuario.ganaPuntos == true);
            salir(usuario);
        }else {
            System.out.println("Decidiste no jugar. Estudia y vuelve luego");
            System.out.println("Usuario no identificado = " + usuario.getNombreUsuario());
        }
    }
}
