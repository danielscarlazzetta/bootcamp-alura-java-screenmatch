package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.model.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {

        return tiempoTotal;
    }


    public void include(Titulo titulo){

        this.tiempoTotal += titulo.getDuracionMinutos();
    }

}
