package ventanas;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.Conexion;
import metodos.WindowTool;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Login_RecoverPass extends javax.swing.JFrame {

    WindowTool WinTool = new WindowTool();
    
    public static String RandomCode = "";
    public static String Username = "";
    public static int Selected = 0;
    
    String RespuestaSecreta = "";
    int Cont = 2;
    
    public Login_RecoverPass() {
        
        initComponents();
        
        
        //Modelando ventana.
        this.setResizable(false);
        this.setTitle(" -  Recuperar contraseña.");
        this.setSize(500, 419);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Setting fondo.
        Fondo_Lbl.setIcon(WinTool.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        //Setting icon.
        this.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        Username_Txt.requestFocus();

        
        //False items.
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel4.setVisible(false);
        Username_Txt2.setVisible(false);
        Pregunta_txt.setVisible(false);
        Respuesta_Txt.setVisible(false);
        Restaurar_Btn.setVisible(false);
        jLabel7.setVisible(false);
        VerificarUser_Btn.setVisible(false);
        Ok_Btn.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChangePass = new javax.swing.JFrame();
        Titulo_Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Username_Lbl = new javax.swing.JLabel();
        Username_Txt = new javax.swing.JTextField();
        Ok_Btn = new javax.swing.JButton();
        Enviar_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Opcion_CB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Username_Txt2 = new javax.swing.JTextField();
        Pregunta_txt = new javax.swing.JTextField();
        Respuesta_Txt = new javax.swing.JTextField();
        Restaurar_Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        VerificarUser_Btn = new javax.swing.JButton();
        Fondo_Lbl = new javax.swing.JLabel();

        javax.swing.GroupLayout ChangePassLayout = new javax.swing.GroupLayout(ChangePass.getContentPane());
        ChangePass.getContentPane().setLayout(ChangePassLayout);
        ChangePassLayout.setHorizontalGroup(
            ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ChangePassLayout.setVerticalGroup(
            ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titulo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Titulo_Lbl.setText("¿Has olvidado tu contraseña?");
        getContentPane().add(Titulo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Por favor, ingresa tu nombre de usuario,<p>te enviaremos un correo con un código de verificación para que puedas restablecer tu contraseña.<html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pregunta de seguridad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Respuesta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        Username_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Username_Lbl.setText("Nombre de usuario:");
        getContentPane().add(Username_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        Username_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Username_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Username_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Username_TxtKeyTyped(evt);
            }
        });
        getContentPane().add(Username_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 170, -1));

        Ok_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Ok_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ok_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Ok_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/AplicarCambios x32.png"))); // NOI18N
        Ok_Btn.setText("Verificar");
        Ok_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Ok_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        Enviar_btn.setBackground(new java.awt.Color(51, 51, 51));
        Enviar_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Enviar_btn.setForeground(new java.awt.Color(204, 204, 204));
        Enviar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Enviar correo x32.png"))); // NOI18N
        Enviar_btn.setText("Enviar correo");
        Enviar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/confusion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 177, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Elige una opción de recuperación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Opcion_CB.setBackground(new java.awt.Color(51, 51, 51));
        Opcion_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Opcion_CB.setForeground(new java.awt.Color(204, 204, 204));
        Opcion_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enviar un correo electrónico", "Responder pregunta secreta" }));
        Opcion_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion_CBActionPerformed(evt);
            }
        });
        getContentPane().add(Opcion_CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre de usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Username_Txt2.setBackground(new java.awt.Color(51, 51, 51));
        Username_Txt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username_Txt2.setForeground(new java.awt.Color(204, 204, 204));
        Username_Txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Username_Txt2KeyPressed(evt);
            }
        });
        getContentPane().add(Username_Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));

        Pregunta_txt.setBackground(new java.awt.Color(51, 51, 51));
        Pregunta_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pregunta_txt.setForeground(new java.awt.Color(204, 204, 204));
        Pregunta_txt.setEnabled(false);
        getContentPane().add(Pregunta_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, -1));

        Respuesta_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Respuesta_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Respuesta_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Respuesta_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Respuesta_TxtKeyPressed(evt);
            }
        });
        getContentPane().add(Respuesta_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 300, -1));

        Restaurar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Restaurar_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Restaurar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Restaurar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Restaurar contraseña x32.png"))); // NOI18N
        Restaurar_Btn.setText("Restaurar");
        getContentPane().add(Restaurar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("<html>Por favor, ingresa tu nombre de usuario<p>"
            + "para que puedas responder a la pregunta de<p>"
            + "seguridad.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        VerificarUser_Btn.setBackground(new java.awt.Color(51, 51, 51));
        VerificarUser_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerificarUser_Btn.setForeground(new java.awt.Color(204, 204, 204));
        VerificarUser_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/AplicarCambios x32.png"))); // NOI18N
        VerificarUser_Btn.setText("Verificar ");
        VerificarUser_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarUser_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarUser_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 258, -1, -1));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Username_TxtKeyTyped
        
        WinTool.WaitEnter(evt, Enviar_btn);
        
    }//GEN-LAST:event_Username_TxtKeyTyped

    private void Enviar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_btnActionPerformed
        
        //Variables.
        String Email = "", Nombre = "";
        boolean Execute = true;
        
        Username = Username_Txt.getText().trim();
        
        
        //Obteniendo el correo del usuario.
        if(!Username.equalsIgnoreCase("")){
            
            try{
            
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select Username, Email, Nombre from Usuarios where Username = '"+ Username +"'");

                ResultSet rs = pst.executeQuery();

                if(rs.next()){

                    Email = rs.getString("Email");
                    Nombre = rs.getString("Nombre");

                }else{

                    Username_Txt.setText("");
                    System.err.println("Nombre de usuario no encontrado. ");
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no encontrado.", " -  Mensaje de error",
                                        0, WinTool.GetIcon("src/JOIcons/Error JO.png"));

                    Execute = false;

                }

                cn.close();

            }catch(SQLException e){

                System.err.println("Error desde la ventana de recover password "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error",
                                        0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un nombre de usuario.", " -  Mensaje de advertencia",
                                        0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            Execute = false;
            
        }
        
        
        //Enviando correo electronico.
        if(Execute == true){
            
        Properties Property = new Properties();
        
        Property.setProperty("mail.smtp.host", "smtp.gmail.com");
        Property.setProperty("mail.smtp.starttls.enable", "true");
        Property.setProperty("mail.smtp.port", "587");
        Property.setProperty("mail.smtp.auth", "true");
        
        Session Sesion = Session.getDefaultInstance(Property);
        
        
        //Credenciales de la cuenta que enviara el correo.
        String CorreoSend = "Evoluti0nRecoverySystem@gmail.com";
        String PasswordSend = "Evolution123456";
        
        
        //Cuerpo del correo.
        String CorreoReceives = Email;
        String Asunto = "Código de verificaión para restablecer contraseña.";
        String Mensaje = "";
        
        
        //Creando un codigo random.
        int RandomNumber = 0;
        
        for(int i = 0 ; i<3 ; i++){
            
            RandomNumber = (int) (Math.random() * (99 - 11) + 11);
            
            RandomCode += Integer.toString(RandomNumber);
            
        }
        
        //Setting mensaje.
        Mensaje += "Buen día, "+ Nombre +".\n\n"
                + "Tu código de verificación para restablecer tu contraseña de acceso "
                + "a Evolution es: "+ RandomCode +". Despues de haber ingresado este código "
                + "serás redireccionado a una ventana para crear tu nueva contraseña.";
        
        
        //
        MimeMessage mail = new MimeMessage(Sesion);
        
        try{
            
            InternetAddress CorreoS = new InternetAddress(CorreoSend);
            InternetAddress CorreoR = new InternetAddress(Email);
            
            mail.setFrom(CorreoS);
            mail.addRecipient(Message.RecipientType.TO, CorreoR);
            mail.setSubject(Asunto);
            mail.setText(Mensaje);
            
            Transport Transporte = Sesion.getTransport("smtp");
            Transporte.connect(CorreoSend, PasswordSend);
            Transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            
            
            JOptionPane.showMessageDialog(null, "Hemos enviado un correo electronico\n"
                    + "con un código de verificación a la dirección de correo: \n"
                    + Email, " -  Mensaje de información", 0, WinTool.GetIcon("src/JOIcons/Info JO.png"));

            this.dispose();
            new Login_VerifyCode().setVisible(true);

            Username_Txt.setText("");
            Transporte.close();
            
        }catch(AddressException ex){
            
            Logger.getLogger(Login_RecoverPass.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }catch(MessagingException ex){
            
            Logger.getLogger(Login_RecoverPass.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
        }else{
            
            //Void.
            
        }
        
    }//GEN-LAST:event_Enviar_btnActionPerformed

    private void Opcion_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion_CBActionPerformed

        Selected = Opcion_CB.getSelectedIndex();

        if(Selected == 0){
            
            //correo.
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            Username_Lbl.setVisible(true);
            Username_Txt.setVisible(true);
            Enviar_btn.setVisible(true);
            
            //pregunta
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel4.setVisible(false);
            Username_Txt2.setVisible(false);
            Pregunta_txt.setVisible(false);
            Respuesta_Txt.setVisible(false);
            Restaurar_Btn.setVisible(false);
            VerificarUser_Btn.setVisible(false);
            jLabel7.setVisible(false);
            Ok_Btn.setVisible(false);

        }else{
            
            //Correo
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            Username_Lbl.setVisible(false);
            Username_Txt.setVisible(false);
            Enviar_btn.setVisible(false);
            
            //Pregunta
            jLabel7.setVisible(true);
            jLabel4.setVisible(true);
            Username_Txt2.setVisible(true);
            VerificarUser_Btn.setVisible(true);
            Username_Txt2.requestFocus();

        }

    }//GEN-LAST:event_Opcion_CBActionPerformed

    private void VerificarUser_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarUser_BtnActionPerformed
        
        Username = Username_Txt2.getText().trim();
        
        if(!Username.equalsIgnoreCase("")){
                       
            try {
            
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select PreguntaSecreta, RespuestaSecreta from Usuarios where Username = '"+ Username +"'");

                ResultSet rs = pst.executeQuery();
                              
                if(rs.next()){
                    
                    if(!rs.getString("PreguntaSecreta").equalsIgnoreCase("")){
                        
                        Pregunta_txt.setText(rs.getString("PreguntaSecreta"));
                        
                        jLabel7.setVisible(false);
                        jLabel4.setVisible(false);
                        Username_Txt2.setVisible(false);
                        VerificarUser_Btn.setVisible(false);

                        jLabel5.setVisible(true);
                        Pregunta_txt.setVisible(true);

                        jLabel6.setVisible(true);
                        Respuesta_Txt.setVisible(true);
                        Ok_Btn.setVisible(true);

                        Respuesta_Txt.requestFocus();

                        RespuestaSecreta = rs.getString("RespuestaSecreta");
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(null, "Aún no se ha definido una pregunta de seguridad\n"
                                + "para este usuario.", " -  Mensaje de error", 0, WinTool.GetIcon("src/JOIcons/Error JO.png"));
                        
                        Username_Txt2.setText("");
                        
                    }

                }else{
                    
                    JOptionPane.showMessageDialog(null, "No se ha encontrado ningún usuario.", " -  Mensaje de error",
                                        0, WinTool.GetIcon("src/JOIcons/Error JO.png"));
                    Username_Txt2.setText("");
                    
                }

            } catch (SQLException e) {

                System.err.println("Error al verificar usuario. "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error",
                                        0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un nombre de usuario.", " -  Mensaje de advertencia",
                                        0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }
        
        
        
    }//GEN-LAST:event_VerificarUser_BtnActionPerformed

    private void Username_Txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Username_Txt2KeyPressed
        
        WinTool.WaitEnter(evt, VerificarUser_Btn);
        
    }//GEN-LAST:event_Username_Txt2KeyPressed

    private void Ok_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_BtnActionPerformed
        
        String Respuesta = Respuesta_Txt.getText().trim();
        
        if(Respuesta.equals(RespuestaSecreta)){
            
            this.dispose();
            new Login_ResetPass().setVisible(true);
            
        }else if(!Respuesta.equals(RespuestaSecreta) && Cont > 0){
            
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nIntentos restantes: "+ Cont,
                    " -  Mensaje de advertencia", 0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            Respuesta_Txt.setText("");
            Cont--;
            
        }else if(!Respuesta.equals(RespuestaSecreta) && Cont == 0){
            
            JOptionPane.showMessageDialog(null, "Número máximo de intentos.", " -  Mensaje de error",
                    0, WinTool.GetIcon("src/JOIcons/Error JO.png"));
            this.dispose();
            
        }
        
    }//GEN-LAST:event_Ok_BtnActionPerformed

    private void Respuesta_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Respuesta_TxtKeyPressed
        
        WinTool.WaitEnter(evt, Ok_Btn);
        
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
            java.util.logging.Logger.getLogger(Login_RecoverPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_RecoverPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_RecoverPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_RecoverPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_RecoverPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ChangePass;
    private javax.swing.JButton Enviar_btn;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JButton Ok_Btn;
    private javax.swing.JComboBox<String> Opcion_CB;
    private javax.swing.JTextField Pregunta_txt;
    private javax.swing.JTextField Respuesta_Txt;
    private javax.swing.JButton Restaurar_Btn;
    private javax.swing.JLabel Titulo_Lbl;
    private javax.swing.JLabel Username_Lbl;
    private javax.swing.JTextField Username_Txt;
    private javax.swing.JTextField Username_Txt2;
    private javax.swing.JButton VerificarUser_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
