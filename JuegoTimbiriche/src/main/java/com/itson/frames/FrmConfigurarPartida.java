/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.frames;

import com.itson.dtos.CrearPartidaDTO;
import javax.swing.*;
import com.itson.interfaces.ConfigurarPartidaListener;
import ValueObjects.DimensionTablero;
import Entities.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class FrmConfigurarPartida extends javax.swing.JFrame {

    private ConfigurarPartidaListener listener;
    private Jugador anfitrion;

    /**
     * Creates new form FrmConfigurarPartida
     */
    public FrmConfigurarPartida() {
        initComponents();
        llenaComboBoxDimensiones();
    }

    public FrmConfigurarPartida(Jugador anfitrion) {
        initComponents();
        llenaComboBoxDimensiones();
        this.anfitrion = anfitrion;
    }

    private void llenaComboBoxDimensiones() {
        List<DimensionTablero> dimensiones = new ArrayList<>();
        dimensiones.add(DimensionTablero.DIEZxDIEZ);
        dimensiones.add(DimensionTablero.QUINCExQUINCE);
        dimensiones.add(DimensionTablero.VEINTExVEINTE);

        DefaultComboBoxModel<DimensionTablero> modeloCombo = new DefaultComboBoxModel<>();

        cmbDimension.setModel(modeloCombo);

        modeloCombo.addAll(dimensiones);
    }

    private void cerrarPantalla() {
        this.setVisible(false);
    }

    public void setListener(ConfigurarPartidaListener listener) {
        this.listener = listener;
    }

    private void listenerCrearPartida() {
        // this.listener.clickBotonCrearPartida();

        CrearPartidaDTO crearPartidaDTO = new CrearPartidaDTO(
                obtenerCodigoPartida(),
                obtenerDimensionPartida(),
                obtieneJugadorPartida());
        this.listener.clickBotonCrearPartida(crearPartidaDTO);
        this.cerrarPantalla();

    }

    private Jugador obtieneJugadorPartida() {
        return this.anfitrion;
    }

    private String obtenerCodigoPartida() {
        return String.valueOf(txtCodigo.getText());
    }
  
    private DimensionTablero obtenerDimensionPartida() {
        DimensionTablero dimension = null; 
        if (cmbDimension.getSelectedItem().equals(DimensionTablero.DIEZxDIEZ)) {
            dimension = DimensionTablero.DIEZxDIEZ;
        } else if (cmbDimension.getSelectedItem().equals(DimensionTablero.QUINCExQUINCE)) {
            dimension = DimensionTablero.QUINCExQUINCE;
        } else if (cmbDimension.getSelectedItem().equals(DimensionTablero.VEINTExVEINTE)) {
            dimension = DimensionTablero.VEINTExVEINTE;
        }

        return dimension;
    }

    private void listenerVolverInicio() {
        this.listener.clickBotonVolverInicio();
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

        txtCodigo = new javax.swing.JTextField();
        cmbDimension = new javax.swing.JComboBox<DimensionTablero>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCrearPartida = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Dimension:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Codigo:");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnCrearPartida.setBackground(new java.awt.Color(255, 0, 0));
        btnCrearPartida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearPartida.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPartida.setText("Crear Partida");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });

        btnVolverInicio.setBackground(new java.awt.Color(51, 102, 255));
        btnVolverInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverInicio.setText("Volver al inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnCrearPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnVolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Configura tu partida!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo)
                                .addComponent(cmbDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel2)))))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        // TODO add your handling code here:
        this.listenerCrearPartida();
    }//GEN-LAST:event_btnCrearPartidaActionPerformed


    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        // TODO add your handling code here:
        this.listenerVolverInicio();
    }//GEN-LAST:event_btnVolverInicioActionPerformed
    private void asignaModeloAComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JComboBox<DimensionTablero> cmbDimension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
