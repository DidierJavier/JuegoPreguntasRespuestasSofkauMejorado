/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.menu;

import com.softku.juegopreguntassofkau.Pregunta;
import com.softku.juegopreguntassofkau.Usuario;
import conexion.db.UsuarioService;
import java.util.Scanner;

/**
 *
 * @author DIDIER JAVIER
 */
public class UIMenu {

    //private static Usuario usuario;
//Menú inicial donde se explica el funcionamiento del juego y se da la opción de iniciarJuegoContinuar o salir
    public static int verMenuInicial() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Bienvenido al concurso de preguntas y respuestas");
        System.out.println("El juego consta de cinco rondas; una pregunta en cada ronda");
        System.out.println("Te puedes retirar cuando quieras y quedas con los puntos acumulados");
        System.out.println("Si continuas y pierdes, tambien pierdes todos los puntos");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Selecciona una opcion valida");
        int usuarioEmpiezaJuegoO_Sale = 2;
        do {                            //El ciclo se repite hasta que el usuario seleccione la opcion 1 o la 2
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

    //Metodo para validar si el usuario se quiere retirar al momento de leer una pregunta
    public static void continuarJugando_O_retirarse_puntos(Pregunta preguntaPorCategoriaAleatoria, Usuario usuario) {
        System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
        System.out.println("Digite otra letra si desea retirarse");
        Scanner sc = new Scanner(System.in);
        char respuestaUsuario = Character.toUpperCase(sc.nextLine().charAt(0));
        int i = 0;
        int j = 10;
        switch (respuestaUsuario) {
            case 'A', 'B', 'C', 'D' -> {
                do {    //Ciclo que se repite hasta encontrar el tamanio de las respuestas por cada pregunta
                    //o hasta obtener un caracter valido ingresado por el usuario (A, B, C, D)
                    //Si el caracter que ingreso el usuario corresponde a la respuesta verdadera, el usuario gana
                    if (respuestaUsuario == preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().get(i).getCaracterABCD()) {
                        if (preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().get(i).isAcierto()) {
                            System.out.println("Excelente, haz acertado la pregunta de la ronda ");
                            usuario.setGanaPuntos(true);
                            usuario.setPuntos((int) Math.pow(j, 2) + usuario.getPuntos() * 20);
                            System.out.println("Ahora tienes: " + usuario.getPuntos() + " puntos");
                            i = preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size();
                        } else {//De lo contrario el usuario pierde
                            usuario.setGanaPuntos(false);
                            usuario.setPuntos(0);
                            System.out.println("No haz acertado, debes estudiar mas");
                            i = preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size();
                        }
                    } else {
                        i++;
                    }
                } while (i != preguntaPorCategoriaAleatoria.getRespuestasPorCadaPregunta().size());
            }
            default -> {
                System.out.println("\nDecidiste no jugar\nEstudia y vuelve en otra ocasion");
                System.out.println("El usuario se retiro del juego\n");
                usuario.setGanaPuntos(false);
            }
        }
    }
    
    public static void enlazarUsuarioA_conexion(Usuario usuario) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-------------------------------------");
            System.out.println("Persistencia de datos para el juego");
            System.out.println("1. Enviar usuario a la BD");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Editar usuario");
            System.out.println("5. Salir");
            //Leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> UsuarioService.recibirUsuario(usuario);
                case 2 -> UsuarioService.listarUsuarios();
                case 3 -> UsuarioService.borrarUsuario();
                case 4 -> UsuarioService.editarUsuario();
                default -> {
                }
            }
            
        }while(opcion != 5);
    }
}

