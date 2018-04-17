/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class Diccionario {

    private String nombre;
    private String dificultad;
    private String[] palabras;
    private static final String nombreFichero = "fichero";

    public Diccionario() {
        palabras = new String[20];
    }
    

    public Diccionario(String nombre, String dificultad) {
        this();
        this.dificultad = dificultad;
    }

    public Diccionario(String[] palabras) {
        this();
        this.palabras = palabras;
    }

    public Diccionario(String nombre, String dificultad, String[] palabras) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.palabras = palabras;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public void listarDiccionario() {
        System.out.println("========== Diccionario " + nombre + " ==========");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                System.out.println(palabras[i]);
            }
        }
        System.out.println("=================================================");
    }

    public void escribirFichero(String palabra){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero,true));
            pw.println(palabra);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            Logger.getLogger(Diccionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarDiccionario() {
        int opcion = 0;
        Scanner lector = new Scanner(System.in);
        while (opcion != 3) {
            System.out.println("\n======*** Actualizar Diccionario " + nombre + " ***======");
            System.out.println("Opciones: \n1. Añadir una palabra al diconario. \n2. Borrar una palabra del diccionario. \n3. Salir.");

            opcion = Utilidades.pedirNumero();
            switch (opcion) {
                case 1:
                    System.out.println("*** Añadir palabra nueva: ***");
                    if (meterPalabra(pedirPalabra())) {
                        System.out.println("Se ha introducido la palabra correctamente.");
                    } else {
                        System.out.println("--- ¡ No se ha podido añadir la palabra !  ---");
                    }
                    break;
                case 2:
                    System.out.println("*** Borrar palabra: ***");
                    if (borrarPalabra(pedirPalabra())) {
                        System.out.println("Se ha borrado la palabra correctamente.");
                    } else {
                        System.out.println("--  No se ha podido borrar la palabra o no existe en el diccionario.  --");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Número incorrecto. Opciones válidas = 1, 2 ó 3.");
//                    throw new AssertionError();
            }
        }
    }

    public boolean meterPalabra(String palabra) {
        boolean hecho = false;
        for (int i = 0; i < palabras.length && hecho == false; i++) {
            if (palabras[i] == null) {
                palabras[i] = palabra;
                hecho = true;
            } else {
                hecho = false;
            }
        }
        return hecho;
    }

    public boolean borrarPalabra(String palabra) {
        boolean hecho = false;
        for (int i = 0; i < palabras.length && hecho == false; i++) {
            if (palabras[i] != null && palabras[i].equalsIgnoreCase(palabra)) {
                palabras[i] = null;
                hecho = true;
            } else {
                hecho = false;
            }
        }
        return hecho;
    }
// Aqui no debo permitir que introduzca ningun numero!! HOW
    public String pedirPalabra() {
        String palabra;
        boolean numeroDetectado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la palabra para actualizar el diccionario '" + nombre + "' :");
        do {
            numeroDetectado = false;
            palabra = lector.nextLine();
            for (int i = 0; i < palabra.length() && numeroDetectado == false; i++) {
                if ((int) palabra.charAt(i) >= 48 && (int) palabra.charAt(i) <= 57) {
                    numeroDetectado = true;
                    System.out.println("La palabra no puede contener números.");

                } else {
                    numeroDetectado = false;
                }
            }
        } while (numeroDetectado == true);

        return palabra;
    }

    public String buscarPalabra(int posicion) {
        return palabras[posicion];
    }

    public void menuDiccionario() {
        int opcion = 0;
        Scanner lector = new Scanner(System.in);
        while (opcion != 3) {
            System.out.println("\n======*** Actualizar Diccionario " + nombre + " ***======");
            System.out.println("Opciones: \n1. Añadir una palabra al diconario. \n2. Borrar una palabra del diccionario. \n3. Salir.");

            opcion = Utilidades.pedirNumero();
            switch (opcion) {
                case 1:
                    System.out.println("*** Añadir palabra nueva: ***");
                    if (meterPalabra(pedirPalabra())) {
                        System.out.println("Se ha introducido la palabra correctamente.");
                    } else {
                        System.out.println("--- ¡ No se ha podido añadir la palabra !  ---");
                    }
                    break;
                case 2:
                    System.out.println("*** Borrar palabra: ***");
                    if (borrarPalabra(pedirPalabra())) {
                        System.out.println("Se ha borrado la palabra correctamente.");
                    } else {
                        System.out.println("--  No se ha podido borrar la palabra o no existe en el diccionario.  --");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Número incorrecto. Opciones válidas = 1, 2 ó 3.");
//                    throw new AssertionError();
            }
        }

    }

    @Override
    public String toString() {
        return "Diccionario " + nombre + ", dificultad: " + dificultad;
    }

}
