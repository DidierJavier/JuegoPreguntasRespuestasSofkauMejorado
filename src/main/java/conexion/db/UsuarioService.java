/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.db;

import com.softku.juegopreguntassofkau.Usuario;
import java.util.Scanner;

/**
 *
 * @author DIDIER JAVIER
 */
public class UsuarioService {
    public static void recibirUsuario(Usuario usuario) {
        UsuarioDAO.crearUsuarioDB(usuario);
    }
    
    public static void listarUsuarios() {
        UsuarioDAO.leerUsuarioDB();
    }
    
    public static void borrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del usuario a borrar");
        int id_usuario = sc.nextInt();
        UsuarioDAO.borrarUsuarioDB(id_usuario);
    }
    
    public static void editarUsuario() {
        
    }
}
