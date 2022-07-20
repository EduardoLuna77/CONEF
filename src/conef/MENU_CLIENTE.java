
package conef;

import java.sql.Connection;
import javax.swing.SwingUtilities;

public class MENU_CLIENTE extends javax.swing.JPanel {
    private static final long serialVersionUID = 747229562277444447L;

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    public MENU_CLIENTE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOTON_REG_CLI = new javax.swing.JButton();
        BOTON_CON_CLI = new javax.swing.JButton();

        setBackground(new java.awt.Color(148, 29, 118));
        setPreferredSize(new java.awt.Dimension(200, 450));

        BOTON_REG_CLI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REG_CLI.setText("REGISTRAR CLIENTE");
        BOTON_REG_CLI.setToolTipText("Registra Cliente");
        BOTON_REG_CLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REG_CLIActionPerformed(evt);
            }
        });

        BOTON_CON_CLI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_CON_CLI.setText("CONSULTAR CLIENTE");
        BOTON_CON_CLI.setToolTipText("Elimina y Edita informacion a través de la consulta");
        BOTON_CON_CLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CON_CLIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTON_REG_CLI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTON_CON_CLI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(BOTON_REG_CLI)
                .addGap(18, 18, 18)
                .addComponent(BOTON_CON_CLI)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_REG_CLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REG_CLIActionPerformed
        CLIENTE_AGREGAR ventana= new CLIENTE_AGREGAR();
          ventana.setInfo(info);
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_REG_CLIActionPerformed

    private void BOTON_CON_CLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CON_CLIActionPerformed
        CLIENTE_CONSULTAR ventana= new CLIENTE_CONSULTAR();
          ventana.setInfo(info);
          ventana.obtenerFilas();
          ventana.setVisible(true);
          
          ((MENU) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_BOTON_CON_CLIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_CON_CLI;
    private javax.swing.JButton BOTON_REG_CLI;
    // End of variables declaration//GEN-END:variables
}
