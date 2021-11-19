package Punto5;

public class Ejercicio5 {

    public static void main(String[] args)
    {
        System.out.println("Numeros del 1 al 100: ");
        int i=1;
        while(i<=100) {
            if(i%2!=0)
            System.out.println(i);
            i++;
            if(i==100){System.out.println(i);}
        }
    }
}
