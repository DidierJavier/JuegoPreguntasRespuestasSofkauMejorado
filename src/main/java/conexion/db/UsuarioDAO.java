/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.db;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.softku.juegopreguntassofkau.Usuario;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DIDIER JAVIER
 */
public class UsuarioDAO {
    
    public static void crearUsuarioDB(Usuario usuario) {
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO juegopreguntasrespuestas(nombreUsuario, puntos) VALUES (?, ?)";
                ps = (PreparedStatement) conexion.prepareStatement(query);
                ps.setString(1, usuario.getNombreUsuario());
                ps.setInt(2, usuario.getPuntos());
                ps.executeUpdate();
                System.out.println("Usuario creado correctamente en BD");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void leerUsuarioDB() {
        
    }
    
    public static void borrarUsuarioDB(int id_usuario) {
        
    }
    
    public static void actualizarUsuarioDB(Usuario usuario) {
        
    }
}
