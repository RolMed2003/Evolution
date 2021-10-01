package metodos;

import java.sql.*;

public class Conexion {

    public static Connection Conectar(){
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/OIB9whRkqF", "OIB9whRkqF", "VvQuZtyd6P");
            
            return cn;
            
        }catch(SQLException e){
            
            System.out.println("Error en la conexion: "+e);
            
        }
        
        return (null);
        
    }

}
