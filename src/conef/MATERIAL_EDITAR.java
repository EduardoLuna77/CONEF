  
package conef;

import java.sql.Connection;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MATERIAL_EDITAR extends javax.swing.JFrame {
    private static final long serialVersionUID = 75264720000000L;

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    ControlDatos conDat = new ControlDatos();

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    DefaultTableModel modelo;

    
    ControlAcceso conAcc = new ControlAcceso();

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    int fila;
    DecimalFormat formato = new DecimalFormat();
    String nombre, tipo, descripcion;
    double precio;
    int idMat;
    boolean punto=false;
    
    
    public MATERIAL_EDITAR() {
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
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BOTON_ACTUALIZAR = new javax.swing.JButton();
        BOTON_REGRESAR = new javax.swing.JButton();
        BOTON_MENU = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CAJATEXTO_DESCRIPCION = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CAJATEXTO_NOMBRE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CAJATEXTO_PRECIO = new javax.swing.JFormattedTextField();
        CAJAOPCIONES_TIPO = new javax.swing.JComboBox<>();
        CAJATEXTO_IDMAT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITAR MATERIAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("DATOS PERSONALES");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("EDITAR MATERIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel15)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 245, 233));

        jPanel5.setBackground(new java.awt.Color(255, 245, 233));

        jPanel8.setBackground(new java.awt.Color(255, 245, 233));

        BOTON_ACTUALIZAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_ACTUALIZAR.setText("ACTUALIZAR");
        BOTON_ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_ACTUALIZARActionPerformed(evt);
            }
        });

        BOTON_REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REGRESAR.setText("Regresar");
        BOTON_REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REGRESARActionPerformed(evt);
            }
        });

        BOTON_MENU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_MENU.setText("Menu");
        BOTON_MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_MENUActionPerformed(evt);
            }
        });

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

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Descripcion");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Tipo");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

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

        CAJAOPCIONES_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJAOPCIONES_TIPOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAJAOPCIONES_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BOTON_REGRESAR)
                        .addGap(18, 18, 18)
                        .addComponent(BOTON_MENU)
                        .addGap(157, 157, 157)
                        .addComponent(BOTON_ACTUALIZAR))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel1)
                            .addComponent(CAJATEXTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAJATEXTO_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CAJATEXTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CAJATEXTO_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAJAOPCIONES_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_ACTUALIZAR)
                    .addComponent(BOTON_REGRESAR)
                    .addComponent(BOTON_MENU)))
        );

        CAJATEXTO_IDMAT.setToolTipText("El id del administrador no se puede modificar");
        CAJATEXTO_IDMAT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CAJATEXTO_IDMAT.setEnabled(false);
        CAJATEXTO_IDMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_IDMATActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("IdMaterial");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAJATEXTO_IDMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAJATEXTO_IDMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void CAJATEXTO_IDMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_IDMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_IDMATActionPerformed

    private void CAJATEXTO_NOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREKeyTyped
        char validar = evt.getKeyChar();

        if (CAJATEXTO_NOMBRE.getText().length() == 20)
        evt.consume();
        else{
            if(!Character.isLetter(validar) && validar!=' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_NOMBREKeyTyped

    private void CAJATEXTO_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_NOMBREActionPerformed

    private void CAJATEXTO_NOMBREFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREFocusGained
        CAJATEXTO_NOMBRE.selectAll();
    }//GEN-LAST:event_CAJATEXTO_NOMBREFocusGained

    private void CAJATEXTO_DESCRIPCIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_DESCRIPCIONKeyTyped
        char validar = evt.getKeyChar();

        if (CAJATEXTO_DESCRIPCION.getText().length() == 100)
        evt.consume();
    }//GEN-LAST:event_CAJATEXTO_DESCRIPCIONKeyTyped

    private void CAJATEXTO_DESCRIPCIONFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_DESCRIPCIONFocusGained
        CAJATEXTO_DESCRIPCION.selectAll();
    }//GEN-LAST:event_CAJATEXTO_DESCRIPCIONFocusGained

    private void BOTON_MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_MENUActionPerformed
        MENU ventana= new MENU();
        ventana.setInfo(info);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BOTON_MENUActionPerformed

    private void BOTON_REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REGRESARActionPerformed
        MATERIAL_CONSULTAR ventana= new MATERIAL_CONSULTAR();
        ventana.setInfo(info);
        ventana.obtenerFilas();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BOTON_REGRESARActionPerformed

    private void BOTON_ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ACTUALIZARActionPerformed
        /*        JOptionPane.showMessageDialog(null, "INFORMACIÓN ACTUALIZADA:", "GUARDADO",
            JOptionPane.INFORMATION_MESSAGE, null );*/
        String nom=CAJATEXTO_NOMBRE.getText();
        if(nom.equals("") ||nom==null){
            Tools.Mostrar("Debes ingresar el nombre del material");
        }else{

            tipo=(String)CAJAOPCIONES_TIPO.getSelectedItem();
            precio=Double.parseDouble((CAJATEXTO_PRECIO.getText().equals(null) || CAJATEXTO_PRECIO.getText().equals(""))
                            ?"0":CAJATEXTO_PRECIO.getText());
            descripcion=(CAJATEXTO_DESCRIPCION.getText().equals(null))?"":CAJATEXTO_DESCRIPCION.getText();
            


                System.out.println(CAJATEXTO_DESCRIPCION.getText());

                conAcc.actualizarMaterial(info.getConexion(),idMat, nom, tipo, precio, descripcion);
            

        }

    }//GEN-LAST:event_BOTON_ACTUALIZARActionPerformed

    private void CAJATEXTO_PRECIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOFocusGained
        CAJATEXTO_PRECIO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_PRECIOFocusGained

    private void CAJATEXTO_PRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_PRECIOActionPerformed

    private void CAJATEXTO_PRECIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_PRECIOKeyPressed

    }//GEN-LAST:event_CAJATEXTO_PRECIOKeyPressed

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

    private void CAJAOPCIONES_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJAOPCIONES_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJAOPCIONES_TIPOActionPerformed

    
    
   
    public void asignarDatos(){
        idMat = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        nombre = modelo.getValueAt(fila, 1).toString();
        tipo = modelo.getValueAt(fila, 2).toString();
        precio =Double.parseDouble(modelo.getValueAt(fila, 3).toString());
        descripcion = modelo.getValueAt(fila, 4).toString();
        
        
        
        CAJATEXTO_IDMAT.setText(idMat+"");
        CAJATEXTO_NOMBRE.setText(nombre);
        CAJAOPCIONES_TIPO.setSelectedItem(tipo);
        CAJATEXTO_PRECIO.setText(precio+"");
        CAJATEXTO_DESCRIPCION.setText(descripcion);
        
    }
    
    public void limpiarCampos(){
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
            java.util.logging.Logger.getLogger(MATERIAL_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MATERIAL_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MATERIAL_EDITAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_ACTUALIZAR;
    private javax.swing.JButton BOTON_MENU;
    private javax.swing.JButton BOTON_REGRESAR;
    private javax.swing.JComboBox<String> CAJAOPCIONES_TIPO;
    private javax.swing.JTextPane CAJATEXTO_DESCRIPCION;
    private javax.swing.JTextField CAJATEXTO_IDMAT;
    private javax.swing.JTextField CAJATEXTO_NOMBRE;
    private javax.swing.JFormattedTextField CAJATEXTO_PRECIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
