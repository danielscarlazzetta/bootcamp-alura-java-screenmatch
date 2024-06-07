package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtrar(Clasificacion clasificacion){

        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Peliculas recomendadas");
        }else if(clasificacion.getClasificacion() == 2){
            System.out.println("Pelicula no tan recomendada");
        }else{
            System.out.println("Agregalo en tu lista mas tarde");
        }
    }
}
