package metodos;

import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JRadioButton;

public class Validacion {

    public int GetSelectedAccess(String Nivel_Access){
        
        int Level = 0;
        
        if(Nivel_Access.equalsIgnoreCase("Administrador")){
                
                Level = 0;
                
            }else if(Nivel_Access.equalsIgnoreCase("Responsable De Bodega")){
                
                Level = 1;
                
            }else if(Nivel_Access.equalsIgnoreCase("Auxiliar De Nomina")){
                
                Level = 2;
                
            }
        
        return Level;
    }
    
    
    public String GetSelectedAccess(int Nivel_Access){
        
        String Level = "";
        
        switch (Nivel_Access) {
            case 0:
                Level = "Administrador";
                break;
            case 1:
                Level = "Responsable De Bodega";
                break;
            case 2:
                Level = "Auxiliar De Nomina";
                break;
            default:
                break;
        }
        
        return Level;
    }
    
    public int GetSelectedStat(String Estado){
        
        int Stat = 0;
        
        if(Estado.equalsIgnoreCase("Activo")){
                
            Stat = 0;
                
        }else if(Estado.equalsIgnoreCase("Inactivo")){
                
            Stat = 1;
                
        }
        
        return Stat;
    }
    
    
    public String GetSelectedStat(int Estado){
        
        String Stat = "";
        
        if(Estado == 0){
                
            Stat = "Activo";
                
        }else if(Estado == 1){
                
            Stat = "Inactivo";
                
        }
        
        return Stat;
    }
    
    
    public String GetSelectedSex(JRadioButton b1, JRadioButton b2){
        
        String Sexo = "";
        
        if(b1.isSelected()){
            
            Sexo = "Masculino";
            
        }else if(b2.isSelected()){
            
            Sexo = "Femenino";
            
        }
        
        return Sexo;
    }
    
    
    public void GetSelectedSex(String Sexo, JRadioButton b1, JRadioButton b2){     
        
        if(Sexo.equalsIgnoreCase("Masculino")){
            
            b1.setSelected(true);
            
        }else if(Sexo.equalsIgnoreCase("Femenino")){
            
            b2.setSelected(true);
            
        }
        
    }
    
    
    public boolean IsAnInt(String Campo){
        
        boolean IsAnInt = true;
        int temp = 0;
        
        try {
            
            temp = Integer.parseInt(Campo);
            
        } catch (NumberFormatException e) {
            
            IsAnInt = false;
            
        }
        
        return IsAnInt;
    }
    
    
    public boolean IsAFloat(String Campo){
        
        boolean IsAFloat = true;
        float temp = 0;
        
        try {
            
            temp = Float.parseFloat(Campo);
            
        } catch (NumberFormatException e) {
            
            IsAFloat = false;
            
        }
        
        return IsAFloat;
    }
    
    
    public int GetEdadByFn(Date FN){
        
        int Edad = 0;
        LocalDate temp = LocalDate.now();
        Date Now = new Date(temp.getYear() - 1900, temp.getMonthValue() - 1, temp.getDayOfMonth());
        
        
        //Nacimiento.
        int DiaNac = FN.getDate();
        int MesNac = FN.getMonth()+1;
        int AñoNac = FN.getYear()+1900;
        
        //Now.
        int DiaNow = Now.getDate();
        int MesNow = Now.getMonth()+1;
        int AñoNow = Now.getYear()+1900;
        
        
        if(MesNow >= MesNac && DiaNow >= DiaNac){
            
            Edad = AñoNow - AñoNac;
            
        }else{
            
            Edad = (AñoNow - AñoNac) - 1;
            
        }
        
        return Edad;
    }
    
}
