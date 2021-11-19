package Punto7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args)
    {
        Scanner leerOpciones = new Scanner(System.in);
        System.out.println("Comprobación numero mayor o igual que cero");
        System.out.println("Favor ingresa el numero a evaluar: ");
        double numero;
        do {
            numero = Double.parseDouble(leerOpciones.nextLine());
            System.out.println("Introduce un numero mayor que 0");
        } while(numero <=0);
        System.out.println(" El numero es "+numero);
    }
}
