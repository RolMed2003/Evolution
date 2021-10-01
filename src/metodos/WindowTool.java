package metodos;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WindowTool {

    public Image GetIconImage(String url){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(url));
        
        return retValue;
    }
    
    
    public void WaitEnter(java.awt.event.KeyEvent evt, JButton Btn){
        
        char cTeclaPresionada = evt.getKeyChar();
        
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            
            Btn.doClick();
            
        }
        
    }
    
    
    public void WaitEnter(java.awt.event.KeyEvent evt, JTextField Txt){
        
        char cTeclaPresionada = evt.getKeyChar();
        
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            
            Txt.requestFocus();
            
        }
        
    }
    
    
    public void WaitEnter(java.awt.event.KeyEvent evt, JRadioButton Txt){
        
        char cTeclaPresionada = evt.getKeyChar();
        
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            
            Txt.requestFocus();
            
        }
        
    }
    
    
    public void WaitEnter(java.awt.event.KeyEvent evt, JComboBox Txt){
        
        char cTeclaPresionada = evt.getKeyChar();
        
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            
            Txt.requestFocus();
            
        }
        
    }
    
    
    public Icon SetFondo(JLabel Fondo_Lbl, String Url){
        
        ImageIcon Fondo = new ImageIcon(Url);
        Icon icono = new ImageIcon(Fondo.getImage().getScaledInstance(Fondo_Lbl.getWidth(),
                Fondo_Lbl.getHeight(), Image.SCALE_DEFAULT));
        
        return icono;
        
    }
    
    
    public Icon GetIcon(String Url){
        
        ImageIcon Icon = new ImageIcon(Url);
        
        return Icon;
        
    }
    
    
    public void VerContraseña(JCheckBox CheckBox, JPasswordField P1, JPasswordField P2){
      
        if(CheckBox.isSelected()){
            
            P1.setEchoChar((char)0);
            P2.setEchoChar((char)0);
            
        }else{
            
            P1.setEchoChar('*');
            P2.setEchoChar('*');
            
        }
        
    }
    
    
    public void VerContraseña(JCheckBox CheckBox, JPasswordField P1){
      
        if(CheckBox.isSelected()){
            
            P1.setEchoChar((char)0);
            
        }else{
            
            P1.setEchoChar('*');
            
        }
        
    }
    
    
    public DefaultTableModel MostrarUsuarios(){
        
        String[] Titulos = {"ID", "Nombre", "Username", "Estado", "Nivel de acceso"};
        String[] Registros = new String[5];
        
        DefaultTableModel Model = new DefaultTableModel(Titulos, 0);
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement("select IDUser, "
                    + "Nombre, Username, Estado, NivelAcceso from Usuarios");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("IDUser");
                    Registros [1] = rs.getString("Nombre");
                    Registros [2] = rs.getString("Username");
                    Registros [3] = rs.getString("Estado");
                    Registros [4] = rs.getString("NivelAcceso");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Ningun usuario ha sido registrado.");
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de registro de usuarios."+ e);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
            
        }

        return Model;
    }
    
    
    public DefaultTableModel FiltrarUsuarios(String Estado, DefaultTableModel Model){
        
        String[] Titulos = {"ID", "Nombre", "Username", "Estado", "Nivel de acceso"};
        String[] Registros = new String[5];
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from Usuarios where Estado = '"+ Estado +"'");
                   
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                Model = new DefaultTableModel(Titulos, 0);
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("IDUser");
                    Registros [1] = rs.getString("Nombre");
                    Registros [2] = rs.getString("Username");
                    Registros [3] = rs.getString("Estado");
                    Registros [4] = rs.getString("NivelAcceso");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                if(Estado.equalsIgnoreCase("Activo")){
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado usuarios activos.");
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado usuarios inactivos.");
                    
                }
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de registro de usuarios."+ e);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
            
        }

        return Model;
        
    }
    
    
    public DefaultTableModel MostrarSalariosBase(){
        
        String[] Titulos = {"Cargo", "Salario Mensual", "Ingresos por antiguedad", "Ingreso por hora extra", "Tipo de cargo"};
        String[] Registros = new String[5];
        
        DefaultTableModel Model = new DefaultTableModel(Titulos, 0);
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from salariosbase");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("Cargo");
                    Registros [1] = Float.toString(rs.getFloat("SalarioMensual"));
                    Registros [2] = rs.getString("Antiguedad");
                    Registros [3] = Float.toString(rs.getFloat("HoraExtra"));
                    Registros [4] = rs.getString("TipoDeCargo");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Ningun salario base registrado.", " -  Mensaje de error", 0,
                        GetIcon("src/JOIcons/Error JO.png"));
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de salarios base"+ e);
            JOptionPane.showMessageDialog(null, "Error de conexion.", " -  Mensaje de error", 0,
                    GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }

        return Model;
    }
    
    
    public DefaultTableModel FiltrarSalarios(String TipoCargo, DefaultTableModel Model){
        
        String[] Titulos = {"Cargo", "Salario Mensual", "Ingresos por antiguedad", "Ingreso por hora extra", "Tipo de cargo"};
        String[] Registros = new String[5];
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from salariosbase where TipoDeCargo = '"+ TipoCargo +"'");
                   
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                Model = new DefaultTableModel(Titulos, 0);
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("Cargo");
                    Registros [1] = Float.toString(rs.getFloat("SalarioMensual"));
                    Registros [2] = rs.getString("Antiguedad");
                    Registros [3] = Float.toString(rs.getFloat("HoraExtra"));
                    Registros [4] = rs.getString("TipoDeCargo");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                if(TipoCargo.equalsIgnoreCase("Gerencial")){
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado salarios de tipo gerenciales.", " -  Mensaje de error", 0
                            , GetIcon("src/JOIcons/Error JO.png"));
                    
                }else if(TipoCargo.equalsIgnoreCase("Administrativo")){
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado salarios de tipo administrativos.", " -  Mensaje de error", 0
                            , GetIcon("src/JOIcons/Error JO.png"));
                    
                }else if(TipoCargo.equalsIgnoreCase("Operativo")){
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado salarios de tipo operativos.", " -  Mensaje de error", 0
                            , GetIcon("src/JOIcons/Error JO.png"));
                    
                }
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de registro de usuarios."+ e);
            JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error", 0
                            , GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }

        return Model;
        
    }
    
    
    public DefaultTableModel MostrarEmpleados(){
        
        String[] Titulos = {"No. INSS", "Nombre", "Telefono", "Cargo", "Estado"};
        String[] Registros = new String[5];
        
        DefaultTableModel Model = new DefaultTableModel(Titulos, 0);
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement("select NumeroINSS, "
                    + "Nombre, Telefono, Cargo, Estado from Empleados");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("NumeroINSS");
                    Registros [1] = rs.getString("Nombre");
                    Registros [2] = rs.getString("Telefono");
                    Registros [3] = rs.getString("Cargo");
                    Registros [4] = rs.getString("Estado");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Ningun empleado ha sido registrado.", " -  Mensaje de error", 0,
                        GetIcon("src/JOIcons/Error JO.png"));
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de registro de usuarios."+ e);
            JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error", 0,
                        GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }

        return Model;
    }
    
    
    public DefaultTableModel FiltrarEmpleados(String Estado, DefaultTableModel Model){
        
        String[] Titulos = {"No. INSS", "Nombre", "Telefono", "Cargo", "Estado"};
        String[] Registros = new String[5];
        
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from Empleados where Estado = '"+ Estado +"'");
                   
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                Model = new DefaultTableModel(Titulos, 0);
                
                while(rs.next()){
                
                    Registros [0] = rs.getString("NumeroINSS");
                    Registros [1] = rs.getString("Nombre");
                    Registros [2] = rs.getString("Telefono");
                    Registros [3] = rs.getString("Cargo");
                    Registros [4] = rs.getString("Estado");

                    Model.addRow(Registros);
                
                }
                
            }else{
                
                if(Estado.equalsIgnoreCase("Activo")){
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado usuarios activos.", " -  Mensaje de advertencia", 0,
                            GetIcon("src/JOIcons/Advertencia JO.png"));
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "No se han encontrado usuarios inactivos.", " -  Mensaje de advertencia", 0,
                            GetIcon("src/JOIcons/Advertencia JO.png"));
                    
                }
                
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde el modelado de la tabla de registro de empleados."+ e);
            JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error", 0
                            , GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }

        return Model;
        
    }
    
}
