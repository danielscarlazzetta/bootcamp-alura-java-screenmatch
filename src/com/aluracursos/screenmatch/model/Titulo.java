package com.aluracursos.screenmatch.model;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;


    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void muestraFicvhaTecnica(){
        System.out.println("Nombre de pelicula: " + nombre);
        System.out.println("Fecha estreno " + fechaLanzamiento);
        System.out.println("Duracion " + getDuracionMinutos());
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calcula(){
        return sumaEvaluaciones/totalEvaluaciones;
    }
}
