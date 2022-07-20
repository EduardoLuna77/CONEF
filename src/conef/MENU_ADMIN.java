
package conef;

import java.sql.Connection;
import javax.swing.SwingUtilities;

public class MENU_ADMIN extends javax.swing.JPanel {
    private static final long serialVersionUID = 95622776147L;
    
    
    
    Informacion info = new Informacion();

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    public MENU_ADMIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOTON_REG_ADMIN = new javax.swing.JButton();
        BOTON_CON_ADMIN = new javax.swing.JButton();

        setBackground(new java.awt.Color(148, 29, 118));
        setPreferredSize(new java.awt.Dimension(200, 450));

        BOTON_REG_ADMIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REG_ADMIN.setText("REGISTRAR ADMINISTRADOR");
        BOTON_REG_ADMIN.setToolTipText("Registra Administrador");
        BOTON_REG_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REG_ADMINActionPerformed(evt);
            }
        });

        BOTON_CON_ADMIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_CON_ADMIN.setText("CONSULTAR ADMINISTRADOR");
        BOTON_CON_ADMIN.setToolTipText("Elimina y Edita informacion a través de la consulta");
        BOTON_CON_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CON_ADMINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTON_REG_ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTON_CON_ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(BOTON_REG_ADMIN)
                .addGap(18, 18, 18)
                .addComponent(BOTON_CON_ADMIN)
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_REG_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REG_ADMINActionPerformed
         
           
          ADMIN_AGREGAR ventana= new ADMIN_AGREGAR();
          ventana.setInfo(info);
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
          
        
    }//GEN-LAST:event_BOTON_REG_ADMINActionPerformed

    private void BOTON_CON_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CON_ADMINActionPerformed
          ADMIN_CONSULTAR ventana= new ADMIN_CONSULTAR();
          ventana.setInfo(info);
          ventana.obtenerFilas();
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_CON_ADMINActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_CON_ADMIN;
    private javax.swing.JButton BOTON_REG_ADMIN;
    // End of variables declaration//GEN-END:variables
}
