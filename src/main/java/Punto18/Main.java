package Punto18;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        Serie serie2 = new Serie("The Flash","Greg Berlanti");
        Serie serie3 = new Serie("SmallVille","Accion", "Alfred Gough", 7);
        Serie serie4 = new Serie("Green Arrow","Accion", "Mort Weisinger", 8);
        Serie serie5 = new Serie("Avatar la leyenda de aang","Michael Dante DiMartino");

        Videojuego Videojuego1 = new Videojuego();
        Videojuego Videojuego2 = new Videojuego("Crash Team Raicing",1000);
        Videojuego Videojuego3 = new Videojuego("DBZ Budokai 3","Aventura","BANDAI",2500);
        Videojuego Videojuego4 = new Videojuego("HALO 2","SHOTTER","MICROSOFT",5000);
        Videojuego Videojuego5 = new Videojuego("Guitar Hero 3",1000);

        Serie[] series ={serie1, serie2, serie3, serie4, serie5};
        Videojuego[] videoJuegos={Videojuego1, Videojuego2, Videojuego3, Videojuego4, Videojuego5};
        series[2].prestar();
        series[3].prestar();
        series[4].prestar();
        videoJuegos[2].prestar();
        videoJuegos[3].prestar();
        videoJuegos[4].prestar();


        int cantidadEntregados=0;
        for (Serie s: series) {
            if (s.isPrestado()){
                cantidadEntregados+=1;
                s.devolver();
            }
        }
        for (Videojuego v: videoJuegos) {
            if (v.isPrestado()){
                cantidadEntregados+=1;
                v.devolver();
            }
        }
        System.out.println("Hay "+cantidadEntregados +" entregados entre video juegos y series\n\t");

        Videojuego juegoMasHoras = videoJuegos[0];
        Serie serieMasTemporadas = series[0];

        for (int i = 1; i < videoJuegos.length; i++) {
            if (videoJuegos[i].compareTo(juegoMasHoras)==1){
                juegoMasHoras=videoJuegos[i];
            }
            if (series[i].compareTo(serieMasTemporadas)==1){
                serieMasTemporadas=series[i];
            }
        }

        System.out.println("El video juego con más horas es: "+juegoMasHoras.toString());
        System.out.println("\n\rLa serie con más temporadas es: "+serieMasTemporadas.toString());
    }
}
