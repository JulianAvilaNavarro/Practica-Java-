package Punto8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana: ");
        String dia = leer.next();
        dia=dia.toLowerCase();
        switch(dia)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia no laboral.");
            default:
                System.out.println("Introduce un dia de la semana: ");
        }
    }
}

