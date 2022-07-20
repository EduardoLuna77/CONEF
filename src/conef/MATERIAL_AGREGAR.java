
package conef;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MATERIAL_AGREGAR extends javax.swing.JFrame {
    private static final long serialVersionUID = 752642776147L;
    ControlAcceso conAcc = new ControlAcceso();
    ControlDatos conDat = new ControlDatos();
    DecimalFormat formato = new DecimalFormat();
    String nombre, tipo, descripcion;
    double precio;
    int idAdm, idMat;
    boolean punto=false;
    
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    public MATERIAL_AGREGAR()  {
        initComponents();
        conDat.llenaCajaOpcionesTipo(CAJAOPCIONES_TIPO);
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
        CAJATEXTO_NOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CAJATEXTO_PRECIO = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        CAJAOPCIONES_TIPO = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CAJATEXTO_DESCRIPCION = new javax.swing.JTextPane();
        BOTON_MENU = new javax.swing.JButton();
        BOTON_GUARDAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR MATERIAL");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("DATOS PERSONALES");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("AGREGAR MATERIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 245, 233));

        jPanel3.setBackground(new java.awt.Color(255, 245, 233));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        CAJATEXTO_NOMBRE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_NOMBREFocusGained(evt);
            }
        });
        CAJATEXTO_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_NOMBREActionPerformed(evt);
            }
        });
        CAJATEXTO_NOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_NOMBREKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio:");

        CAJATEXTO_PRECIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_PRECIOFocusGained(evt);
            }
        });
        CAJATEXTO_PRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_PRECIOActionPerformed(evt);
            }
        });
        CAJATEXTO_PRECIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CAJATEXTO_PRECIOKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_PRECIOKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Tipo");

        CAJAOPCIONES_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJAOPCIONES_TIPOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAJAOPCIONES_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(222, 222, 222))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CAJATEXTO_NOMBRE)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAJATEXTO_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJATEXTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJATEXTO_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CAJAOPCIONES_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 245, 233));

        jPanel10.setBackground(new java.awt.Color(255, 245, 233));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Descripcion");

        CAJATEXTO_DESCRIPCION.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_DESCRIPCIONFocusGained(evt);
            }
        });
        CAJATEXTO_DESCRIPCION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_DESCRIPCIONKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(CAJATEXTO_DESCRIPCION);

        BOTON_MENU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_MENU.setText("Menu");
        BOTON_MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_MENUActionPerformed(evt);
            }
        });

        BOTON_GUARDAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_GUARDAR.setText("Guardar");
        BOTON_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_GUARDARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(BOTON_MENU)
                        .addGap(241, 241, 241)
                        .addComponent(BOTON_GUARDAR))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_GUARDAR)
                    .addComponent(BOTON_MENU))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CAJATEXTO_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_NOMBREActionPerformed

    private void BOTON_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_GUARDARActionPerformed
        
        nombre = CAJATEXTO_NOMBRE.getText();
        if(nombre.equals("") || nombre ==null){
            Tools.Mostrar("Debes ingresar el Nombre");
        }else{  
            tipo=CAJAOPCIONES_TIPO.getSelectedItem().toString();
            precio=Double.parseDouble((CAJATEXTO_PRECIO.getText().equals(null) || CAJATEXTO_PRECIO.getText().equals(""))
                            ?"0":CAJATEXTO_PRECIO.getText());
            descripcion=(CAJATEXTO_DESCRIPCION.getText().equals(null))?"":CAJATEXTO_DESCRIPCION.getText();
            idAdm=info.getIdAdm();
            conAcc.agregarMaterial(info.getConexion(), nombre, tipo, precio, descripcion, info.getIdAdm());

            JOptionPane.showMessageDialog(null, "MATERIAL AGREGADO", "GUARDADO", 
                            JOptionPane.INFORMATION_MESSAGE, null );
                    LimpiarCampos();
               
        }
        
        
    }//GEN-LAST:event_BOTON_GUARDARActionPerformed

    private void BOTON_MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_MENUActionPerformed
          MENU ventana= new MENU();
          ventana.setInfo(info);
          ventana.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_BOTON_MENUActionPerformed

    private void CAJATEXTO_PRECIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOKeyTyped
        
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_PRECIO.getText().length() == 12)
            evt.consume();
        else{
            if(CAJATEXTO_PRECIO.getText().indexOf(".")==-1){
                if(Character.isLetter(validar)){
                    getToolkit().beep();
                    evt.consume();
                }
            }else{
                if(validar=='.'){
                    getToolkit().beep();
                    evt.consume();
                }
            }
        }
        
    }//GEN-LAST:event_CAJATEXTO_PRECIOKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void CAJATEXTO_NOMBREFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREFocusGained
        CAJATEXTO_NOMBRE.selectAll();
    }//GEN-LAST:event_CAJATEXTO_NOMBREFocusGained

    private void CAJATEXTO_PRECIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOFocusGained
        CAJATEXTO_PRECIO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_PRECIOFocusGained

    private void CAJATEXTO_PRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_PRECIOActionPerformed

    private void CAJATEXTO_PRECIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOKeyPressed
        
    }//GEN-LAST:event_CAJATEXTO_PRECIOKeyPressed

    private void CAJATEXTO_DESCRIPCIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_DESCRIPCIONKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_DESCRIPCION.getText().length() == 100)
            evt.consume();
        
    }//GEN-LAST:event_CAJATEXTO_DESCRIPCIONKeyTyped

    private void CAJATEXTO_DESCRIPCIONFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_DESCRIPCIONFocusGained
        CAJATEXTO_DESCRIPCION.selectAll();
    }//GEN-LAST:event_CAJATEXTO_DESCRIPCIONFocusGained

    private void CAJATEXTO_NOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_NOMBRE.getText().length() == 30)
            evt.consume();
        else{
            if(!Character.isLetter(validar) && validar!=' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_NOMBREKeyTyped

    private void CAJAOPCIONES_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJAOPCIONES_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJAOPCIONES_TIPOActionPerformed

    
    
    
    public String crearUsuario(String nombre){
        
        String nomAux = nombre = nombre.toLowerCase();
        int c=1;
        while(conAcc.buscaUsuario(info.getConexion(), nomAux)){
            nomAux=nombre+c;
            c++;       
        }
        return nomAux;
    }
    public void LimpiarCampos(){
        CAJATEXTO_NOMBRE.setText("");
        CAJATEXTO_PRECIO.setText("");
        CAJAOPCIONES_TIPO.setSelectedIndex(0);
        CAJATEXTO_DESCRIPCION.setText("");
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(MATERIAL_AGREGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_AGREGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_AGREGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_AGREGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MATERIAL_AGREGAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_GUARDAR;
    private javax.swing.JButton BOTON_MENU;
    private javax.swing.JComboBox<String> CAJAOPCIONES_TIPO;
    private javax.swing.JTextPane CAJATEXTO_DESCRIPCION;
    private javax.swing.JTextField CAJATEXTO_NOMBRE;
    private javax.swing.JFormattedTextField CAJATEXTO_PRECIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
