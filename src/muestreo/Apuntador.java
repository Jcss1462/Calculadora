/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

/**
 *
 * @author salas
 */
public class Apuntador {
    
    private dato dato;
    private  int siguiente;

    public Apuntador(dato dato, int siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public dato getDato() {
        return dato;
    }

    public void setDato(dato dato) {
        this.dato = dato;
    }

    public int getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
