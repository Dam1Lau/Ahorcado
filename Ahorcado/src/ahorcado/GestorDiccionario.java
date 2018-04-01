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
public class GestorDiccionario {

    private final int pass;
    private Diccionario[] diccionarios;

    public GestorDiccionario() {
        this.pass = 1775;
        diccionarios = new Diccionario[3];
        diccionarios[0] = new Diccionario("Facil");
        diccionarios[1] = new Diccionario("Medio");
        diccionarios[2] = new Diccionario("Dificil");
    }

    public Diccionario[] getDiccionarios() {
        return diccionarios;
    }

    public void menu() {
        int opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("========== Bienvenido al gestor de Diccionarios ==========");
        System.out.println("Elige un diccionario a editar:");
        System.out.println("");
        for (int i = 0; i < diccionarios.length; i++) {
            System.out.println(diccionarios[i].toString());
        }
        opcion = lector.nextInt();
        while (opcion < 1 | opcion > 3) {
            System.out.println("Numero incorrecto. Elige entre uno de los tres diccionarios.");
            opcion = lector.nextInt();
        }
        switch (opcion) {
            case 1:
                if(pedirnumero()==1)
                    diccionarios[0].menuDiccionario();
                else
                    diccionarios[0].listarDiccionario();

                break;
            case 2:
                if(pedirnumero()==1)
                    diccionarios[1].menuDiccionario();
                else
                    diccionarios[1].listarDiccionario();

                break;
            case 3:
                if(pedirnumero()==1)
                    diccionarios[3].menuDiccionario();
                else
                    diccionarios[3].listarDiccionario();

                break;
            default:
                throw new AssertionError();
        }

    }
    
    public int pedirnumero(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("=================================\n1. Editar diccionario \n2. Lista de palabras\n=================================");
        do {            
            numero = lector.nextInt();
        } while (numero !=1 && numero!=2);
    return numero;
    }

}
