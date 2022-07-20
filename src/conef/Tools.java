
package conef;
import javax.swing.JOptionPane;
public class Tools {

    public static void main(String[] args) {
        
    }
    public static String LeeCar (String Message){
        boolean Falso;
        String Caracter="";
        do {
            Falso=false;
            Caracter=JOptionPane.showInputDialog(Message);
            if (Caracter.length()==0)
                JOptionPane.showMessageDialog(null, "No ingresaste ningún caracter", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
            else
                Falso=true;
            
        }while(Falso==false); 
        return Caracter;
        }
    
    public static int LeeInt (String Message){
        boolean Falso=false;
        int Entero=0;
        do {
            try {
                Entero=Integer.parseInt(LeeCar(Message));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                    }
        }while(Falso==false); 
        return Entero;
      
        }
    public static float LeeFloat (String Message){
        boolean Falso=false;
        float Decimales=0;
        do {
            try {
                Decimales=Float.parseFloat(LeeCar(Message));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                    }
        }while(Falso==false); 
        return Decimales;
      
        }
    public static double LeeDouble (String Message){
        boolean Falso=false;
        double Decimales=0;
        do {
            try {
                Decimales=Double.parseDouble(LeeCar(Message));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                }
        }while(Falso==false); 
        return Decimales;
      
        }
        public static short LeeShort (String Message){
        boolean Falso=false;
        short Decimales=0;
        do {
            try {
                Decimales=Short.parseShort(LeeCar(Message));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                    }
        }while(Falso==false); 
        return Decimales;
      
        }              
        
    public static void Mostrar (String Message){
                JOptionPane.showMessageDialog(null, Message, null, 
                        JOptionPane.INFORMATION_MESSAGE, null);       
    }
    
     public static String LeeModCar(String Message, String Text){
        boolean Falso=false;
        String Caracter;
        do {
            Caracter=JOptionPane.showInputDialog(null, Message, Text);
            if (Caracter.length()==0)
                JOptionPane.showMessageDialog(null, "No ingresaste ningún caracter", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
            else
                Falso=true;
            
        }while(Falso==false); 
        return Caracter;
        }
    
    public static int LeeInt (String Message, int Numb){
        boolean Falso=false;
        int Entero=0;
        do {
            try {
                Entero=Integer.parseInt(LeeModCar(Message, ""+Numb));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                }
        }while(Falso==false); 
        return Entero;
        }
    
    public static float LeeFloat (String Message, float Numb){
        boolean Falso=false;
        float Decimales=0;
        do {
            try {
                Decimales=Float.parseFloat(LeeModCar(Message, ""+Numb));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                    }
        }while(Falso==false); 
        return Decimales;
      
        }
    public static double LeeDouble (String Message, double Numb){
        boolean Falso=false;
        double Decimales=0;
        do {
            try {
                Decimales=Double.parseDouble(LeeCar(Message, ""+Numb));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                }
        }while(Falso==false); 
        return Decimales;
      
        }
    public static short LeeShort (String Message, short Numb){
        boolean Falso=false;
        short Decimales=0;
        do {
            try {
                Decimales=Short.parseShort(LeeModCar(Message, ""+Numb));
                Falso=true;}
            catch(Exception Error){
                    JOptionPane.showMessageDialog(null, "Lo que ingresaste es incorrecto:", "ERROR", 
                        JOptionPane.ERROR_MESSAGE, null );
                }
        }while(Falso==false); 
        return Decimales;
      
        }              
   
    
    public static String LeeCar(String Message, String Titulo){
              return  JOptionPane.showInputDialog(null, Message, Titulo, 
              JOptionPane.QUESTION_MESSAGE, null, null, null).toString();
      } 
  public static String JOP(String Message, String Titulo, String []Choice){
              return  JOptionPane.showInputDialog(null, Message, Titulo, 
              JOptionPane.QUESTION_MESSAGE, null, Choice, Choice[0]).toString();
      }
  
  public static int JOP(String Message, String Titulo, int []Choice){
              String []Choice2=new String[Choice.length];
              for(int i=0; i<Choice.length;i++) //pasar arreglo, todo lo que tenga de entero a Cadena
                  Choice2[i]=""+Choice[i];
              return  Integer.parseInt(JOptionPane.showInputDialog(null, Message, Titulo, 
              JOptionPane.QUESTION_MESSAGE, null, Choice2, Choice2[0]).toString());
              }
  public static float JOP(String Message, String Titulo, float []Choice){
              String []Choice2=new String[Choice.length];
              for(int i=0; i<Choice.length;i++) //pasar arreglo, todo lo que tenga de Float a Cadena
                  Choice2[i]=""+Choice[i];
              return  Float.parseFloat(JOptionPane.showInputDialog(null, Message, Titulo, 
              JOptionPane.QUESTION_MESSAGE, null, Choice2, Choice2[0]).toString());
              }
  public static double JOP(String Message, String Titulo, double []Choice){
              String []Choice2=new String[Choice.length];
              for(int i=0; i<Choice.length;i++) //pasar arreglo, todo lo que tenga de Double a Cadena
                  Choice2[i]=""+Choice[i];
              return  Double.parseDouble(JOptionPane.showInputDialog(null, Message, Titulo, 
              JOptionPane.QUESTION_MESSAGE, null, Choice2, Choice2[0]).toString());
              }
  public static int JOPYN(String Message, String Titulo){
      return  JOptionPane.showConfirmDialog(null, Message, Titulo, 
              JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
      } 
  public static int JOPOC(String Message, String Titulo){
      return  JOptionPane.showConfirmDialog(null, Message, Titulo, 
              JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
      } 
  public static int JOPYNC(String Message, String Titulo){
      return  JOptionPane.showConfirmDialog(null, Message, Titulo, 
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
      }
}
