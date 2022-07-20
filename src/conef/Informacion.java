package conef;

import java.sql.Connection;

public class Informacion {

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }
    
    private Connection conexion;
    private int idAdm;
    
    Informacion(){
        
    }
    
    
    
}
