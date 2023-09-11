package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import Entidades.Alumno;
import java.time.LocalDate;

public class UniversidadGrupo17 {


    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        Alumno alu2 = new Alumno(41885865, "Hernandez", "Juan", LocalDate.of(1998, 2, 24), false);
        Alumno alu3 = new Alumno(42285655, "Bonacci", "Guadalupe", LocalDate.of(1998, 6, 24), true);
        Alumno alu4 = new Alumno(41885677, "Molina", "Luciano", LocalDate.of(1998, 1, 14), true);
        AlumnosDatos.buscarAlumnosPorDni(41885865);
//        AlumnosDatos.guardarAlumno(alu2);
//        AlumnosDatos.guardarAlumno(alu3);
//        AlumnosDatos.guardarAlumno(alu4);
//        AlumnosDatos.buscarAlumnosPorId(1);
        
      
    }
    
}
