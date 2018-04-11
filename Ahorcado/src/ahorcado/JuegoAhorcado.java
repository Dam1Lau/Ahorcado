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
public class JuegoAhorcado {

    private static JuegoAhorcado game = null;
    private String palabraAdivinar;
    private char[] respuestaJugador;

    private JuegoAhorcado() {
    }

    private synchronized static void crearJuego() {
        if (game == null) {
            game = new JuegoAhorcado();
        }
    }

    public static JuegoAhorcado getJuego() {
        if (game == null) {
            crearJuego();
        }
        return game;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public String obtenerPalabraRandom(Diccionario diccionario) {
        int random = (int) (Math.random() * diccionario.getPalabras().length);
        return diccionario.buscarPalabra(random);
    }
//////////////// Aqui puede meter un numero y no se contaria como fallo. ¿Como solucionarlo? Excepcion? Filtrar aqui?

    public char pedirLetra() {
        char letra;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un letra: ");
        letra = lector.next().charAt(0);
        return letra;
    }

    public boolean analizarRespuesta(char[] respuesta) {
        boolean acertada = false;
        int parar = 0;
        for (int i = 0; i < respuesta.length && parar == 0; i++) {
            if (respuesta[i] == '-') {
                acertada = false;
                parar = 1;
            } else {
                acertada = true;
            }
        }
        return acertada;
    }

    public void Jugar(Jugador jugador, Diccionario diccionario) {
        String palabra = obtenerPalabraRandom(diccionario).toLowerCase();
        char[] respuesta = new char[palabra.length()];
        char letraComparar;
        boolean acertado;
        for (int i = 0; i < respuesta.length; i++) {
            respuesta[i] = '-';
        }
        while (jugador.getVidas() > 0 && !analizarRespuesta(respuesta)) {
            letraComparar = pedirLetra();
            acertado = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letraComparar) {
                    respuesta[i] = letraComparar;
                    acertado = true;
                }
            }
            if (acertado == true) {
                pintarAhorcado(jugador);
                System.out.println("Bien hecho. Esa letra está en la palabra~ \nPALABRA: ");
                for (int i = 0; i < respuesta.length; i++) {
                    System.out.print(respuesta[i]);
                }
                System.out.println("\n=================");
            } else {
                jugador.setVidas(jugador.getVidas() - 1);
                pintarAhorcado(jugador);
                System.out.println("Has fallado. Te quedan " + jugador.getVidas() + " vidas");
                System.out.println("PALABRA: ");
                for (int i = 0; i < respuesta.length; i++) {
                    System.out.print(respuesta[i]);
                }
            }
        }
        System.out.println("\nLa palabra era: " + palabra);
    }

    public void pintarAhorcado(Jugador jugador) {
        if (jugador.getVidas() >= 6) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_|_ ");
        } else if (jugador.getVidas() == 5) {
            System.out.println("  ");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ ");
        } else if (jugador.getVidas() == 4) {
            System.out.println(" _______ ");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ ");
        } else if (jugador.getVidas() == 3) {
            System.out.println(" _______ ");
            System.out.println(" |     |");
            System.out.println(" |   (º-º)");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println("_|_ ");
        } else if (jugador.getVidas() == 2) {
            System.out.println(" _______ ");
            System.out.println(" |     |");
            System.out.println(" |   (º-º)");
            System.out.println(" |    _|_");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ ");
        } else if (jugador.getVidas() == 1) {
            System.out.println(" _______ ");
            System.out.println(" |     |");
            System.out.println(" |   (ºoº)  -(OH NO!)");
            System.out.println(" |    _|_");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println("_|_ ");
        } else {
            System.out.println(" _______ ");
            System.out.println(" |     |");
            System.out.println(" |   (x-x)");
            System.out.println(" |    _|_");
            System.out.println(" |     |");
            System.out.println(" |    / \\");
            System.out.println("_|_ ");
            System.out.println("******* RIP *******");
            
        }

    }
    
    
}
