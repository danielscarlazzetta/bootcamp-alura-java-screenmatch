public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones;
    int totalEvaluaciones;

    void muestraFicvhaTecnica(){
        System.out.println("Nombre de pelicula: " + nombre);
        System.out.println("Fecha estreno " + fechaLanzamiento);
        System.out.println("Duracion " + duracionMinutos);
    }

    void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    double calcula(){
        return sumaEvaluaciones/totalEvaluaciones;
    }
}
