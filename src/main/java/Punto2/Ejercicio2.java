package Punto2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leerOpciones = new Scanner(System.in);
        System.out.println("Favor ingresa los numeros a comparar: ");
        System.out.println("\n Ingresa el primer numero:  ");
        float var1 = Integer.parseInt(leerOpciones.nextLine());
        System.out.println("\n Ingresa el segundo numero:  ");
        float var2 = Integer.parseInt(leerOpciones.nextLine());

        if (var1>var2)
        {
            System.out.println("El primero numero es mayor que el segundo");
        }
        else if(var1<var2)
        {
            System.out.println(" El segundo numero es mayor que el primero");
        }
        else{System.out.println("Los numeros son iguales");}
    }
}
