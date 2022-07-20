
package conef;

import java.sql.Connection;
import javax.swing.SwingUtilities;


public class MENU_PEDIDO extends javax.swing.JPanel {
    private static final long serialVersionUID = 76147L;
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    public MENU_PEDIDO() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOTON_REAL_PEDIDO = new javax.swing.JButton();
        BOTON_CON_PEDIDO = new javax.swing.JButton();

        setBackground(new java.awt.Color(148, 29, 118));
        setPreferredSize(new java.awt.Dimension(200, 450));

        BOTON_REAL_PEDIDO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REAL_PEDIDO.setText("REALIZAR PEDIDO");
        BOTON_REAL_PEDIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REAL_PEDIDOActionPerformed(evt);
            }
        });

        BOTON_CON_PEDIDO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_CON_PEDIDO.setText("CONSULTAR PEDIDO");
        BOTON_CON_PEDIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CON_PEDIDOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTON_REAL_PEDIDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTON_CON_PEDIDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(BOTON_REAL_PEDIDO)
                .addGap(18, 18, 18)
                .addComponent(BOTON_CON_PEDIDO)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_REAL_PEDIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REAL_PEDIDOActionPerformed
        REALIZAR_PEDIDO ventana= new REALIZAR_PEDIDO();
          ventana.setInfo(info);
          ventana.asignarDatos();
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_REAL_PEDIDOActionPerformed

    private void BOTON_CON_PEDIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CON_PEDIDOActionPerformed
        PEDIDO_CONSULTAR ventana= new PEDIDO_CONSULTAR();
          ventana.setInfo(info);
          ventana.obtenerFilas();
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_CON_PEDIDOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_CON_PEDIDO;
    private javax.swing.JButton BOTON_REAL_PEDIDO;
    // End of variables declaration//GEN-END:variables
}
