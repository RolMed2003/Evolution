package ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.Conexion;
import metodos.WindowTool;
import metodos.Validacion;
import clases.Usuario;



public class InformacionGeneralUsers extends javax.swing.JFrame {

    WindowTool Metodo = new WindowTool();
    Validacion Val = new Validacion();
    
    String Username_Sesion = Login.Username_Sesion;
    
    Usuario User = new Usuario();
    
    public InformacionGeneralUsers() {
        
        initComponents();

        
        //Modelando ventana.
        this.setLocationRelativeTo(null);
        this.setSize(850, 610);
        this.setVisible(true);
        this.setTitle(" -  Informacion general de "+ Admin_ManageUser.Nombre_Update +".  -"
                            +" Sesion iniciada como: "+ Username_Sesion);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Fondo.
        Fondo_Lbl.setIcon(Metodo.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        
        //Icono de ventana.
        this.setIconImage(Metodo.GetIconImage("icons/Logo.jpg"));
        
        
        //Setting saludo.
        Saludo_Lbl.setText("Informacion general de "+ Admin_ManageUser.Nombre_Update +".");
        
        
        //Aplicar_Btn = false.
        Aplicar_Btn.setVisible(false);
        
        
        //Consultando informacion general del usuario.       
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select IDUser, Nombre, Telefono, Email, Domicilio, Username, Estado, NivelAcceso, "
                    + "RegistradoBy, FechaRegistro, UltimaModificacionBy from Usuarios where Username = '"
                    + Admin_ManageUser.Username_Update +"'");
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                User.setIDUser(rs.getInt("IDUser")); 
                User.setNombre(rs.getString("Nombre")); 
                User.setTelefono(rs.getString("Telefono")); 
                User.setEmail(rs.getString("Email")); 
                User.setDomicilio(rs.getString("Domicilio")); 
                User.setEstado(rs.getString("Estado")); 
                User.setNivelAcceso(rs.getString("NivelAcceso")); 
                User.setFechaRegistro(rs.getDate("FechaRegistro")); 
                User.setRegistradoBy(rs.getString("RegistradoBy")); 
                User.setUltimaModificacionBy(rs.getString("UltimaModificacionBy")); 
                User.setUsername(rs.getString("Username")); 
                
                                
                Nombre_Txt.setText(User.getNombre());
                Telefono_Txt.setText(User.getTelefono());
                Email_Txt.setText(User.getEmail());
                Username_Txt.setText(User.getUsername());
                Access_Cmb.setSelectedIndex(Val.GetSelectedAccess(User.getNivelAcceso()));
                Estado_Cmb.setSelectedIndex(Val.GetSelectedStat(User.getEstado()));
                Registred_Txt.setText(User.getRegistradoBy());
                ID_Txt.setText(Integer.toString(User.getIDUser()));
                FechaRegistro_Txt.setText(User.getFechaRegistro().toString());
                UltimaMod_Txt.setText(User.getUltimaModificacionBy());
                Domicilio_Txt.setText(User.getDomicilio());
                
            }
 
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde la ventana de informacion del usuario. "+ e);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
            
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo_Lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nombre_Lbl = new javax.swing.JLabel();
        Nombre_Txt = new javax.swing.JTextField();
        Telefono_Lbl = new javax.swing.JLabel();
        Telefono_Txt = new javax.swing.JTextField();
        Email_Lbl = new javax.swing.JLabel();
        Email_Txt = new javax.swing.JTextField();
        Acceso_Lbl = new javax.swing.JLabel();
        Access_Cmb = new javax.swing.JComboBox<>();
        Estado_Cmb = new javax.swing.JComboBox<>();
        Estado_Lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Domicilio_Txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Registred_Lbl = new javax.swing.JLabel();
        Registred_Txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FechaRegistro_Txt = new javax.swing.JTextField();
        Username_Txt = new javax.swing.JTextField();
        Username_Lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UltimaMod_Txt = new javax.swing.JTextField();
        Editar_Btn = new javax.swing.JButton();
        Aplicar_Btn = new javax.swing.JButton();
        Nombre_Warn = new javax.swing.JLabel();
        Telefono_Warn = new javax.swing.JLabel();
        Email_Warn = new javax.swing.JLabel();
        Username_Warn = new javax.swing.JLabel();
        ID_Lbl = new javax.swing.JLabel();
        ID_Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fondo_Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Nombre_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Nombre_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Nombre_Lbl.setText("Nombre:");

        Nombre_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Nombre_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Nombre_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Nombre_Txt.setEnabled(false);
        Nombre_Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nombre_TxtMouseExited(evt);
            }
        });

        Telefono_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Telefono_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Telefono_Lbl.setText("Telefono:");

        Telefono_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Telefono_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Telefono_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Telefono_Txt.setEnabled(false);

        Email_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Email_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Email_Lbl.setText("Email:");

        Email_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Email_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Email_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Email_Txt.setEnabled(false);

        Acceso_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Acceso_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Acceso_Lbl.setText("Nivel de acceso:");

        Access_Cmb.setBackground(new java.awt.Color(51, 51, 51));
        Access_Cmb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Access_Cmb.setForeground(new java.awt.Color(204, 204, 204));
        Access_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Responsable De Bodega", "Auxiliar De Nomina" }));
        Access_Cmb.setEnabled(false);

        Estado_Cmb.setBackground(new java.awt.Color(51, 51, 51));
        Estado_Cmb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Estado_Cmb.setForeground(new java.awt.Color(204, 204, 204));
        Estado_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        Estado_Cmb.setEnabled(false);

        Estado_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Estado_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Estado_Lbl.setText("Estado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Domicilio:");

        Domicilio_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Domicilio_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Domicilio_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Domicilio_Txt.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email_Txt)
                    .addComponent(Telefono_Txt)
                    .addComponent(Nombre_Txt)
                    .addComponent(Domicilio_Txt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre_Lbl)
                            .addComponent(Telefono_Lbl)
                            .addComponent(Email_Lbl)
                            .addComponent(Estado_Lbl)
                            .addComponent(jLabel2)
                            .addComponent(Acceso_Lbl)
                            .addComponent(Estado_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Access_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Telefono_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telefono_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Email_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Domicilio_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Estado_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estado_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Acceso_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Access_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 440));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        Registred_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Registred_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Registred_Lbl.setText("Usuario registrado por:");

        Registred_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Registred_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Registred_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Registred_Txt.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Fecha de registro:");

        FechaRegistro_Txt.setBackground(new java.awt.Color(51, 51, 51));
        FechaRegistro_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FechaRegistro_Txt.setForeground(new java.awt.Color(204, 204, 204));
        FechaRegistro_Txt.setEnabled(false);

        Username_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Username_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Username_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Username_Txt.setEnabled(false);

        Username_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Username_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Username_Lbl.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Última modificación por:");

        UltimaMod_Txt.setBackground(new java.awt.Color(51, 51, 51));
        UltimaMod_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UltimaMod_Txt.setForeground(new java.awt.Color(204, 204, 204));
        UltimaMod_Txt.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registred_Txt)
                    .addComponent(FechaRegistro_Txt)
                    .addComponent(Username_Txt)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Registred_Lbl)
                            .addComponent(Username_Lbl)
                            .addComponent(jLabel3))
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addComponent(UltimaMod_Txt))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Registred_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registred_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaRegistro_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UltimaMod_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 360, 300));

        Editar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Editar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Editar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Editar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Editar x32.png"))); // NOI18N
        Editar_Btn.setText("Editar registro");
        Editar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 180, -1));

        Aplicar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Aplicar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Aplicar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Aplicar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/AplicarCambios x32.png"))); // NOI18N
        Aplicar_Btn.setText("Aplicar cambios");
        Aplicar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aplicar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Aplicar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        Nombre_Warn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Nombre_Warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Nombre_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 20, 20));

        Telefono_Warn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Telefono_Warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Telefono_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 20, 20));

        Email_Warn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Email_Warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Email_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 20, 20));

        Username_Warn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Username_Warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Username_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 20, 20));

        ID_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ID_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        ID_Lbl.setText("ID:");
        getContentPane().add(ID_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, 25));

        ID_Txt.setBackground(new java.awt.Color(51, 51, 51));
        ID_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ID_Txt.setForeground(new java.awt.Color(204, 204, 204));
        ID_Txt.setEnabled(false);
        getContentPane().add(ID_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 90, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Editar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_BtnActionPerformed
        
        Editar_Btn.setVisible(false);
        Aplicar_Btn.setVisible(true);
        
        Nombre_Txt.setEnabled(true);
        Telefono_Txt.setEnabled(true);
        Email_Txt.setEnabled(true);
        Username_Txt.setEnabled(true);
        Access_Cmb.setEnabled(true);
        Estado_Cmb.setEnabled(true);
        Domicilio_Txt.setEnabled(true);
        
    }//GEN-LAST:event_Editar_BtnActionPerformed

    private void Aplicar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aplicar_BtnActionPerformed
        
        //Variables.
        int Empty = 0;
       
        
        //Recuperando datos ingresados.
        User.setNombre(Nombre_Txt.getText().trim());
        User.setTelefono(Telefono_Txt.getText().trim());
        User.setEmail(Email_Txt.getText().trim());
        User.setDomicilio(Domicilio_Txt.getText().trim());
        User.setEstado(Val.GetSelectedStat(Estado_Cmb.getSelectedIndex()));
        User.setNivelAcceso(Val.GetSelectedAccess(Access_Cmb.getSelectedIndex()));
        User.setUsername(Username_Txt.getText().trim());
        User.setUltimaModificacionBy(Username_Sesion);
                
        
        //Validando que los campos no esten vacios.
        if(User.getNombre().equals("")){
            
            Empty++;
            Nombre_Warn.setText("!");
            
        }if(User.getTelefono().equals("")){
            
            Empty++;
            Telefono_Warn.setText("!");
            
        }if(User.getEmail().equals("")){
            
            Empty++;
            Email_Warn.setText("!");
            
        }if(User.getDomicilio().equals("")){
            
            Empty++;
            jLabel4.setText("!");
            
        }if(User.getUsername().equals("")){
            
            Empty++;
            Username_Warn.setText("!");
            
        }
        
        
        //
        try{
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select Username from Usuarios where Username = '"+ User.getUsername() +
                            "' and not IDUser = '"+ Integer.toString(User.getIDUser()) +"'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "Nombre de usuario ya existente.", " -  Mensaje de advertencia",
                            0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
                Username_Warn.setText("!");
                
            }else{
            
                if(Empty == 0){
                    
                    try{
                        
                        Connection cn2 = Conexion.Conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                            "update Usuarios set Nombre = ?, Telefono = ?, Email = ?, Domicilio = ?, Username = ?, "
                                    + "NivelAcceso = ?, Estado = ?, UltimaModificacionBy = ? where IDUser = '"+ User.getIDUser() +"'");
                            
                        
                        pst2.setString(1, User.getNombre());
                        pst2.setString(2, User.getTelefono());
                        pst2.setString(3, User.getEmail());
                        pst2.setString(4, User.getDomicilio());
                        pst2.setString(5, User.getUsername());
                        pst2.setString(6, User.getNivelAcceso());
                        pst2.setString(7, User.getEstado());
                        pst2.setString(8, User.getUltimaModificacionBy());
                        
                        pst2.executeUpdate();
                        
                        
                        
                        JOptionPane.showMessageDialog(null, "Se han actualizado los registros exitosamente.",
                                " -  Mensaje de información", 0, Metodo.GetIcon("src/JOIcons/Info JO.png"));
                            
                        this.dispose();
                        
                        cn2.close();
                        
                    }catch(SQLException e){
                        
                        System.err.println("Error al actualizar registros de User "+ e);
                        JOptionPane.showMessageDialog(null, "Error de conexión.",
                                " -  Mensaje de error", 0, Metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));
                        
                    }
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Por favor, rellena todos los campos vacios.",
                                " -  Mensaje de advertencia", 0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
                    
                }
            
            }
            
            cn.close();
            
        }catch(SQLException e){
            
            System.err.println("Error desde la ventana de info user. "+ e);
            JOptionPane.showMessageDialog(null, "Error de conexión.",
                                " -  Mensaje de error", 0, Metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }
        
        
        
    }//GEN-LAST:event_Aplicar_BtnActionPerformed

    private void Nombre_TxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_TxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_TxtMouseExited

    
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
            java.util.logging.Logger.getLogger(InformacionGeneralUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneralUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneralUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneralUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionGeneralUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acceso_Lbl;
    private javax.swing.JComboBox<String> Access_Cmb;
    private javax.swing.JButton Aplicar_Btn;
    private javax.swing.JTextField Domicilio_Txt;
    private javax.swing.JButton Editar_Btn;
    private javax.swing.JLabel Email_Lbl;
    private javax.swing.JTextField Email_Txt;
    private javax.swing.JLabel Email_Warn;
    private javax.swing.JComboBox<String> Estado_Cmb;
    private javax.swing.JLabel Estado_Lbl;
    private javax.swing.JTextField FechaRegistro_Txt;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JLabel ID_Lbl;
    private javax.swing.JTextField ID_Txt;
    private javax.swing.JLabel Nombre_Lbl;
    private javax.swing.JTextField Nombre_Txt;
    private javax.swing.JLabel Nombre_Warn;
    private javax.swing.JLabel Registred_Lbl;
    private javax.swing.JTextField Registred_Txt;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JLabel Telefono_Lbl;
    private javax.swing.JTextField Telefono_Txt;
    private javax.swing.JLabel Telefono_Warn;
    private javax.swing.JTextField UltimaMod_Txt;
    private javax.swing.JLabel Username_Lbl;
    private javax.swing.JTextField Username_Txt;
    private javax.swing.JLabel Username_Warn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
