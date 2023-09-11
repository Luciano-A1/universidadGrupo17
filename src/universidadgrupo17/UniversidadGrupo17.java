package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import AccesoDatos.MateriaDatos;
import Entidades.Alumno;
import Entidades.Materia;
import java.time.LocalDate;

public class UniversidadGrupo17 {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        Alumno alu2 = new Alumno(41885865, "Hernandez", "Juan", LocalDate.of(1998, 2, 24), false);
        Alumno alu3 = new Alumno(42285655, "Bonacci", "Guadalupe", LocalDate.of(1998, 6, 24), true);
        Alumno alu4 = new Alumno(41885677, "Molina", "Luciano", LocalDate.of(1998, 1, 14), true);
//        Alumno alu5 = new Alumno(7, 41995677, "Galeassi", "Maria", LocalDate.of(1998, 4, 14), true);
//        AlumnosDatos.modicarAlumno(alu5);
//        AlumnosDatos.guardarAlumno(alu1);
//        AlumnosDatos.guardarAlumno(alu2);
//        AlumnosDatos.guardarAlumno(alu3);
//        AlumnosDatos.guardarAlumno(alu4);

//        AlumnosDatos.listaAlumno();
//        AlumnosDatos.eliminarAlumno(7);
//        AlumnosDatos.buscarAlumnosPorId(7);
//------------------------------------------------------------------------------
        Materia m1 = new Materia(1, 1, "Matematicas", true);
        Materia m2 = new Materia(2, 2, "Historia", true);
        Materia m3 = new Materia(3, 3, "Comunicaión", false);
        Materia m4 = new Materia(4,1, "Programación I", true);
        
//        MateriaDatos.modicarMateria(m4);
//        MateriaDatos.modicarMateria(m3);
//        MateriaDatos.modicarMateria(m2);
//        MateriaDatos.modicarMateria(m1);

//        MateriaDatos.guardarMateria(m1);
//        MateriaDatos.guardarMateria(m2);
//        MateriaDatos.guardarMateria(m3);
//        MateriaDatos.guardarMateria(m4);
//        MateriaDatos.buscarMateriaPorId(2);
    }

}
