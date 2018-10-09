/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author JUAN CAMILO
 */
public class leer_Archivo {

    String patch;
    File archivo;
    FileReader fr;
    BufferedReader br;
    ArrayList<dato> poblacion;

    public leer_Archivo() {
        patch = new String();
        archivo = null;
        fr = null;
        br = null;
        poblacion = new ArrayList<>();

    }

    public ArrayList presentar() {

        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        try {
            this.patch = buscador.getSelectedFile().getAbsolutePath();

        } catch (Exception e) {
        }

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            this.archivo = new File(this.patch);
            this.fr = new FileReader(this.archivo);
            this.br = new BufferedReader(this.fr);

            // Lectura del fichero
            String lines;
            int idx=1;
            dato dato;
            while ((lines = br.readLine()) != null) {

                //System.out.println(lines);
               // int numeracion, int dato, String genero, String colordeojos, int Estrato, String tamaño;
                        
                String[] parts = lines.split("-");
                int edad = Integer.parseInt(parts[0]); 
//                String Genero = parts[1]; 
//                String colorO = parts[2]; 
//                int estrato = Integer.parseInt(parts[3]); 
//                String tamaño = parts[4]; 
                
                dato= new dato(idx, edad);
                this.poblacion.add(dato);
                idx++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
        return poblacion;
    }
}
