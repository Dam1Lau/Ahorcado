/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Ahorcado {

    /**
     * TODOS LOS METODOS EN LOS QUE TENGA QUE INTRODUCIR UNA OPCION DE 1 O 2 EN
     * UNA MISMA CLASE UTILIDADES PARA QUE LA EXCEPCION LA PILLE AHI?
     */
    public static void menuPrincipal(Jugador jugador, GestorDiccionario gestor, JuegoAhorcado juego) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        System.out.println("******************* INICIAR JUEGO *******************");
        do {
            System.out.println("___________________________________\nQué quiere hacer: \n1. Jugar \n2. Editar diccionario. \n3. Salir \n___________________________________");
            opcion = Utilidades.pedirNumero();
            switch (opcion) {
                case 1:  //JUGAR
                    int dificultad;
                    System.out.println("Dificultad: 1. Facil    2. Medio    3.Difícil");
                    do {                        
                        dificultad = Utilidades.pedirNumero();
                    } while (dificultad <1 || dificultad >3);
                    juego.Jugar(jugador, gestor.obtenerDiccionario(dificultad));
                    break;
                case 2: // EDITAR
                     gestor.menu();
                    break;
                case 3: // BYE
                    System.out.println("¡Bye!");
                    break;
                default:
                    System.out.println("Ese número no hace na.");
            }
        } while (opcion != 3);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        JuegoAhorcado test =  JuegoAhorcado.getJuego();
        menuPrincipal(new Jugador(), new GestorDiccionario(), test);
        
    }

}
