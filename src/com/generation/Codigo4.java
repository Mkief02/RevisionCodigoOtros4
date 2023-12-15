/**
 * Se importó la dependencia de java.util.Scanner porque se utiliza
 * para leer la entrada del usuario. Además se le agregó como argumento
 * System.in al Scanner para recibir el String del usuario. Se elminó
 * el scanner de uno de los jugadores, no era necesario.
 * Se agregó el método main para poder ejecutar el programa.
 * Se modificó la forma en que se compara el registro del jugador uno y dos.
 * Para esto se utilizaban los caracteres "==", lo que no es correcto
 * en Java, lo correcto es utilizar el método ".equals" o, en este caso,
 * ".equalsIgnoreCase" para comparar la cadena sin considerar las mayúsculas
 * o minúsculas.
 * Se agregaron algunos "break" necesarios en los cases del switch utilizados.
 */


package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scan.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scan.nextLine();

        if (j1.equalsIgnoreCase(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equalsIgnoreCase("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equalsIgnoreCase("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equalsIgnoreCase("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }
        scan.close();
    }
}
