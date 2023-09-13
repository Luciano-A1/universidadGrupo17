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

        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        Alumno alu2 = new Alumno(41885865, "Hernandez", "Juan", LocalDate.of(1998, 2, 24), false);
        Alumno alu3 = new Alumno(42285655, "Bonacci", "Guadalupe", LocalDate.of(1998, 6, 24), true);
        Alumno alu4 = new Alumno(41885677, "Molina", "Luciano", LocalDate.of(1998, 1, 14), true);
        Alumno alu5 = new Alumno(41995677, "Galeassi", "María Florencia", LocalDate.of(1998, 4, 14), true);

//        AlumnosDatos.listaAlumno();
//------------------------------------------------------------------------------
        Materia m1 = new Materia(1, "Matematicas", true);
        Materia m2 = new Materia(1, "Historia", true);
        Materia m3 = new Materia(2, "Comunicaión", false);
        Materia m4 = new Materia(1, "Programación I", true);
        Materia m5 = new Materia(2, "Programación II", true);

//        MateriaDatos.listarMaterias();
//------------------------------------------------------------------------------
<<<<<<< Updated upstream
//        Alumno alumnoX = AlumnosDatos.buscarAlumnosPorDni(41885677);
//        Materia materiaX = MateriaDatos.buscarMateriaPorId(2);
//        Inscripcion insc1 = new Inscripcion(10, alumnoX, materiaX);
//        InscripcionDatos.guardarInscripcion(insc1);
//        InscripcionDatos.actualizarNota(4, 2, 5);
        System.out.println("");
=======
        
      Inscripcion insc1 = new Inscripcion(10, alu1.obtenerAlumnoCompleto(alu1), m2.obtenerMateriaCompleto(m2));

      InscripcionDatos.guardarInscripcion(insc1);
>>>>>>> Stashed changes

    }

}
