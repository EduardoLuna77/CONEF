
package conef;

import conef.ControlAcceso;
import conef.Informacion;
import conef.MENU;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {
    private static final long serialVersionUID = 752647223333956247L;

    ControlAcceso conAcc =new ControlAcceso();

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    Informacion info = new Informacion();
    
    
    public LOGIN() {
        initComponents();
        USUARIO.requestFocusInWindow();
        
        info.setConexion(conAcc.getConexion());
        
        
        this.setLocationRelativeTo(this);
        
        this.pintarImagen(LOGO, "/images/logo.png");
        
    }
    public LOGIN(Connection conexion) {
        initComponents();
        USUARIO.requestFocusInWindow();
        
        info.setConexion(conexion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "conef.LOGIN_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LABELPASSWORD = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        INICIARSESION = new javax.swing.JButton();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setText("USUARIO");

        LABELPASSWORD.setText("CONTRASEÑA");

        USUARIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                USUARIOFocusGained(evt);
            }
        });
        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOActionPerformed(evt);
            }
        });
        USUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                USUARIOKeyPressed(evt);
            }
        });

        INICIARSESION.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        INICIARSESION.setText("INICIAR SESIÓN");
        INICIARSESION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INICIARSESIONMouseClicked(evt);
            }
        });
        INICIARSESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARSESIONActionPerformed(evt);
            }
        });

        PASSWORD.setToolTipText("Ingresa la contraseña para ingresar.");
        PASSWORD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PASSWORDFocusGained(evt);
            }
        });
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });
        PASSWORD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PASSWORDKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(USUARIO)
                            .addComponent(LABELPASSWORD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(INICIARSESION)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PASSWORD)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(LABELPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(INICIARSESION)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        SALIR.setBackground(new java.awt.Color(255, 102, 102));
        SALIR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SALIR.setText("Salir");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        LOGO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        LOGO.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SALIR)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(SALIR)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIOActionPerformed

    private void INICIARSESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARSESIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INICIARSESIONActionPerformed

    private void INICIARSESIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INICIARSESIONMouseClicked
        conectar();
                       
    }//GEN-LAST:event_INICIARSESIONMouseClicked

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void USUARIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USUARIOKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER)
           conectar();
    }//GEN-LAST:event_USUARIOKeyPressed

    private void USUARIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_USUARIOFocusGained
        USUARIO.selectAll();
    }//GEN-LAST:event_USUARIOFocusGained

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void PASSWORDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PASSWORDFocusGained
        PASSWORD.selectAll();
    }//GEN-LAST:event_PASSWORDFocusGained

    private void PASSWORDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PASSWORDKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
           conectar();
    }//GEN-LAST:event_PASSWORDKeyPressed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    public void conectar(){
        
        
           if((USUARIO.getText().equals("") && String.valueOf(PASSWORD.getPassword()).equals(""))
                   || USUARIO.getText().equals("") || String.valueOf(PASSWORD.getPassword()).equals(""))
               JOptionPane.showMessageDialog(null, "Falta ingresar datos");
           else{
                if(conAcc.obtenerAdmin(info.getConexion(), USUARIO.getText().toString(), String.valueOf(PASSWORD.getPassword()))!=0){
                    
                    info.setIdAdm(conAcc.obtenerAdmin(info.getConexion(), USUARIO.getText().toString(), String.valueOf(PASSWORD.getPassword())));
                    
                    MENU ventana = new MENU();
                    ventana.setInfo(info);
                    ventana.setVisible(true);
                    this.dispose();
                } else{
                    JOptionPane.showMessageDialog(null, "Alguno de los datos ingresados es incorrecto","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
           }
               
        
    }
    private ImageIcon imagen;
    private Icon icono;
    
    void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(getClass().getResource(ruta));

        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INICIARSESION;
    private javax.swing.JLabel LABELPASSWORD;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
