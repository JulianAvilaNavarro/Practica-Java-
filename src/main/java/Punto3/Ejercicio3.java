package Punto3;
import java.util.Scanner;
import java.math.*;

public class Ejercicio3 {
    public static void main(String[] args)
    {
        Scanner leerOpciones = new Scanner(System.in);
        System.out.println("Calculo área circulo");
        System.out.println("Favor ingresa el radio del circulo en metros: ");
        double radio = Double.parseDouble(leerOpciones.nextLine());
        double area =Math.PI*Math.pow(radio,2);
        System.out.println("El área del circulo es: "+area+ " Metros");
    }
}
