package com.aluracursos.screenmatch.model;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosEpisodios() {
        return minutosEpisodios;
    }

    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }

//    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosEpisodios;
    }
}
