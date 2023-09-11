
package AccesoDatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaDatos {
    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static List<Materia> listaM = new ArrayList<>();
    
    
    public static void modicarMateria(Materia materia) {

        String sql = "update materia set nombre = ?, año = ? where idMateria = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getYear());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Materia no Existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Materia" + ex.getMessage());
        }

    }
    
    
    
}
