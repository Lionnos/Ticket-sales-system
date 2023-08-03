package View.Tickets;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.ProgrammingController;
import Model.Entity.Programming;

public class JInternalTicket extends javax.swing.JInternalFrame {

    private JPanelSell jpanelSell;
    
    
    public JInternalTicket() {
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

        jPanel_Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Barra = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelVenta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxBUS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanelBUS = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1320, 738));
        setPreferredSize(new java.awt.Dimension(1320, 738));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Fondo.setMinimumSize(new java.awt.Dimension(1320, 738));
        jPanel_Fondo.setPreferredSize(new java.awt.Dimension(1320, 738));
        jPanel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Venta de Pasajes");
        jPanel_Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 190, 50));

        jPanel_Barra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel_Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Anular Boletos");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Barra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 40));

        jLabelVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVenta.setText("Venta Boletos");
        jLabelVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVentaMouseClicked(evt);
            }
        });
        jPanel_Barra.add(jLabelVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar Boleto");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Barra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel_Barra.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 40));

        jPanel_Fondo.add(jPanel_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 820, 40));

        jComboBoxBUS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel_Fondo.add(jComboBoxBUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("BUS :");
        jPanel_Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jPanelBUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_Fondo.add(jPanelBUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 300, 600));

        getContentPane().add(jPanel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVentaMouseClicked
        // TODO add your handling code here:
        panelVenta();
    }//GEN-LAST:event_jLabelVentaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        getProgramming();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void panelVenta(){
        jpanelSell = null;
        jpanelSell = new JPanelSell();
        jpanelSell.setVisible(true);
        jPanel_Fondo.add(jpanelSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> jComboBoxBUS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelVenta;
    public static javax.swing.JPanel jPanelBUS;
    private javax.swing.JPanel jPanel_Barra;
    private javax.swing.JPanel jPanel_Fondo;
    // End of variables declaration//GEN-END:variables



    private static List<Integer> seats;

    private void initNewComponets(){
        getSeatForID();
        getProgramming();
        MinibusSimulation();
    }

    public static void MinibusSimulation() {
        jPanelBUS.removeAll();
        
        jPanelBUS.setLayout(new GridLayout(7, 3, 15, 15)); // 7 filas (asientos), 3 columnas, espacio horizontal y vertical de 15 píxeles

        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 3; col++) {
                int seatNumber = (row - 1) * 3 + col;
                String seatLabel;
                if (seatNumber - 1 == 0) {
                    seatLabel = "Chofer";
                } else {
                    seatLabel = String.valueOf(seatNumber - 1);
                }
                JButton seatButton = null;
                seatButton = new JButton(seatLabel);
                
                
                String imagePath = "/Icons/seat.png"; // Assuming the image is in the "Icons" folder relative to your class
                java.net.URL imageUrl = JInternalTicket.class.getResource(imagePath);
                if (imageUrl != null) {
                    seatButton.setIcon(new ImageIcon(imageUrl));
                } else {
                    System.err.println("Image not found: " + imagePath);
                }
                //seatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/seat.png")));
                seatButton.setHorizontalAlignment(SwingConstants.RIGHT);
                seatButton.setBackground(new Color(46, 204, 113));

                for (int randomSeat : seats) {
                    System.out.println(randomSeat);
                    if ((seatNumber-1) == randomSeat) {
                        seatButton.setBackground(new Color(231, 76, 60));
                        break;
                    } else {
                        seatButton.setBackground(new Color(46, 204, 113));
                    }
                }

                seatButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = (JButton) e.getSource();
                        String label = clickedButton.getText();
                
                        JPanelSell.jLabelSeatNumber.setText(label);
                    
                        System.out.println("Se hizo clic en el botón: " + label);
                    }
                });
                jPanelBUS.add(seatButton);

            }
        }
        jPanelBUS.revalidate(); 
    }
    
    private void getSeatForID(){
        jComboBoxBUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seats = null;
                seats = new ArrayList<>();

                String id = (String) jComboBoxBUS.getSelectedItem();
                seats = getProgramming.getSeatNumbersByProgrammingId(id);
                MinibusSimulation();
            }
        });
    }

    public static void upColor(){
                seats = null;
                seats = new ArrayList<>();
                String id = (String) jComboBoxBUS.getSelectedItem();
                seats = getProgramming.getSeatNumbersByProgrammingId(id);
    }
    
    private void getProgramming(){
        getProgramming.getIdProgramming();
        List<String> elements = getProgramming.idProgrammingList;
        jComboBoxBUS.removeAllItems();

        for (String idProgramming : elements) {
            jComboBoxBUS.addItem(idProgramming);
        }
    }
}
