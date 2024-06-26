/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.frames;

import com.itson.interfaces.JuegoListener;
import Aggregates.ColoresJugadores;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class FrmJuego extends javax.swing.JFrame {

    private JuegoListener listener;
    private ColoresJugadores colores;
    
  /**
 * Creates new form FrmJuego
 */
public FrmJuego(JuegoListener listener) {
    initComponents();
    if (listener != null) {
        PanelTableroDiez panelTablero = new PanelTableroDiez(listener);
        panelTablero.run();
        panelTablero.setBounds(0, 0, 900, 700);
        panelTablero.setBackground(new Color(250, 75, 75)); // Set the background color of your panel
        add(panelTablero);
        // Alternatively, you can set the background color of the JFrame itself
        // setBackground(Color.BLACK);
    } else {
        System.err.println("El listener es nulo");
    }
}


    public void setListener(JuegoListener listener) {
        this.listener = listener;
    }

    public ColoresJugadores getColores() {
        return colores;
    }

    public void setColores(ColoresJugadores colores) {
        this.colores = colores;
    }

    private void cerrarPantalla() {
        this.setVisible(false);
    }

    private void listenerSalir() {
        this.listener.clickBotonSalir();
        this.cerrarPantalla();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(640, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.listenerSalir();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables

}
