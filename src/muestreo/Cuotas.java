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
public class Cuotas extends javax.swing.JFrame {

    //variables
    ArrayList<dato> datos;
    ArrayList<intervalo> estratos;
    ArrayList<dato> muestra;
    DefaultTableModel modelo;
    JScrollPane scrollpane;
    dato dato;
    int tamañoMuestra;
    int con = 0;
    int cantidad;

    /**
     * Creates new form Simple
     */
    public Cuotas(ArrayList datos, ArrayList estratos, int tamañoMuestra, int cantidad) {
        initComponents();

        try {

            //propiedades del los jtextfile que mostraran los datos
            mm.setText(null);
            dm.setText(null);
            vm.setText(null);

            mm.setEditable(false);
            dm.setEditable(false);
            vm.setEditable(false);

            this.datos = datos;
            this.estratos = estratos;
            this.tamañoMuestra = tamañoMuestra;
            this.muestra = new ArrayList<>();
            tabla();

            this.cantidad = cantidad;

            //sacar datos muestrales
            if (!this.muestra.isEmpty()) {

                mm.setText(null);
                dm.setText(null);
                vm.setText(null);
                //System.out.println(this.datos.size());
                while (!this.muestra.isEmpty()) {

                    this.muestra.remove(0);
                    this.modelo.removeRow(0);

                }
                //System.out.println(this.datos.size());
            }

            if (this.muestra.isEmpty()) {

                ArrayList<intervalo> interval2 = new ArrayList();

                System.out.println("Cantidad= " + this.cantidad);
                System.out.println("Tamaño muestra== " + tamañoMuestra);
                System.out.println("Tamaño intervalos== " + this.estratos.size());
                int e = 0;
                double proporcion;
                double suma = 0;

                for (int i = 0; i < this.estratos.size(); i++) {

                    suma += this.estratos.get(i).getDatos().size();
                    System.out.println("estrato " + i + "=" + this.estratos.get(i).getDatos().size());

                }

                System.out.println("suma= + " + suma);
                for (int i = 0; i < this.estratos.size(); i++) {

                    proporcion = ((double) this.estratos.get(i).getProporcion()) / (double) tamañoMuestra;
                    //  proporcion = (int)Math.round((double)(tamañoMuestra)/((double) this.estratos.get(i).getProporcion()));

                    double p2 = proporcion * 100;
                    double contador = 0;
                    System.out.println("proporcion1= " + proporcion);
                    System.out.println("proporcion2= " + p2);

                    while (contador <= tamañoMuestra) {
                        System.out.println("contador(" + contador + ") < proporcico(" + proporcion + ")");
                        for (int j = 0; j < this.estratos.get(j).getDatos().size(); j++) {
                            int datop = JOptionPane.showConfirmDialog(null, "Dese agregar el elemento " + this.estratos.get(j).getDatos().get(i) + "a la muestra?");
                            if (datop == 1) {
                                this.muestra.add(this.estratos.get(i).getDatos().get(e));
                                break;
                            }
                        }
                        System.out.println(e);
                        this.muestra.add(this.estratos.get(i).getDatos().get(e));
                        //System.out.println(contador);
                        contador = contador + proporcion;
                    }

                }

//            for (int i = 0; i < this.estratos.size(); i++) {
//                for (int j = 0; j < this.cantidad; j++) {
//                    for (int x = 0; x < this.datos.size(); x++) {
//                        e = (int) (Math.random() * (this.estratos.get(i).getLimiteSuperior() - this.estratos.get(i).getLimiteInferior()) + this.estratos.get(i).getLimiteInferior());
//                        if (e == this.datos.get(x).getDato()) {
//                            System.out.println(i);
//                            this.muestra.add(this.datos.get(x));
//                            break;
//                        }
//                    }
//                }
//            }
                this.con = 0;
                for (int i = 0; i < this.muestra.size(); i++) {
                    //le digo a la tabla que me agrege filas segun vaya aumentando el contador
                    modelo.insertRow(con, new Object[]{});
                    modelo.setValueAt(i + 1, con, 0);
                    modelo.setValueAt(this.muestra.get(i).getNumeracion(), con, 1);
                    modelo.setValueAt(this.muestra.get(i).getDato(), con, 2);
                    con++;

                }
            }

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //calculos muestrales
            double mediaMuestral;
            double desviacionMuestral;
            double varianzaMuestral;
            double suma = 0;

            //media muestrales
            for (int i = 0; i < this.muestra.size(); i++) {

                suma = suma + this.muestra.get(i).getDato();

            }
            mediaMuestral = suma / this.tamañoMuestra;

            //desviacion muestrales
            double suma2 = 0;

            for (int i = 0; i < this.muestra.size(); i++) {

                suma2 = suma2 + Math.pow(this.muestra.get(i).getDato() - mediaMuestral, 2);

            }

            desviacionMuestral = (double) Math.sqrt(suma2 / (this.tamañoMuestra - 1));

            //varianza muestrales
            varianzaMuestral = Math.pow(desviacionMuestral, 2);

            //asignacion de resultados
            mm.setText(String.valueOf(mediaMuestral));
            dm.setText(String.valueOf(desviacionMuestral));
            vm.setText(String.valueOf(varianzaMuestral));

            System.out.println("tamaño= " + this.estratos.size());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    //creo la estructura de la tabal y se la asigno
    private void tabla() {

        String x[][] = {};
        //creo los titulos de las columnas de la tabla
        String columnas[] = {"numeracion", "Sujeto", "Dato"};

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
        setTitle("Muestreo Estratificado");

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
                        .addGap(0, 73, Short.MAX_VALUE))
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
                .addContainerGap(196, Short.MAX_VALUE))
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
