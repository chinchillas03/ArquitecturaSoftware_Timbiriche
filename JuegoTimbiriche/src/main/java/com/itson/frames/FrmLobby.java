/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.frames;

import com.itson.dtos.SolicitarInicioDTO;
import com.itson.interfaces.LobbyListener;
import com.itson.presentadores.PresentadorLobby;
import dominio.DimensionTablero;
import dominio.Jugador;
import dominio.Partida;
import java.util.List;
import javax.swing.text.View;

/**
 *
 * @author Usuario
 */
public class FrmLobby extends javax.swing.JFrame {

    private LobbyListener listener;
    private SolicitarInicioDTO solicitar = new SolicitarInicioDTO();
    
    /**
     * Creates new form FrmLobby
     *
     */
    public FrmLobby() {
        initComponents();
    }

    public void setListener(LobbyListener listener) {
        this.listener = listener;
    }

    private void cerrarPantalla() {
        this.setVisible(false);
    }

    private void listenerIniciar() {
        SolicitarInicioDTO solicitarInicioDTO = new SolicitarInicioDTO();
        solicitarInicioDTO.setDimension(DimensionTablero.DIEZxDIEZ);
        solicitarInicioDTO.setPartida(this.listener.obtenerPartida());
        this.listener.solicitarInicio(solicitarInicioDTO);
        this.cerrarPantalla();
    }

    private void listenerVolverInicio() {
        this.listener.salir();
        this.cerrarPantalla();
    }

    public void actualizarDatosPartida(Partida partida) {
        lblCodigo.setText(partida.getCodigo());
        lblDimension.setText(partida.getTablero().getDimension().toString());
        lblNombre1.setText(partida.getJugadores().get(0).getNombre());
    }

    public void actualizarDatosJugador(Partida partida) {
        this.listener.actualizarDatosJugador(partida);
    }

    public void mostrarJugador(List<Jugador> jugadores) {
        lblNombre1.setText(jugadores.get(0).getNombre());
        lblNombre1.setForeground(jugadores.get(0).getColorJugador());
        lblAvatar1.setText("");
        lblAvatar1.setIcon(jugadores.get(0).getAvatar());

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
        btnIniciar = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblDimension = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        lblAvatar1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNombre2 = new javax.swing.JLabel();
        lblAvatar2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNombre3 = new javax.swing.JLabel();
        lblAvatar3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNombre4 = new javax.swing.JLabel();
        lblAvatar4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setBackground(new java.awt.Color(255, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 363, 156, 45));

        btnVolverInicio.setBackground(new java.awt.Color(51, 102, 255));
        btnVolverInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverInicio.setText("Volver al inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 45));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Datos de la partida");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Dimensión");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblCodigo.setText("*Codigo aquí*");
        jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblDimension.setText("*Dimension aquí*");
        jPanel4.add(lblDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 220));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("Nombre del Jugador 1");
        jPanel3.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 260, -1));

        lblAvatar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvatar1.setText("Avatar del Jugador 1");
        jPanel3.add(lblAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 250, 230));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 270));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(260, 270));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setText("Nombre del Jugador 2");
        jPanel5.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 7, 250, -1));

        lblAvatar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvatar2.setText("Avatar del Jugador 2");
        jPanel5.add(lblAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 240));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 260));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre3.setText("Nombre del Jugador 3");
        jPanel6.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));

        lblAvatar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvatar3.setText("Avatar del Jugador 3");
        jPanel6.add(lblAvatar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 230));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre4.setText("Nombre del Jugador 4");
        lblNombre4.setToolTipText("");
        jPanel7.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));

        lblAvatar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvatar4.setText("Avatar del Jugador 4");
        jPanel7.add(lblAvatar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 230));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 260, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        this.listenerIniciar();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        // TODO add your handling code here:
        this.listenerVolverInicio();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblAvatar1;
    private javax.swing.JLabel lblAvatar2;
    private javax.swing.JLabel lblAvatar3;
    private javax.swing.JLabel lblAvatar4;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDimension;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    // End of variables declaration//GEN-END:variables
}
