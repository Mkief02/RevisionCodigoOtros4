/**
 * Se importó la dependencia de java.util.Scanner porque se utiliza
 * para leer la entrada del usuario. Además se le agregó como argumento
 * System.in al Scanner para recibir el String del usuario. Se elminó
 * el scanner de uno de los jugadores, no era necesario.
 * En la cadena de texto que recibe "scan" se le agregó el método ".toLowerCase()"
 * para que convierta siempre la cadena a minúsculas y se realicen las comparaciones
 * correctamente en cualquier caso.
 * Se agregó el método main para poder ejecutar el programa.
 * Se modificó la forma en que se compara el registro del jugador uno y dos.
 * Para esto se utilizaban los caracteres "==", lo que no es correcto
 * en Java, lo correcto es utilizar el método ".equals".
 * Se agregaron algunos "break" necesarios en los cases del switch utilizados.
 * Se agregó el método ".close()" al scanner para terminar el proceso al final de main.
 */


package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scan.nextLine().toLowerCase();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scan.nextLine().toLowerCase();

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
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
