
package conef;

import static java.time.LocalDate.now;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class REALIZAR_PEDIDO extends javax.swing.JFrame {
    private static final long serialVersionUID = 7526443566622776147L;
    ControlAcceso conAcc = new ControlAcceso();
    ControlDatos conDat = new ControlDatos();
    String  nombre, apellidoPaterno, apellidoMaterno;
    int idCli;
    double montoTotal=0;
    
    DefaultTableModel modeloCliente = new DefaultTableModel();
    DefaultTableModel modeloAdministrador = new DefaultTableModel();
    DefaultTableModel modeloMateriales = new DefaultTableModel();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    int numero;
    
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    public REALIZAR_PEDIDO()  {
        initComponents();
       
        CONTADOR.setHorizontalTextPosition(2);
        TABLA.setDefaultEditor(Object.class, null);
        TABLA.getTableHeader().setReorderingAllowed(false) ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CAJAOPCIONES_CLIENTE = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CONTADOR = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CAJATEXTO_CANTIDAD = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        CAJAOPCIONES_MATERIAL = new javax.swing.JComboBox<>();
        BOTON_AGREGAR = new javax.swing.JButton();
        BOTON_ELIMINAR = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        MENU = new javax.swing.JButton();
        BOTON_GUARDAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR CLIENTE");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("REALIZAR PEDIDO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(203, 239, 254));

        jPanel4.setBackground(new java.awt.Color(203, 239, 254));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Selecciona Cliente");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Monto Total");

        CONTADOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CONTADOR.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(CAJAOPCIONES_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(CONTADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJAOPCIONES_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CONTADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(203, 239, 254));

        jPanel7.setBackground(new java.awt.Color(203, 239, 254));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Selecciona Material");

        CAJATEXTO_CANTIDAD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CANTIDADFocusGained(evt);
            }
        });
        CAJATEXTO_CANTIDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CANTIDADKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CANTIDADKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ingresa la cantidad");

        BOTON_AGREGAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_AGREGAR.setText("Agregar");
        BOTON_AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_AGREGARActionPerformed(evt);
            }
        });

        BOTON_ELIMINAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_ELIMINAR.setText("Eliminar");
        BOTON_ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_ELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(CAJAOPCIONES_MATERIAL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(CAJATEXTO_CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BOTON_AGREGAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BOTON_ELIMINAR))
                    .addComponent(jLabel10))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJAOPCIONES_MATERIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJATEXTO_CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTON_AGREGAR)
                    .addComponent(BOTON_ELIMINAR))
                .addGap(46, 46, 46))
        );

        jPanel10.setBackground(new java.awt.Color(203, 239, 254));

        MENU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MENU.setText("Menu");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });

        BOTON_GUARDAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_GUARDAR.setText("REALIZAR");
        BOTON_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_GUARDARActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(MENU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(BOTON_GUARDAR)
                .addGap(314, 314, 314))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_GUARDAR)
                    .addComponent(MENU))
                .addGap(18, 18, 18))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void BOTON_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_GUARDARActionPerformed
       montoTotal= Double.parseDouble(CONTADOR.getText().toString());
       idCli = Integer.parseInt(modeloCliente.getValueAt(CAJAOPCIONES_CLIENTE.getSelectedIndex(), 0).toString());
       String fecha=now()+"";
        int noVale;
        int fila;
        if(Tools.JOPYN("¿Estás seguro que deseas realizar el pedido? ", "Realizar pedido")==JOptionPane.YES_OPTION){
            conAcc.registraPedido(info.getConexion(), fecha, montoTotal, info.getIdAdm(), idCli);
            System.out.println("Agregado a la tabla pedidos");
            noVale=conAcc.ultimoPedido(info.getConexion());
            for (int C = 0; C < modelo.getRowCount(); C++) {
                registrarRelacionPedio(C, noVale);
            }
            LimpiarCampos();
            imprimirPedido();
            
        }
        
        
    }//GEN-LAST:event_BOTON_GUARDARActionPerformed
void imprimirPedido(){
    int noVale= conAcc.ultimoPedido(info.getConexion());
        System.out.println(noVale);
        
        if(noVale!=-1){
            PEDIDO_IMP ventana= new PEDIDO_IMP();
            ventana.setInfo(info);
            ventana.LlenaHojaNoVale(noVale);
            ventana.setVisible(true);
            this.dispose();
        }
}
    void registrarRelacionPedio(int fila, int noVale){
        int idMat=Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        int cantMat=Integer.parseInt(modelo.getValueAt(fila, 3).toString());
        double costoMat=Double.parseDouble(modelo.getValueAt(fila, 4).toString());
        
        conAcc.registraPed_Mat(info.getConexion(), idMat, noVale, cantMat, costoMat);
        
    }
    
    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
          MENU ventana= new MENU();
          ventana.setInfo(info);
          ventana.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_MENUActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void CAJATEXTO_CANTIDADKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CANTIDADKeyTyped

        char validar = evt.getKeyChar();

        if (CAJATEXTO_CANTIDAD.getText().length() == 5)
        evt.consume();
        else{
            if(Character.isLetter(validar) || validar==' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_CANTIDADKeyTyped

    private void CAJATEXTO_CANTIDADKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CANTIDADKeyPressed

    }//GEN-LAST:event_CAJATEXTO_CANTIDADKeyPressed

    private void CAJATEXTO_CANTIDADFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CANTIDADFocusGained
        CAJATEXTO_CANTIDAD.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CANTIDADFocusGained

    private void BOTON_AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_AGREGARActionPerformed
        
        String cant =CAJATEXTO_CANTIDAD.getText();
        
        if(cant != null || !cant.equals("")){
            if(modelo.getRowCount()==0){
                agregar();
            }else{
                int c=existente();
                if(c==-1)
                    agregar();
                else
                    actualizarCampo(c);

            }
        }else{
            Tools.Mostrar("Debes de ingresar una cantidad");
        }
        
        
        
        
    }//GEN-LAST:event_BOTON_AGREGARActionPerformed
    public void agregar(){
        montoTotal+=Double.parseDouble(modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 3).toString())
                *Integer.parseInt(CAJATEXTO_CANTIDAD.getText());
        CONTADOR.setText(montoTotal+"");
        String fila []= new String [5] ;
        fila[0]=modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 0).toString();
        fila[1]=modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 1).toString();
        fila[2]=modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 3).toString();
        fila[3]=CAJATEXTO_CANTIDAD.getText();
        fila[4]=Double.parseDouble(modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 3).toString())
                *Integer.parseInt(CAJATEXTO_CANTIDAD.getText())+"";
        System.out.println(CAJAOPCIONES_MATERIAL.getSelectedIndex());
        modelo.addRow(fila);
        TABLA.setModel(modelo);
    }
    public int existente(){
         int a,b;
         for (int c=0; c < modelo.getRowCount(); c++) {
             a=Integer.parseInt(modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(),0).toString());
             b=Integer.parseInt(modelo.getValueAt(c,0).toString());
             if(a==b)
                 return c;
        }
         return -1;
    }
    public void actualizarCampo(int c){
        montoTotal+=Double.parseDouble(modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 3).toString())
                *Integer.parseInt(CAJATEXTO_CANTIDAD.getText());
        CONTADOR.setText(montoTotal+"");
        String fila []= new String [5] ;
        int cant=Integer.parseInt(CAJATEXTO_CANTIDAD.getText())+Integer.parseInt(modelo.getValueAt(c, 3).toString());
        double costo=Double.parseDouble(modeloMateriales.getValueAt(CAJAOPCIONES_MATERIAL.getSelectedIndex(), 3).toString())
                *Integer.parseInt(CAJATEXTO_CANTIDAD.getText())+Double.parseDouble(modelo.getValueAt(c, 4).toString());
        modelo.setValueAt(cant, c, 3);
        modelo.setValueAt(costo, c, 4);
        
        TABLA.setModel(modelo);
    }

    private void BOTON_ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ELIMINARActionPerformed
        int fila= TABLA.getSelectedRow();
        double subMonto;
        double monto;
        System.out.println("Fila no. "+fila);
        if(fila>=0){
            subMonto=Double.parseDouble(modelo.getValueAt(fila, 4).toString());
            monto = Double.parseDouble(CONTADOR.getText().toString())-subMonto;
            CONTADOR.setText(monto+"");
            montoTotal=monto;
            modelo.removeRow(fila);
        }
            
        
    }//GEN-LAST:event_BOTON_ELIMINARActionPerformed

    
    
    
    public void LimpiarCampos(){
        modelo=defineEncabezado(new DefaultTableModel());
        TABLA.setModel(modelo);
        CAJATEXTO_CANTIDAD.setText("");
        CAJAOPCIONES_CLIENTE.setSelectedIndex(0);
        CAJAOPCIONES_MATERIAL.setSelectedIndex(0);
        CONTADOR.setText("0");
        
    }
    public void asignarDatos(){
        
        modeloCliente = conAcc.obtenerClientesPedido(info.getConexion());
        modeloAdministrador = conAcc.buscaAdminPedido(info.getConexion(),info.getIdAdm());
        modeloMateriales = conAcc.obtenerMaterialesPedido(info.getConexion());
        
        CAJAOPCIONES_CLIENTE=conDat.llenaCajaOpciones(modeloCliente, CAJAOPCIONES_CLIENTE, 1);
        CAJAOPCIONES_MATERIAL=conDat.llenaCajaOpciones(modeloMateriales, CAJAOPCIONES_MATERIAL, 2);
        
        idCli=Integer.parseInt(modeloCliente.getValueAt(0, 0).toString());
        nombre=modeloAdministrador.getValueAt(0, 1).toString();
        apellidoPaterno=modeloAdministrador.getValueAt(0, 2).toString();
        apellidoMaterno=modeloAdministrador.getValueAt(0, 3).toString();
        
        modelo=defineEncabezado(modelo);
        TABLA.setModel(modelo);
        
    }
    
    public DefaultTableModel defineEncabezado(DefaultTableModel modelo){
        modelo.addColumn("No");
        modelo.addColumn("MATERIAL");
        modelo.addColumn("COSTO POR UNIDAD");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("COSTO");
        return modelo;
        
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
            java.util.logging.Logger.getLogger(REALIZAR_PEDIDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REALIZAR_PEDIDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REALIZAR_PEDIDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REALIZAR_PEDIDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REALIZAR_PEDIDO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_AGREGAR;
    private javax.swing.JButton BOTON_ELIMINAR;
    private javax.swing.JButton BOTON_GUARDAR;
    private javax.swing.JComboBox<String> CAJAOPCIONES_CLIENTE;
    private javax.swing.JComboBox<String> CAJAOPCIONES_MATERIAL;
    private javax.swing.JFormattedTextField CAJATEXTO_CANTIDAD;
    private javax.swing.JLabel CONTADOR;
    private javax.swing.JButton MENU;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
