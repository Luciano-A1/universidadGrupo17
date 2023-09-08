/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo17;

import AccesoDatos.AlumnosDatos;
import Entidades.Alumno;
import java.time.LocalDate;



/**
 *
 * @author Jeremias
 */
public class UniversidadGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno(41885655, "Ledesma", "Jeremias", LocalDate.of(1998, 12, 24), true);
        AlumnosDatos.guardarAlumno(alu1);
        
      
    }
    
}
