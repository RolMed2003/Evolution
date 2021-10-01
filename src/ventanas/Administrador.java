package ventanas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.WindowTool;
import metodos.FicheroTool;

public class Administrador extends javax.swing.JFrame {

    //Metodos.
    WindowTool Metodo = new WindowTool();
    FicheroTool FiTool = new FicheroTool();

    
    //Variables.
    String Nombre_Sesion, Sexo, Username_Sesion;
    int NumeroDeSesion = 0;
    

    public Administrador() {

        initComponents();

        
        //Variables.
        Nombre_Sesion = Login.Nombre_Sesion;
        Sexo = Login.Sexo_Sesion;
        NumeroDeSesion = Login.NumeroDeSesion;
        Username_Sesion = Login.Username_Sesion;
        

        //Modelando el Jframe de Aministrador.
        this.setVisible(true);
        this.setTitle(" -  Administrador del sistema.");
        this.setLocationRelativeTo(null);
        this.setSize(1000, 600);
        this.setResizable(false);
        
        //Setting close operation.
        try {
            
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               
               @Override
               public void windowClosing(WindowEvent e){
                   
                   int Option = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas salir?",
                           " -  Mensaje de advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
                   
                   if(Option == JOptionPane.YES_OPTION){
                       
                       System.exit(0);
                       
                   }
                   
               } 
                
            });
            
        } catch (Exception e) {
            
            System.err.println(e);
            
        }
        

        //Fondo.
        Fondo_Lbl.setIcon(Metodo.SetFondo(Fondo_Lbl, "src/icons/fondo2.jpg"));
        this.repaint();
        

        //Icono ventana.
        this.setIconImage(Metodo.GetIconImage("icons/Logo.jpg"));
        this.repaint();
        

        //Setting Saludo.
        if(Sexo.equalsIgnoreCase("Masculino")){
            
            Saludo_Lbl.setText("Bienvenido, "+ Nombre_Sesion +".");
            
        }else if(Sexo.equalsIgnoreCase("Femenino")){
            
            Saludo_Lbl.setText("Bienvenida, "+ Nombre_Sesion +".");
            
        }
        
        
        //
        AddUser_Btn.requestFocus();
        
        
        //Validando si los globos de ayuda estan activos.
        if( (FiTool.LeerFichero(Username_Sesion, 1)).equalsIgnoreCase("Si") ){
            
            Ayuda_CB.setSelected(true);
            
        }else{
            
            Ayuda_CB.setSelected(false);
            
        }
        
        
        //Validando si ya se ha definido una opcion de recuperacion de contraseña.
        String PreguntaSecreta = Login.PreguntaSecreta;
        
        if(PreguntaSecreta.equalsIgnoreCase("")){
            
            //Void.
            
        }else{
            
            EstablecerPregunta_Btn.setText("Redefinir pregunta secreta");
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddUser_Btn = new javax.swing.JButton();
        GestionarUser_Btn = new javax.swing.JButton();
        Idk_Btn = new javax.swing.JButton();
        PanelCapturista_Btn = new javax.swing.JButton();
        PanelTecnico_Btn = new javax.swing.JButton();
        CerrarSesion_Btn = new javax.swing.JButton();
        AgregarUser_Lbl = new javax.swing.JLabel();
        GestionarUser_Lbl = new javax.swing.JLabel();
        GestionarUser_Lbl1 = new javax.swing.JLabel();
        Idk_Lbl = new javax.swing.JLabel();
        Idk_Lbl1 = new javax.swing.JLabel();
        PanelCapturista_Lbl = new javax.swing.JLabel();
        PanelCapturista_Lbl1 = new javax.swing.JLabel();
        PanelTecnico_Lbl = new javax.swing.JLabel();
        Paneltecnico_Lbl1 = new javax.swing.JLabel();
        CerrarSesion_Lbl = new javax.swing.JLabel();
        Saludo_Lbl = new javax.swing.JLabel();
        Fondo_Lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Ayuda_CB = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        EstablecerPregunta_Btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddUser_Btn.setBackground(new java.awt.Color(51, 51, 51));
        AddUser_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AgregarUsuario.png"))); // NOI18N
        AddUser_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUser_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddUser_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 115, 128, 128));

        GestionarUser_Btn.setBackground(new java.awt.Color(51, 51, 51));
        GestionarUser_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GestionarUsuario.png"))); // NOI18N
        GestionarUser_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarUser_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(GestionarUser_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 115, 128, 128));

        Idk_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Idk_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ver inventario.png"))); // NOI18N
        getContentPane().add(Idk_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 115, 128, 128));

        PanelCapturista_Btn.setBackground(new java.awt.Color(51, 51, 51));
        PanelCapturista_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ventana Responsable de bodega.png"))); // NOI18N
        PanelCapturista_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelCapturista_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(PanelCapturista_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 358, 128, 128));

        PanelTecnico_Btn.setBackground(new java.awt.Color(51, 51, 51));
        PanelTecnico_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ventana Aux. Nomina.png"))); // NOI18N
        PanelTecnico_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelTecnico_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(PanelTecnico_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 358, 128, 128));

        CerrarSesion_Btn.setBackground(new java.awt.Color(51, 51, 51));
        CerrarSesion_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cerrar sesion.png"))); // NOI18N
        CerrarSesion_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesion_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 358, 128, 128));

        AgregarUser_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AgregarUser_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        AgregarUser_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarUser_Lbl.setText("Agregar usuario");
        getContentPane().add(AgregarUser_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 250, 128, 30));

        GestionarUser_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        GestionarUser_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        GestionarUser_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionarUser_Lbl.setText("Gestionar");
        getContentPane().add(GestionarUser_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 250, 128, 30));

        GestionarUser_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        GestionarUser_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        GestionarUser_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionarUser_Lbl1.setText("usuario");
        getContentPane().add(GestionarUser_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 270, 128, 30));

        Idk_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Idk_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Idk_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Idk_Lbl.setText("Ver inventario");
        getContentPane().add(Idk_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 250, 128, 30));

        Idk_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Idk_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        Idk_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Idk_Lbl1.setText("de equipos");
        getContentPane().add(Idk_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 270, 128, 30));

        PanelCapturista_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PanelCapturista_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        PanelCapturista_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelCapturista_Lbl.setText("Panel responsable");
        getContentPane().add(PanelCapturista_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 493, 128, 30));

        PanelCapturista_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PanelCapturista_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        PanelCapturista_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelCapturista_Lbl1.setText("de bodega");
        getContentPane().add(PanelCapturista_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 513, 128, 30));

        PanelTecnico_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PanelTecnico_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        PanelTecnico_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelTecnico_Lbl.setText("Panel nomina");
        getContentPane().add(PanelTecnico_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 493, 128, 30));

        Paneltecnico_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Paneltecnico_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        Paneltecnico_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Paneltecnico_Lbl1.setText("y empleados");
        getContentPane().add(Paneltecnico_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 513, 130, 30));

        CerrarSesion_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CerrarSesion_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        CerrarSesion_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarSesion_Lbl.setText("Cerrar sesion");
        getContentPane().add(CerrarSesion_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 493, 128, 30));

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Fondo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jMenu1.setText("Ayuda");

        Ayuda_CB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        Ayuda_CB.setSelected(true);
        Ayuda_CB.setText("Mostrar globos de ayuda");
        Ayuda_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_CBActionPerformed(evt);
            }
        });
        jMenu1.add(Ayuda_CB);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones de recuperación");

        EstablecerPregunta_Btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        EstablecerPregunta_Btn.setText("Establecer pregunta secreta");
        EstablecerPregunta_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstablecerPregunta_BtnActionPerformed(evt);
            }
        });
        jMenu2.add(EstablecerPregunta_Btn);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesion_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesion_BtnActionPerformed

        FiTool.LimpiarFichero();
        
        this.dispose();
        new Login().setVisible(true);

        JOptionPane.showMessageDialog(null, "Se ha cerrado la sesión.", " -  Mensaje de información",
                                        0, Metodo.GetIcon("src/JOIcons/Info JO.png"));

    }//GEN-LAST:event_CerrarSesion_BtnActionPerformed

    private void AddUser_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUser_BtnActionPerformed

        new Admin_AddUser().setVisible(true);

    }//GEN-LAST:event_AddUser_BtnActionPerformed

    private void GestionarUser_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarUser_BtnActionPerformed

        new Admin_ManageUser().setVisible(true);

    }//GEN-LAST:event_GestionarUser_BtnActionPerformed

    private void PanelCapturista_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelCapturista_BtnActionPerformed
        
        this.dispose();
        new ResponsableDeBodega().setVisible(true);
        
    }//GEN-LAST:event_PanelCapturista_BtnActionPerformed

    private void Ayuda_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_CBActionPerformed
        
        if(Ayuda_CB.isSelected()){
            
            FiTool.EscrbirFichero("Si", Username_Sesion, 1);
            
        }else{
            
            FiTool.EscrbirFichero("No", Username_Sesion, 1);
            
        }
        
    }//GEN-LAST:event_Ayuda_CBActionPerformed

    private void EstablecerPregunta_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstablecerPregunta_BtnActionPerformed
        
        new Login_SetRecovery().setVisible(true);
        
    }//GEN-LAST:event_EstablecerPregunta_BtnActionPerformed

    private void PanelTecnico_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelTecnico_BtnActionPerformed
        
        this.dispose();
        new AuxiliarDeNomina().setVisible(true);
        
    }//GEN-LAST:event_PanelTecnico_BtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser_Btn;
    private javax.swing.JLabel AgregarUser_Lbl;
    private javax.swing.JCheckBoxMenuItem Ayuda_CB;
    private javax.swing.JButton CerrarSesion_Btn;
    private javax.swing.JLabel CerrarSesion_Lbl;
    private javax.swing.JMenuItem EstablecerPregunta_Btn;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JButton GestionarUser_Btn;
    private javax.swing.JLabel GestionarUser_Lbl;
    private javax.swing.JLabel GestionarUser_Lbl1;
    private javax.swing.JButton Idk_Btn;
    private javax.swing.JLabel Idk_Lbl;
    private javax.swing.JLabel Idk_Lbl1;
    private javax.swing.JButton PanelCapturista_Btn;
    private javax.swing.JLabel PanelCapturista_Lbl;
    private javax.swing.JLabel PanelCapturista_Lbl1;
    private javax.swing.JButton PanelTecnico_Btn;
    private javax.swing.JLabel PanelTecnico_Lbl;
    private javax.swing.JLabel Paneltecnico_Lbl1;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
