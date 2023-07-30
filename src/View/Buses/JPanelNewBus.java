/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Buses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controller.VehicleController;
import Model.Entity.Vehicle;

/**
 *
 * @author Acer
 */
public class JPanelNewBus extends javax.swing.JPanel {

    /**
     * Creates new form JPanelNewBus
     */
    public JPanelNewBus() {
        initComponents();
        initController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Seat = new javax.swing.JTextField();
        jComboBox_State = new javax.swing.JComboBox<>();
        jTextField_Plate = new javax.swing.JTextField();
        jComboBox_Model = new javax.swing.JComboBox<>();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Aceptar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ESTADO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 320, 130));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("DESCRIPCIÓN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("PLACA DE BUS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("MODELO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("NUMERO DE ASIENTOS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTextField_Seat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextField_Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, -1));

        jComboBox_State.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(jComboBox_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, -1));

        jTextField_Plate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextField_Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, -1));

        jComboBox_Model.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_Model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota Coaster", "Nissan Urvan", "Volkswagen Eurovan", "Volkswagen Kombi", "Ford Transit", "Mercedes Benz Vario", "Mercedes Benz Sprinter", "Mitsubishi Fuso Rosa" }));
        add(jComboBox_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, -1));

        jButton_Buscar.setText("Buscar");
        add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 70, 30));

        jButton_Aceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Aceptar.setText("Aceptar");
        jButton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AceptarActionPerformed(evt);
            }
        });
        add(jButton_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jButton_Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });
        add(jButton_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        // TODO add your handling code here:
        onclickAcept();
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        onclickCancel();
    }//GEN-LAST:event_jButton_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JComboBox<String> jComboBox_Model;
    private javax.swing.JComboBox<String> jComboBox_State;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Plate;
    private javax.swing.JTextField jTextField_Seat;
    // End of variables declaration//GEN-END:variables

    
    VehicleController vehicleController;

    private void initController(){
        vehicleController = new VehicleController();
    }


    private void createVehicle(){

        String description;
        String plate;
        String model;
        int seatNumbers;
        boolean state;
    
        model = (String) jComboBox_Model.getSelectedItem();
    
        String selectedOption = (String) jComboBox_State.getSelectedItem();
        state = selectedOption.equals("Activo");
    
        description = jTextArea_Description.getText();
        plate = jTextField_Plate.getText();
        seatNumbers = Integer.parseInt(jTextField_Seat.getText());
    
        Vehicle vehicle = new Vehicle(null, description, plate, model, seatNumbers, state);
        vehicleController.create(vehicle);
    }

    private void onclickAcept(){
        Object[] options = {"Si, proceder","No, Cancelar"};
        int confirmacion = JOptionPane.showOptionDialog(null, "¿Desea confirmar?", "Confirmación", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (confirmacion == JOptionPane.YES_OPTION) {
            createVehicle();
        }
    }

    private void onclickCancel(){
        this.setVisible(false);
    }
}