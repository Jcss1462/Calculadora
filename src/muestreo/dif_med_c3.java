/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestreo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;

/**
 *
 * @author JUAN CAMILO
 */
public class dif_med_c3 extends javax.swing.JFrame {

    /**
     * Creates new form mediaC1
     */
    public dif_med_c3() {

        initComponents();
        superior.setEditable(false);
        inferior.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        varianzaM1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        superior = new javax.swing.JTextField();
        inferior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        varianzaM2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Interpretacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intervalos de confianza para la diferencia de medias caso 2:");

        jLabel1.setText("Varianzas poblacionales desconocidas pero diferentes:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Intervalos  de confianza para la diferencia de medias caso 3:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese los valores de las medias muestrales:");

        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese el valor de las varianzas muestrales:");

        varianzaM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varianzaM1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ingrese el tamaño de la muestra:");

        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n1KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Ingrese el nivel de confianza porcentual:");

        nc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ncKeyTyped(evt);
            }
        });

        jLabel7.setText("Intervalo de confianza:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("≤ μ1-μ2≤");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("%");

        jButton2.setText("Ingresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel10.setText("(x1) ̅  = ");

        jLabel11.setText("(x2) ̅  = ");

        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x2KeyTyped(evt);
            }
        });

        jLabel12.setText("S1^2 =");

        varianzaM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varianzaM2KeyTyped(evt);
            }
        });

        jLabel13.setText("S2^2 =");

        jLabel14.setText("n1=");

        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n2KeyTyped(evt);
            }
        });

        jLabel15.setText("n2=");

        Interpretacion.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(inferior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(superior, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(9, 9, 9)
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(9, 9, 9)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varianzaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varianzaM2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(27, 27, 27)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Interpretacion, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varianzaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varianzaM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Interpretacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        x1.setText(null);
        x2.setText(null);
        varianzaM1.setText(null);
        varianzaM2.setText(null);
        n1.setText(null);
        n2.setText(null);
        nc.setText(null);
        superior.setText(null);
        inferior.setText(null);
        Interpretacion.setText(null);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            double media1;
            double media2;
            double varianza1;
            double varianza2;
            double tamaño1;
            double tamaño2;
            double nivelc;

            if ((x1.getText().length() == 0) || (x2.getText().length() == 0) || (varianzaM1.getText().length() == 0) || (varianzaM2.getText().length() == 0) || (n1.getText().length() == 0) || (n2.getText().length() == 0)) {
                //emite señal de error
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Ingrese el valor de ambas medias muestrales, desviaciones estandart poblacionales y tamaños muestrales para hallar los intervalos de condianza", "Error de Campo vacio", JOptionPane.ERROR_MESSAGE);

            } else if ((n1.getText().length() < 1) || (n2.getText().length() < 1)) {
                //emite señal de error
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "El tamaño de las muestras muestrales deve ser mayor a 0", "Tamaño de la muestra no valido", JOptionPane.ERROR_MESSAGE);

            } else {

                //DecimalFormat df = new DecimalFormat("0.00000");
                media1 = Double.parseDouble(x1.getText());
                media2 = Double.parseDouble(x2.getText());
                varianza1 = Double.parseDouble(varianzaM1.getText());
                varianza2 = Double.parseDouble(varianzaM2.getText());
                tamaño1 = Double.parseDouble(n1.getText());
                tamaño2 = Double.parseDouble(n2.getText());

                if ((nc.getText().length() == 0)) {
                    JOptionPane.showMessageDialog(this, "se tomara 95% como nivel de confianza", "Nivel de confianza", HEIGHT);
                    nivelc = 95;
                } else {
                    nivelc = Double.parseDouble(nc.getText());
                }

                if ((nivelc > 100) || (nivelc < 0)) {
                    //emite señal de error
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this, "No es valido tener un nivel de confianza mayor a 100% o menor al 0%", "Nivel de confianza no valido", JOptionPane.ERROR_MESSAGE);

                } else {
                    double porcentaje;
                    porcentaje = nivelc / 100;

                    double alfa2 = (1 - porcentaje) / 2;
                    double num = Math.pow((varianza1 / tamaño1) + (varianza2 / tamaño2), 2);
                    double dem1 = (Math.pow(varianza1 / tamaño1, 2)) / (tamaño1 - 1);
                    double dem2 = (Math.pow(varianza2 / tamaño2, 2)) / (tamaño2 - 1);

                    double v = num / (dem1 + dem2);

                    //////////////////
                    double sup;
                    double inf;

                    TDistribution td = new TDistribution(v);

                    sup = (media1 - media2) + ((Math.abs(td.inverseCumulativeProbability(alfa2))) * (Math.sqrt((varianza1 / tamaño1) + (varianza2 / tamaño2))));
                    inf = (media1 - media2) - ((Math.abs(td.inverseCumulativeProbability(alfa2))) * (Math.sqrt((varianza1 / tamaño1) + (varianza2 / tamaño2))));

                    System.out.println((Math.abs(td.inverseCumulativeProbability(alfa2))));

                    superior.setText(String.valueOf(sup));
                    inferior.setText(String.valueOf(inf));

                    if ((sup > 0) && (inf > 0)) {
                        Interpretacion.setText("La media poblacional 1 es mas grande que la media poblacional 2");
                    } else if ((sup < 0) && (inf < 0)) {
                        Interpretacion.setText("La media poblacional 2 es mas grande que la media poblacional 1");
                    } else {
                        Interpretacion.setText("Se puede decir que la media poblacional 1 es igual a la media poblacional 2");
                    }

                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Hay un dato invalido", "Error con algun dato mal ingresado", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyTyped
        //declaro unba variable de tipo char y le digo que me devuelva solo los valores que le diga que me retorne
        char c = evt.getKeyChar();
        //si el char es una letra
        if (Character.isLetter(c)) {
            //emite señal de error
            getToolkit().beep();
            //no deja escribir
            evt.consume();
            //muestra el siguiente mensaje
            JOptionPane.showMessageDialog(this, "Solo ingresa numeros en este campo", "Error de compativilidad", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_x1KeyTyped

    private void varianzaM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varianzaM1KeyTyped
        //declaro unba variable de tipo char y le digo que me devuelva solo los valores que le diga que me retorne
        char c = evt.getKeyChar();
        //si el char es una letra
        if (Character.isLetter(c)) {
            //emite señal de error
            getToolkit().beep();
            //no deja escribir
            evt.consume();
            //muestra el siguiente mensaje
            JOptionPane.showMessageDialog(this, "Solo ingresa numeros en este campo", "Error de compativilidad", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_varianzaM1KeyTyped

    private void n1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyTyped
        //declaro unba variable de tipo char y le digo que me devuelva solo los valores que le diga que me retorne
        char c = evt.getKeyChar();
        //si el char es una letra
        if (Character.isLetter(c)) {
            //emite señal de error
            getToolkit().beep();
            //no deja escribir
            evt.consume();
            //muestra el siguiente mensaje
            JOptionPane.showMessageDialog(this, "Solo ingresa numeros en este campo", "Error de compativilidad", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_n1KeyTyped

    private void ncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ncKeyTyped
        //declaro unba variable de tipo char y le digo que me devuelva solo los valores que le diga que me retorne
        char c = evt.getKeyChar();
        //si el char es una letra
        if (Character.isLetter(c)) {
            //emite señal de error
            getToolkit().beep();
            //no deja escribir
            evt.consume();
            //muestra el siguiente mensaje
            JOptionPane.showMessageDialog(this, "Solo ingresa numeros en este campo", "Error de compativilidad", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_ncKeyTyped

    private void x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_x2KeyTyped

    private void varianzaM2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varianzaM2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_varianzaM2KeyTyped

    private void n2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_n2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interpretacion;
    private javax.swing.JTextField inferior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField nc;
    private javax.swing.JTextField superior;
    private javax.swing.JTextField varianzaM1;
    private javax.swing.JTextField varianzaM2;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    // End of variables declaration//GEN-END:variables
}
