package loginjava;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author COYAKS
 */
public class Login extends javax.swing.JFrame {
    int intentos=1,cont=3;
    
    public Clip clip;
    public String ruta="/Audio/";
     
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void Sonido(String archivo){
        try {
            clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".wav")));
            clip.start();
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(12, 92, 235));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoHorizontal-01.png"))); // NOI18N
        jLabel1.setText("TecnoMatics");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 717, 960, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NNN-01.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 270, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante-en-la-computadora.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 178, 276, 270));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter64_NEGRO.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter64_AZUL.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter64_AZUL.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter64_AZUL.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 481, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/youtube64_NEGRO.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/youtube64_AZUL.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/youtube64_AZUL.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/youtube64_AZUL.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook64_NEGRO.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FACEBOOK64_AZUL.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FACEBOOK64_AZUL.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FACEBOOK64_AZUL.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 481, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGIN128_AZUL_1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 67, 147, 148));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CERRAR32_AZUL.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar32_AZUL.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 40));

        jLabelPass.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 20)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(12, 92, 235));
        jLabelPass.setText("PASSWORD:");
        jPanel2.add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 160, 40));

        jLabelUser.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 20)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(12, 92, 235));
        jLabelUser.setText("USER:");
        jPanel2.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 70, 40));

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setText("Ingresar user...");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 230, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BLOQUEAR32_AZUL.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MINI_USER32_AZUL.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 40));

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Dialog", 0, 27)); // NOI18N
        txtPass.setForeground(new java.awt.Color(51, 51, 51));
        txtPass.setText("jPasswordField1");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 200, 30));

        jSeparator1.setForeground(new java.awt.Color(12, 92, 235));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 300, 20));

        jSeparator2.setForeground(new java.awt.Color(12, 92, 235));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 300, 20));

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ENTER_BUTTON.PNG"))); // NOI18N
        btnIniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ENTER_OSCURO_BUTTON.PNG"))); // NOI18N
        btnIniciar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ENTER_OSCURO_BUTTON.PNG"))); // NOI18N
        btnIniciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ENTER_OSCURO_BUTTON.PNG"))); // NOI18N
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 410, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        Sonido("BtnSelect");
        this.txtUser.setText("");
        this.txtUser.setForeground(new Color(12,92,235));
        this.jLabelPass.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        Sonido("BtnSelect");
        this.txtPass.setText("");
        this.txtPass.setForeground(new Color(12,92,235));//color celeste
        this.jLabelPass.setForeground(new Color(12,92,235));//color celestre
    }//GEN-LAST:event_txtPassMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Sonido("SonidoSelect");
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Sonido("SonidoSelect");
        int op=JOptionPane.YES_NO_OPTION;
        int result=JOptionPane.showConfirmDialog(null, "Ud. desea salir del Login?","EXIT", op);
            if (result==0) {
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Sonido("BtnSelect");
        String usu, pass;
        usu=this.txtUser.getText();
        pass=this.txtPass.getText();
        if ("felix".equals(usu) && "sistemas".equals(pass)) {
            Menu ob=new Menu();
            ob.setVisible(true);
            this.setVisible(false);
        }else{//3 intentos
            if (intentos<3) {
                intentos++;
                cont--;
                if (!"felix".equals(usu) && "sistemas".equals(pass)) {
                    JOptionPane.showMessageDialog(null, "Usuario incorrecto. Intento restante: "+cont);
                }else if (!"sistemas".equals(pass) && "felix".equals(usu)) {
                    JOptionPane.showMessageDialog(null, "Password incorrecto. Intento restante: "+cont);
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario y Password incorrecto. Intento restante: "+cont);
                }
                this.txtUser.setText("");
                this.txtPass.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Número de intentos: "+intentos+", pasó el límite establecido");
                JOptionPane.showMessageDialog(null, "Cerrando Login");
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
         Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
         Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
         Sonido("SonidoSelect");
    }//GEN-LAST:event_jButton1MouseEntered

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        Sonido("BtnSelect");
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        Sonido("BtnSelect");
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Sonido("SonidoSelect");
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        Sonido("SonidoSelect");
    }//GEN-LAST:event_jLabel7MouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
