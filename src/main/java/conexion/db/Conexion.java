/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DIDIER JAVIER
 */
public class Conexion {//Clase para establecer la conexion a la BD con MYSQL
    
    public Connection get_connection() {//Metodo para obtener la conexion a la BD
        Connection connection = null;
        try {
            //Se emplea la configuración por defecto que trae el paquete XAMPP. El usuario por defecto es <root> y no tiene 
            //contraseña. Si se tiene un nombre distinto a la BD, donde dice <resultadoJuego_app>, se cambia por el nombre que se le haya
            //dado a la BD
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/resultadoJuego_app", "root", "");
            if(connection != null) {
                System.out.println("\nConexion exitosa\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
