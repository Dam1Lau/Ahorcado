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
public class Jugador {
    private String nombre;
    private int vidas;

    public Jugador() {
        nombre = "Por Defecto";
        vidas = 7;
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Jugador nombre " + nombre + " -  vidas " + vidas;
    }
    
    
    
}
