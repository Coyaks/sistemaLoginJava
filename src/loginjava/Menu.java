package loginjava;
import AppPackage.AnimationClass;
//import javafx.animation.Animation;

/**
 *
 * @author COYAKS
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.setExtendedState(Menu.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLinea1 = new javax.swing.JPanel();
        jPanelLinea2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPublicidad1 = new javax.swing.JLabel();
        jLabelPublicidad2 = new javax.swing.JLabel();
        jLabelAdelante = new javax.swing.JLabel();
        jLabelAtras1 = new javax.swing.JLabel();
        jLabelFONDOOO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemMinimizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1926, 1006));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLinea1.setBackground(new java.awt.Color(0, 51, 255));
        jPanelLinea1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1920, 10));

        jPanelLinea2.setBackground(new java.awt.Color(0, 51, 255));
        jPanelLinea2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 754, 1920, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("TecnoMatics");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 240, 30));

        jLabelPublicidad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/PLUCICIDAD_LAPTOP1.PNG"))); // NOI18N
        jPanel1.add(jLabelPublicidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 1840, 680));

        jLabelPublicidad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/PLUCICIDAD_LAPTOP2.PNG"))); // NOI18N
        jPanel1.add(jLabelPublicidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1920, 110, 1840, 680));

        jLabelAdelante.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 100)); // NOI18N
        jLabelAdelante.setForeground(new java.awt.Color(0, 0, 255));
        jLabelAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right64_Azul.png"))); // NOI18N
        jLabelAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdelanteMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 830, 80, 60));

        jLabelAtras1.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 100)); // NOI18N
        jLabelAtras1.setForeground(new java.awt.Color(0, 0, 255));
        jLabelAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left64_Azul.png"))); // NOI18N
        jLabelAtras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtras1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 70, 60));

        jLabelFONDOOO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/FONDO_BORDE_AZULL.png"))); // NOI18N
        jPanel1.add(jLabelFONDOOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 920));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/carpeta.png"))); // NOI18N
        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItemMinimizar.setText("Minimizar");
        jMenuItemMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemMinimizarMouseClicked(evt);
            }
        });
        jMenuItemMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMinimizarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMinimizar);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/carro-de-la-compra.png"))); // NOI18N
        jMenu2.setText("Ventas");

        jMenuItem2.setText("Vender");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Generar reportes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/Consultas.png"))); // NOI18N
        jMenu3.setText("Consultas");

        jMenuItem4.setText("Precios");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Ofertas");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/ajustes-tres-engranajes-simbolo-de-interfaz.png"))); // NOI18N
        jMenu4.setText("Configuración");

        jMenuItem6.setText("Configurar descuentos");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Configurar obsequio");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Configurar cantidad optima de metros vendidos");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Configurar premio sorpresa");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus/servicio-tenico_1.png"))); // NOI18N
        jMenu5.setText("Ayuda");

        jMenuItem10.setText("Acerca de la tienda");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabelAtras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtras1MouseClicked
        // TODO add your handling code here:
        AnimationClass ob=new AnimationClass();
        ob.jLabelXRight(-1920, 80 , 25, 10, jLabelPublicidad1);
        
        AnimationClass obb=new AnimationClass();
        obb.jLabelXRight(80, 1920, 25, 10, jLabelPublicidad2);
    }//GEN-LAST:event_jLabelAtras1MouseClicked

    private void jLabelAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdelanteMouseClicked
        // TODO add your handling code here:
        AnimationClass ob=new AnimationClass();
        ob.jLabelXLeft(80, -1920 , 25, 10, jLabelPublicidad1);
        
        AnimationClass obb=new AnimationClass();
        obb.jLabelXLeft(1920, 80, 25, 10, jLabelPublicidad2);//incremento tiene q ser menos a 25
    }//GEN-LAST:event_jLabelAdelanteMouseClicked

    private void jMenuItemMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemMinimizarMouseClicked
        // TODO add your handling code here:
        //this.setState(Menu.ICONIFIED);
        
    }//GEN-LAST:event_jMenuItemMinimizarMouseClicked

    private void jMenuItemMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(Menu.ICONIFIED);
    }//GEN-LAST:event_jMenuItemMinimizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        AnimationClass ob=new AnimationClass();
        ob.jLabelXLeft(80, -1920 , 25, 10, jLabelPublicidad1);
        
        AnimationClass obb=new AnimationClass();
        obb.jLabelXLeft(1920, 80, 25, 10, jLabelPublicidad2);//incremento tiene q ser menos a 25
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdelante;
    private javax.swing.JLabel jLabelAtras1;
    private javax.swing.JLabel jLabelFONDOOO;
    private javax.swing.JLabel jLabelPublicidad1;
    private javax.swing.JLabel jLabelPublicidad2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLinea1;
    private javax.swing.JPanel jPanelLinea2;
    // End of variables declaration//GEN-END:variables
}
