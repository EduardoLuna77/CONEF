
package conef;

import java.sql.Connection;
import javax.swing.SwingUtilities;

public class MENU_MATERIAL extends javax.swing.JPanel {
    private static final long serialVersionUID = 750002295622656457L;
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    public MENU_MATERIAL() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOTON_REG_MAT = new javax.swing.JButton();
        BOTON_CON_MAT = new javax.swing.JButton();

        setBackground(new java.awt.Color(148, 29, 118));
        setPreferredSize(new java.awt.Dimension(200, 450));

        BOTON_REG_MAT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REG_MAT.setText("REGISTRAR MATERIAL");
        BOTON_REG_MAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REG_MATActionPerformed(evt);
            }
        });

        BOTON_CON_MAT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_CON_MAT.setText("CONSULTAR MATERIAL");
        BOTON_CON_MAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CON_MATActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTON_REG_MAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTON_CON_MAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(BOTON_REG_MAT)
                .addGap(18, 18, 18)
                .addComponent(BOTON_CON_MAT)
                .addGap(179, 179, 179))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_REG_MATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REG_MATActionPerformed
        MATERIAL_AGREGAR ventana= new MATERIAL_AGREGAR();
          ventana.setInfo(info);
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_REG_MATActionPerformed

    private void BOTON_CON_MATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CON_MATActionPerformed
        MATERIAL_CONSULTAR ventana= new MATERIAL_CONSULTAR();
          ventana.setInfo(info);
          ventana.obtenerFilas();
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_CON_MATActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_CON_MAT;
    private javax.swing.JButton BOTON_REG_MAT;
    // End of variables declaration//GEN-END:variables
}
