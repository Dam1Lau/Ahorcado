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
 * @author Laura
 */
public class GestorDiccionario {

    private final int pass;
    private Diccionario[] diccionarios;

    public GestorDiccionario() {
        this.pass = 1775;
        diccionarios = new Diccionario[3];
        diccionarios[0] = new Diccionario("Frutas","Facil");
        diccionarios[1] = new Diccionario("Astronomia","Medio");
        diccionarios[2] = new Diccionario("Peliculas","Dificil");
    }

    public Diccionario[] getDiccionarios() {
        return diccionarios;
    }
    
    public Diccionario obtenerDiccionario(int numero){
        return diccionarios[numero];
    }

    public void menu() {
        int opcion = 0;
        boolean noEsNumero;
        Scanner lector = new Scanner(System.in);
        System.out.println("========== Bienvenido al gestor de Diccionarios ==========");
        System.out.println("Elige un diccionario a editar:\n ");

        for (int i = 0; i < diccionarios.length; i++) {
            System.out.println(diccionarios[i].toString());
        }
        do {
            System.out.println("Numero incorrecto. Elige entre uno de los tres diccionarios.");
            opcion = Utilidades.pedirNumero();
            
            
        } while (opcion < 1 | opcion > 3);
        
        switch (opcion) {
            case 1:
                if (pedirnumero() == 1) {
                    diccionarios[0].menuDiccionario();
                } else {
                    diccionarios[0].listarDiccionario();
                }

                break;
            case 2:
                if (pedirnumero() == 2) {
                    diccionarios[1].menuDiccionario();
                } else {
                    diccionarios[1].listarDiccionario();
                }

                break;
            case 3:
                if (pedirnumero() == 3) {
                    diccionarios[2].menuDiccionario();
                } else {
                    diccionarios[2].listarDiccionario();
                }

                break;

        }

    }

    public int pedirnumero() {
        int numero;
        System.out.println("=================================\n1. Editar diccionario \n2. Lista de palabras\n=================================");
        do {
            numero = Utilidades.pedirNumero();
        } while (numero != 1 && numero != 2);
        return numero;
    }

    public boolean comprobarPassword(int pass) {
        boolean correcta = false;
        if (this.pass == pass) {
            correcta = true;
        }
        return correcta;
    }

}
