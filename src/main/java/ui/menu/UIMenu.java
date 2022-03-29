/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.menu;

import com.softku.juegopreguntassofkau.Categoria;
import com.softku.juegopreguntassofkau.Pregunta;
import com.softku.juegopreguntassofkau.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIDIER JAVIER
 */
public class UIMenu {

    //private static Usuario usuario;
//Menú inicial donde se explica el funcionamiento del juego y se da la opción de iniciarJuegoContinuar o salir
    public static int verMenuInicial() {
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
                usuarioEmpiezaJuegoO_Sale = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nError, digitaste mal la opcion: " + e.getMessage() + "\n");
                verMenuInicial();
            }
        } while (usuarioEmpiezaJuegoO_Sale != 1 && usuarioEmpiezaJuegoO_Sale != 2);
        return usuarioEmpiezaJuegoO_Sale;
    }

    //   public static boolean usuarioIniciaOsaleDelJuego(int empezarJuegoSalir) {
//        boolean iniciarJuegoContinuar = false;
//        //empezarJuegoSalir = verMenuInicial();
//        switch (empezarJuegoSalir) {
//            case 1 -> {
//                iniciarJuegoContinuar = true;
//                //Usuario usuarioEnJuego = crearUsuario();
//                System.out.println("Estamos listos "); //+ usuarioEnJuego.getNombreUsuario()
//                System.out.println("\n¿Eres capaz de responder las 5 preguntas sin equivocarte?."
//                        + "\nRecuerda que si te retiras quedas con los puntos que hayas ganado.\n"
//                        + "Si respondes y pierdes en cualquier ronda pierdes todos los puntos.\n"
//                        + "Ganas si respondes todas las preguntas de forma correcta.");
//            }
//            case 2 -> {
//                iniciarJuegoContinuar = false;
//                System.out.println("Hasta la proxima ocasion");
//                System.exit(0);
//            }
//            default ->
//                System.out.println("Selecciona una opcion valida");
//        }
//        return iniciarJuegoContinuar;
//    }
//}
//Método para ingresar un nombre de usuario de al menos 7 letras
//    public static Usuario crearUsuario() {
//        Usuario usuario = new Usuario();
//        usuario.validarNombreUsuario(usuario);
//        return usuario;
//        System.out.println("Estamos listos " + usuario.getNombreUsuario()
//                + "\n¿Eres capaz de responder las 5 preguntas sin equivocarte?."
//                + "\nRecuerda que si te retiras quedas con los puntos que hayas ganado.\n"
//                + "Si respondes y pierdes en cualquier ronda pierdes todos los puntos.\n"
//                + "Ganas si respondes todas las preguntas de forma correcta.");
//'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
//}
    public static void continuarJugando_O_retirarse_puntos(Pregunta preguntaPorCategoriaAleatoria, Usuario usuario) {
        System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
        System.out.println("Digite otra letra si desea retirarse");
        Scanner sc = new Scanner(System.in);
        char respuestaUsuario = Character.toUpperCase(sc.nextLine().charAt(0));
        //boolean respuestaCorrecta = false;
        int i = 0;
        int j = 10;
        switch (respuestaUsuario) {
            case 'A', 'B', 'C', 'D' -> {
                do {
                    if (respuestaUsuario == preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().get(i).getCaracterABCD()) {
                        if (preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().get(i).isAcierto()) {
                            System.out.println("Excelente, haz acertado la pregunta de la ronda ");
                            usuario.setGanaPuntos(true);
                            usuario.setPuntos((int) Math.pow(j, 2) + usuario.getPuntos() * 20);
                            System.out.println("Ahora tienes: " + usuario.getPuntos() + " puntos");
                            i = preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size();
                        } else {
                            usuario.setGanaPuntos(false);
                            usuario.setPuntos(0);
                            System.out.println("No haz acertado, debes estudiar mas");
                            //System.out.println("Llegaste hasta la ronda " + (i + 1));
                            i = preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size();
                        }
                    } else {
                        i++;
                    }
                } while (i != preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size());
            }
            default -> {
                System.out.println("\nDecidiste no jugar\nEstudia y vuelve en otra ocasion");
                usuario.setGanaPuntos(false);
                System.exit(0);
            }
        }
    }

//    public static void salir(int puntos) {
//        System.out.println("Quedaste con " + puntos + " puntos");
//        System.out.println("Fin del juego");
//        System.exit(0);
//    }
}

