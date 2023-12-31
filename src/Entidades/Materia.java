package Entidades;

public class Materia {
    private int idMateria,year;
    private String nombre;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, int year, String nombre, boolean estado) {
        this.idMateria = idMateria;
        this.year = year;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Materia(int year, String nombre, boolean estado) {
        this.year = year;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", year=" + year + ", nombre=" + nombre + '}';
    }
    
}
