package conef;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;



public class ControlDatos {
    
    public boolean validaPassword(String clave, String clave2){
        if(clave.equals(clave2))
            if(clave.length()>=8)
                if(validaMayuscula(clave))
                    if(validaMinuscula(clave))
                        if(validaNumero(clave))
                            return true;
                        else
                            return false;
                    else
                        return false;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    
    public boolean validaMayuscula(String texto){
        if(texto.contains("A") || texto.contains("B") || texto.contains("C") || texto.contains("D")
         || texto.contains("E") || texto.contains("F") || texto.contains("G") || texto.contains("H")
         || texto.contains("I") || texto.contains("J") || texto.contains("K") || texto.contains("L")
         || texto.contains("M") || texto.contains("N") || texto.contains("Ñ") || texto.contains("O")
         || texto.contains("P") || texto.contains("Q") || texto.contains("R") || texto.contains("S")
         || texto.contains("T") || texto.contains("U") || texto.contains("V") || texto.contains("W")
         || texto.contains("X") || texto.contains("Y") || texto.contains("Z") )
            return true;
        else
            return false;
    }
    
    public boolean validaMinuscula(String texto){
        if(texto.contains("a") || texto.contains("b") || texto.contains("c") || texto.contains("d")
         || texto.contains("e") || texto.contains("f") || texto.contains("g") || texto.contains("h")
         || texto.contains("i") || texto.contains("j") || texto.contains("k") || texto.contains("l")
         || texto.contains("m") || texto.contains("n") || texto.contains("ñ") || texto.contains("o")
         || texto.contains("p") || texto.contains("q") || texto.contains("r") || texto.contains("s")
         || texto.contains("t") || texto.contains("u") || texto.contains("v") || texto.contains("w")
         || texto.contains("x") || texto.contains("y") || texto.contains("z") )
            return true;
        else
            return false;
    }
    public boolean validaNumero(String texto){
        if(texto.contains("0") || texto.contains("1") || texto.contains("2") || texto.contains("3")
         || texto.contains("4") || texto.contains("5") || texto.contains("6") || texto.contains("7")
         || texto.contains("8") || texto.contains("9") )
            return true;
        else
            return false;
    }
    public boolean validaTexto(String texto) {
        
        boolean x = true;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i)) && texto.charAt(i)!=' ') {
                x = false;
            }
        }
        return x;
    }
    
    
    public void llenaCajaOpciones(JComboBox<String> caja){
        caja.addItem(" ");
        caja.addItem("Aguascalientes");
        caja.addItem("Baja California ");
        caja.addItem("Baja California Sur");
        caja.addItem("Campeche");
        caja.addItem("Chiapas");
        caja.addItem("Chihuahua");
        caja.addItem("Ciudad de Mexico");
        caja.addItem("Coahuila");
        caja.addItem("Colima");
        caja.addItem("Durango");
        caja.addItem("Guanajuato");
        caja.addItem("Guerrero");
        caja.addItem("Hidalgo");
        caja.addItem("Jalisco");
        caja.addItem("Estado de Mexico");
        caja.addItem("Michoacan");
        caja.addItem("Morelos");
        caja.addItem("Nayarit");
        caja.addItem("Nuevo Leon");
        caja.addItem("Oaxaca");
        caja.addItem("Puebla");
        caja.addItem("Queretaro");
        caja.addItem("Quintana Roo");
        caja.addItem("San Luis Potosi");
        caja.addItem("Sinaloa");
        caja.addItem("Sonora");
        caja.addItem("Tabasco");
        caja.addItem("Tamaulipas");
        caja.addItem("Tlaxcala");
        caja.addItem("Veracruz");
        caja.addItem("Yucatán");
        caja.addItem("Zacatecas");
        
        
        
    }
    
    public void llenaCajaOpcionesTipo(JComboBox<String> caja){
        caja.addItem(" ");
        caja.addItem("KILO");
        caja.addItem("PACA");
        caja.addItem("BULTO");
        caja.addItem("BALON");
        caja.addItem("COLCHON");
    }
    
    public JComboBox<String> llenaCajaOpciones(DefaultTableModel modelo, JComboBox<String> caja,int opc){

        
        for (int c=0;c < modelo.getRowCount() ; c++) {
            System.out.println(modelo.getRowCount()+"  c: "+c);
           if(opc==1)
                caja.addItem(modelo.getValueAt(c, 0).toString()+" - "+modelo.getValueAt(c, 1).toString()+" " +modelo.getValueAt(c, 2).toString()+" - "+modelo.getValueAt(c, 3).toString());
           else
                caja.addItem(modelo.getValueAt(c, 0).toString()+" - "+modelo.getValueAt(c, 1).toString()+", " +modelo.getValueAt(c, 2).toString()+" - $"+modelo.getValueAt(c, 3).toString());
        }
        System.out.println("***salio de llena caja opciones");
        return caja;
        
    }
    boolean validaCorreo(String correo){
        String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
        Pattern pattern = Pattern.compile(regx);  
        Matcher matcher = pattern.matcher(correo);  
        if(matcher.matches())
            return true;
        else
            return false;
            
    }
    
}
