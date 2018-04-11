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
 * TODOS LOS METODOS EN LOS QUE TENGA QUE INTRODUCIR UNA OPCION DE 1 O 2 EN UNA MISMA CLASE UTILIDADES PARA QUE LA EXCEPCION LA PILLE AHI?
 */
    public static void menuPrincipal(){
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("******************* INICIAR JUEGO *******************");
        System.out.println("Qué quiere hacer: 1. Jugar 2. Editar diccionario.");
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       GestorDiccionario gest = new GestorDiccionario();
       gest.menu();
        
//        Jugador jug = new Jugador();
//        Diccionario dic = new Diccionario(new String[]{"Hola","Adios","Arriba","Abajo","Derecha","Palabra", "jeje"});
//        JuegoAhorcado test =  JuegoAhorcado.getJuego();
        
        //test.Jugar(jug, dic);
        
        
        
        
        
        
        
        
        
    }
    
}
