/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

/**
 *
 * @author JUAN CAMILO
 */
public class dato {
    
    private int numeracion;
    private int dato;
    private String genero;
    private String colordeojos;
    private int Estrato;
    private String tamaño;

    public dato(int numeracion, int dato) {
        this.numeracion = numeracion;
        this.dato = dato;
//        this.genero = genero;
//        this.colordeojos = colordeojos;
//        this.Estrato = Estrato;
//        this.tamaño = tamaño;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColordeojos() {
        return colordeojos;
    }

    public void setColordeojos(String colordeojos) {
        this.colordeojos = colordeojos;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

   

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
    
}
