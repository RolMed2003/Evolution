package ventanas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.Conexion;
import metodos.WindowTool;


public class Login_SetRecovery extends javax.swing.JFrame {

    //Metodos.
    WindowTool WinTool = new WindowTool();
    
    
    //Variables.
    int NumeroDeSesion = Login.NumeroDeSesion;
    String Username = Login.Username_Sesion;
    String PreguntaSecreta = "", RespuestaSecreta = "";
    
    
    public Login_SetRecovery() {
        
        initComponents();
        
        
        //Variables.
        PreguntaSecreta = Login.PreguntaSecreta;
        
        
        //Modelando tabla.
        this.setVisible(true);
        this.setTitle(" -  Opciones de recuperación de contraseña.");
        this.setLocationRelativeTo(null);
        this.setSize(445, 483);
        this.setResizable(false);
        
        
        //Setting Close operation.
        try {
            
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               
               @Override
               public void windowClosing(WindowEvent e){
                   
                   if(NumeroDeSesion == 1){
                       
                       int Option = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas salir de esta ventana?\nPodrás "
                                + "definir esta opción de recuperación luego.",
                                " -  Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                     WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));

                        if(Option == JOptionPane.YES_OPTION){
                            
                            dispose();

                        }
                       
                   }else{
                       
                       dispose();
                       
                   }
                   
                   
               } 
                
            });
            
        } catch (Exception e) {
            
            System.err.println(e);
            
        }
        
        
        //Setting fondo.
        Fondo_Lbl.setIcon(WinTool.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        
        
        //Setting icono de ventana.
        this.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        
        //
        Respuesta_Txt.requestFocus();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo_Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pregunta_Cmb = new javax.swing.JComboBox<>();
        Respuesta_Txt = new javax.swing.JTextField();
        Listo_Btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Fondo_Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Saludo_Lbl.setText("<html>Hola, "+ Login.Nombre_Sesion +".<p>"
            + "Por favor, define una pregunta y una respuesta de <p>seguridad"
            + " para restablecer tu contraseña en caso de ser <p>olvidada.<html>");
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Respuesta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Pregunta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Pregunta_Cmb.setBackground(new java.awt.Color(51, 51, 51));
        Pregunta_Cmb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Pregunta_Cmb.setForeground(new java.awt.Color(204, 204, 204));
        Pregunta_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál fue el nombre de tu primera mascota?", "¿Cuál es el primer instituo al que fuiste?", "¿Dónde nació tu mamá?" }));
        getContentPane().add(Pregunta_Cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 400, -1));

        Respuesta_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Respuesta_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Respuesta_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Respuesta_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Respuesta_TxtKeyPressed(evt);
            }
        });
        getContentPane().add(Respuesta_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, -1));

        Listo_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Listo_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Listo_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Listo_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/AplicarCambios x32.png"))); // NOI18N
        Listo_Btn.setText("Listo");
        Listo_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listo_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Listo_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 350, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("<html>También podrás restablecer tu "
            + "contraseña mediante un código enviado"
            + " a<p>tu correo electrónico.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Listo_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listo_BtnActionPerformed
        
        int SelectedQuest = Pregunta_Cmb.getSelectedIndex();
        
        RespuestaSecreta = Respuesta_Txt.getText().trim();
        
        switch (SelectedQuest) {
            case 0:
                PreguntaSecreta = "¿Cuál fue el nombre de tu primera mascota?";
                break;
            case 1:
                PreguntaSecreta = "¿Cuál es el primer instituo al que fuiste?";
                break;
            case 2:
                PreguntaSecreta = "¿Dónde nació tu mamá?";
                break;
            default:
                break;
        }
        
        if(!RespuestaSecreta.equalsIgnoreCase("")){
            
            try {
            
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "update Usuarios set PreguntaSecreta = ?, RespuestaSecreta = ? where Username = '"+
                                Username +"'");
                
                pst.setString(1, PreguntaSecreta);
                pst.setString(2, RespuestaSecreta);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Se ha definido la pregunta de seguridad correctamente!",
                            " -  Mensaje de información", 0, WinTool.GetIcon("src/JOIcons/Info JO.png"));
                
                this.dispose();

            } catch (SQLException e) {

                System.err.println("Error en el setting de pregunta secreta. "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión", " -  Mensaje de error",
                        0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por favor, responde a la pregunta.", " -  Mensaje de advertencia",
                    0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }
        
        
    }//GEN-LAST:event_Listo_BtnActionPerformed

    private void Respuesta_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Respuesta_TxtKeyPressed
        
        WinTool.WaitEnter(evt, Listo_Btn);
        
    }//GEN-LAST:event_Respuesta_TxtKeyPressed

    
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
            java.util.logging.Logger.getLogger(Login_SetRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_SetRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_SetRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_SetRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_SetRecovery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JButton Listo_Btn;
    private javax.swing.JComboBox<String> Pregunta_Cmb;
    private javax.swing.JTextField Respuesta_Txt;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}