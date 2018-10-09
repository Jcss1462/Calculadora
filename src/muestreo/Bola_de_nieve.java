/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN CAMILO
 */
public class Bola_de_nieve extends javax.swing.JFrame {

    //variables
    ArrayList<dato> datos;
    ArrayList<Apuntador> ap;
    DefaultTableModel modelo;
    JScrollPane scrollpane;
    dato dato;
    int tamañoMuestra;
    int e1;
    int con = 0;

    /**
     * Creates new form Simple
     */
    public Bola_de_nieve(ArrayList datos, int tamañoM, int elemento1) {
        initComponents();

         ap= new ArrayList<>();

        //propiedades del los jtextfile que mostraran los datos
        mm.setText(null);
        dm.setText(null);
        vm.setText(null);

        mm.setEditable(false);
        dm.setEditable(false);
        vm.setEditable(false);

        this.datos = datos;
        this.tamañoMuestra = tamañoM;
        this.e1 = elemento1;
        tabla();

        //sacar datos muestrales
        if (!this.ap.isEmpty()) {

            mm.setText(null);
            dm.setText(null);
            vm.setText(null);
            //System.out.println(this.datos.size());
            while (!this.ap.isEmpty()) {

                this.ap.remove(0);
                this.modelo.removeRow(0);

            }
            //System.out.println(this.datos.size());
        }
        if (this.ap.isEmpty()) {

            ArrayList<Apuntador> ap = new ArrayList<>();
            Apuntador apuntador;
                    
            //
            int e = (int) (Math.random() * this.datos.size()) + 1;

            //Selecciono el primer elemento y lo agrego a la muestra
            
            for(int i=0;i<this.datos.size();i++){
            
                if(e1==this.datos.get(i).getNumeracion()){
                    this.dato=this.datos.get(i);   
                }
            }

            apuntador = new Apuntador(this.dato, e);
            this.ap.add(apuntador);

            //lleno mi muestra con los siguientes k esimos
            for (int i = 0; i < this.tamañoMuestra-1; i++) {
                
                int n=this.ap.get(i).getSiguiente();
                this.dato=this.datos.get(n-1);
                int e2 = (int) (Math.random() * this.datos.size()) + 1;
                apuntador = new Apuntador(this.dato, e2);
                this.ap.add(apuntador);
 
            }
            
            this.ap.get(this.ap.size()-1).setSiguiente(0);

            this.con = 0;
            for (int i = 0; i < this.ap.size(); i++) {
                //le digo a la tabla que me agrege filas segun vaya aumentando el contador
                modelo.insertRow(con, new Object[]{});
                modelo.setValueAt(i + 1, con, 0);
                modelo.setValueAt(this.ap.get(i).getDato().getNumeracion(), con, 1);
                modelo.setValueAt(this.ap.get(i).getDato().getDato(), con, 2);
                modelo.setValueAt(this.ap.get(i).getSiguiente(), con, 3);
                con++;

            }
        }
        //calculos muestrales
        double mediaMuestral;
        double desviacionMuestral;
        double varianzaMuestral;
        double suma = 0;

        //media muestrales
        for (int i = 0; i < this.ap.size(); i++) {

            suma = suma + this.ap.get(i).getDato().getDato();

        }
        mediaMuestral = suma / this.tamañoMuestra;

        //desviacion muestrales
        double suma2 = 0;

        for (int i = 0; i < this.ap.size(); i++) {

            suma2 = suma2 + Math.pow(this.ap.get(i).getDato().getDato() - mediaMuestral, 2);

        }

        desviacionMuestral = (double) Math.sqrt(suma2 / (this.tamañoMuestra - 1));

        //varianza muestrales
        varianzaMuestral = Math.pow(desviacionMuestral, 2);

        //asignacion de resultados
        mm.setText(String.valueOf(mediaMuestral));
        dm.setText(String.valueOf(desviacionMuestral));
        vm.setText(String.valueOf(varianzaMuestral));

    }

    //creo la estructura de la tabal y se la asigno
    private void tabla() {

        String x[][] = {};
        //creo los titulos de las columnas de la tabla
        String columnas[] = {"numeracion", "Sujeto", "Edad", "Selecciona al sujeto #"};

        //hago qe mi tabla tenga la estructura de filas vacias y las columnas como titulo lo que ingrese en el string columnas
        //modifico el default table model para hacer que nadie pueda editar directamente las celdas
        modelo = new DefaultTableModel(x, columnas) {

            @Override
            public boolean isCellEditable(int row, int col) {

                return false;
            }

        };

        //le doy una estructura a mi tabla modelo
        tablaS.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaS = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muestreo Bola de nieve");

        tablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaS);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        vm.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setText("Media muestral:");

        mm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("Desviacion muestral:");

        dm.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setText("Varianza muestral:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(vm, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dm, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        this.dispose();
        this.setVisible(false);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mm;
    private javax.swing.JTable tablaS;
    private javax.swing.JTextField vm;
    // End of variables declaration//GEN-END:variables
}
