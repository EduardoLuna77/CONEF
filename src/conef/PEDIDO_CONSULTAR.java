
package conef;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PEDIDO_CONSULTAR extends javax.swing.JFrame {
    private static final long serialVersionUID = 75264111111L;
    ControlAcceso conAcc = new ControlAcceso();
    DefaultTableModel modelo;
    
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    
    public PEDIDO_CONSULTAR() {
        initComponents();
        TABLA.setDefaultEditor(Object.class, null);
        TABLA.getTableHeader().setReorderingAllowed(false) ;

    }
    public void obtenerFilas(){
        modelo =conAcc.obtenerPedidos(info.getConexion());
        TABLA.setModel(modelo);
        System.out.println("Tabla obtenida");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        BOTON_REGRESARMENU = new javax.swing.JButton();
        CAJATEXTO_BUSCAR = new javax.swing.JTextField();
        ELIMINAR = new javax.swing.JButton();
        IMPRIMIR = new javax.swing.JButton();

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("DATOS PERSONALES");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("CONSULTAR ADMINISTRADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel15)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAR MATERIAL");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(203, 239, 254));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("PEDIDOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(216, 216, 216)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(203, 239, 254));

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA);

        BOTON_REGRESARMENU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BOTON_REGRESARMENU.setText("IR AL MENU");
        BOTON_REGRESARMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REGRESARMENUActionPerformed(evt);
            }
        });

        CAJATEXTO_BUSCAR.setToolTipText("Buscar por nombre,apellido paterno, apellido materno.");
        CAJATEXTO_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_BUSCARActionPerformed(evt);
            }
        });
        CAJATEXTO_BUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CAJATEXTO_BUSCARKeyReleased(evt);
            }
        });

        ELIMINAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        IMPRIMIR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IMPRIMIR.setText("IMPRIMIR");
        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(BOTON_REGRESARMENU)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CAJATEXTO_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ELIMINAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(IMPRIMIR)
                .addGap(141, 141, 141))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CAJATEXTO_BUSCAR)
                            .addComponent(ELIMINAR)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(IMPRIMIR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BOTON_REGRESARMENU)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CAJATEXTO_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_BUSCARActionPerformed

    private void BOTON_REGRESARMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REGRESARMENUActionPerformed
        MENU ventana= new MENU();
        ventana.setInfo(info);
        ventana.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_BOTON_REGRESARMENUActionPerformed

    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
        int fila= TABLA.getSelectedRow();
        System.out.println(fila);
        
        if(fila!=-1){
            PEDIDO_IMP ventana= new PEDIDO_IMP();
            ventana.setInfo(info);
            ventana.setModelo(modelo);
            ventana.LlenaHoja(fila);
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_IMPRIMIRActionPerformed

    private void CAJATEXTO_BUSCARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_BUSCARKeyReleased
        if(!CAJATEXTO_BUSCAR.getText().equals("") || CAJATEXTO_BUSCAR.getText()!=null){
            modelo = conAcc.buscaPedido(info.getConexion(), CAJATEXTO_BUSCAR.getText());
            TABLA.setModel(modelo);
        }
    }//GEN-LAST:event_CAJATEXTO_BUSCARKeyReleased

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        int fila= TABLA.getSelectedRow();
        System.out.println("Fila no. "+fila);
        int noVale;
        String nombre="";
        
        if(fila>=0){
            
            noVale = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
            
                nombre = modelo.getValueAt(fila, 1).toString();
                if(Tools.JOPYN("¿Seguro que desea eliminar el pedido?", "Eliminar Material")==JOptionPane.YES_OPTION){
                    if(conAcc.eliminarPedido(info.getConexion(), noVale)){
                        modelo.removeRow(fila);
                        Tools.Mostrar("Registro Eliminado");
                    }
                    
            
        }
            
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PEDIDO_CONSULTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PEDIDO_CONSULTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PEDIDO_CONSULTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PEDIDO_CONSULTAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PEDIDO_CONSULTAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_REGRESARMENU;
    private javax.swing.JTextField CAJATEXTO_BUSCAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton IMPRIMIR;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
