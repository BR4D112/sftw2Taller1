package models;

import java.util.Date;

public class Candidato {
    private String nombre;
    private String apellido;
    private Etnia etnia;
    private double resultadoGlobalIcfes;
    private double resultadoMatematicas;
    private double resultadoIngles;
    private Date fechaInscripcion;

    // Constructor
    public Candidato(String nombre, String apellido, Etnia etnia, double resultadoGlobalIcfes,
                     double resultadoMatematicas, double resultadoIngles, Date fechaInscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.etnia = etnia;
        this.resultadoGlobalIcfes = resultadoGlobalIcfes;
        this.resultadoMatematicas = resultadoMatematicas;
        this.resultadoIngles = resultadoIngles;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public double getResultadoGlobalIcfes() {
        return resultadoGlobalIcfes;
    }

    public void setResultadoGlobalIcfes(double resultadoGlobalIcfes) {
        this.resultadoGlobalIcfes = resultadoGlobalIcfes;
    }

    public double getResultadoMatematicas() {
        return resultadoMatematicas;
    }

    public void setResultadoMatematicas(double resultadoMatematicas) {
        this.resultadoMatematicas = resultadoMatematicas;
    }

    public double getResultadoIngles() {
        return resultadoIngles;
    }

    public void setResultadoIngles(double resultadoIngles) {
        this.resultadoIngles = resultadoIngles;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", etnia='" + etnia + '\'' +
                ", resultadoGlobalIcfes=" + resultadoGlobalIcfes +
                ", resultadoMatematicas=" + resultadoMatematicas +
                ", resultadoIngles=" + resultadoIngles +
                ", fechaInscripcion=" + fechaInscripcion +
                '}';
    }
}
