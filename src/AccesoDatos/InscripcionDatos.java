package AccesoDatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
   

    public static void guardarInscripcion(Inscripcion insc) {

        String sql = "insert into inscripcion (nota, idAlumno, idMateria) value(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                System.out.println("Se genero el ID Inscripcion");
            } else {
                System.out.println("no se genero el ID Inscripcion");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, ">>> Guardado <<<");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + ex.getMessage());

        }

    }

    public static void actualizarNota(int IdAlumno, int idMateria, int nota) {
        String sql = "update inscripcion set nota = ? where idAlumno = ? and idMateria = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, IdAlumno);
            ps.setInt(3, idMateria);

            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Al acceder a la tabla inscripcion");
        }

    }
    
    public static void borrarInscripcionMatAlu(int idAlumno, int idMateria){
        String sql = "delete from inscripcion where idAlumno = ? and idMateria = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int fila = ps.executeUpdate();
            if (fila>0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Al acceder a la tabla inscripcion");
        }
    }
    
    public static  List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> listaInsc = new ArrayList<>();
        String sqlBusqueda="select * from inscripcion";
        try {
            ps=con.prepareStatement(sqlBusqueda);
            rs=ps.executeQuery();
            while(rs.next()){
                 Inscripcion inscripcion=new Inscripcion();
                 inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                 Alumno alumno=AlumnosDatos.buscarAlumnosPorId(rs.getInt("idAlumno"));
                 Materia materia=MateriaDatos.buscarMateriaPorId(rs.getInt("idMateria"));

                 inscripcion.setAlumno(alumno);
                 inscripcion.setMateria(materia);
                 inscripcion.setNota(rs.getInt("Nota"));
                 listaInsc.add(inscripcion);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a los datos de las tablas"+ex.getMessage());
        }
       
           return listaInsc;
    }
    
    public static List<Inscripcion> obtenerInscripcionPorAlumno(int id){
        List<Inscripcion> listaInsc = new ArrayList<>();
        String sqlBusqueda="select * from inscripcion where idAlumno=?";
        try {
            ps=con.prepareStatement(sqlBusqueda);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno=AlumnosDatos.buscarAlumnosPorId(rs.getInt("idAlumno"));
                Materia materia=MateriaDatos.buscarMateriaPorId(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getInt("Nota"));
                listaInsc.add(inscripcion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a los datos de las tablas"+ex.getMessage());
        }
        return listaInsc;
        
    }
    
    public static List<Materia> obtenerMateriasCursadas(int idA){
        List<Materia> materia=new ArrayList<>();
//       String sqlBusqueda="SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON(inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno =?";
        String sqlBusqueda="select inscripcion.idMateria,nombre,año,estado from inscripcion,materia where inscripcion.idMateria=materia.idMateria and inscripcion.idAlumno=?";
        try {
            ps=con.prepareStatement(sqlBusqueda);
            ps.setInt(1,idA);
            rs=ps.executeQuery();
            while(rs.next()){
                Materia materia1 = new Materia();
                materia1.setIdMateria(rs.getInt("idMateria"));
                materia1.setNombre(rs.getString("Nombre"));
                materia1.setYear(rs.getInt("Año"));
                materia1.setEstado(rs.getBoolean("estado"));
                materia.add(materia1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a los datos de la tabla inscripción"+ex.getMessage());
        }
        return materia;
 
    }
    
    public static List<Materia> obtenerMateriasNoCursadas(int idA){
        List<Materia> materiaNoCursadas=new ArrayList<>();
        
        String sqlBusqueda="select * from materia where estado=1 and idMateria not in (select idMateria from inscripcion where idAlumno=?)";
        try {
            ps=con.prepareStatement(sqlBusqueda);
             ps.setInt(1,idA);
            rs=ps.executeQuery();
            while(rs.next()){
                Materia materiaNo = new Materia();
                materiaNo.setIdMateria(rs.getInt("idMateria"));
                materiaNo.setNombre(rs.getString("Nombre"));
                materiaNo.setYear(rs.getInt("Año"));
                materiaNo.setEstado(rs.getBoolean("estado"));
                materiaNoCursadas.add(materiaNo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a los datos de la tabla inscripción"+ex.getMessage());
        }
        return materiaNoCursadas;
    }
    
    public static List<Alumno> obtenerAlumnosPorMateria(int idM){
        List<Alumno> alumnosPorMateria=new ArrayList<>();
        String sqlBusqueda="select alumno.idAlumno,dni,nombre,apellido,fechaNacimiento,estado from inscripcion,alumno where inscripcion.idAlumno=alumno.idAlumno and idMateria=? and alumno.estado=1";
        try {
            ps=con.prepareStatement(sqlBusqueda);
            ps.setInt(1, idM);
            rs=ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("DNI"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosPorMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a los datos de las tablas"+ex.getMessage());
        }
        return alumnosPorMateria;
    }
}
