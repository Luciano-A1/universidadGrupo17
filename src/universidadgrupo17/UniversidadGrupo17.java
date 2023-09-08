package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import Entidades.Alumno;
import java.time.LocalDate;

public class UniversidadGrupo17 {


    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        AlumnosDatos.guardarAlumno(alu1);
        
      
    }
    
}
