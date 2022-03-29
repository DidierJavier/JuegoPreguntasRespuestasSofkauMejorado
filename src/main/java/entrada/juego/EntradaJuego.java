/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada.juego;

import com.softku.juegopreguntassofkau.Categoria;
import static com.softku.juegopreguntassofkau.Categoria.obtenerCategoriaPreguntaYrespuestas;
import com.softku.juegopreguntassofkau.Pregunta;
import com.softku.juegopreguntassofkau.Respuesta;
import conexion.db.Conexion;
import conexion.db.UsuarioService;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import ui.menu.UIMenu;
/**
 *
 * @author DIDIER JAVIER
 */
public class EntradaJuego {
    public static void main(String[] args) {
        
        //Se crean los objetos tipo Respuesta. Luego se crean los objetos tipo pregunta para agregarles las
        //los objetos Respuesta segun la pregunta y finalmente se crean los objetos tipo Categoria para añadirles
        //las preguntas segun la categoria
        
        //Ronda 1------------------------------------------------------------------------------------------------------
        //Creando Respuestas a la pregunta 1, ronda 1------------------------------------------------------------------
        Respuesta respuestaA_Pregunta1_Ronda1 = new Respuesta("El pollo", 'A', false);
        Respuesta respuestaB_Pregunta1_Ronda1 = new Respuesta("El gallo", 'B', false);
        Respuesta respuestaC_Pregunta1_Ronda1 = new Respuesta("La gallina", 'C', true);
        Respuesta respuestaD_Pregunta1_Ronda1 = new Respuesta("La gallineta", 'D', false);
        //Creando la pregunta 1, ronda 1
        Pregunta pregunta1_ronda1 = new Pregunta("Cual es la mama de los pollitos?");
        //Agregando las respuestas a la pregunta 1 ronda 1
        pregunta1_ronda1.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta1_Ronda1);
        pregunta1_ronda1.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta1_Ronda1);
        pregunta1_ronda1.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta1_Ronda1);
        pregunta1_ronda1.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta1_Ronda1);
        
        //Creando Respuestas a la pregunta 2, ronda 1
        Respuesta respuestaA_Pregunta2_Ronda1 = new Respuesta("Uno", 'A', false);
        Respuesta respuestaB_Pregunta2_Ronda1 = new Respuesta("Todos", 'B', true);
        Respuesta respuestaC_Pregunta2_Ronda1 = new Respuesta("Ninguno", 'C', false);
        Respuesta respuestaD_Pregunta2_Ronda1 = new Respuesta("Siete", 'D', false);
        //Se crea el objeto pregunta 2
        Pregunta pregunta2_ronda1 = new Pregunta("¿Cuantos meses del año tiene 28 dias?");
        //Añadiendo Respuestas a la pregunta 2, ronda 1
        pregunta2_ronda1.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta2_Ronda1);
        pregunta2_ronda1.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta2_Ronda1);
        pregunta2_ronda1.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta2_Ronda1);
        pregunta2_ronda1.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta2_Ronda1);

        //Creando respuestas a la pregunta 3 ronda 1
        Respuesta respuestaA_Pregunta3_Ronda1 = new Respuesta("El agua", 'A', false);
        Respuesta respuestaB_Pregunta3_Ronda1 = new Respuesta("La lluvia", 'B', false);
        Respuesta respuestaC_Pregunta3_Ronda1 = new Respuesta("La luna", 'C', false);
        Respuesta respuestaD_Pregunta3_Ronda1 = new Respuesta("El sol", 'D', true);
        //Creando la pregunta 3
        Pregunta pregunta3_ronda1 = new Pregunta("¿Que es aquello que todo el mundo toma pero nadie se lleva?");
        //Agregando respuestas a la pregunta 3
        pregunta3_ronda1.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta3_Ronda1);
        pregunta3_ronda1.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta3_Ronda1);
        pregunta3_ronda1.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta3_Ronda1);
        pregunta3_ronda1.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta3_Ronda1);

        //Creando las respuestas 4 ronda 1
        Respuesta respuestaA_Pregunta4_Ronda1 = new Respuesta("El cinco", 'A', false);
        Respuesta respuestaB_Pregunta4_Ronda1 = new Respuesta("El ocho", 'B', true);
        Respuesta respuestaC_Pregunta4_Ronda1 = new Respuesta("El dos", 'C', false);
        Respuesta respuestaD_Pregunta4_Ronda1 = new Respuesta("El tres", 'D', false);
        //Creando la pregunta 4
        Pregunta pregunta4_ronda1 = new Pregunta("¿A cual numero si se le quita la mitad, queda el cero?");
        //Agregando las respuestas a la pregunta 4 ronda 1
        pregunta4_ronda1.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta4_Ronda1);
        pregunta4_ronda1.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta4_Ronda1);
        pregunta4_ronda1.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta4_Ronda1);
        pregunta4_ronda1.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta4_Ronda1);

        //Creando respuestas para la pregunta 5 ronda 1
        Respuesta respuestaA_Pregunta5_Ronda1 = new Respuesta("De vapor", 'A', false);
        Respuesta respuestaB_Pregunta5_Ronda1 = new Respuesta("De agua", 'B', false);
        Respuesta respuestaC_Pregunta5_Ronda1 = new Respuesta("De vidrio", 'C', false);
        Respuesta respuestaD_Pregunta5_Ronda1 = new Respuesta("De aire", 'D', true);
        //Creando la pregunta 5
        Pregunta pregunta5_ronda1 = new Pregunta("¿De que esta lleno un recipiente vacio?");
        //Agregando las respuestas a la pregunta 5
        pregunta5_ronda1.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta5_Ronda1);
        pregunta5_ronda1.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta5_Ronda1);
        pregunta5_ronda1.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta5_Ronda1);
        pregunta5_ronda1.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta5_Ronda1);
        
        //Creando la categoria 1 
        Categoria categoria1 = new Categoria("Categoria 1");
        //Agregando las preguntas a la categoria 1
        categoria1.getPreguntasPorCategoria().add(pregunta1_ronda1);
        categoria1.getPreguntasPorCategoria().add(pregunta2_ronda1);
        categoria1.getPreguntasPorCategoria().add(pregunta3_ronda1);
        categoria1.getPreguntasPorCategoria().add(pregunta4_ronda1);
        categoria1.getPreguntasPorCategoria().add(pregunta5_ronda1);

        //Ronda 2--------------------------------------------------------------------------------------------
        //Creando respuestas pregunta 1 ronda 2--------------------------------------------------------------
        Respuesta respuestaA_Pregunta1_Ronda2 = new Respuesta("86.400", 'A', true);
        Respuesta respuestaB_Pregunta1_Ronda2 = new Respuesta("84.600", 'B', false);
        Respuesta respuestaC_Pregunta1_Ronda2 = new Respuesta("48.600", 'C', false);
        Respuesta respuestaD_Pregunta1_Ronda2 = new Respuesta("46.800", 'D', false);
        //Creando la pregunta 1 ronda 2
        Pregunta pregunta1_ronda2 = new Pregunta("¿Cuantos segundos tiene un dia?");
        //Agregando las respuestas a la pregunta 5
        pregunta1_ronda2.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta1_Ronda2);
        pregunta1_ronda2.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta1_Ronda2);
        pregunta1_ronda2.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta1_Ronda2);
        pregunta1_ronda2.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta1_Ronda2);

        //Creando respuestas para la pregunta 2, ronda 2
        Respuesta respuestaA_Pregunta2_Ronda2 = new Respuesta("El Amazonas", 'A', true);
        Respuesta respuestaB_Pregunta2_Ronda2 = new Respuesta("El Nilo", 'B', false);
        Respuesta respuestaC_Pregunta2_Ronda2 = new Respuesta("El Misisipi", 'C', false);
        Respuesta respuestaD_Pregunta2_Ronda2 = new Respuesta("El Tigris", 'D', false);
        //Agregando la pregunta 2, ronda 2
        Pregunta pregunta2_ronda2 = new Pregunta("¿Cual es el rio mas caudaloso del mundo?");
        //Agregando las respuestas a la pregunta 2, ronda 2
        pregunta2_ronda2.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta2_Ronda2);
        pregunta2_ronda2.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta2_Ronda2);
        pregunta2_ronda2.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta2_Ronda2);
        pregunta2_ronda2.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta2_Ronda2);

        //Creando respuestas para la pregunta 3 ronda 2
        Respuesta respuestaA_Pregunta3_Ronda2 = new Respuesta("La tierra", 'A', false);
        Respuesta respuestaB_Pregunta3_Ronda2 = new Respuesta("Venus", 'B', false);
        Respuesta respuestaC_Pregunta3_Ronda2 = new Respuesta("Marte", 'C', false);
        Respuesta respuestaD_Pregunta3_Ronda2 = new Respuesta("Mercurio", 'D', true);
        //Agregando la pregunta 3 ronda 2
        Pregunta pregunta3_ronda2 = new Pregunta("¿El planeta mas cercano al sol es?");
        //Agregando las respuestas a la pregunta 5
        pregunta3_ronda2.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta3_Ronda2);
        pregunta3_ronda2.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta3_Ronda2);
        pregunta3_ronda2.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta3_Ronda2);
        pregunta3_ronda2.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta3_Ronda2);

        //Creando las respuestas para la pregunta 4, ronda 2
        Respuesta respuestaA_Pregunta4_Ronda2 = new Respuesta("Cuadrilatero", 'A', false);
        Respuesta respuestaB_Pregunta4_Ronda2 = new Respuesta("Pentagono", 'B', false);
        Respuesta respuestaC_Pregunta4_Ronda2 = new Respuesta("Triangulo", 'C', true);
        Respuesta respuestaD_Pregunta4_Ronda2 = new Respuesta("Hexagono", 'D', false);
        //Agregando la pregunta 4 ronda 2
        Pregunta pregunta4_ronda2 = new Pregunta("¿Como se llama un poligono de tres lados?");
        //Agregando las respuestas a la pregunta 4 ronda 2
        pregunta4_ronda2.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta4_Ronda2);
        pregunta4_ronda2.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta4_Ronda2);
        pregunta4_ronda2.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta4_Ronda2);
        pregunta4_ronda2.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta4_Ronda2);

        //Creando las respuestas para la pregunta 5 ronda 2
        Respuesta respuestaA_Pregunta5_Ronda2 = new Respuesta("Diptongo", 'A', false);
        Respuesta respuestaB_Pregunta5_Ronda2 = new Respuesta("Histeresis", 'B', false);
        Respuesta respuestaC_Pregunta5_Ronda2 = new Respuesta("Triptongo", 'C', false);
        Respuesta respuestaD_Pregunta5_Ronda2 = new Respuesta("Onomatopeya", 'D', true);
        //Agregando la pregunta 5 ronda 2
        Pregunta pregunta5_ronda2 = new Pregunta("¿La palabra que representa o imita un sonido se llama?");
        //Agregando las respuestas a la pregunta 5 ronda 2
        pregunta5_ronda2.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta5_Ronda2);
        pregunta5_ronda2.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta5_Ronda2);
        pregunta5_ronda2.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta5_Ronda2);
        pregunta5_ronda2.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta5_Ronda2);

        //Creando la categoria 2 
        Categoria categoria2 = new Categoria("Categoria 2");
        //Agregando las preguntas a la categoria 1
        categoria2.getPreguntasPorCategoria().add(pregunta1_ronda2);
        categoria2.getPreguntasPorCategoria().add(pregunta2_ronda2);
        categoria2.getPreguntasPorCategoria().add(pregunta3_ronda2);
        categoria2.getPreguntasPorCategoria().add(pregunta4_ronda2);
        categoria2.getPreguntasPorCategoria().add(pregunta5_ronda2);

        //Ronda 3----------------------------------------------------------------------------------------
        //Creando las respuestas ronda 3 pregunta 1---------------------------------------------------------------
        Respuesta respuestaA_Pregunta1_Ronda3 = new Respuesta("Rumania", 'A', true);
        Respuesta respuestaB_Pregunta1_Ronda3 = new Respuesta("Transilvania", 'B', false);
        Respuesta respuestaC_Pregunta1_Ronda3 = new Respuesta("Rusia", 'C', false);
        Respuesta respuestaD_Pregunta1_Ronda3 = new Respuesta("Noruega", 'D', false);
        //Creando la pregunta 1 ronda 3
        Pregunta pregunta1_ronda3 = new Pregunta("¿A que pais pertenece Transilvania?");
        //Agregando las respuestas a la pregunta 1 ronda 3
        pregunta1_ronda3.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta1_Ronda3);
        pregunta1_ronda3.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta1_Ronda3);
        pregunta1_ronda3.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta1_Ronda3);
        pregunta1_ronda3.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta1_Ronda3);

        //Creando las respuestas para la pregunta 2 ronda 3
        Respuesta respuestaA_Pregunta2_Ronda3 = new Respuesta("1999", 'A', false);
        Respuesta respuestaB_Pregunta2_Ronda3 = new Respuesta("1809", 'B', false);
        Respuesta respuestaC_Pregunta2_Ronda3 = new Respuesta("1989", 'C', true);
        Respuesta respuestaD_Pregunta2_Ronda3 = new Respuesta("1986", 'D', false);
        //Creando la pregunta 2 ronda 3
        Pregunta pregunta2_ronda3 = new Pregunta("¿En que anio cayo el muro de Berlin?");
        //Agregando las respuestas a la pregunta 2 ronda 3
        pregunta2_ronda3.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta2_Ronda3);
        pregunta2_ronda3.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta2_Ronda3);
        pregunta2_ronda3.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta2_Ronda3);
        pregunta2_ronda3.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta2_Ronda3);

        //Creando las respuestas para la pregunta 3 ronda 3
        Respuesta respuestaA_Pregunta3_Ronda3 = new Respuesta("Carl Lewis", 'A', false);
        Respuesta respuestaB_Pregunta3_Ronda3 = new Respuesta("Usain Bolt", 'B', false);
        Respuesta respuestaC_Pregunta3_Ronda3 = new Respuesta("Mark Spitz", 'C', false);
        Respuesta respuestaD_Pregunta3_Ronda3 = new Respuesta("Michael Phelps", 'D', true);
        //Creando la pregunta 3 ronda 3
        Pregunta pregunta3_ronda3 = new Pregunta("Cual es el atleta con mas medallas olimpicas actualmente");
        //Agregando las respuestas a la pregunta 3 ronda 3
        pregunta3_ronda3.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta3_Ronda3);
        pregunta3_ronda3.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta3_Ronda3);
        pregunta3_ronda3.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta3_Ronda3);
        pregunta3_ronda3.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta3_Ronda3);

        //Creando las respuestas para la pregunta 4 ronda 3
        Respuesta respuestaA_Pregunta4_Ronda3 = new Respuesta("10.800", 'A', false);
        Respuesta respuestaB_Pregunta4_Ronda3 = new Respuesta("13.800", 'B', true);
        Respuesta respuestaC_Pregunta4_Ronda3 = new Respuesta("12.800", 'C', false);
        Respuesta respuestaD_Pregunta4_Ronda3 = new Respuesta("14.800", 'D', false);
        //Creando la pregunta 4 ronda 3
        Pregunta pregunta4_ronda3 = new Pregunta("La edad del universo en millones de anios es:");
        //Agregando las respuestas a la pregunta 4 ronda 3
        pregunta4_ronda3.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta4_Ronda3);
        pregunta4_ronda3.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta4_Ronda3);
        pregunta4_ronda3.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta4_Ronda3);
        pregunta4_ronda3.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta4_Ronda3);

        //Creando respuestas para la pregunta 5 ronda 3
        Respuesta respuestaA_Pregunta5_Ronda3 = new Respuesta("El Gallego", 'A', false);
        Respuesta respuestaB_Pregunta5_Ronda3 = new Respuesta("El Arameo", 'B', false);
        Respuesta respuestaC_Pregunta5_Ronda3 = new Respuesta("El Vasco", 'C', true);
        Respuesta respuestaD_Pregunta5_Ronda3 = new Respuesta("El Castellano", 'D', false);
        //Creando la pregunta 5 ronda 3
        Pregunta pregunta5_ronda3 = new Pregunta("El idioma mas antiguo en Europa y que aun se usa es:");
        //Agregando las respuestas a la pregunta 4 ronda 3
        pregunta5_ronda3.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta5_Ronda3);
        pregunta5_ronda3.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta5_Ronda3);
        pregunta5_ronda3.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta5_Ronda3);
        pregunta5_ronda3.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta5_Ronda3);

        //Creando la categoria 3 
        Categoria categoria3 = new Categoria("Categoria 3");
        //Agregando las preguntas a la categoria 1
        categoria3.getPreguntasPorCategoria().add(pregunta1_ronda3);
        categoria3.getPreguntasPorCategoria().add(pregunta2_ronda3);
        categoria3.getPreguntasPorCategoria().add(pregunta3_ronda3);
        categoria3.getPreguntasPorCategoria().add(pregunta4_ronda3);
        categoria3.getPreguntasPorCategoria().add(pregunta5_ronda3);

        //Ronda 4--------------------------------------------------------------------------------------
        //Creando respuestas para la pregunta 1 ronda 4-----------------------------------------------------------------------
        Respuesta respuestaA_Pregunta1_Ronda4 = new Respuesta("Dinamarca", 'A', true);
        Respuesta respuestaB_Pregunta1_Ronda4 = new Respuesta("Islandia", 'B', false);
        Respuesta respuestaC_Pregunta1_Ronda4 = new Respuesta("Islas Feroe", 'C', false);
        Respuesta respuestaD_Pregunta1_Ronda4 = new Respuesta("Noruega", 'D', false);
        //Creando la pregunta 1 ronda 4
        Pregunta pregunta1_ronda4 = new Pregunta("A que pais pertenece Groenlandia:");
        //Agregando las respuestas a la pregunta 1 ronda 4
        pregunta1_ronda4.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta1_Ronda4);
        pregunta1_ronda4.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta1_Ronda4);
        pregunta1_ronda4.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta1_Ronda4);
        pregunta1_ronda4.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta1_Ronda4);

        //Creando las respuestas a la pregunta 2 ronda 4
        Respuesta respuestaA_Pregunta2_Ronda4 = new Respuesta("Londres", 'A', false);
        Respuesta respuestaB_Pregunta2_Ronda4 = new Respuesta("Tokio", 'B', false);
        Respuesta respuestaC_Pregunta2_Ronda4 = new Respuesta("Barcelona", 'C', true);
        Respuesta respuestaD_Pregunta2_Ronda4 = new Respuesta("Beijing", 'D', false);
        //Creando la pregunta 2 ronda 4
        Pregunta pregunta2_ronda4 = new Pregunta("¿Donde se celebraron las olimpiadas de 1992?");
        //Agregando las respuestas a la pregunta 2 ronda 4
        pregunta2_ronda4.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta2_Ronda4);
        pregunta2_ronda4.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta2_Ronda4);
        pregunta2_ronda4.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta2_Ronda4);
        pregunta2_ronda4.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta2_Ronda4);

        //Creando las respuestas para la pregunta 3 ronda 4
        Respuesta respuestaA_Pregunta3_Ronda4 = new Respuesta("Dos", 'A', false);
        Respuesta respuestaB_Pregunta3_Ronda4 = new Respuesta("Tres", 'B', true);
        Respuesta respuestaC_Pregunta3_Ronda4 = new Respuesta("Uno", 'C', false);
        Respuesta respuestaD_Pregunta3_Ronda4 = new Respuesta("Cuatro", 'D', false);
        //Creando la pregunta 3 ronda 4
        Pregunta pregunta3_ronda4 = new Pregunta("¿Cuantos corazones tiene un pulpo?");
        //Agregando las respuestas a la pregunta 3 ronda 4
        pregunta3_ronda4.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta3_Ronda4);
        pregunta3_ronda4.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta3_Ronda4);
        pregunta3_ronda4.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta3_Ronda4);
        pregunta3_ronda4.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta3_Ronda4);

        //Creando respuestas para la pregunta 4 ronda 4
        Respuesta respuestaA_Pregunta4_Ronda4 = new Respuesta("Ramses IV", 'A', false);
        Respuesta respuestaB_Pregunta4_Ronda4 = new Respuesta("Ramses V", 'B', false);
        Respuesta respuestaC_Pregunta4_Ronda4 = new Respuesta("Ramses III", 'C', true);
        Respuesta respuestaD_Pregunta4_Ronda4 = new Respuesta("Ramses II", 'D', false);
        //Creando la pregunta 4 ronda 4
        Pregunta pregunta4_ronda4 = new Pregunta("El ultimo faraon de Egipto fue:");
        //Agregando las respuestas a la pregunta 4 ronda 4
        pregunta4_ronda4.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta4_Ronda4);
        pregunta4_ronda4.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta4_Ronda4);
        pregunta4_ronda4.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta4_Ronda4);
        pregunta4_ronda4.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta4_Ronda4);

        //Creando respuestas para la pregunta 5 ronda 4
        Respuesta respuestaA_Pregunta5_Ronda4 = new Respuesta("El higado", 'A', false);
        Respuesta respuestaB_Pregunta5_Ronda4 = new Respuesta("El Pancreas", 'B', true);
        Respuesta respuestaC_Pregunta5_Ronda4 = new Respuesta("Los rinones", 'C', false);
        Respuesta respuestaD_Pregunta5_Ronda4 = new Respuesta("El vazo", 'D', false);
        //Creando la pregunta 5 ronda 4
        Pregunta pregunta5_ronda4 = new Pregunta("La insulina en el cuerpo se produce en:");
        //Agregando las respuestas a la pregunta 1 ronda 4
        pregunta5_ronda4.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta5_Ronda4);
        pregunta5_ronda4.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta5_Ronda4);
        pregunta5_ronda4.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta5_Ronda4);
        pregunta5_ronda4.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta5_Ronda4);

        //Creando la categoria 4
        Categoria categoria4 = new Categoria("Categoria 4");
        //Agregando las preguntas a la categoria 1
        categoria4.getPreguntasPorCategoria().add(pregunta1_ronda4);
        categoria4.getPreguntasPorCategoria().add(pregunta2_ronda4);
        categoria4.getPreguntasPorCategoria().add(pregunta3_ronda4);
        categoria4.getPreguntasPorCategoria().add(pregunta4_ronda4);
        categoria4.getPreguntasPorCategoria().add(pregunta5_ronda4);

        //Ronda 5---------------------------------------------------------------------------------
        //Creando respuestas pregunta 1 ronda 5-----------------------------------------------------------------------
        Respuesta respuestaA_Pregunta1_Ronda5 = new Respuesta("Sirio", 'A', false);
        Respuesta respuestaB_Pregunta1_Ronda5 = new Respuesta("Procyon", 'B', false);
        Respuesta respuestaC_Pregunta1_Ronda5 = new Respuesta("Epsilon Indi", 'C', false);
        Respuesta respuestaD_Pregunta1_Ronda5 = new Respuesta("Alfa Centauri", 'D', true);
        //Creando la pregunta 1 ronda 5
        Pregunta pregunta1_ronda5 = new Pregunta("¿Cual es la estrella mas cercana al sol?");
        //Agregando las respuestas a la pregunta 1 ronda 5
        pregunta1_ronda5.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta1_Ronda5);
        pregunta1_ronda5.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta1_Ronda5);
        pregunta1_ronda5.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta1_Ronda5);
        pregunta1_ronda5.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta1_Ronda5);

        //Creando las respuestas para la pregunta 2 ronda 5
        Respuesta respuestaA_Pregunta2_Ronda5 = new Respuesta("Etna", 'A', false);
        Respuesta respuestaB_Pregunta2_Ronda5 = new Respuesta("Vesubio", 'B', true);
        Respuesta respuestaC_Pregunta2_Ronda5 = new Respuesta("Sicilia", 'C', false);
        Respuesta respuestaD_Pregunta2_Ronda5 = new Respuesta("Santorini", 'D', false);
        //Creando la pregunta 2 ronda 5
        Pregunta pregunta2_ronda5 = new Pregunta("¿Que volcan sepulto la ciudad de Pompeya?");
        //Agregando las respuestas a la pregunta 1 ronda 5
        pregunta2_ronda5.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta2_Ronda5);
        pregunta2_ronda5.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta2_Ronda5);
        pregunta2_ronda5.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta2_Ronda5);
        pregunta2_ronda5.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta2_Ronda5);

        //Agregando respuestas a la pregunta 3 ronda 5
        Respuesta respuestaA_Pregunta3_Ronda5 = new Respuesta("Cheliabinsk", 'A', false);
        Respuesta respuestaB_Pregunta3_Ronda5 = new Respuesta("Perm", 'B', false);
        Respuesta respuestaC_Pregunta3_Ronda5 = new Respuesta("Voronezh", 'C', false);
        Respuesta respuestaD_Pregunta3_Ronda5 = new Respuesta("Pripiat", 'D', true);
        //Creando la pregunta 3 ronda 5
        Pregunta pregunta3_ronda5 = new Pregunta("¿Cual era la ciudad mas cercana a la central nuclear de Chernobil?");
        //Agregando las respuestas a la pregunta 3 ronda 5
        pregunta3_ronda5.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta3_Ronda5);
        pregunta3_ronda5.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta3_Ronda5);
        pregunta3_ronda5.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta3_Ronda5);
        pregunta3_ronda5.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta3_Ronda5);

        //Creando las respuestas para la pregunta 4 ronda 5
        Respuesta respuestaA_Pregunta4_Ronda5 = new Respuesta("Indonesia", 'A', true);
        Respuesta respuestaB_Pregunta4_Ronda5 = new Respuesta("India", 'B', false);
        Respuesta respuestaC_Pregunta4_Ronda5 = new Respuesta("Pakistan", 'C', false);
        Respuesta respuestaD_Pregunta4_Ronda5 = new Respuesta("Bangladesh", 'D', false);
        //Creando la pregunta 1 ronda 5
        Pregunta pregunta4_ronda5 = new Pregunta("¿Cual es el pais con mayor cantidad de musulmanes?");
        //Agregando las respuestas a la pregunta 4 ronda 5
        pregunta4_ronda5.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta4_Ronda5);
        pregunta4_ronda5.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta4_Ronda5);
        pregunta4_ronda5.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta4_Ronda5);
        pregunta4_ronda5.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta4_Ronda5);

        //Creando las respuestas para la pregunta 5 ronda 5
        Respuesta respuestaA_Pregunta5_Ronda5 = new Respuesta("Sur Africa", 'A', false);
        Respuesta respuestaB_Pregunta5_Ronda5 = new Respuesta("Mongolia", 'B', false);
        Respuesta respuestaC_Pregunta5_Ronda5 = new Respuesta("China", 'C', false);
        Respuesta respuestaD_Pregunta5_Ronda5 = new Respuesta("Australia", 'D', true);
        //Creando la pregunta 1 ronda 5
        Pregunta pregunta5_ronda5 = new Pregunta("¿Cual es el pais con mas camellos salvajes?");
        //Agregando las respuestas a la pregunta 1 ronda 5
        pregunta5_ronda5.getRespuestasPorCadaPregunta().add(respuestaA_Pregunta5_Ronda5);
        pregunta5_ronda5.getRespuestasPorCadaPregunta().add(respuestaB_Pregunta5_Ronda5);
        pregunta5_ronda5.getRespuestasPorCadaPregunta().add(respuestaC_Pregunta5_Ronda5);
        pregunta5_ronda5.getRespuestasPorCadaPregunta().add(respuestaD_Pregunta5_Ronda5);

        //Creando la categoria 5 
        Categoria categoria5 = new Categoria("Categoria 5");
        //Agregando las preguntas a la categoria 1
        categoria5.getPreguntasPorCategoria().add(pregunta1_ronda5);
        categoria5.getPreguntasPorCategoria().add(pregunta2_ronda5);
        categoria5.getPreguntasPorCategoria().add(pregunta3_ronda5);
        categoria5.getPreguntasPorCategoria().add(pregunta4_ronda5);
        categoria5.getPreguntasPorCategoria().add(pregunta5_ronda5);
        
        //Se crea un ArrayList para guardar las categorias de las preguntas
        ArrayList<Categoria> categorias = new ArrayList();
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        
        //Metodo para obtener la categoria, la pregunta y las opciones que tiene el usuario
        //Este metodo recibe como parametros el ArrayList de categorias, el cual incluye todas las categorias
        //y el metodo UIMenu.verMenuInicial, el cual devuelve un numero entero
        obtenerCategoriaPreguntaYrespuestas(categorias, UIMenu.verMenuInicial());
    }
}
