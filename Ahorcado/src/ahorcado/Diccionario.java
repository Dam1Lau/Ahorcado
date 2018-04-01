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
public class Diccionario {

    private String nombre;
    private String[] palabras;

    public Diccionario() {

        System.out.println("Pon un nombre al diccionario y que sea repersentativo de las palabras que contendrá (EJ: Frutas)");
        Scanner lector = new Scanner(System.in);
        nombre = lector.nextLine();
        palabras = new String[20];
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
            if (palabras[i].equalsIgnoreCase(palabra)) {
                palabras[i] = null;
                hecho = true;
            } else {
                hecho = false;
            }
        }
        return hecho;
    }

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

}
