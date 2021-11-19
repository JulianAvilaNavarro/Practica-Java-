package Punto13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("La fecha y hora en el formato (AAAA/MM/DD) (HH:MM:SS) son: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));

    }
}
