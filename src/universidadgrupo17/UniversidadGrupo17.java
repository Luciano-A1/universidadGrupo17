/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo17;

import AccesoDatos.Conexion1;
import java.sql.Connection;

/**
 *
 * @author Jeremias
 */
public class UniversidadGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con=null;
        con=Conexion1.getConexion();
    }
    
}
