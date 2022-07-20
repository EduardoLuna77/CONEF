/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conef;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amigo
 */
public class ADMIN_IMP extends javax.swing.JFrame implements Printable{
    private static final long serialVersionUID = 752647222776147L;
ControlAcceso conAcc = new ControlAcceso();
    DefaultTableModel modelo;

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    
    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    Informacion info = new Informacion();
    
    void LlenaHoja(int fila){
        
        ETIQUETA_IDADM.setText(modelo.getValueAt(fila, 0).toString());
        ETIQUETA_USUARIO.setText(modelo.getValueAt(fila, 1).toString());
        ETIQUETA_NOMBRE.setText(modelo.getValueAt(fila, 2).toString());
        ETIQUETA_APPATERNO.setText(modelo.getValueAt(fila, 3).toString());
        ETIQUETA_APMATERNO.setText(modelo.getValueAt(fila, 4).toString());
        ETIQUETA_TELEFONO.setText(modelo.getValueAt(fila, 5).toString());
        ETIQUETA_CORREO.setText(modelo.getValueAt(fila, 6).toString());
        ETIQUETA_CALLE.setText(modelo.getValueAt(fila, 7).toString());
        ETIQUETA_NUMERO.setText(modelo.getValueAt(fila, 8).toString());
        ETIQUETA_COLONIA.setText(modelo.getValueAt(fila, 9).toString());
        ETIQUETA_CIUDAD.setText(modelo.getValueAt(fila, 10).toString());
        ETIQUETA_ESTADO.setText(modelo.getValueAt(fila, 11).toString());
        
        
    }
    
    public ADMIN_IMP() {
        initComponents();
        this.pintarImagen(LOGOCELFIMEX, "/images/logoCelfimex.png");
        this.pintarImagen(LOGOCONEF, "/images/logo.png");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hoja = new javax.swing.JPanel();
        LOGOCELFIMEX = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ETIQUETA_IDADM = new javax.swing.JLabel();
        ETIQUETA_APPATERNO = new javax.swing.JLabel();
        ETIQUETA_NOMBRE = new javax.swing.JLabel();
        ETIQUETA_TELEFONO = new javax.swing.JLabel();
        ETIQUETA_APMATERNO = new javax.swing.JLabel();
        ETIQUETA_CORREO = new javax.swing.JLabel();
        ETIQUETA_CALLE = new javax.swing.JLabel();
        ETIQUETA_COLONIA = new javax.swing.JLabel();
        ETIQUETA_CIUDAD = new javax.swing.JLabel();
        ETIQUETA_NUMERO = new javax.swing.JLabel();
        ETIQUETA_ESTADO = new javax.swing.JLabel();
        ETIQUETA_USUARIO = new javax.swing.JLabel();
        BOTON_IMPRIMIR = new javax.swing.JButton();
        BOTON_REGRESAR = new javax.swing.JButton();
        LOGOCONEF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMPRESION");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        Hoja.setBackground(new java.awt.Color(255, 255, 255));
        Hoja.setName("Hoja"); // NOI18N

        LOGOCELFIMEX.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("idAdm:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ADMINISTRADOR");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Apellido Paterno: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Telefono: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DOMICILIO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Correo: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Calle: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Numero:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Colonia");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ciudad:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Estado");

        ETIQUETA_IDADM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_IDADM.setText(" ");

        ETIQUETA_APPATERNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_APPATERNO.setText(" ");

        ETIQUETA_NOMBRE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_NOMBRE.setText(" ");

        ETIQUETA_TELEFONO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_TELEFONO.setText(" ");

        ETIQUETA_APMATERNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_APMATERNO.setText(" ");

        ETIQUETA_CORREO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_CORREO.setText(" ");

        ETIQUETA_CALLE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_CALLE.setText(" ");

        ETIQUETA_COLONIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_COLONIA.setText(" ");

        ETIQUETA_CIUDAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_CIUDAD.setText(" ");

        ETIQUETA_NUMERO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_NUMERO.setText(" ");

        ETIQUETA_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_ESTADO.setText(" ");

        ETIQUETA_USUARIO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ETIQUETA_USUARIO.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ETIQUETA_IDADM, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ETIQUETA_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ETIQUETA_APPATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ETIQUETA_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ETIQUETA_APMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ETIQUETA_NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ETIQUETA_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ETIQUETA_COLONIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ETIQUETA_CALLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ETIQUETA_NUMERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ETIQUETA_ESTADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ETIQUETA_CIUDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(ETIQUETA_IDADM)
                    .addComponent(ETIQUETA_USUARIO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ETIQUETA_NOMBRE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ETIQUETA_APPATERNO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ETIQUETA_APMATERNO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ETIQUETA_TELEFONO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ETIQUETA_CORREO))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ETIQUETA_CALLE)
                    .addComponent(jLabel14)
                    .addComponent(ETIQUETA_CIUDAD))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(ETIQUETA_ESTADO)
                    .addComponent(ETIQUETA_NUMERO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ETIQUETA_COLONIA))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        BOTON_IMPRIMIR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_IMPRIMIR.setText("IMPRIMIR");
        BOTON_IMPRIMIR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BOTON_IMPRIMIRFocusLost(evt);
            }
        });
        BOTON_IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_IMPRIMIRActionPerformed(evt);
            }
        });

        BOTON_REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_REGRESAR.setText("Regresar");
        BOTON_REGRESAR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BOTON_REGRESARFocusLost(evt);
            }
        });
        BOTON_REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_REGRESARActionPerformed(evt);
            }
        });

        LOGOCONEF.setText("jLabel1");

        javax.swing.GroupLayout HojaLayout = new javax.swing.GroupLayout(Hoja);
        Hoja.setLayout(HojaLayout);
        HojaLayout.setHorizontalGroup(
            HojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HojaLayout.createSequentialGroup()
                .addGroup(HojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HojaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HojaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BOTON_REGRESAR)
                        .addGap(153, 153, 153)
                        .addComponent(BOTON_IMPRIMIR)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(HojaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LOGOCELFIMEX, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGOCONEF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        HojaLayout.setVerticalGroup(
            HojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HojaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGOCELFIMEX, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGOCONEF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(HojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_REGRESAR)
                    .addComponent(BOTON_IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        //BOTON_IMPRIMIR.setVisible(false);
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       // BOTON_IMPRIMIR.setVisible(true);
    }//GEN-LAST:event_formFocusGained

    private void BOTON_IMPRIMIRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BOTON_IMPRIMIRFocusLost

    }//GEN-LAST:event_BOTON_IMPRIMIRFocusLost

    private void BOTON_IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_IMPRIMIRActionPerformed
        /*PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);

        if(job.printDialog()){
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }else{
            System.out.println("Imprension cancelada");
        }*/
        printComponent(Hoja);
        
        
        
    }//GEN-LAST:event_BOTON_IMPRIMIRActionPerformed

    private void BOTON_REGRESARFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BOTON_REGRESARFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTON_REGRESARFocusLost

    private void BOTON_REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REGRESARActionPerformed
        ADMIN_CONSULTAR ventana= new ADMIN_CONSULTAR();
        ventana.setInfo(info);
        ventana.obtenerFilas();
        ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BOTON_REGRESARActionPerformed

    public void printComponent(JPanel component){
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable (new Printable() {    
          public int print(Graphics pg, PageFormat pf, int pageNum){
            if (pageNum > 0){
            return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2 = (Graphics2D) pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            component.paint(g2);
            return Printable.PAGE_EXISTS;
          }
        });
        if (pj.printDialog() == false)
        return;

        try {
              pj.print();
        } catch (PrinterException ex) {
              // handle exception
        }
}
    
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
            java.util.logging.Logger.getLogger(ADMIN_IMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_IMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_IMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_IMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN_IMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_IMPRIMIR;
    private javax.swing.JButton BOTON_REGRESAR;
    private javax.swing.JLabel ETIQUETA_APMATERNO;
    private javax.swing.JLabel ETIQUETA_APPATERNO;
    private javax.swing.JLabel ETIQUETA_CALLE;
    private javax.swing.JLabel ETIQUETA_CIUDAD;
    private javax.swing.JLabel ETIQUETA_COLONIA;
    private javax.swing.JLabel ETIQUETA_CORREO;
    private javax.swing.JLabel ETIQUETA_ESTADO;
    private javax.swing.JLabel ETIQUETA_IDADM;
    private javax.swing.JLabel ETIQUETA_NOMBRE;
    private javax.swing.JLabel ETIQUETA_NUMERO;
    private javax.swing.JLabel ETIQUETA_TELEFONO;
    private javax.swing.JLabel ETIQUETA_USUARIO;
    private javax.swing.JPanel Hoja;
    private javax.swing.JLabel LOGOCELFIMEX;
    private javax.swing.JLabel LOGOCONEF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graficos, PageFormat formatoPagina, int paginaIndex) throws PrinterException {
        if(paginaIndex==0){
            Graphics2D grafico = (Graphics2D) graficos;
            grafico.translate(formatoPagina.getImageableX(), formatoPagina.getImageableY());
            printAll(grafico);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
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
    
}
