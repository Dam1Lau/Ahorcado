/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Utilidades {


    public static int pedirNumero() {
        int numero = 0;
        boolean noEsNumero;
        Scanner lector = new Scanner(System.in);
        do {
            try {
                noEsNumero = false;
                numero = lector.nextInt();

            } catch (InputMismatchException e) {
                noEsNumero = true;
                System.out.println("Introduce un número, no un carácter");
                lector.nextLine();
            }
        } while (noEsNumero);
        return numero;
    }

    
    // APUNTES:
    /*
        1. En la parte de meter una palabra, en vez de comprobar todas las entradas
           crear una exception en la que si no cumple eso salte el mensaje.
    
    */
    
}
