package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import AccesoDatos.InscripcionDatos;
import AccesoDatos.MateriaDatos;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;

public class UniversidadGrupo17 {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno(1, 41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        Alumno alu2 = new Alumno(41885865, "Hernandez", "Juan", LocalDate.of(1998, 2, 24), false);
        Alumno alu3 = new Alumno(42285655, "Bonacci", "Guadalupe", LocalDate.of(1998, 6, 24), true);
        Alumno alu4 = new Alumno(41885677, "Molina", "Luciano", LocalDate.of(1998, 1, 14), true);
        Alumno alu5 = new Alumno(5, 41995677, "Galeassi", "María Florencia", LocalDate.of(1998, 4, 14), true);

//------------------------------------------------------------------------------
        Materia m1 = new Materia(1, 1, "Matematicas", true);
        Materia m2 = new Materia(2, 1, "Historia", true);
        Materia m3 = new Materia(3, 2, "Comunicaión", false);
        Materia m4 = new Materia(4, 1, "Programación I", true);
        Materia m5 = new Materia(2, "Programación II", true);
        
       // MateriaDatos.guardarMateria(m5);
       //MateriaDatos.eliminarMateria(5);
        
        
        //MateriaDatos.listarMaterias();
//        MateriaDatos.modicarMateria(m1);
//        MateriaDatos.modicarMateria(m2);
//        MateriaDatos.modicarMateria(m3);
//        MateriaDatos.modicarMateria(m4);

//------------------------------------------------------------------------------
Inscripcion insc1= new Inscripcion(7, alu1, m1);
        

InscripcionDatos.guardarInscripcion(insc1);


    }

}
