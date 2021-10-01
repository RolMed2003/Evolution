package metodos;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FicheroTool {

    WindowTool WinTool = new WindowTool();
    
    public void EscrbirFichero(String Username, String Password){
    
        try{
            
            FileWriter FW = new FileWriter("Datos de acceso.txt", false);
            BufferedWriter BW = new BufferedWriter(FW);
            PrintWriter PW = new PrintWriter(BW);
            
            PW.print(Username + "\n");
            PW.print(Password);
            PW.close();
            
        }catch(Exception e){
            
            System.err.println("Error al guardar el fichero con los datos de acceso. "+ e);
            
            JOptionPane.showMessageDialog(null, "Error al escribir fichero.", "Error de escritura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
    }
    
    
    public void EscrbirFichero(String MostrarAyuda, String Username, int Numero){
    
        try{
            
            FileWriter FW = new FileWriter(Numero +".MostrarAyuda"+ Username +".txt", false);
            BufferedWriter BW = new BufferedWriter(FW);
            PrintWriter PW = new PrintWriter(BW);
            
            PW.print(MostrarAyuda);
            PW.close();
            
        }catch(IOException e){
            
            System.err.println("Error al guardar el fichero de MostrarAyuda. "+ e);
            
            JOptionPane.showMessageDialog(null, "Error al escribir fichero.", "Error de escritura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
    }
    
    
    public String LeerFichero(String Username, int Numero){
        
        String MostrarAyuda = "";
        
        try{
            
            FileReader FR = new FileReader(Numero +".MostrarAyuda"+ Username +".txt");
            BufferedReader BR = new BufferedReader(FR);
            
            MostrarAyuda = BR.readLine();
                
        }catch(IOException e){
            
            System.err.println("Error al obtener AyudaOption. "+ e );
            
            JOptionPane.showMessageDialog(null, "Error de lectura.", "Error de lectura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
        return MostrarAyuda;
    }
    
    
    public void LimpiarFichero(){
    
        try{
            
            FileWriter FW = new FileWriter("Datos de acceso.txt", false);
            BufferedWriter BW = new BufferedWriter(FW);
            PrintWriter PW = new PrintWriter(BW);
            
            PW.print("");
            PW.close();
            
        }catch(Exception e){
            
            System.err.println("Error al limpiar fichero. "+ e);
            
            JOptionPane.showMessageDialog(null, "Error al limpiar fichero.", "Error de escritura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
    }
    
    
    public String GetUserFichero(){
        
        int Cont = 1;
        String Username = "";
        
        try{
            
            FileReader FR = new FileReader("Datos de acceso.txt");
            BufferedReader BR = new BufferedReader(FR);
            
            String Temp = "";
            
            while( (Temp = BR.readLine()) != null ){
                
                if(Cont == 1){
                    
                    Username = Temp;
                    Temp = "";
                    Cont++;
                    
                }
                
            }
                      
        }catch(Exception e){
            
            System.err.println("Error al obtener el Username "+ e);
            
            JOptionPane.showMessageDialog(null, "Error al obtener el Username.", "Error de lectura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
        return Username;
    }
    
    
    public String GetPassFichero(){
        
        int Cont = 1;
        String Password = "";
        
        try{
            
            FileReader FR = new FileReader("Datos de acceso.txt");
            BufferedReader BR = new BufferedReader(FR);
            
            String Temp = "";
            
            while( (Temp = BR.readLine()) != null ){
                
                if(Cont == 1){
                    
                    Temp = "";
                    Cont++;
                    
                }else if(Cont == 2){
                    
                    Password = Temp;
                    Temp = "";
                    Cont++;
                    
                }
                
            }
            
        }catch(Exception e){
            
            System.err.println("Error al obtener el Password "+ e);
            
            JOptionPane.showMessageDialog(null, "Error al obtener el Password.", "Error de lectura", 0,
                    WinTool.GetIcon("src/icons_x32/Error de conexion JOP x32.png"));
            
        }
        
        return Password;
    }
    
}
