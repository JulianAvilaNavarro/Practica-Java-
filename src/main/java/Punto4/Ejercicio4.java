package Punto4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args)
    {
        Scanner leerOpciones = new Scanner(System.in);
        System.out.println("Calculo el precio con IVA de un producto");
        System.out.println("Nota: usar puntos en vez de comas para decimales ");
        System.out.println("Favor ingresa el valor del producto en pesos (usar puntos en vez de comas): ");
        double precio = Double.parseDouble(leerOpciones.nextLine());
        double precioIva =precio*0.21+precio;
        System.out.println("El valor del producto es: "+precioIva+ " pesos");
    }
}


