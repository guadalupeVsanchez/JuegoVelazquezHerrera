/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author DavidH
 */
public class JuegoMar extends javax.swing.JFrame {
    PintarMar pintar = null;

    /**
     * Creates new form JuegoMar
     */
    public JuegoMar() {
        initComponents();
        PintarMar pintarMar = new PintarMar(jLabel1);
        pintarMar.start();
        Tocar tocar = new Tocar("sea.wav");
        tocar.start();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezAzul.jpg"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezPallazo.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezAmarillo.jpg"))); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezRosa.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 80));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezAmarillo.jpg"))); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, 80));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezTropical.jpg"))); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezLeopardo.jpg"))); // NOI18N
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 80));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezTropical.jpg"))); // NOI18N
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, 80));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezRosa.jpg"))); // NOI18N
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 100, 80));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezPallazo.jpg"))); // NOI18N
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 80));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezLeopardo.jpg"))); // NOI18N
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, 80));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/PezAzul.jpg"))); // NOI18N
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 100, 80));

        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 80));

        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 80));

        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 80));

        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, 80));

        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 80));

        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 80));

        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, 80));

        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 100, 80));

        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 80));

        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, 80));

        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 100, 80));

        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/pez1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jButton25.setText("Juego");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 80, 60));

        jButton26.setText("Guardar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButton27.setText("Abrir");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodemo/Mar.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 600, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 13");
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida==0||valida==1){
            valida++;
            intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton2,50,30);
        moverBoton.start();
        if(valida==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Pallaso");
          Pallazo=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
        
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Encuentra los pares");
        jButton1.setLocation(-100, 300);
        jButton2.setLocation(-100,500);
        jButton3.setLocation(-100,500);
        jButton4.setLocation(-100,500);
        jButton5.setLocation(-100,500);
        jButton6.setLocation(-100,500);
        jButton7.setLocation(-100,500);
        jButton8.setLocation(-100,500);
        jButton9.setLocation(-100,500);
        jButton10.setLocation(-100,500);
        jButton11.setLocation(-100,500);
        jButton12.setLocation(-100,500);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here: 
        //JOptionPane.showMessageDialog(null, "Boton 14");.
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }    
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida1==0||valida1==1){
            valida1++;
            intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton3,50,120);
        moverBoton.start();
        if(valida1==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Amarillo");
          PezAmarillo=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 15");
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }  
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida3==0||valida3==1){
            valida3++;
            intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton4,50,210);
        moverBoton.start();
        if(valida3==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Rosa");
          PezRosa=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 16");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }    
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida1==0||valida1==1){
            valida1++;
            intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton5,160,30);
        moverBoton.start();
        if(valida1==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Amarillo");
          PezAmarillo=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
        
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 17");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida2==0||valida2==1){
          valida2++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton6,160,120);
        moverBoton.start();
        if(valida2==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Tropical");
          PezTropical=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 18");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }   
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida4==0||valida4==1){
          valida4++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton7,160,210);
        moverBoton.start();
        if(valida4==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Leopardo");
          PezLeopardo=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 19");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida2==0||valida2==1){
          valida2++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton8,270,30);
        moverBoton.start();
        if(valida2==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Tropical");
          PezTropical=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 20");
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }   
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }        
        MoverBoton moverBoton = new MoverBoton(jButton9,270,120);
        moverBoton.start();
        if(valida3==0||valida3==1){
            valida3++;
            intentos++;
        }
        if(valida3==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Rosa");
          PezRosa=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 21");
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }   
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida==0||valida==1){
            valida++;
            intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton10,270,210);
        moverBoton.start();
        if(valida==2){
            JOptionPane.showMessageDialog(null, "Encontraste al Pez Pallaso");
         Pallazo=true;  
         ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
      
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 22");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }  
        if(PezAzul==false){
            jButton1.setLocation(-100,500);
            jButton12.setLocation(-100,500);
            valida5=0;
        }
        if(valida4==0||valida4==1){
          valida4++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton11,380,30);
        moverBoton.start();
        if(valida4==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Leopardo");
          PezLeopardo=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 23");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }   
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(valida5==0||valida5==1){
          valida5++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton12,380,120);
        moverBoton.start();
        if(valida5==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Azul");
          PezAzul=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton23MouseClicked

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Boton 24");
        if(Pallazo==false){
            jButton2.setLocation(-100,500);
            jButton10.setLocation(-100,500);
            valida=0;
        }
        if(PezAmarillo==false){
            jButton5.setLocation(-100,500);
            jButton3.setLocation(-100,500);
            valida1=0;
        }
        if(PezRosa==false){
            jButton4.setLocation(-100,500);
            jButton9.setLocation(-100,500);
            valida3=0;
        }
        if(PezTropical==false){
            jButton6.setLocation(-100,500);
            jButton8.setLocation(-100,500);
            valida2=0;
        }   
        if(PezLeopardo==false){
            jButton7.setLocation(-100,500);
            jButton11.setLocation(-100,500);
            valida4=0;
        }
        if(valida5==0||valida5==1){
          valida5++;
          intentos++;
        }
        MoverBoton moverBoton = new MoverBoton(jButton1,380,210);
        moverBoton.start();
        if(valida5==2){
          JOptionPane.showMessageDialog(null, "Encontraste al Pez Azul");
          PezAzul=true;
          ganaste++;
        }
        if(ganaste==6)
            JOptionPane.showMessageDialog(null, "Encontraste Todos Los Pares");
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        Guardar();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        leer();
        System.out.println(juegoMar1.string);
    }//GEN-LAST:event_jButton27ActionPerformed
    
    public void Guardar(){
    File f = new File("JuegoMar.bin");
    FileOutputStream fos = null;
    ObjectOutputStream escribirObjeto = null;
    try{
        
        fos = new FileOutputStream( f );
        escribirObjeto = new ObjectOutputStream( fos );
        escribirObjeto.writeObject( this.juegoMar );
    }
    catch( Exception e ){ }
    finally
    {
        try{
            if( escribirObjeto != null ) escribirObjeto.close();
        }catch( Exception ex ){}
    }
        
    }
    
    public void leer(){
    File f = new File("JuegoMar.bin");
    FileInputStream fis = null;
    ObjectInputStream leerObjeto = null;
 
    try{
        fis = new FileInputStream( f );
        leerObjeto = new ObjectInputStream( fis );
        this.juegoMar1 = (JuegoMar)leerObjeto.readObject();
	
    }
    catch( Exception e ){ }
    finally
    {
        try{
           
            if( leerObjeto != null ) leerObjeto.close();
        }catch( Exception ex ){}
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                juegoMar.setVisible(true);
            }
        });
    }
    boolean Pallazo = false;
    boolean PezAmarillo = false;
    boolean PezTropical = false;
    boolean PezRosa = false;
    boolean PezLeopardo = false;
    boolean PezAzul = false;
    private int ganaste= 1;
    private static int valida = 0;
    private static int valida1 = 0;
    private static int valida2 = 0;
    private static int valida3 = 0;
    private static int valida4 = 0;
    private static int valida5 = 0;
    public int intentos = 0;
    public String string = "BYE";
    private static JuegoMar juegoMar = new JuegoMar();
    private static JuegoMar juegoMar1 = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
