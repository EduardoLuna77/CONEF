package conef;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlAcceso {
    public static final String URL = "jdbc:mysql://localhost:3306/conef";
    public static final String USER = "admin";
    public static final String CLAVE = "ADM_102proyect";
    
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("¡CONECTADO!");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        return con;
    }
    
    
    
    public void agregarAdmin( Connection conexion, String usuario, String nombre, String apellidoPaterno,
                String apellidoMaterno,String telefono, String correo, String calle, int numero, 
                        String colonia, String ciudad,String estado, String clave){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "INSERT INTO administradores ( usuario, nombre, apellidoPaterno, apellidoMaterno, telefono, correo, direccionCalle, direccionNumero, direccionColonia, direccionCiudad, direccionEstado, clave)" +
"  VALUES ( '"+usuario +"', '"+nombre +"', '"+apellidoPaterno+"', '"+apellidoMaterno+"', '"+telefono+"', '"+correo +"', '" +calle+"', '"+numero+"', '"+colonia+"', '"+ciudad+"', '"+estado+"', '"+clave+"');";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             //JOptionPane.showMessageDialog(null, "Agregado a la tabla");

        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Guardado");
        
    }
    
    
     public void actualizarAdmin( Connection conexion, int idAdm, String usuario, String nombre, String apellidoPaterno,
                String apellidoMaterno,String telefono, String correo, String calle, int numero, 
                        String colonia, String ciudad,String estado, String clave){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "UPDATE administradores SET usuario = '"+usuario +"', nombre = '"+nombre +"', apellidoPaterno = '"+apellidoPaterno+"', apellidoMaterno = '"+apellidoMaterno+"', telefono = '"+telefono+"', correo = '"+correo +"', direccionCalle = '" +calle+"', "
                + "direccionNumero = '"+numero+"', direccionColonia = '"+colonia+"', direccionCiudad = '"+ciudad+"', direccionEstado = '"+estado+"', clave = '"+clave+"' "
                + "where idAdm = '"+idAdm+"';";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             
             //JOptionPane.showMessageDialog(null, "Tabla actualizada");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Actualizado");
        
    }
     
     public void actualizarAdmin( Connection conexion, int idAdm, String usuario, String nombre, String apellidoPaterno,
                String apellidoMaterno,String telefono, String correo, String calle, int numero, 
                        String colonia, String ciudad,String estado){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "UPDATE administradores SET usuario = '"+usuario +"', nombre = '"+nombre +"', apellidoPaterno = '"+apellidoPaterno+"', apellidoMaterno = '"+apellidoMaterno+"', telefono = '"+telefono+"', correo = '"+correo +"', direccionCalle = '" +calle+"', "
                + "direccionNumero = '"+numero+"', direccionColonia = '"+colonia+"', direccionCiudad = '"+ciudad+"', direccionEstado = '"+estado+"' "
                + "where idAdm = '"+idAdm+"';";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             //JOptionPane.showMessageDialog(null, "Usuario actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Actualizado");
        
    }
    
    public boolean eliminarAdmin( Connection conexion, int idAdm){
      
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "DELETE FROM administradores where idAdm = '"+idAdm+"';";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             System.out.println("Usuario eliminado");
             return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
            Tools.Mostrar("No se puede eliminar el administrador \nporque esta asociado a un cliente o a un pedido");
            return false;
        }
       
        
    }
    
     public DefaultTableModel obtenerAdministradores(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoAdm(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT idAdm, usuario, nombre, apellidoPaterno, apellidoMaterno, telefono, correo, direccionCalle, direccionNumero, direccionColonia, direccionCiudad, direccionEstado FROM administradores ORDER BY idAdm ASC;";
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[12];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    fila[10] = rs.getString(11);
                    fila[11] = rs.getString(12);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tablas Obtenidas");
        return modelo;
    }
    
     public DefaultTableModel defineEncabezadoAdm(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("USUARIO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("A.PATERNO");
        modelo.addColumn("A. MATERNO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        modelo.addColumn("CALLE");
        modelo.addColumn("NUMERO");
        modelo.addColumn("COLONIA");
        modelo.addColumn("CIUDAD");
        modelo.addColumn("ESTADO");
        return modelo;
        
    }
    
    public DefaultTableModel defineEncabezadoCliente(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("A.PATERNO");
        modelo.addColumn("A. MATERNO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        modelo.addColumn("CALLE");
        modelo.addColumn("NUMERO");
        modelo.addColumn("COLONIA");
        modelo.addColumn("CIUDAD");
        modelo.addColumn("ESTADO");
        modelo.addColumn("OBSERVACIONES");
        modelo.addColumn("COMERCIO");
        modelo.addColumn("ADMINISTRADOR");
        return modelo;
        
    }
    public DefaultTableModel defineEncabezadoPedidos(DefaultTableModel modelo){
        modelo.addColumn("NO. VALE");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO");
        modelo.addColumn("NOMBRE CLIENTE");
        modelo.addColumn("APELLIDO PATERNO CLIENTE");
        modelo.addColumn("COMERCIO");
        modelo.addColumn("ADMINISTRADOR");
        return modelo;
        
    }
    
    public DefaultTableModel defineEncabezadoPedidoImp(DefaultTableModel modelo){
        modelo.addColumn("NO. VALE");
        modelo.addColumn("FECHA");
        modelo.addColumn("COSTO");
        modelo.addColumn("NOMBRE CLIENTE");
        modelo.addColumn("APELLIDO PATERNO CLIENTE");
        modelo.addColumn("APELLIDO MATERNO CLIENTE");
        modelo.addColumn("COMERCIO");
        modelo.addColumn("NOMBRE ADMINISTRADOR");
        modelo.addColumn("APELLIDO PATERNO ADMIN");
        modelo.addColumn("APELLIDO MATERNO ADMIN");
        return modelo;
        
    }
    public DefaultTableModel defineEncabezadoMaterial(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIPO");
        modelo.addColumn("PRECIO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("ADMINISTRADOR");
        return modelo;
        
    }
    public DefaultTableModel defineEncabezadoClientePedido(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APPATERNO");
        modelo.addColumn("COMERCIO");
        return modelo;
        
    }
    public DefaultTableModel defineEncabezadoMaterialesPedido(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIPO");
        modelo.addColumn("PRECIO");
        return modelo;       
    }
    public DefaultTableModel defineEncabezadoAdmPedido(DefaultTableModel modelo){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APPATERNO");
        modelo.addColumn("APPMATERNO");
        return modelo;
    }
    
    public DefaultTableModel defineEncabezadoPedidoTabla(DefaultTableModel modelo){
        modelo.addColumn("No");
        modelo.addColumn("MATERIAL");
        modelo.addColumn("COSTO POR UNIDAD");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("COSTO");
        return modelo;
        
    }
    public DefaultTableModel buscaAdmin(Connection conexion, String  buscar ){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoAdm(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT idAdm, usuario, nombre, apellidoPaterno, apellidoMaterno, telefono, correo, direccionCalle, direccionNumero, direccionColonia, direccionCiudad, direccionEstado "
                + "FROM administradores WHERE idAdm LIKE '%"+buscar+"%' OR nombre LIKE '%"+buscar+"%' OR apellidoPaterno LIKE '%"+buscar+"%' OR apellidoMaterno LIKE '%"+buscar+"%' OR usuario LIKE '%"+buscar+"%' OR nombre LIKE '%"+buscar+"%'"
                + " OR direccionCalle LIKE '%"+buscar+"%' OR direccionCiudad LIKE '%"+buscar+"%' OR direccionEstado LIKE '%"+buscar+"%' ORDER BY idAdm ASC;";
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[12];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    fila[10] = rs.getString(11);
                    fila[11] = rs.getString(12);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tablas Obtenidas");
        return modelo;
        
    }
    
    public int obtenerAdmin(Connection conexion, String usuario, String clave){
        Statement s;
        ResultSet rs;
        int idAdm=0;
        String query= "SELECT idAdm FROM administradores WHERE usuario = '"+usuario+"' AND clave = '"+clave+"' ORDER BY idAdm ASC;";
        String id="";
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
             while(rs.next())
                  id=rs.getString(1);
             if(id.equals("")) System.out.println("No existe el administrador");
             else idAdm = Integer.parseInt(id);
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conexion Establecida");
        return idAdm;
    }
    
    
    
    public boolean buscaUsuario(Connection conexion, String usuario){
        
        Statement s;
        ResultSet rs;
        boolean x=false;
        String query= "SELECT idAdm FROM administradores WHERE usuario = '"+usuario+"' ORDER BY idAdm ASC;";
        String id="";
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
             while(rs.next())
                  id=rs.getString(1);
             if(id.equals("")) System.out.println("No existe el administrador");
             else x = true;
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Usuario buscado");
        return x;
    }
    
    
    public void agregarCliente( Connection conexion, String nombre, String apellidoPaterno,
                String apellidoMaterno,String telefono, String correo, String calle, int numero, 
                        String colonia, String ciudad, String estado, String comercio, String observaciones, int idAdm){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "INSERT INTO cliente ( nombre, apellidoPaterno, apellidoMaterno, telefono, correo, direccionCalle, direccionNumero, direccionColonia, direccionCiudad, direccionEstado, comercio, observaciones, idAdm)" +
        "  VALUES ( '"+nombre +"', '"+apellidoPaterno+"', '"+apellidoMaterno+"', '"+telefono+"', '"+correo +"', '" +calle+"', '"+numero+"', '"+colonia+"', '"+ciudad+"', '"+estado+"', '"+comercio+"', '"+observaciones+"', "+idAdm+");";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             System.out.println("Agregado a la tabla cliente");

        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    public DefaultTableModel obtenerClientes(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoCliente(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT * FROM (SELECT cliente.idCli , cliente.nombre as nomCli, cliente.apellidoPaterno, cliente.apellidoMaterno, cliente.telefono, cliente.correo, cliente.direccionCalle, cliente.direccionNumero, " +
            "cliente.direccionColonia, cliente.direccionCiudad, cliente.direccionEstado, cliente.observaciones, cliente.comercio, administradores.nombre as nomAdm FROM cliente JOIN administradores " +
            "WHERE cliente.idAdm = administradores.idAdm) as resultado ORDER BY idCli ASC;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[14];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    fila[10] = rs.getString(11);
                    fila[11] = rs.getString(12);
                    fila[12] = rs.getString(13);
                    fila[13] = rs.getString(14);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
    
    public DefaultTableModel buscaCliente(Connection conexion, String  buscar ){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoCliente(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT * FROM (SELECT cliente.idCli, cliente.nombre as nomCli, cliente.apellidoPaterno, cliente.apellidoMaterno, cliente.telefono, cliente.correo, cliente.direccionCalle, cliente.direccionNumero, cliente.direccionColonia, cliente.direccionCiudad, cliente.direccionEstado, cliente.observaciones, cliente.comercio, administradores.nombre as nomAdm " +
                "FROM cliente JOIN administradores WHERE cliente.idAdm = administradores.idAdm) as Resultado WHERE idCli  LIKE '%"+buscar+"%' OR nomCli LIKE '%"+buscar+"%' OR apellidoPaterno LIKE '%"+buscar+"%' OR apellidoMaterno LIKE '%"+buscar+"%' OR telefono LIKE '%"+buscar+"%' OR correo LIKE '%"+buscar+"%' OR direccionCalle LIKE '%"+buscar+"%' OR direccionNumero LIKE '%"+buscar+"%' OR direccionColonia LIKE '%"+buscar+"%' OR direccionCiudad LIKE '%"+buscar+"%' OR direccionEstado LIKE '%"+buscar+"%' OR observaciones LIKE '%"+buscar+"%' OR comercio LIKE '%"+buscar+"%' OR nomAdm LIKE '%"+buscar+"%' ORDER BY idCli ASC;";
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[14];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    fila[10] = rs.getString(11);
                    fila[11] = rs.getString(12);
                    fila[12] = rs.getString(13);
                    fila[13] = rs.getString(14);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tablas Obtenidas");
        return modelo;
        
    }
    
    public boolean eliminarCliente( Connection conexion, int idCli){
      
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "DELETE FROM cliente where idCli = '"+idCli+"';";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             System.out.println("Cliente eliminado");
             return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
            Tools.Mostrar("No se puede eliminar el cliente \nporque esta asociado a un pedido");
            return false;
        }
       
    }
    
        
        public void actualizarCliente( Connection conexion, int idCli, String nombre, String apellidoPaterno,
                String apellidoMaterno,String telefono, String correo, String calle, int numero, 
                        String colonia, String ciudad,String estado, String observaciones, String comercio){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "UPDATE cliente SET  nombre = '"+nombre +"', apellidoPaterno = '"+apellidoPaterno+"', apellidoMaterno = '"+apellidoMaterno+"', telefono = '"+telefono+"', correo = '"+correo +"', direccionCalle = '" +calle+"', "
                + "direccionNumero = '"+numero+"', direccionColonia = '"+colonia+"', direccionCiudad = '"+ciudad+"', direccionEstado = '"+estado+"', observaciones = '"+observaciones+"', comercio = '"+comercio+"' "
                + "WHERE idCli = '"+idCli+"';";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             //JOptionPane.showMessageDialog(null, "Usuario actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Cliente Actualizado");
        
    }
        public void agregarMaterial( Connection conexion, String nombre,String tipo, double precio, String descripcion, int idAdm){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "INSERT INTO materiales ( nombre, tipo,  precio, descripcion, idAdm)" +
        "  VALUES ( '"+nombre +"', '"+tipo+"', '"+precio+"', '"+descripcion+"', "+idAdm+");";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             System.out.println("Agregado a la tabla materiales");

        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
        public DefaultTableModel buscaMaterial(Connection conexion, String  buscar ){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoMaterial(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT * FROM (SELECT materiales.idMat, materiales.nombre as nomMat, materiales.tipo, materiales.precio, materiales.descripcion, administradores.nombre as nomAdm " +
                "FROM cliente JOIN administradores WHERE material.idMat LIKE '%"+buscar+"%' OR material.nombre WHERE LIKE '%"+buscar+"%' OR material.tipo LIKE '%"+buscar+"%' OR material.precio LIKE '%"+buscar+"%' OR material.descripcion LIKE '%"+buscar+"%' OR administradores.nombre) AS RESULTADO ORDER BY cliente.idAdm ASC;";
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[14];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    fila[10] = rs.getString(11);
                    fila[11] = rs.getString(12);
                    fila[12] = rs.getString(13);
                    fila[13] = rs.getString(14);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tablas Obtenidas");
        return modelo;
        
    }
        public DefaultTableModel obtenerMateriales(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoMaterial(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT * FROM (SELECT materiales.idMat, materiales.nombre, materiales.tipo, materiales.precio, materiales.descripcion, administradores.nombre as nomAdm FROM materiales JOIN administradores "
                + "WHERE materiales.idAdm = administradores.idAdm) as resultado ORDER BY idMat asc;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[6];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
        public boolean eliminarMaterial( Connection conexion, int idMat){
      
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "DELETE FROM materiales where idMat = "+idMat+";";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             System.out.println("Material eliminado");
             return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
            Tools.Mostrar("No se puede eliminar el material \nporque esta asociado a un pedido");
            return false;
        }
       
    }
        
        public void actualizarMaterial( Connection conexion, int idMat, String nombre, String tipo, double precio, String descripcion){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query1= "UPDATE materiales SET  nombre = '"+nombre +"', tipo = '"+tipo+"', precio = '"+precio+"', descripcion = '"+descripcion+"' "
                + "WHERE idMat = '"+idMat+"';";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             //JOptionPane.showMessageDialog(null, "Usuario actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Cliente Actualizado");
        
    }
    
        
        
        
        
     public DefaultTableModel obtenerClientesPedido(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoClientePedido(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT idCli, nombre, apellidoPaterno, comercio from cliente;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[4];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
     
      public DefaultTableModel obtenerMaterialesPedido(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoMaterialesPedido(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT idMat, nombre, tipo, precio from materiales;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[4];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
      
    public DefaultTableModel buscaAdminPedido(Connection conexion, int  idAdm ){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoAdmPedido(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT idAdm, nombre, apellidoPaterno, apellidoMaterno FROM administradores WHERE idAdm = "+idAdm;
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[4];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    modelo.addRow(fila);
        
             }
             
             System.out.println("Tablas Obtenidas");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
        
    }
    
    public void registraPedido( Connection conexion, String fecha, double costo, int idAdm, int idCli){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "INSERT INTO pedidos (fecha, costo, idAdm, idCli) values  ('"+fecha +"', "+costo+", "+idAdm+", "+idCli+");";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             System.out.println("Pedido Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(fecha);
        
        
    }
    
    public void registraPed_Mat(Connection conexion, int idMat, int noVale, int cantidad, double costoPorMaterial){
        
        Statement s;
        ResultSet rs;
        String texto="";
        String query= "INSERT INTO ped_Mat (idMat, noVale, cantidadPorMaterial , costoPorMaterial) values  ('"+idMat +"', "+noVale+", "+cantidad+", "+costoPorMaterial+");";
        try {
             s = conexion.createStatement();
             s.executeUpdate(query);
             //JOptionPane.showMessageDialog(null, "Usuario actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Registro en Tabla Relación de Pedido");
        
    }
    public int ultimoPedido(Connection conexion){
        
        Statement s;
        ResultSet rs;
        String fila[];
        String noVale="";
        String query= "SELECT max(noVale) from pedidos;";
        try {
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  noVale = rs.getString(1);
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Tabla Relación de Pedido Registrado");
        return Integer.parseInt(noVale);
    }
    
    public DefaultTableModel obtenerPedidos(Connection conexion){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoPedidos(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT pedidos.noVale, pedidos.fecha, pedidos.costo, cliente.nombre as NomCliente, cliente.apellidoPaterno as ApPaternoCliente, cliente.comercio, administradores.nombre as administrador" +
                    " from pedidos join administradores join cliente " +
                    " where administradores.idAdm = pedidos.idAdm && cliente.idCli = pedidos.idCLi;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[7];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
    
    public DefaultTableModel buscaPedido(Connection conexion, String  buscar ){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoPedidos(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT * FROM (SELECT pedidos.noVale, pedidos.fecha, pedidos.costo, cliente.nombre as nomCliente, cliente.apellidoPaterno as apPaternoCliente, cliente.comercio, administradores.nombre as administrador" +
                    " FROM pedidos join administradores join cliente " +
                    " WHERE administradores.idAdm = pedidos.idAdm && cliente.idCli = pedidos.idCLi) AS resultado WHERE noVale LIKE '%"+buscar+"%' OR  fecha  LIKE '%"+buscar+"%' OR  costo LIKE '%"+buscar+"%' OR  nomCliente LIKE '%"+buscar+"%' OR  apPaternoCliente  LIKE '%"+buscar+"%' OR  comercio LIKE '%"+buscar+"%' OR  administrador  LIKE '%"+buscar+"%';";
        
        try {
        
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[7];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tablas Obtenidas");
        return modelo;
        
    }
    
     public boolean eliminarPedido( Connection conexion, int noVale){
      
        Statement s;
        ResultSet rs;
        String texto="";
        String query1 = "DELETE FROM ped_mat WHERE noVale = "+noVale+";";
        String query2 = "DELETE FROM pedidos WHERE noVale = "+noVale+";";
        
        try {
             s = conexion.createStatement();
             s.executeUpdate(query1);
             s.executeUpdate(query2);
             System.out.println("Material eliminado");
             return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
            Tools.Mostrar("No se puede eliminar el material \nporque esta asociado a un pedido");
            return false;
        }
       
    }
     
     
     public DefaultTableModel obtenerPedidoImprimir(Connection conexion, int noVale){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoPedidoImp(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT noVale, fecha, costo, cliente.nombre, cliente.apellidoPaterno, cliente.apellidoMaterno, comercio, administradores.nombre, administradores.apellidoPaterno, administradores.apellidoMaterno FROM pedidos JOIN administradores JOIN cliente WHERE noVale = "+noVale+" AND pedidos.idAdm=administradores.idAdm AND cliente.idcli=pedidos.idCli;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[10];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    fila[5] = rs.getString(6);
                    fila[6] = rs.getString(7);
                    fila[7] = rs.getString(8);
                    fila[8] = rs.getString(9);
                    fila[9] = rs.getString(10);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
     public DefaultTableModel obtenerPedidoImprimirTabla(Connection conexion, int noVale){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo=defineEncabezadoPedidoTabla(modelo);
        Statement s;
        ResultSet rs;
        String fila[];
        String query= "SELECT ped_mat.noVale, materiales.nombre, materiales.precio, cantidadPorMaterial, costoPorMaterial FROM ped_mat JOIN materiales WHERE ped_mat.noVale = "+noVale+" AND ped_mat.idMat = materiales.idMat;";
        
        try {
            
             s = conexion.createStatement();
             rs = s.executeQuery(query);
              while(rs.next()){
                  fila=new String[5];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getString(5);
                    modelo.addRow(fila);
        
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos de la tabla Cliente obtenidas");
        return modelo;
    }
     
}
