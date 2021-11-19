package Punto17;

public class Main {
    public static void main(String[] args)
    {
        double TotalPrecioElec=0;
        double TotalPrecioLavadoras=0;
        double TotalPrecioTelevisores=0;
        //creacion de objetos para llenar el array
        Electrodomestico Horno = new Electrodomestico();
        Electrodomestico Licuadora = new Electrodomestico(300,2);
        Electrodomestico equipoSonido = new Electrodomestico(500,3);
        Electrodomestico Plancha = new Electrodomestico(150,"blanco",'g',1);
        Televisor Televisor = new Televisor();
        Televisor Televisor2 = new Televisor(6000,10);
        Televisor Televisor3 = new Televisor(7800,"lila",'F',18,50,true);
        Lavadora Lavadora1 = new Lavadora();
        Lavadora Lavadora2 = new Lavadora(2000,10);
        Lavadora Lavadora3 = new Lavadora(3000,"Rojo",'B',15,30);

        //llenar datos
        Electrodomestico [] Electrodomesticos =
                {Horno,
                Licuadora,
                equipoSonido,
                Plancha,
                Televisor,
                Televisor2,
                Televisor3,
                Lavadora1,
                Lavadora2,
                Lavadora3,
              };

        for (Electrodomestico e: Electrodomesticos) {
            if(e instanceof Electrodomestico ){
                TotalPrecioElec+=e.precioFinal();
            }
            if (e instanceof  Lavadora){
                TotalPrecioLavadoras+=e.precioFinal();
            }
            if(e instanceof  Televisor){
                TotalPrecioTelevisores+=e.precioFinal();
            }
        }
        double precioTotal=TotalPrecioElec+TotalPrecioLavadoras+TotalPrecioTelevisores;
        System.out.println("******************* Calculador precios electrodomesticos ****************");
        System.out.println("EL precio de los electrodomesticos es "+TotalPrecioElec+" Euros.");
        System.out.println("EL precio de las lavadoras es "+TotalPrecioLavadoras+" Euros.");
        System.out.println("EL precio de los televisores es "+TotalPrecioTelevisores+" Euros.");
        System.out.println("Total acumulado: "+precioTotal+" Euros.");
        System.out.println("************************************************************************");

    }
}
