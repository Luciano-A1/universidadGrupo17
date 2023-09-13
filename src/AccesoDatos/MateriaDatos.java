package AccesoDatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    public static List<Materia> listaMaterias = new ArrayList<>();

    public static void guardarMateria(Materia materia) {

        String sql = "insert into materia(nombre, año, estado) value(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getYear());
            ps.setBoolean(3, materia.isEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                System.out.println("Se agrego con exito al ID");
            } else {
                System.out.println("no se obtuvo al ID");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, ">>> Guardado <<<");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + ex.getMessage());

        }

    }

    public static void buscarMateriaPorId(int id) {

        String sql = "select nombre, año from materia where idMateria = ? and estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setYear(rs.getInt("año"));
                materia.setEstado(true);
                System.out.println(materia);

            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Acceso Materia");
        }

    }

    public static void listarMaterias() {
        String sqlMateria = "select * from materia";
        try {
            ps = con.prepareStatement(sqlMateria);
            rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("Nombre"));
                materia.setYear(rs.getInt("Año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                listaMaterias.add(materia);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de materias");
        }
        System.out.println("---> Lista de Materias");
        for (Materia materia : listaMaterias) {
            System.out.println(materia.toString());
            
        }
    }

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
    
    public static void eliminarMateria(int id){
         String sql = "update materia set estado = 0 where idMateria = ?";
         
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "---> Materia Eliminada");
            }else{
                JOptionPane.showMessageDialog(null, "---> Materia inactiva");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Materia" + ex.getMessage());
        }
         
    }


}
