/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN CAMILO
 */
public class Estratos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    JScrollPane scrollpane;
    int con = 0;
    ArrayList<intervalo> estratos;
    ArrayList<dato> poblacion;

    public Estratos(ArrayList estratos, ArrayList poblacion) {

        initComponents();
        this.estratos = estratos;
        this.poblacion = poblacion;
        tabla();

        con = 0;
        for (int i = 0; i < this.estratos.size(); i++) {

            modelo.insertRow(con, new Object[]{});
            modelo.setValueAt(i + 1, con, 0);
            modelo.setValueAt(this.estratos.get(i).getLimiteInferior(), con, 1);
            modelo.setValueAt(this.estratos.get(i).getLimiteSuperior(), con, 2);
            modelo.setValueAt(this.estratos.get(i).getProporcion()+"%", con, 3);
            con++;

        }
    }

    //creo la estructura de la tabal y se la asigno
    private void tabla() {

        String x[][] = {};
        //creo los titulos de las columnas de la tabla
        String columnas[] = {"Numeracion", "Limite inferior", "Limite superior","Proporcion"};

        //hago qe mi tabla tenga la estructura de filas vacias y las columnas como titulo lo que ingrese en el string columnas
        //modifico el default table model para hacer que nadie pueda editar directamente las celdas
        modelo = new DefaultTableModel(x, columnas) {

            @Override
            public boolean isCellEditable(int row, int col) {

                return false;
            }

        };

        //le doy una estructura a mi tabla modelo
        tablaE.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ls = new javax.swing.JTextField();
        li = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("<=  Edad  <=");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        tablaE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaE);

        jButton2.setText("Eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel2.setText("Limite inferiror");

        jLabel3.setText("Limite superior");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(536, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(li, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(ls, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(li, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        if (i >= minValueInclusive && i <= maxValueInclusive) {
            return true;
        } else {
            return false;
        }
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        boolean comprobar = false;
        boolean permiso = false;
        int limIn = 0;
        int limSu = 0;

        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
            modelo.removeRow(i);
        }

        if ((li.getText().length() == 0) || (ls.getText().length() == 0)) {

            //emite señal de error
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Deve darle un limite inferior y superior al intervalo", "Intevalo incompleto", JOptionPane.ERROR_MESSAGE);
        } else {
            do {
                try {
                    limIn = Integer.parseInt(li.getText());
                    limSu = Integer.parseInt(ls.getText());
                    comprobar = true;

                    if (limIn > limSu) {
                        //emite señal de error
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "El limite inferior deve ser menor o igual que el limite superior\n vueva a intentarlo", "Intervalo incorrecto", JOptionPane.ERROR_MESSAGE);

                        break;
                    }

                    if (limIn <= limSu) {
                        permiso = true;
                    }

                    for (int i = 0; i < this.estratos.size(); i++) {
                        int a1 = limIn;
                        int b1 = limSu;

                        while (a1 != b1) {
                            if (between(a1, this.estratos.get(i).getLimiteInferior(), this.estratos.get(i).getLimiteSuperior())) {
                                getToolkit().beep();
                                JOptionPane.showMessageDialog(null, "Limite ya contenido en otro intervalo", "Limite en otro intervalo", JOptionPane.ERROR_MESSAGE);
                                permiso = false;
                                break;
                            }
                            a1++;
                        }

                    }
                } catch (NumberFormatException e) {

                    //emite señal de error
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Los limites del intervalo deven de ser numeros enteros", "Tipo de dato incorrecto", JOptionPane.ERROR_MESSAGE);
                    comprobar = false;

                }
            } while ((comprobar = false) || limIn > limSu);

        }

        if (permiso == true) {

            li.setText(null);
            ls.setText(null);
            ArrayList<dato>info=new ArrayList();

            double contador = 0;
            dato d;

            for (int i = 0; i < this.poblacion.size(); i++) {

                d = this.poblacion.get(i);
                if ((d.getDato() <= limSu) && (d.getDato() >= limIn)) {
                    contador++;
                    info.add(d);
                }

            }
            ////////////////////////////////////////
            
            DecimalFormat df = new DecimalFormat("0.000");
            //calculo la proporcion de los intrvalos
            double proporcion=((double)(contador)/((double)(this.poblacion.size())));
            System.out.println(contador);
            System.out.println(this.poblacion.size());
            System.out.println(proporcion);
            
            double pp=proporcion*100;

            intervalo inter = new intervalo(limIn, limSu,pp,info);
            this.estratos.add(inter);

            con = 0;
            for (int i = 0; i < this.estratos.size(); i++) {

                modelo.insertRow(con, new Object[]{});
                modelo.setValueAt(i + 1, con, 0);
                modelo.setValueAt(this.estratos.get(i).getLimiteInferior(), con, 1);
                modelo.setValueAt(this.estratos.get(i).getLimiteSuperior(), con, 2);
                modelo.setValueAt(this.estratos.get(i).getProporcion()+"%", con, 3);
                con++;

            }

        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // declaro una variable y le asigno la capacidad de seleccopmar un elemento de mi tabla
        int filaSeleccionada = tablaE.getSelectedRow();
        //coloco un try catch en la parte del codigo que me puede generar cualquier tipo de error
        try {
            //si no se ha seleccionado ningun elemento me hace esto, porque -1 significa ninguno para este comando
            if (filaSeleccionada == -1) {
                //emite señal de error
                getToolkit().beep();
                //muestra este mensaje
                JOptionPane.showMessageDialog(this, "debes seleccionar una fila", "sin seleccion", JOptionPane.ERROR_MESSAGE);
                //de lo contrario   
            } else {
                //declaro una variable y le asigno la capacidad de mostrarme un cuadro de confirmacion
                int confirmacion = JOptionPane.showConfirmDialog(tablaE, "¿Estas seguro que desea eliminar el estrato " + tablaE.getValueAt(filaSeleccionada, 0).toString() + " ? ", "Confirmacion", JOptionPane.ERROR_MESSAGE);
                //si la respuesta del cuadro de confirmacion es postiva me deve hacer lo siguiente
                if (confirmacion == JOptionPane.YES_OPTION) {

                    modelo.removeRow(filaSeleccionada);
                    this.estratos.remove(filaSeleccionada);
                    JOptionPane.showMessageDialog(this, "Estrato eliminado exitosamente");

                }

            }

            //excepcion general
        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField li;
    private javax.swing.JTextField ls;
    private javax.swing.JTable tablaE;
    // End of variables declaration//GEN-END:variables
}
