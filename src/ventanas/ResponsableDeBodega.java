package ventanas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.WindowTool;
import metodos.FicheroTool;

public class ResponsableDeBodega extends javax.swing.JFrame {
    
    //Metodos.
    WindowTool WinTool = new WindowTool();
    FicheroTool FiTool = new FicheroTool();

    
    //Variables.
    String Username_Sesion = Login.Username_Sesion;
    String PreguntSecreta = Login.PreguntaSecreta;
    String Sexo = Login.Sexo_Sesion;
    String Nombre_Sesion = Login.Nombre_Sesion;
    
    
    public ResponsableDeBodega() {
        
        initComponents();
        
        
        //Modelando ventana.
        this.setVisible(true);
        this.setTitle(" -  Responsable De Bodega");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        //Setting close operation.
        try {
            
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               
               @Override
               public void windowClosing(WindowEvent e){
                   
                   int Option = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas salir?",
                           " -  Mensaje de advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
                   
                   if(Option == JOptionPane.YES_OPTION){
                       
                       System.exit(0);
                       
                   }
                   
               } 
                
            });
            
        } catch (Exception e) {
            
            System.err.println(e);
            
        }
        
        
        //Setting Fondo.
        Fondo_Lbl.setIcon(WinTool.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        
        //Setting icon.
        this.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        
        //Setting saludo.
        if(Sexo.equalsIgnoreCase("Masculino")){
            
            Saludo_Lbl.setText("Bienvenido, "+ Nombre_Sesion +".");
            
        }else if(Sexo.equalsIgnoreCase("Femenino")){
            
            Saludo_Lbl.setText("Bienvenida, "+ Nombre_Sesion +".");
            
        }
        
        
        //Validando si la ayuda esta activada.
        if(FiTool.LeerFichero(Username_Sesion, 1).equals("Si")){
            
            MostrarAyuda_CB.setSelected(true);
            
        }else{
            
            MostrarAyuda_CB.setSelected(false);
            
        }
        
        
        //Validando si ya se ha definido una pregunta de seguridad.
        if(!PreguntSecreta.equals("")){
            
            EstablecerPregunta_Btn.setText("Redefinir pregunta secreta");
            
        }
        
        
        //Ocultando btn de admin.
        if(!Login.Acceso.equalsIgnoreCase("Administrador")){
            
            Volver_Btn.setVisible(false);
            Volver_Lbl.setVisible(false);
            Vovler_Lbl1.setVisible(false);
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo_Lbl = new javax.swing.JLabel();
        CerrarSesion_Lbl = new javax.swing.JLabel();
        CerrarSesion_Btn = new javax.swing.JButton();
        Volver_Btn = new javax.swing.JButton();
        Volver_Lbl = new javax.swing.JLabel();
        Vovler_Lbl1 = new javax.swing.JLabel();
        Fondo_Lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MostrarAyuda_CB = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        EstablecerPregunta_Btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        CerrarSesion_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CerrarSesion_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        CerrarSesion_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarSesion_Lbl.setText("Cerrar sesion");
        getContentPane().add(CerrarSesion_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 493, 128, 30));

        CerrarSesion_Btn.setBackground(new java.awt.Color(51, 51, 51));
        CerrarSesion_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cerrar sesion.png"))); // NOI18N
        CerrarSesion_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesion_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 358, 128, 128));

        Volver_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Volver_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ventana Admin x128.png"))); // NOI18N
        Volver_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Volver_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 358, 128, 128));

        Volver_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Volver_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Volver_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Volver_Lbl.setText("Volver a");
        getContentPane().add(Volver_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 493, 128, 30));

        Vovler_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Vovler_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        Vovler_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vovler_Lbl1.setText("Administrador");
        getContentPane().add(Vovler_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 513, 128, 30));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 999, 600));

        jMenu1.setText("Ayuda");

        MostrarAyuda_CB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        MostrarAyuda_CB.setSelected(true);
        MostrarAyuda_CB.setText("Mostrar globos de ayuda");
        MostrarAyuda_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAyuda_CBActionPerformed(evt);
            }
        });
        jMenu1.add(MostrarAyuda_CB);

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

    private void EstablecerPregunta_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstablecerPregunta_BtnActionPerformed
        
        new Login_SetRecovery().setVisible(true);
        
    }//GEN-LAST:event_EstablecerPregunta_BtnActionPerformed

    private void MostrarAyuda_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAyuda_CBActionPerformed
        
        if(MostrarAyuda_CB.isSelected()){
            
            FiTool.EscrbirFichero("Si", Username_Sesion, 1);
            
        }else{
            
            FiTool.EscrbirFichero("No", Username_Sesion, 1);
            
        }
        
    }//GEN-LAST:event_MostrarAyuda_CBActionPerformed

    private void CerrarSesion_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesion_BtnActionPerformed

        FiTool.LimpiarFichero();

        this.dispose();
        new Login().setVisible(true);

        JOptionPane.showMessageDialog(null, "Se ha cerrado la sesión.", " -  Mensaje de información",
            0, WinTool.GetIcon("src/JOIcons/Info JO.png"));
    }//GEN-LAST:event_CerrarSesion_BtnActionPerformed

    private void Volver_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_BtnActionPerformed

        this.dispose();
        new Administrador().setVisible(true);

    }//GEN-LAST:event_Volver_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(ResponsableDeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponsableDeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponsableDeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponsableDeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponsableDeBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion_Btn;
    private javax.swing.JLabel CerrarSesion_Lbl;
    private javax.swing.JMenuItem EstablecerPregunta_Btn;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JCheckBoxMenuItem MostrarAyuda_CB;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JButton Volver_Btn;
    private javax.swing.JLabel Volver_Lbl;
    private javax.swing.JLabel Vovler_Lbl1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
