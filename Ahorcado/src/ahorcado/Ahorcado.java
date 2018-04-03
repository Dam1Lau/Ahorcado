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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        GestorDiccionario gest = new GestorDiccionario();
//        gest.menu();
        
        Jugador jug = new Jugador();
        Diccionario dic = new Diccionario(new String[]{"Hola","Adios","Arriba","Abajo","Derecha","es muy random", "jeje"});
        JuegoAhorcado test =  JuegoAhorcado.getJuego();
        
        test.Jugar(jug, dic);
        
        
        Scanner lector = new Scanner(System.in);
        int opcion;
        
        
        
        
        
        
    }
    
}
