  
package conef;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ADMIN_EDITAR extends javax.swing.JFrame {
    private static final long serialVersionUID = 75264722956227L;

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
    String usuario, nombre, apellidoPaterno, apellidoMaterno;
    String telefono;
    String correo,  calle, colonia, ciudad, estado, clave;
    int numero, idAdm;
    
    
    public ADMIN_EDITAR() {
        initComponents();
        conDat.llenaCajaOpciones(CAJAOPCIONES_ESTADO);
        CAJATEXTO_CLAVE1.setToolTipText("Ingresa una contraseña con minimo 8 carácteres, \n debe incluir 1 letra mayúscula, 1 letra minúscula y 1 número");
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
        jLabel2 = new javax.swing.JLabel();
        CAJATEXTO_APPATERNO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CAJATEXTO_APMATERNO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CAJATEXTO_IDADM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CAJATEXTO_USUARIO = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CAJATEXTO_TELEFONO = new javax.swing.JFormattedTextField();
        CAJATEXTO_CORREO = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CAJATEXTO_CALLE = new javax.swing.JFormattedTextField();
        CAJATEXTO_NUMERO = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CAJATEXTO_COLONIA = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        CAJATEXTO_CIUDAD = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        BOTON_ACTUALIZAR = new javax.swing.JButton();
        BOTON_REGRESAR = new javax.swing.JButton();
        TITULO_CLAVE1 = new javax.swing.JLabel();
        BOTON_MENU = new javax.swing.JButton();
        TITULO_CLAVE2 = new javax.swing.JLabel();
        CAJATEXTO_CLAVE1 = new javax.swing.JPasswordField();
        CAJATEXTO_CLAVE2 = new javax.swing.JPasswordField();
        CAJAOPCIONES_ESTADO = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITAR ADMINISTRADOR");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("DATOS PERSONALES");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("EDITAR ADMINISTRADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        CAJATEXTO_APPATERNO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_APPATERNOFocusGained(evt);
            }
        });
        CAJATEXTO_APPATERNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_APPATERNOActionPerformed(evt);
            }
        });
        CAJATEXTO_APPATERNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_APPATERNOKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        CAJATEXTO_APMATERNO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_APMATERNOFocusGained(evt);
            }
        });
        CAJATEXTO_APMATERNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_APMATERNOActionPerformed(evt);
            }
        });
        CAJATEXTO_APMATERNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_APMATERNOKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");

        CAJATEXTO_IDADM.setToolTipText("El id del administrador no se puede modificar");
        CAJATEXTO_IDADM.setEnabled(false);
        CAJATEXTO_IDADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_IDADMActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("IdAmin");

        CAJATEXTO_USUARIO.setToolTipText("Ingresar Nombre, apellidos");
        CAJATEXTO_USUARIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_USUARIOFocusGained(evt);
            }
        });
        CAJATEXTO_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_USUARIOActionPerformed(evt);
            }
        });
        CAJATEXTO_USUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_USUARIOKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAJATEXTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CAJATEXTO_APPATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CAJATEXTO_APMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(CAJATEXTO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAJATEXTO_IDADM, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)))
                        .addGap(61, 61, 61))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CAJATEXTO_IDADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CAJATEXTO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJATEXTO_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJATEXTO_APPATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJATEXTO_APMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono:");

        CAJATEXTO_TELEFONO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_TELEFONOFocusGained(evt);
            }
        });
        CAJATEXTO_TELEFONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CAJATEXTO_TELEFONOKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_TELEFONOKeyTyped(evt);
            }
        });

        CAJATEXTO_CORREO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CORREOFocusGained(evt);
            }
        });
        CAJATEXTO_CORREO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CORREOKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CAJATEXTO_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAJATEXTO_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAJATEXTO_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAJATEXTO_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DIRECCIÓN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Calle");

        CAJATEXTO_CALLE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CALLEFocusGained(evt);
            }
        });
        CAJATEXTO_CALLE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CALLEKeyTyped(evt);
            }
        });

        CAJATEXTO_NUMERO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_NUMEROFocusGained(evt);
            }
        });
        CAJATEXTO_NUMERO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CAJATEXTO_NUMEROKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_NUMEROKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Número");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Colonia");

        CAJATEXTO_COLONIA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_COLONIAFocusGained(evt);
            }
        });
        CAJATEXTO_COLONIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_COLONIAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(CAJATEXTO_CALLE, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(CAJATEXTO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(CAJATEXTO_COLONIA, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAJATEXTO_COLONIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAJATEXTO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAJATEXTO_CALLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ciudad");

        CAJATEXTO_CIUDAD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CIUDADFocusGained(evt);
            }
        });
        CAJATEXTO_CIUDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJATEXTO_CIUDADActionPerformed(evt);
            }
        });
        CAJATEXTO_CIUDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CIUDADKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Estado");

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

        TITULO_CLAVE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TITULO_CLAVE1.setText("Nueva Contraseña");

        BOTON_MENU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOTON_MENU.setText("Menu");
        BOTON_MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_MENUActionPerformed(evt);
            }
        });

        TITULO_CLAVE2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TITULO_CLAVE2.setText("Confirmar Contraseña");

        CAJATEXTO_CLAVE1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CLAVE1FocusGained(evt);
            }
        });
        CAJATEXTO_CLAVE1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CLAVE1KeyTyped(evt);
            }
        });

        CAJATEXTO_CLAVE2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAJATEXTO_CLAVE2FocusGained(evt);
            }
        });
        CAJATEXTO_CLAVE2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAJATEXTO_CLAVE2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BOTON_REGRESAR)
                .addGap(18, 18, 18)
                .addComponent(BOTON_MENU)
                .addGap(148, 148, 148)
                .addComponent(BOTON_ACTUALIZAR)
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CAJATEXTO_CLAVE1)
                    .addComponent(jLabel12)
                    .addComponent(CAJATEXTO_CIUDAD, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(TITULO_CLAVE1))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(TITULO_CLAVE2)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CAJAOPCIONES_ESTADO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CAJATEXTO_CLAVE2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(265, 265, 265))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJATEXTO_CIUDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJAOPCIONES_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO_CLAVE1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TITULO_CLAVE2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAJATEXTO_CLAVE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAJATEXTO_CLAVE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_ACTUALIZAR)
                    .addComponent(BOTON_REGRESAR)
                    .addComponent(BOTON_MENU)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void CAJATEXTO_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_NOMBREActionPerformed

    private void CAJATEXTO_APPATERNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_APPATERNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_APPATERNOActionPerformed

    private void CAJATEXTO_APMATERNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_APMATERNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_APMATERNOActionPerformed

    private void BOTON_ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ACTUALIZARActionPerformed
/*        JOptionPane.showMessageDialog(null, "INFORMACIÓN ACTUALIZADA:", "GUARDADO", 
                        JOptionPane.INFORMATION_MESSAGE, null );*/
        
        String clave1 = String.valueOf(CAJATEXTO_CLAVE1.getPassword());
        String clave2 = String.valueOf(CAJATEXTO_CLAVE2.getPassword());
        String usuAux = (CAJATEXTO_USUARIO.getText()==null)?"":CAJATEXTO_USUARIO.getText();
        
        
        
        idAdm = Integer.parseInt(CAJATEXTO_IDADM.getText());
        nombre = CAJATEXTO_NOMBRE.getText();
        apellidoPaterno = (CAJATEXTO_APPATERNO.getText()==null)?"":CAJATEXTO_APPATERNO.getText();
        apellidoMaterno = (CAJATEXTO_APMATERNO.getText()==null)?"":CAJATEXTO_APMATERNO.getText();
        telefono = (CAJATEXTO_TELEFONO.getText()==null)?"":CAJATEXTO_TELEFONO.getText();
        correo = (CAJATEXTO_CORREO.getText()==null)?"":CAJATEXTO_CORREO.getText();
        calle = (CAJATEXTO_CALLE.getText()==null)?"":CAJATEXTO_CALLE.getText();
        numero = (CAJATEXTO_NUMERO.getText().equals(""))? Integer.parseInt("0"):Integer.parseInt(CAJATEXTO_NUMERO.getText());
        colonia = (CAJATEXTO_COLONIA.getText()==null)?"":CAJATEXTO_COLONIA.getText();
        ciudad = (CAJATEXTO_CIUDAD.getText()==null)?"":CAJATEXTO_CIUDAD.getText();
        estado = (String)CAJAOPCIONES_ESTADO.getSelectedItem();
        
        if(usuAux!=null || !usuAux.equals("")){
            if(verifica()){
                if(usuario.equals(usuAux)){
                    registrar(clave1, clave2);
                }else{
                     if(conAcc.buscaUsuario(info.getConexion(), usuAux)){
                         JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
                    }else{
                        usuario = usuAux;
                        registrar(clave1, clave2);
                    }
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingresar a un usuario");
        }
        
        
    }//GEN-LAST:event_BOTON_ACTUALIZARActionPerformed

    public void registrar(String clave1, String clave2){
        if(registraClave(clave1, clave2)){
                    if(conDat.validaPassword(clave1, clave2)){
                        clave=clave1;
                        editaAdminConClave();
                        Tools.Mostrar("Usuario Modificado");
                    }else{
                        Tools.Mostrar("La contraseña no coincide\nAsegurate que cumpla con los criterios");
                    }

                }else{
                    editaAdminSinClave();
                    Tools.Mostrar("Usuario Modificado");
                }
        limpiarCampos();
    }
    public void editaAdminConClave(){
        conAcc.actualizarAdmin(info.getConexion(),idAdm, usuario, nombre, apellidoPaterno, apellidoMaterno,
                            telefono, correo, calle, numero, colonia, ciudad, estado, clave);
    }
    
    public void editaAdminSinClave(){
        conAcc.actualizarAdmin(info.getConexion(),idAdm, usuario, nombre, apellidoPaterno, apellidoMaterno,
                            telefono, correo, calle, numero, colonia, ciudad, estado);
    }
    
    public boolean registraClave(String clave1, String clave2){
        boolean x = true;
        
        if(clave1.equals("") && clave2.equals("") )
            x=false;
        
        return x;
    }
    
    
    
    private void BOTON_REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_REGRESARActionPerformed
          ADMIN_CONSULTAR ventana= new ADMIN_CONSULTAR();
          ventana.setInfo(info);
          ventana.obtenerFilas();
          ventana.setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_BOTON_REGRESARActionPerformed

    private void CAJATEXTO_IDADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_IDADMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_IDADMActionPerformed

    private void CAJATEXTO_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_USUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_USUARIOActionPerformed

    private void CAJATEXTO_CIUDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJATEXTO_CIUDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJATEXTO_CIUDADActionPerformed

    private void BOTON_MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_MENUActionPerformed
          MENU ventana= new MENU();
          ventana.setInfo(info);
          ventana.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_BOTON_MENUActionPerformed

    private void CAJATEXTO_TELEFONOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_TELEFONOKeyTyped
         char validar = evt.getKeyChar();
            
        if (CAJATEXTO_TELEFONO.getText().length() == 10)
            evt.consume();
        else{
            if(Character.isLetter(validar) || validar==' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_TELEFONOKeyTyped

    private void CAJATEXTO_NUMEROKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_NUMEROKeyTyped
    
         char validar = evt.getKeyChar();
            
        if (CAJATEXTO_NUMERO.getText().length() == 5)
            evt.consume();
        else{
            if(Character.isLetter(validar) | validar==' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_NUMEROKeyTyped

    private void CAJATEXTO_USUARIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_USUARIOFocusGained
        CAJATEXTO_USUARIO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_USUARIOFocusGained

    private void CAJATEXTO_NOMBREFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_NOMBREFocusGained
        CAJATEXTO_NOMBRE.selectAll();
    }//GEN-LAST:event_CAJATEXTO_NOMBREFocusGained

    private void CAJATEXTO_APPATERNOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_APPATERNOFocusGained
        CAJATEXTO_APPATERNO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_APPATERNOFocusGained

    private void CAJATEXTO_APMATERNOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_APMATERNOFocusGained
        CAJATEXTO_APMATERNO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_APMATERNOFocusGained

    private void CAJATEXTO_TELEFONOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_TELEFONOFocusGained
        CAJATEXTO_TELEFONO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_TELEFONOFocusGained

    private void CAJATEXTO_CORREOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CORREOFocusGained
        CAJATEXTO_CORREO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CORREOFocusGained

    private void CAJATEXTO_CALLEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CALLEFocusGained
        CAJATEXTO_CALLE.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CALLEFocusGained

    private void CAJATEXTO_NUMEROFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_NUMEROFocusGained
        CAJATEXTO_NUMERO.selectAll();
    }//GEN-LAST:event_CAJATEXTO_NUMEROFocusGained

    private void CAJATEXTO_COLONIAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_COLONIAFocusGained
        CAJATEXTO_COLONIA.selectAll();
    }//GEN-LAST:event_CAJATEXTO_COLONIAFocusGained

    private void CAJATEXTO_CIUDADFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CIUDADFocusGained
        CAJATEXTO_CIUDAD.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CIUDADFocusGained

    private void CAJATEXTO_CLAVE1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CLAVE1FocusGained
        CAJATEXTO_CLAVE1.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CLAVE1FocusGained

    private void CAJATEXTO_CLAVE2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAJATEXTO_CLAVE2FocusGained
        CAJATEXTO_CLAVE2.selectAll();
    }//GEN-LAST:event_CAJATEXTO_CLAVE2FocusGained

    private void CAJATEXTO_TELEFONOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_TELEFONOKeyPressed
        
    }//GEN-LAST:event_CAJATEXTO_TELEFONOKeyPressed

    private void CAJATEXTO_NUMEROKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_NUMEROKeyPressed
        
    }//GEN-LAST:event_CAJATEXTO_NUMEROKeyPressed

    private void CAJATEXTO_USUARIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_USUARIOKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_USUARIO.getText().length() == 20)
            evt.consume();
    }//GEN-LAST:event_CAJATEXTO_USUARIOKeyTyped

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

    private void CAJATEXTO_APPATERNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_APPATERNOKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_APPATERNO.getText().length() == 20)
            evt.consume();
        else{
            if(!Character.isLetter(validar) && validar!=' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_APPATERNOKeyTyped

    private void CAJATEXTO_APMATERNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_APMATERNOKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_APMATERNO.getText().length() == 20)
            evt.consume();
        else{
            if(!Character.isLetter(validar) && validar!=' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_APMATERNOKeyTyped

    private void CAJATEXTO_CORREOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CORREOKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_CORREO.getText().length() == 30)
            evt.consume();
    }//GEN-LAST:event_CAJATEXTO_CORREOKeyTyped

    private void CAJATEXTO_CALLEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CALLEKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_CALLE.getText().length() == 25)
            evt.consume();
    }//GEN-LAST:event_CAJATEXTO_CALLEKeyTyped

    private void CAJATEXTO_COLONIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_COLONIAKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_COLONIA.getText().length() == 25)
            evt.consume();
    }//GEN-LAST:event_CAJATEXTO_COLONIAKeyTyped

    private void CAJATEXTO_CIUDADKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CIUDADKeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_CIUDAD.getText().length() == 25)
            evt.consume();
        else{
            if(!Character.isLetter(validar) && validar!=' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_CIUDADKeyTyped

    private void CAJATEXTO_CLAVE1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CLAVE1KeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_CLAVE1.getPassword().length == 20)
            evt.consume();
        else{
            if(validar==' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_CLAVE1KeyTyped

    private void CAJATEXTO_CLAVE2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAJATEXTO_CLAVE2KeyTyped
        char validar = evt.getKeyChar();
            
        if (CAJATEXTO_CLAVE2.getPassword().length == 20)
            evt.consume();
        else{
            if(validar==' '){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_CAJATEXTO_CLAVE2KeyTyped

   
    public boolean verifica(){
        boolean x=false;
        
        if(conDat.validaTexto(CAJATEXTO_NOMBRE.getText())){
            if(conDat.validaTexto(CAJATEXTO_APPATERNO.getText())){
                if(conDat.validaTexto(CAJATEXTO_APMATERNO.getText())){
                    if(conDat.validaTexto(CAJATEXTO_CIUDAD.getText())){
                        x=true;
                    }else{
                        Tools.Mostrar("La ciudad no debe contener algún número");
                    }
                }else{
                    Tools.Mostrar("El apellido materno no debe contener algún número");
                }
            }else{
                Tools.Mostrar("El apellido paterno no debe contener algún número");
            }
        }else{
            Tools.Mostrar("El nombre no debe contener algún número");
        }
        return x;
    }
    
    public void asignarDatos(){
        idAdm = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        usuario = modelo.getValueAt(fila, 1).toString();
        nombre = modelo.getValueAt(fila, 2).toString();
        apellidoPaterno = modelo.getValueAt(fila, 3).toString();
        apellidoMaterno = modelo.getValueAt(fila, 4).toString();
        telefono = modelo.getValueAt(fila, 5).toString();
        correo = modelo.getValueAt(fila, 6).toString();
        calle = modelo.getValueAt(fila, 7).toString();
        numero = Integer.parseInt(modelo.getValueAt(fila, 8).toString());
        colonia = modelo.getValueAt(fila, 9).toString();
        ciudad = modelo.getValueAt(fila, 10).toString();
        estado = modelo.getValueAt(fila, 11).toString();
        
        
        CAJATEXTO_IDADM.setText(idAdm+"");
        CAJATEXTO_USUARIO.setText(usuario);
        CAJATEXTO_NOMBRE.setText(nombre);
        CAJATEXTO_APPATERNO.setText(apellidoPaterno);
        CAJATEXTO_APMATERNO.setText(apellidoMaterno);
        CAJATEXTO_CALLE.setText(calle);
        CAJATEXTO_CIUDAD.setText(ciudad);
        CAJATEXTO_COLONIA.setText(colonia);
        CAJATEXTO_NUMERO.setText(numero+"");
        CAJAOPCIONES_ESTADO.setSelectedItem(estado);
        CAJATEXTO_TELEFONO.setText(telefono);
        CAJATEXTO_CORREO.setText(correo);
        if(info.getIdAdm()!=idAdm){
            CAJATEXTO_CLAVE1.setVisible(false);
            CAJATEXTO_CLAVE2.setVisible(false);
            TITULO_CLAVE1.setVisible(false);
            TITULO_CLAVE2.setVisible(false);
            
            
        }
    }
    
    
    public void limpiarCampos(){
        CAJATEXTO_CLAVE1.setText("");
        CAJATEXTO_CLAVE2.setText("");
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
            java.util.logging.Logger.getLogger(ADMIN_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ADMIN_EDITAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_ACTUALIZAR;
    private javax.swing.JButton BOTON_MENU;
    private javax.swing.JButton BOTON_REGRESAR;
    private javax.swing.JComboBox<String> CAJAOPCIONES_ESTADO;
    private javax.swing.JTextField CAJATEXTO_APMATERNO;
    private javax.swing.JTextField CAJATEXTO_APPATERNO;
    private javax.swing.JFormattedTextField CAJATEXTO_CALLE;
    private javax.swing.JFormattedTextField CAJATEXTO_CIUDAD;
    private javax.swing.JPasswordField CAJATEXTO_CLAVE1;
    private javax.swing.JPasswordField CAJATEXTO_CLAVE2;
    private javax.swing.JFormattedTextField CAJATEXTO_COLONIA;
    private javax.swing.JFormattedTextField CAJATEXTO_CORREO;
    private javax.swing.JTextField CAJATEXTO_IDADM;
    private javax.swing.JTextField CAJATEXTO_NOMBRE;
    private javax.swing.JFormattedTextField CAJATEXTO_NUMERO;
    private javax.swing.JFormattedTextField CAJATEXTO_TELEFONO;
    private javax.swing.JTextField CAJATEXTO_USUARIO;
    private javax.swing.JLabel TITULO_CLAVE1;
    private javax.swing.JLabel TITULO_CLAVE2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
