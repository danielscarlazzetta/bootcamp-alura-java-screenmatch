package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.model.Pelicula;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void include(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionMinutos();
    }
}
