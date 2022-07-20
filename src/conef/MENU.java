
package conef;

import static conef.ControlAcceso.URL;
import java.awt.*;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MENU extends javax.swing.JFrame {
    private static final long serialVersionUID = 752647433422776147L;

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }

    Informacion info=new Informacion();
    MENU_ADMIN PanelAdm = new MENU_ADMIN();
    MENU_CLIENTE PanelCli = new MENU_CLIENTE();
    MENU_MATERIAL PanelMat = new MENU_MATERIAL();
    MENU_PEDIDO PanelPed = new MENU_PEDIDO();
    
    
    public MENU() {
        
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CONTENEDOR_PRINCIPAL = new javax.swing.JPanel();
        PANEL_MENU = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ADMINISTRADOR = new javax.swing.JButton();
        CLIENTE = new javax.swing.JButton();
        MATERIAL = new javax.swing.JButton();
        PEDIDO = new javax.swing.JButton();
        BOTON_SALIR = new javax.swing.JButton();
        BOTON_CERRARSESION = new javax.swing.JButton();
        CONTENEDOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        CONTENEDOR_PRINCIPAL.setBackground(new java.awt.Color(204, 255, 204));
        CONTENEDOR_PRINCIPAL.setPreferredSize(new java.awt.Dimension(922, 450));
        CONTENEDOR_PRINCIPAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONTENEDOR_PRINCIPALMouseClicked(evt);
            }
        });

        PANEL_MENU.setBackground(new java.awt.Color(201, 130, 253));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("OPCIONES");

        ADMINISTRADOR.setBackground(new java.awt.Color(212, 211, 244));
        ADMINISTRADOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADMINISTRADOR.setText("ADMINISTRADORES");
        ADMINISTRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINISTRADORActionPerformed(evt);
            }
        });

        CLIENTE.setBackground(new java.awt.Color(212, 211, 244));
        CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CLIENTE.setText("CLIENTES");
        CLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTEActionPerformed(evt);
            }
        });

        MATERIAL.setBackground(new java.awt.Color(212, 211, 244));
        MATERIAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MATERIAL.setText("MATERIALES");
        MATERIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIALActionPerformed(evt);
            }
        });

        PEDIDO.setBackground(new java.awt.Color(212, 211, 244));
        PEDIDO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PEDIDO.setText("PEDIDOS");
        PEDIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEDIDOActionPerformed(evt);
            }
        });

        BOTON_SALIR.setText("SALIR");
        BOTON_SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_SALIRActionPerformed(evt);
            }
        });

        BOTON_CERRARSESION.setText("CERRAR SESION");
        BOTON_CERRARSESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CERRARSESIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_MENULayout = new javax.swing.GroupLayout(PANEL_MENU);
        PANEL_MENU.setLayout(PANEL_MENULayout);
        PANEL_MENULayout.setHorizontalGroup(
            PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_MENULayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_MENULayout.createSequentialGroup()
                        .addComponent(BOTON_CERRARSESION)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(BOTON_SALIR)
                        .addGap(34, 34, 34))
                    .addGroup(PANEL_MENULayout.createSequentialGroup()
                        .addGroup(PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(MATERIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CLIENTE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ADMINISTRADOR, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(PEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PANEL_MENULayout.setVerticalGroup(
            PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_MENULayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(ADMINISTRADOR)
                .addGap(18, 18, 18)
                .addComponent(CLIENTE)
                .addGap(18, 18, 18)
                .addComponent(MATERIAL)
                .addGap(18, 18, 18)
                .addComponent(PEDIDO)
                .addGap(68, 68, 68)
                .addGroup(PANEL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_SALIR)
                    .addComponent(BOTON_CERRARSESION))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        CONTENEDOR.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout CONTENEDORLayout = new javax.swing.GroupLayout(CONTENEDOR);
        CONTENEDOR.setLayout(CONTENEDORLayout);
        CONTENEDORLayout.setHorizontalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        CONTENEDORLayout.setVerticalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CONTENEDOR_PRINCIPALLayout = new javax.swing.GroupLayout(CONTENEDOR_PRINCIPAL);
        CONTENEDOR_PRINCIPAL.setLayout(CONTENEDOR_PRINCIPALLayout);
        CONTENEDOR_PRINCIPALLayout.setHorizontalGroup(
            CONTENEDOR_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTENEDOR_PRINCIPALLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(PANEL_MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONTENEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        CONTENEDOR_PRINCIPALLayout.setVerticalGroup(
            CONTENEDOR_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_MENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CONTENEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONTENEDOR_PRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONTENEDOR_PRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADMINISTRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINISTRADORActionPerformed
        
        
        PanelAdm.setSize(300, 450); 
        PanelAdm.setLocation(0,0);
        PanelAdm.setInfo(info);
        
        CONTENEDOR.removeAll();
        CONTENEDOR.add(PanelAdm,BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
                
    }//GEN-LAST:event_ADMINISTRADORActionPerformed

    private void CLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTEActionPerformed
        
        PanelCli.setSize(300, 450); 
        PanelCli.setLocation(0,0);
        PanelCli.setInfo(info);
        
        CONTENEDOR.removeAll();
        CONTENEDOR.add(PanelCli,BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
        
    }//GEN-LAST:event_CLIENTEActionPerformed

    private void BOTON_SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BOTON_SALIRActionPerformed

    private void MATERIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIALActionPerformed
        
        PanelMat.setSize(300, 450); 
        PanelMat.setLocation(0,0);
        PanelMat.setInfo(info);
        
        CONTENEDOR.removeAll();
        CONTENEDOR.add(PanelMat,BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_MATERIALActionPerformed

    private void PEDIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEDIDOActionPerformed
        
        PanelPed.setSize(300, 450); 
        PanelPed.setLocation(0,0);
        PanelPed.setInfo(info);
        
        CONTENEDOR.removeAll();
        CONTENEDOR.add(PanelPed,BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_PEDIDOActionPerformed

    private void CONTENEDOR_PRINCIPALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTENEDOR_PRINCIPALMouseClicked
        CONTENEDOR.removeAll();
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
        
    }//GEN-LAST:event_CONTENEDOR_PRINCIPALMouseClicked

    private void BOTON_CERRARSESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CERRARSESIONActionPerformed
        LOGIN ventana= new LOGIN(info.getConexion());
        ventana.setVisible(true);
        this.dispose();
          
    }//GEN-LAST:event_BOTON_CERRARSESIONActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMINISTRADOR;
    private javax.swing.JButton BOTON_CERRARSESION;
    private javax.swing.JButton BOTON_SALIR;
    private javax.swing.JButton CLIENTE;
    private javax.swing.JPanel CONTENEDOR;
    private javax.swing.JPanel CONTENEDOR_PRINCIPAL;
    private javax.swing.JButton MATERIAL;
    private javax.swing.JPanel PANEL_MENU;
    private javax.swing.JButton PEDIDO;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    


}
