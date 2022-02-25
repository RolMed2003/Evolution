package metodos;

import java.sql.*;

public class Conexion {

    public static Connection Conectar(){
        
        try{
            
            Connection cn = DriverManager.getConnection("", "", "");
            
            return cn;
            
        }catch(SQLException e){
            
            System.out.println("Error en la conexion: "+e);
            
        }
        
        return (null);
        
    }

}
