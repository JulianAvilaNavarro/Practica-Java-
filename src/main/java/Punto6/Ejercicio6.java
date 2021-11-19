package Punto6;

public class Ejercicio6 {

    public static void main(String[] args)
    {
        System.out.println("Numeros del 1 al 100: ");
        int i=1;
        for(i = 1; i<=100;i++)
            if(i%2!=0)
                System.out.println(i);
                i++;
            if(i>100){System.out.println("100");}
    }
}
