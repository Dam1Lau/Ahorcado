/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Laura
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        GestorDiccionario gest = new GestorDiccionario();
//        gest.menu();
        
        Jugador jug = new Jugador();
        Diccionario dic = new Diccionario(new String[]{"Hola","Adios","Arriba","Abajo","Derecha","Es muy random", "Jeje"});
        JuegoAhorcado test =  JuegoAhorcado.getJuego();
        
        for (int i = 20; i >= 0; i--) {
            System.out.println(test.obtenerPalabraRandom(dic));
        }
        
    }
    
}
