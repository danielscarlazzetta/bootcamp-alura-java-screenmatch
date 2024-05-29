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
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalEvaluaciones());
//        miPelicula.sumaEvaluaciones = 2 ;
//        miPelicula.totalEvaluaciones = 1;
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
    }
}

