/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.menu;

import com.softku.juegopreguntassofkau.Categoria;
import com.softku.juegopreguntassofkau.Usuario;
import java.util.Scanner;

/**
 *
 * @author DIDIER JAVIER
 */
public class UIMenu {
    //Menú inicial donde se explica el funcionamiento del juego y se da la opción de continuar o salir
    public static void verMenu() {
        System.out.println("Bienvenido al concurso de preguntas y respuestas");
        System.out.println("El juego consta de cinco rondas; una pregunta en cada ronda");
        System.out.println("Te puedes retirar cuando quieras y quedas con los puntos acumulados");
        System.out.println("Si continuas y pierdes, tambien pierdes todos los puntos\n");
        System.out.println("Selecciona una opcion valida");
        int usuarioEmpiezaJuegoO_Sale = 2;
        do {
            System.out.println("1. Empezar");
            System.out.println("2. Salir");

            Scanner sc = new Scanner(System.in);
            try {
                usuarioEmpiezaJuegoO_Sale = Integer.parseInt(sc.nextLine()) ;
            } catch (NumberFormatException e) {
                System.out.println("\nError, digitaste mal la opcion: " + e.getMessage() + "\n");
                verMenu();
            }
            

            switch (usuarioEmpiezaJuegoO_Sale) {
                case 1 -> {
                    crearUsuario();
                }
                case 2 -> {
                    System.out.println("Hasta la proxima ocasion");
                    salir(0);
                    System.exit(0);
                }
                default -> System.out.println("Selecciona una opcion valida");
            }
        } while (usuarioEmpiezaJuegoO_Sale != 1);
    }
    
    //Método para ingresar un nombre de usuario de al menos 7 letras
    public static void crearUsuario() {
        Usuario usuario = new Usuario();
        int nombreLengthSinEspacios;
        do {
            System.out.println("Ingresa tu nombre (Como minimo debe contener 7 letras):\n");
            Scanner sc = new Scanner(System.in);
            usuario.setNombreUsuario(sc.nextLine());
            nombreLengthSinEspacios = usuario.getNombreUsuario().replace(" ", "").length();
        } while (nombreLengthSinEspacios < 7);
        System.out.println("Estamos listos. ¿Eres capaz de responder las 5 preguntas sin equivocarte?."
                + "\nRecuerda que si te retiras quedas con los puntos que hayas ganado.\n"
                + "Si respondes y pierdes en cualquier ronda pierdes todos los puntos.\n"
                + "Ganas si respondes todas las preguntas de forma correcta.");
    }
    
    //Método para darle al usuario la opción de retirarse o continuar respondiendo
    public static String continuarJugando_O_Retirarse() {
        String opcionValida = null;
        String respuesta;
        do {
            System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
            System.out.println("Digite otra letra si desea retirarse");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine().toUpperCase();
            switch (respuesta) {
                case "A", "B", "C", "D" -> {
                    opcionValida = respuesta;

                    respuesta = "E";
                }
                default -> {
                    System.out.println("\nHasta la proxima ocasion\n");
                    if (Usuario.getPuntos() == 1) {
                        Usuario.setPuntos(0);
                    }
                    salir(Usuario.getPuntos());
                    System.exit(0);
                }
            }
        } while (!respuesta.equals("E"));
        return opcionValida;

    }
    
    public static void salir(int puntos) {
        System.out.println("Quedaste con " + puntos + " puntos");
        System.out.println("Fin del juego");
        System.exit(0);
    }
}
