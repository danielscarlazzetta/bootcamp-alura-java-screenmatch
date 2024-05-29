public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Encanto";
        miPelicula.fechaLanzamiento= 2022;
        miPelicula.duracionMinutos = 120;
        miPelicula.evalua(10.0);
        miPelicula.evalua(10.0);

        miPelicula.muestraFicvhaTecnica();
        System.out.println("Nota promedio es de: " + miPelicula.sumaEvaluaciones);
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calcula());




        Pelicula otraPeli = new Pelicula();
        otraPeli.nombre = "Matrix";
        otraPeli.fechaLanzamiento= 1998;
        otraPeli.duracionMinutos = 180;

        //otraPeli.muestraFicvhaTecnica();
    }
}

