import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2022);
        miPelicula.setDuracionMinutos(120);

        miPelicula.evalua(10.0);
        miPelicula.evalua(10.0);
        miPelicula.evalua(7.8);

        miPelicula.muestraFicvhaTecnica();
//        System.out.println("Nota promedio es de: " + miPelicula.sumaEvaluaciones);
//        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calcula());

        System.out.println("**********************");
        System.out.println(miPelicula.getNombre());
        System.out.println(miPelicula.getDuracionMinutos());
        System.out.println(miPelicula.getFechaLanzamiento());
        System.out.println(miPelicula.isIncluidoEnElPlan());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFicvhaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.include(miPelicula);
        calculadora.include(casaDragon);

        System.out.println(calculadora.getTiempoTotal());

        System.out.println("**********************");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("cac");
        otraPelicula.setFechaLanzamiento(1999);
        otraPelicula.setDuracionMinutos(187);

        calculadora.include(otraPelicula);
        System.out.println("asd: " + calculadora.getTiempoTotal());

        System.out.println("**********************");

        Pelicula otraPelicula2 = new Pelicula();
        otraPelicula2.setNombre("Matrix");
        otraPelicula2.setFechaLanzamiento(1990);
        otraPelicula2.setDuracionMinutos(199);

        calculadora.include(otraPelicula2);
        System.out.println("asd 22: " + calculadora.getTiempoTotal());
        System.out.println("**********************");

        FiltroRecomendaciones filtroRecomendacion = new FiltroRecomendaciones();
        filtroRecomendacion.filtrar(miPelicula);


        System.out.println("**********************");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa del Dragonite");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtrar(episodio);
    }
}

