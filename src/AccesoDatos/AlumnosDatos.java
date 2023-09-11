package AccesoDatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnosDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static List<Alumno> listaA = new ArrayList<>();

    public static void guardarAlumno(Alumno alumno) {

        String sql = "insert into alumno(dni, apellido, nombre, fechaNacimiento, estado) value(?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
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

    public static void buscarAlumnosPorId(int id) {

        String sql = "select dni, apellido, nombre, fechaNacimiento from alumno where idAlumno = ? and estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                System.out.println(alumno);

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no activo");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Acceso Alumno");
        }

    }

    public static void buscarAlumnosPorDni(int dni) {

        String sql = "select idAlumno, dni, apellido, nombre, fechaNacimiento from alumno where dni = ? and estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                System.out.println(alumno);

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no activo");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Acceso Alumno");
        }
    }

    public static void listaAlumno() {
        String sql = "select * from alumno";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                listaA.add(alumno);

            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Lista Registrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Acceso a la tabla de Alumnos");
        }

        System.out.println("---> Lista de Alumnos");
        for (Alumno alu : listaA) {
            System.out.println(alu.toString());
        }
    }

    public static void modicarAlumno(Alumno alumno) {

        String sql = "update alumno set dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? where idAlumno = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Alumno no Existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Alumno" + ex.getMessage());
        }

    }

    public static void eliminarAlumno(int id){
         String sql = "update alumno set estado = 0 where idAlumno = ?";
         
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "---> Alumno Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "---> Alumno ya no activo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Alumno" + ex.getMessage());
        }
         
    }

}
