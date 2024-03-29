package View.Programming;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controller.ProgrammingController;
import Controller.VehicleController;
import Model.Entity.Programming;
import Model.Entity.Vehicle;
import java.util.List;

/**
 *
 * @author Acer
 */
public class JPanelNewProgramming extends javax.swing.JPanel {

    /**
     * Creates new form JPanelNewProgramming
     */
    public JPanelNewProgramming() {
        initComponents();
        initNewComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancel = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jComboBoxDESTINO = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBUS = new javax.swing.JComboBox<>();
        jComboBoxORIGEN = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxHORA = new javax.swing.JComboBox<>();
        jTextFieldFECHA = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(420, 520));
        setPreferredSize(new java.awt.Dimension(420, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 120, -1));

        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/acept.png"))); // NOI18N
        jButtonAdd.setText("Añadir");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 120, 40));

        jComboBoxDESTINO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxDESTINO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abancay", "Andahuaylas", "Antabamba", "Aymaraes", "Cotabambas", "Chincheros", "Grau" }));
        add(jComboBoxDESTINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("UNIDAD (BUS)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CIUDAD ORIGEN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("DESTINO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("FECHA DE SALIDA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("HORA SALIDA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jComboBoxBUS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jComboBoxBUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 230, -1));

        jComboBoxORIGEN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxORIGEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abancay", "Andahuaylas", "Antabamba", "Aymaraes", "Cotabambas", "Chincheros", "Grau" }));
        add(jComboBoxORIGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("COMPLETE LOS CAMPOS ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBoxHORA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxHORA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:30:00", "6:00:00", "6:30:00", "7:00:00", "7:30:00", "8:00:00", "8:30:00", "9:00:00" }));
        add(jComboBoxHORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 90, -1));

        jTextFieldFECHA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 180, -1));

        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateMouseClicked(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        onclickAcept();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        onclickCancel();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateMouseClicked
        // TODO add your handling code here:
        myList = null;
        vehicleController = null;
        initNewComponents();
    }//GEN-LAST:event_jButtonUpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonAdd;
    public static javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxBUS;
    private javax.swing.JComboBox<String> jComboBoxDESTINO;
    private javax.swing.JComboBox<String> jComboBoxHORA;
    private javax.swing.JComboBox<String> jComboBoxORIGEN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldFECHA;
    // End of variables declaration//GEN-END:variables


    //  =====================================================
    //  ADD
    //  =====================================================
    
    VehicleController vehicleController;
    ProgrammingController programmingController;
    List<ListVehicle> myList;
    List<String> obtainIdVehicle = null;

    private String idProgramming = null;
    private String idVehicle = null;
    private String origin;
    private String destination;
    private Date programmingDate;
    private Time programmingHour;
    private BigDecimal totalCost = BigDecimal.ZERO;
    private boolean state = true;
    
    
    private void initNewComponents(){
        myList = null;
        vehicleController = null;
        myList = new ArrayList<>();
        vehicleController = new VehicleController();
        getVehicle();
    }
    
    private void getVehicle(){
        List<Vehicle> vehicles = vehicleController.getAll();
        obtainIdVehicle = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isState() == true) {
                obtainIdVehicle.add(vehicle.getIdVehicle());
                myList.add(new ListVehicle(vehicle.getModel(), vehicle.getPlate()));
            }
        }

        jComboBoxBUS.removeAllItems();
        for (ListVehicle listVehicle : myList) {
            String item = listVehicle.getModel() + ", " + listVehicle.getPlate();
            jComboBoxBUS.addItem(item);
        }
    }

    private void getData(){
        String selectedValue = (String) jComboBoxBUS.getSelectedItem();
        for (ListVehicle listVehicle : myList) {
            String item = listVehicle.getModel() + ", " + listVehicle.getPlate();
            if (item.equals(selectedValue)) {
                int posicion = myList.indexOf(listVehicle);
                idVehicle = obtainIdVehicle.get(posicion);
                break;
            }
        }
    }

    private void createPrograming(){
        getData();
        //selectBus = (String) jComboBoxBUS.getSelectedItem();
        origin = (String) jComboBoxORIGEN.getSelectedItem();
        destination = (String) jComboBoxDESTINO.getSelectedItem();
        String getDate = jTextFieldFECHA.getText();
        String getHour = (String) jComboBoxHORA.getSelectedItem();

        programmingDate = Date.valueOf(getDate);
        programmingHour = Time.valueOf(getHour);
        
        programmingController = new ProgrammingController();
        Programming programming = new Programming(idProgramming, idVehicle, origin, destination, programmingDate, programmingHour, totalCost, state);
        programmingController.create(programming);
    }

    private void onclickAcept(){
        Object[] options = {"Si, proceder","No, Cancelar"};
        int confirmacion = JOptionPane.showOptionDialog(null, "¿Desea confirmar?", "Confirmación", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (confirmacion == JOptionPane.YES_OPTION) {
            createPrograming();
            onclickCancel();
        }
    }

    private void onclickCancel(){
        this.setVisible(false);
        vehicleController = null;
        myList = null;
    }
}