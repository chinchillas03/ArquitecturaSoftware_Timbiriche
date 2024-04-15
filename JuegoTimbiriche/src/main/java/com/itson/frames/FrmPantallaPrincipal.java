/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.frames;

import com.itson.interfaces.PantallaPrincipalListener;

/**
 *
 * @author Usuario
 */
public class FrmPantallaPrincipal extends javax.swing.JFrame {

    private PantallaPrincipalListener listener;
    
    /**
     * Creates new form FrmPantallaPrincipal
     */
    public FrmPantallaPrincipal() {
        initComponents();
    }

    public void setListener(PantallaPrincipalListener listener) {
        this.listener = listener;
    }
    
    private void cerrarPantalla(){
        this.setVisible(false);
    }
    
    private void listenerNuevaPartida (){
        this.listener.clickBotonCrearPartida();
        this.cerrarPantalla();
    }
    
    private void listenerUnirsePartida (){
        this.listener.clickBotonUnirsePartida();
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

        btnNuevaPartida = new javax.swing.JButton();
        btnUnirsePartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevaPartida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNuevaPartida.setText("Nueva Partida");
        btnNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPartidaActionPerformed(evt);
            }
        });

        btnUnirsePartida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUnirsePartida.setText("Buscar Partida");
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUnirsePartida)
                    .addComponent(btnNuevaPartida))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(btnNuevaPartida)
                .addGap(48, 48, 48)
                .addComponent(btnUnirsePartida)
                .addGap(177, 177, 177))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPartidaActionPerformed
        // TODO add your handling code here:
        this.listenerNuevaPartida();
    }//GEN-LAST:event_btnNuevaPartidaActionPerformed

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        // TODO add your handling code here:
        this.listenerUnirsePartida();
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPartida;
    private javax.swing.JButton btnUnirsePartida;
    // End of variables declaration//GEN-END:variables
}
