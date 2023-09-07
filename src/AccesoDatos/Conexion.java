/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias
 */
public class Conexion {
    private static Conexion singleton;
    public Conexion(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
        }
    }
    public static Connection obtenerConexion(){
           Connection con=null;
        if(singleton==null){
            singleton=new Conexion();
        }
        try {
//            con=DriverManager.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }
        return con;
    }
}
