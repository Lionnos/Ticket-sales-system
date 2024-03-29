package View.Home;

import View.Buses.JInternalBuses;
import View.Inicio.JInternalInicio;
import View.Programming.JInternalProgramming;
import View.Reports.JInternalReport;
import View.Tickets.JInternalTicket;
import View.Users.JInternalUsers;
        
import desplazable.Desface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent; 

public class JFrameHome extends javax.swing.JFrame {

    private final Desface desplace;
    private Point initialClick;
    
    
    public JFrameHome() {
        initComponents();
        initMenu();
        this.desplace = new Desface();
        moverVentanaConPanel(jPanel_Menu); // mover ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Menu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_MenuLeft = new javax.swing.JPanel();
        jPanel_Fondo = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Menu.setBackground(new java.awt.Color(97, 106, 107));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Home/Icons/salir.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 32, 32));

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 32));

        jPanel_MenuLeft.setBackground(new java.awt.Color(0, 51, 51));
        jPanel_MenuLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel_MenuLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 32, 230, 740));

        jPanel_Fondo.setBackground(new java.awt.Color(51, 51, 51));

        jDesktopPane.setMinimumSize(new java.awt.Dimension(1320, 738));

        javax.swing.GroupLayout jPanel_FondoLayout = new javax.swing.GroupLayout(jPanel_Fondo);
        jPanel_Fondo.setLayout(jPanel_FondoLayout);
        jPanel_FondoLayout.setHorizontalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_FondoLayout.setVerticalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1320, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        //jPanel_Folding.setSize(new Dimension(jPanel_Folding.getWidth(),this.getHeight()));
    }//GEN-LAST:event_formComponentResized

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
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    
    // =============================================================================================
    private void moverVentanaConPanel(JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick); // Establecer el foco en el panel.
            }
        });

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Obtener la posición actual del JFrame.
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Calcular el desplazamiento.
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Mover el JFrame a la nueva posición.
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        });
    }
    
    //  =========================
    //  INTERACCIONES CON EL MENU
    //  =========================
    private void initMenu(){
        menuLeft = new JPanelMenu();
        menuLeft.setVisible(true);
        jPanel_MenuLeft.add(menuLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,230, 740));
        
        Inicio = new JInternalInicio();
        User = new JInternalUsers();
        Bus = new JInternalBuses();
        Programming = new JInternalProgramming();
        Ticket = new JInternalTicket();
        Report = new JInternalReport();

        slider();
        selectTicket();
        selectProgramming();
        selectInicio();
        selectUser();
        selectBus();
        selectReport();
        
        configInternal(Inicio, true);
    }
    
    public void slider(){
        JPanelMenu.jLabelHome.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                
                if(jPanel_MenuLeft.getX() == -180){
                    desplace.desplazarDerecha(jPanel_MenuLeft,jPanel_MenuLeft.getX() , 0, 10, 1);
                }
                else if (jPanel_MenuLeft.getX() == 0){        
                    desplace.desplazarIzquierda(jPanel_MenuLeft,jPanel_MenuLeft.getX() , -180, 10, 1);
                }
            }
        });
    }

    
    public void selectTicket(){
        JPanelMenu.jLabelTicket.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, false);                
                configInternal(User, false);
                configInternal(Bus, false);
                configInternal(Programming, false);
                configInternal(Ticket, true);
                configInternal(Report, false);
            }
        });
    }
    
    public void selectProgramming(){
        JPanelMenu.jLabelProgramming.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, false);                
                configInternal(User, false);
                configInternal(Bus, false);
                configInternal(Programming, true);
                configInternal(Ticket, false);
                configInternal(Report, false);
            }
        });
    }
        
    public void selectInicio(){
        JPanelMenu.jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, true);                
                configInternal(User, false);
                configInternal(Bus, false);
                configInternal(Programming, false);
                configInternal(Ticket, false);
                configInternal(Report, false);;
            }
        });
    }

    public void selectUser(){
        JPanelMenu.jLabelUsers.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, false);                
                configInternal(User, true);
                configInternal(Bus, false);
                configInternal(Programming, false);
                configInternal(Ticket, false);
                configInternal(Report, false);
            }
        });
    }

    public void selectBus(){
        JPanelMenu.jLabelBuses.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, false);                
                configInternal(User, false);
                configInternal(Bus, true);
                configInternal(Programming, false);
                configInternal(Ticket, false);
                configInternal(Report, false);
            }
        });
    }

    public void selectReport(){
        JPanelMenu.jLabelReport.addMouseListener(new java.awt.event.MouseAdapter()  {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                configInternal(Inicio, false);                
                configInternal(User, false);
                configInternal(Bus, false);
                configInternal(Programming, false);
                configInternal(Ticket, false);
                configInternal(Report, true);
            }
        });
    }
    
    public void configInternal(JInternalFrame frame, boolean visible ){
        frame.setLocation(0, 0);
        frame.setResizable(false);
        //frame.setMaximizable(true);
        frame.setClosable(true);
        //frame.setIconifiable(true);
        frame.setVisible(visible);
        
        try {
            jDesktopPane.add(frame);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public JPanelMenu menuLeft;
    private JInternalInicio Inicio;
    private JInternalUsers User;
    private JInternalBuses Bus;
    private JInternalProgramming Programming;
    private JInternalTicket Ticket;
    private JInternalReport Report;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel_Fondo;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JPanel jPanel_MenuLeft;
    // End of variables declaration//GEN-END:variables
}