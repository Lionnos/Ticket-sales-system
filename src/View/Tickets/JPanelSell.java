package View.Tickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controller.TicketController;
import Model.Entity.Ticket;
import View.Home.JPanelMenu;

public class JPanelSell extends javax.swing.JPanel {

    public static String numeroAsiento;

    public JPanelSell() {
        initComponents();
        initNewComponets();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jComboBoxTipoDocumento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroDocumento = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxPrecio = new javax.swing.JComboBox<>();
        jTextFieldDirecion = new javax.swing.JTextField();
        jTextFieldRazonSocial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelSeatNumber = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldRuc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(820, 520));
        setPreferredSize(new java.awt.Dimension(820, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/acept.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jComboBoxTipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE", "CARNET EXTRANJERO", "RUC" }));
        add(jComboBoxTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("RUC");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTextFieldNumeroDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 170, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("DATOS DEL CLIENTE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("NUMERO");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("GENERO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 20));

        jTextFieldNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 170, -1));

        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("TELEFONO/CELULAR");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jComboBoxPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00", "13.00", "15.00", "20.00" }));
        add(jComboBoxPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 170, -1));

        jTextFieldDirecion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 170, -1));

        jTextFieldRazonSocial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 370, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("DIRECCIÓN");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabelSeatNumber.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabelSeatNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeatNumber.setText("15");
        jLabelSeatNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        add(jLabelSeatNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 130, 130));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("ASIENTO Nº");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("FECHA");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFecha.setText("17-23-2039");
        add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("PRECIO");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        jTextFieldRuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldRuc.setName(""); // NOI18N
        add(jTextFieldRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("RAZON SOCIAL");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jComboBoxGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("NOMBRES");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("APELLIDOS");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("DOCUMENTO");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("S/");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        onclickCancel();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        onClickAcept();
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxPrecio;
    private javax.swing.JComboBox<String> jComboBoxTipoDocumento;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    public static javax.swing.JLabel jLabelSeatNumber;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDirecion;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    private javax.swing.JTextField jTextFieldRazonSocial;
    private javax.swing.JTextField jTextFieldRuc;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables


    private String idTicket = null;
    private String idUser;
    private String idClient;
    private String idProgramming;
    private String description = null;
    private String destination;
    private int seatNumber;
    private Date createdAt;
    private Date travelDate;
    private Time departureTime;
    private String moneyType;

    private BigDecimal price;
    private boolean state = true;

    private void initNewComponets(){
        getDate();
    }
    
    private void getDate() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formatoFecha);
        jLabelFecha.setText(fechaFormateada);
    }

    private void onClickAcept(){
        Object[] options = {"Si, proceder","No, Cancelar"};
        int confirmacion = JOptionPane.showOptionDialog(null, "¿Desea confirmar?", "Confirmación", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (confirmacion == JOptionPane.YES_OPTION) {
            venderBoleto();
            this.setVisible(false);
            /*
            JInternalTicket.jComboBoxBUS.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JInternalTicket.MinibusSimulation();
                }
            });*/
            JInternalTicket.upColor();
            JInternalTicket.MinibusSimulation();
        }
    }
    private void onclickCancel(){
        this.setVisible(false);
    }

    
    private void venderBoleto(){
        registerClient();
        getDataForTicket();

        TicketController ticketController = new TicketController();
        Ticket ticket = new Ticket();
        ticket.setIdTicket(idTicket);
        ticket.setIdUser(idUser);
        ticket.setIdClient(idClient);
        ticket.setIdProgramming(idProgramming);
        ticket.setDescription(description);
        ticket.setDestination(destination);
        ticket.setSeatNumber(seatNumber);
        ticket.setCreatedAt(createdAt);
        ticket.setTravelDate(travelDate);
        ticket.setDepartureTime(departureTime);
        ticket.setMoneyType(moneyType);
        ticket.setPrice(price);
        ticket.setState(state);

        ticketController.create(ticket);
        ticket = null;
        ticketController = null;
    }

    private void getDataForTicket(){
        idUser = JPanelMenu.idUser;
        idProgramming = (String) JInternalTicket.jComboBoxBUS.getSelectedItem();

        List<String> idlList = getProgramming.idProgrammingList;
        List<String> destinationList = getProgramming.destinationList;
        List<Date> dateList = getProgramming.dateList;
        List<Time> hourList = getProgramming.hourList;

        for (int i = 0; i < idlList.size(); i++) {
            if(idlList.get(i) == idProgramming){
                destination = destinationList.get(i);
                travelDate = dateList.get(i);
                departureTime = hourList.get(i);
                break;
            }
        }

        seatNumber = Integer.parseInt( jLabelSeatNumber.getText() );

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date utilDate = formatoFecha.parse(jLabelFecha.getText());
            createdAt = new Date(utilDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        moneyType = "Soles";
        price = new BigDecimal((String) jComboBoxPrecio.getSelectedItem());
    }

    public void registerClient() {
        RegisterClient.firstName = jTextFieldNombres.getText();
        RegisterClient.lastName = jTextFieldApellidos.getText();
        RegisterClient.documentType = (String) jComboBoxTipoDocumento.getSelectedItem();
        RegisterClient.documentNumber = null;
        RegisterClient.ruc = 0L;
        RegisterClient.businessName = jTextFieldRazonSocial.getText();
        RegisterClient.gender = (String) jComboBoxGenero.getSelectedItem();
        RegisterClient.telephone = 0; // Valor por defecto en caso de cadena vacía
        RegisterClient.address = jTextFieldDirecion.getText();
    
        try {
            if (!jTextFieldNumeroDocumento.getText().isEmpty()) {
                RegisterClient.documentNumber = Long.parseLong(jTextFieldNumeroDocumento.getText());
            }
            if (!jTextFieldRuc.getText().isEmpty()) {
                RegisterClient.ruc = Long.parseLong(jTextFieldRuc.getText());
            }
            if (!jTextFieldTelefono.getText().isEmpty()) {
                RegisterClient.telephone = Integer.parseInt(jTextFieldTelefono.getText());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        RegisterClient.save();
        idClient = RegisterClient.idClient;
    }
    

    private void obtainIdProgramming(){


    }

    private void actualizarBoleto(){

    }

    private void eliminiarBoleto(){

    }
}
