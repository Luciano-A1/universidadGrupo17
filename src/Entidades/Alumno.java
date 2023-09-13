package Entidades;

import AccesoDatos.AlumnosDatos;
import java.time.LocalDate;
import java.util.List;

public class Alumno {
    private int idAlumno,dni;
    private String apellido,nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return   "Id: " + idAlumno+"\n"+
                 "DNI: "+dni+"\n"+
                 "Apellido: "+apellido+"\n"+
                 "Nombre: " + nombre+"\n"+
                 "Fecha de nacimiento: " + fechaNacimiento+"\n"+
                 "Estado: " + estado+"\n"+
            "******************************";
    }
    
//    public Alumno obtenerAlumnoCompleto(Alumno alumno) {
//        List<Alumno> listaAlu = AlumnosDatos.listaA;
//        Alumno alu = new Alumno();
//        for (Alumno objAlu : listaAlu) {
//            if (alumno.getDni() == objAlu.getDni()) {
//                alu.setIdAlumno(objAlu.getIdAlumno());
//                alu.setDni(objAlu.getDni());
//                alu.setApellido(objAlu.getApellido());
//                alu.setNombre(objAlu.getNombre());
//                alu.setFechaNacimiento(objAlu.getFechaNacimiento());
//                alu.setEstado(objAlu.isEstado());
//            }
//        }
//        return alu;
//    }
    
    
}
