package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import AccesoDatos.InscripcionDatos;
import AccesoDatos.MateriaDatos;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;
import java.time.Month;

public class UniversidadGrupo17 {

    public static void main(String[] args) {
        //********************Alumnos********************

        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        Alumno alu2 = new Alumno(41885865, "Hernandez", "Juan", LocalDate.of(1998, 2, 24), false);
        Alumno alu3 = new Alumno(42285655, "Bonacci", "Guadalupe", LocalDate.of(1998, 6, 24), true);
        Alumno alu4 = new Alumno(41885677, "Molina", "Luciano", LocalDate.of(1998, 1, 14), true);
        Alumno alu5 = new Alumno(41995677, "Galeassi", "María Florencia", LocalDate.of(1998, 4, 14), true);
        Alumno alu6 = new Alumno(55094020,"Fuenzalida","Evaristo",LocalDate.of(2001, 11, 13),true);
        Alumno alu7 = new Alumno(57157050,"Cayuqueo","Camila",LocalDate.of(2002,12,5),false);
        Alumno alu8 = new Alumno(54369140,"Roncaglia","Romero",LocalDate.of(2003,5,15),true);
//        AlumnosDatos.guardarAlumno(alu6);
//        AlumnosDatos.guardarAlumno(alu7);
//        AlumnosDatos.guardarAlumno(alu8);
//        AlumnosDatos.listaAlumno();
//------------------------------------------------------------------------------
 //********************Materias********************
        Materia m1 = new Materia(1, "Matemáticas", true);
        Materia m2 = new Materia(1, "Historia", true);
        Materia m3 = new Materia(2, "Comunicación", false);
        Materia m4 = new Materia(1, "Programación I", true);
        Materia m5 = new Materia(2, "Programación II", true);
        Materia m6=new Materia(3,"Fundamentos filosóficos de la programación",true);
        Materia m7 = new Materia(3,"Programación III",false);
        Materia m8 = new Materia(3,"Cyberliteratura",true);
        
//        MateriaDatos.guardarMateria(m8);
//        MateriaDatos.guardarMateria(m7);
//        MateriaDatos.guardarMateria(m6);
//        MateriaDatos.guardarMateria(m5);
//        MateriaDatos.guardarMateria(m4);
//        MateriaDatos.guardarMateria(m3);
//        MateriaDatos.guardarMateria(m2);
//        MateriaDatos.guardarMateria(m1);
        
//        MateriaDatos.listarMaterias();
//------------------------------------------------------------------------------
 //********************Inscripción********************
        Alumno al1 = AlumnosDatos.buscarAlumnosPorId(1);
        Materia mat1 = MateriaDatos.buscarMateriaPorId(3);
        Alumno al2=AlumnosDatos.buscarAlumnosPorId(8);
        Alumno al3=AlumnosDatos.buscarAlumnosPorId(4);
        Alumno al4=AlumnosDatos.buscarAlumnosPorId(6);
        Materia mat2=MateriaDatos.buscarMateriaPorId(9);
        Materia mat3=MateriaDatos.buscarMateriaPorId(4);
        Materia mat4=MateriaDatos.buscarMateriaPorId(8);
                      
        Inscripcion insc1 = new Inscripcion(8, al2, mat1);
        Inscripcion insc2 = new Inscripcion(7, al2, mat3);
        Inscripcion insc3 = new Inscripcion(5, al1, mat1);
        Inscripcion insc4 = new Inscripcion(9, al1, mat4);
        Inscripcion insc5 = new Inscripcion(10, al3, mat2);
        Inscripcion insc6 = new Inscripcion(2, al3, mat4);
        Inscripcion insc7 = new Inscripcion(6, al4, mat2);
        Inscripcion insc8 = new Inscripcion(4, al4, mat3);
        
//        InscripcionDatos.guardarInscripcion(insc1);
//        InscripcionDatos.guardarInscripcion(insc2);
//        InscripcionDatos.guardarInscripcion(insc3);
//        InscripcionDatos.guardarInscripcion(insc4);
//        InscripcionDatos.guardarInscripcion(insc5);
//        InscripcionDatos.guardarInscripcion(insc6);
//        InscripcionDatos.guardarInscripcion(insc7);
//        InscripcionDatos.guardarInscripcion(insc8);
//        InscripcionDatos.actualizarNota(4, 2, 5);
//----------       ******************Todas las inscripciones*********************
//          for (Inscripcion inscripcion:InscripcionDatos.obtenerInscripciones()) {
//              System.out.println("ID: "+inscripcion.getIdInscripcion());
//              System.out.println("Apellido: "+inscripcion.getAlumno().getApellido());
//              System.out.println("Nombre: "+inscripcion.getAlumno().getNombre());
//              System.out.println("Materia: "+inscripcion.getMateria().getNombre());
//              System.out.println("Año: "+inscripcion.getMateria().getYear());
//              System.out.println("*******************************************");
//        }
//----------       ******************Inscripciones por Alumno*********************    
//          for(Inscripcion inscripcion:InscripcionDatos.obtenerInscripcionPorAlumno(8)){
//              System.out.println("ID: "+inscripcion.getIdInscripcion());
//              System.out.println("Apellido: "+inscripcion.getAlumno().getApellido());
//              System.out.println("Nombre: "+inscripcion.getAlumno().getNombre());
//              System.out.println("Materia: "+inscripcion.getMateria().getNombre());
//              System.out.println("Año: "+inscripcion.getMateria().getYear());
//              System.out.println("****************************************");
//          }
//----------       ******************Materias Cursadas*********************   
//           for (Materia materia:InscripcionDatos.obtenerMateriasCursadas(8)) {
//                System.out.println("Nombre: "+materia.toString());
//        }
//----------       ******************Materias No Cursadas********************* 
//           for (Materia materia:InscripcionDatos.obtenerMateriasNoCursadas(1)) {
//                System.out.println("Nombre: "+materia.toString());
//        }
//----------       ******************Alumnos por Materia********************* 
//             for(Alumno alumno:InscripcionDatos.obtenerAlumnosPorMateria(8)){
//                  System.out.println("ID: "+alumno.getIdAlumno());
//                  System.out.println("DNI: "+alumno.getDni());
//                  System.out.println("Apellido: "+alumno.getApellido());
//                  System.out.println("Nombre "+alumno.getNombre());
//                  System.out.println("Fecha de Nacimiento: "+alumno.getFechaNacimiento());
//                  System.out.println("Estado: "+alumno.isEstado());
//                  System.out.println("****************************************");
//          }
//          InscripcionDatos.obtenerInscripcionPorAlumno(3);
//          InscripcionDatos.obtenerMateriasCursadas(3);
//          InscripcionDatos.obtenerMateriasNoCursadas(3);



    }

}
