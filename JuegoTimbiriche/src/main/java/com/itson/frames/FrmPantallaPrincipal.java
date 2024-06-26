/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.frames;

import com.itson.interfaces.PantallaPrincipalListener;
import com.itson.presentadores.PresentadorPantallaPrincipal;
import Entities.Jugador;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmPantallaPrincipal extends javax.swing.JFrame {
    
    private PantallaPrincipalListener listener;
    private Jugador anfitrion; 
    /**
     * Creates new form FrmPantallaPrincipal
     */
    public FrmPantallaPrincipal(Jugador anfitrion) {        
        initComponents();
        cargarAvatares();
        lblNombre.setText(randomizarNombre());
        
        this.anfitrion = anfitrion;
        
        
    }



    public void setListener(PantallaPrincipalListener listener) {
        this.listener = listener;
    }
    
    private void cerrarPantalla(){  
        this.setVisible(false);
    }
    
    private void listenerNuevaPartida (){
        this.listener.clickBotonCrearPartida(anfitrion);
        this.cerrarPantalla();
    }
    
    private void listenerUnirsePartida (){
        this.listener.clickBotonUnirsePartida(anfitrion);
        this.cerrarPantalla();
    }
 
    public void cargarAvatares(){
        this.lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Player Azul.png")));
        this.lblNombre.setForeground(Color.BLUE);
        this.repaint();
    }
    
    private void listenerCambioAvatarIzquierda(){
        this.listener.cambioAvatarIzquierda();
    }
    
    private void listenerCambioAvatarDerecha(){
        this.listener.cambioAvatarDerecha();
    }
    
      public JLabel getLblAvatar() {
        return this.lblAvatar;
    }
      
    public void listenerCambiarNombre(){
        this.listener.cambiarNombre();
    }
    
    
      public JLabel getLblNombre() {
        return this.lblNombre;
    }
      
    public String abrirDlgCambioNombre(){
        
        String nombre = JOptionPane.showInputDialog(this, "Ingresa tu nombre");
        if(nombre == null){
            nombre = lblNombre.getText();
            return nombre;
        }
        return nombre;
    }  
    
    public String asignarNombreNulo(String nombre){
        nombre = lblNombre.getText();
        return nombre;
    }
    
    public static String randomizarNombre() {
        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1; 
        return "Player" + randomNumber;
    }
    
    public void actualizarNombre(String nombre){
        this.getLblNombre().setText(nombre);
    }
      
      public ImageIcon cambiarAvatar(ImageIcon avatar, Color color){
            getLblAvatar().setIcon(avatar);
            getLblNombre().setForeground(color);
            this.repaint();
            return null;
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
        btnNuevaPartida = new javax.swing.JButton();
        btnUnirsePartida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        flechaIzquierda = new javax.swing.JLabel();
        flechaDerecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnNuevaPartida.setBackground(new java.awt.Color(255, 0, 0));
        btnNuevaPartida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevaPartida.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaPartida.setText("Nueva Partida");
        btnNuevaPartida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPartidaActionPerformed(evt);
            }
        });

        btnUnirsePartida.setBackground(new java.awt.Color(51, 102, 255));
        btnUnirsePartida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUnirsePartida.setForeground(new java.awt.Color(255, 255, 255));
        btnUnirsePartida.setText("Buscar Partida");
        btnUnirsePartida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUnirsePartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Timbiriche.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, -1, -1));

        lblNombre.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Player 1");
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
        });
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Player Azul.png"))); // NOI18N
        jPanel2.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        flechaIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Flecha Izquierda.png"))); // NOI18N
        flechaIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaIzquierdaMouseClicked(evt);
            }
        });
        jPanel2.add(flechaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        flechaDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Flecha Derecha.png"))); // NOI18N
        flechaDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaDerechaMouseClicked(evt);
            }
        });
        jPanel2.add(flechaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5251816.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
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

    private void flechaIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaIzquierdaMouseClicked
        
        this.listenerCambioAvatarIzquierda();
    }//GEN-LAST:event_flechaIzquierdaMouseClicked

    private void flechaDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaDerechaMouseClicked
       
        this.listenerCambioAvatarDerecha();
    }//GEN-LAST:event_flechaDerechaMouseClicked

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        
    }//GEN-LAST:event_lblNombreMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.listenerCambiarNombre();
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPartida;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JLabel flechaDerecha;
    private javax.swing.JLabel flechaIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
