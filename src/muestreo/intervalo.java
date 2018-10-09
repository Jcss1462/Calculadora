/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

import java.util.ArrayList;

/**
 *
 * @author JUAN CAMILO
 */
public class intervalo {
    
    private int limiteInferior;
    private int limiteSuperior;
    private double proporcion; 
    private ArrayList<dato> datos;

    public intervalo(int limiteInferior, int limiteSuperior, double proporcion, ArrayList<dato> datos) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.proporcion = proporcion;
        this.datos = datos;
    }

    public ArrayList<dato> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<dato> datos) {
        this.datos = datos;
    }

    
    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getProporcion() {
        return proporcion;
    }

    public void setProporcion(double proporcion) {
        this.proporcion = proporcion;
    }
    
    
    
}
