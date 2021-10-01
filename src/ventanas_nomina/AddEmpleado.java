package ventanas_nomina;

import clases.Empleado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.Conexion;
import metodos.FicheroTool;
import metodos.Validacion;
import metodos.WindowTool;
import ventanas.Login;



public class AddEmpleado extends javax.swing.JFrame {

    //Metodos.
    WindowTool Metodo = new WindowTool();
    FicheroTool FiTool = new FicheroTool();
    Validacion Val = new Validacion();
    
    
    //Variables.
    boolean Igual;
    Date date2 = new Date(2010-1900, 11, 31);
    Empleado Emp = new Empleado();
    String Username_Sesion;
    
    
    //getting fecha de registro.
    java.sql.Date FechaRegistro = new java.sql.Date(LocalDate.now().getYear() - 1900, LocalDate.now().getMonthValue() - 1,
            LocalDate.now().getDayOfMonth());
    
    public AddEmpleado() {
        
        initComponents();
        
        
        //Variables.
        Username_Sesion = Login.Username_Sesion;
        
        
        //Modelando ventana.
        this.setVisible(true);
        this.setTitle(" -  Registro de empleado");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Setting Fondo.
        Fondo_Lbl.setIcon(Metodo.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        
        //Setting icon.
        this.setIconImage(Metodo.GetIconImage("icons/Logo.jpg"));
        
        
        //Cambiando de panel.
        jPanel2.setVisible(false);
        W5_1.setVisible(false);
        
        
        //Dandole un rango valido a el calendario.
        Date date1 = new Date(1921-1900, 0, 1);
        
        Nacimiento_Txt.setDate(date2);
        Nacimiento_Txt.setSelectableDateRange(date1, date2);
        
        
        //Setting fecha de registro.
        FechaRegistro_Txt.setText(FechaRegistro.toString());

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre_Txt = new javax.swing.JTextField();
        DNI_Txt = new javax.swing.JTextField();
        Edad_Txt = new javax.swing.JTextField();
        Masculino_RB = new javax.swing.JRadioButton();
        Femenino_RB = new javax.swing.JRadioButton();
        Nacimiento_Txt = new com.toedter.calendar.JDateChooser();
        Telefono_Txt = new javax.swing.JTextField();
        Email_Txt = new javax.swing.JTextField();
        Domicilio_Txt = new javax.swing.JTextField();
        Next_Btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        W1 = new javax.swing.JLabel();
        W2 = new javax.swing.JLabel();
        W3 = new javax.swing.JLabel();
        W5 = new javax.swing.JLabel();
        W4 = new javax.swing.JLabel();
        W6 = new javax.swing.JLabel();
        W7 = new javax.swing.JLabel();
        W8 = new javax.swing.JLabel();
        W5_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Volver_Btn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cargos_Tbl = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        NoInss_Txt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        FechaRegistro_Txt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Estado_CMB = new javax.swing.JComboBox<>();
        Registrar_Btn = new javax.swing.JButton();
        Fondo_Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Registro de empleado.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Información general");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Domicilio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 183, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 351, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Información de contacto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 11, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("DNI:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Sexo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Nombre_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Nombre_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nombre_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Nombre_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nombre_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(Nombre_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 363, -1));

        DNI_Txt.setBackground(new java.awt.Color(51, 51, 51));
        DNI_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DNI_Txt.setForeground(new java.awt.Color(204, 204, 204));
        DNI_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DNI_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(DNI_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 363, -1));

        Edad_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Edad_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edad_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Edad_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Edad_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(Edad_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 363, -1));

        Masculino_RB.setBackground(new java.awt.Color(51, 51, 51));
        Masculino_RB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Masculino_RB.setForeground(new java.awt.Color(204, 204, 204));
        Masculino_RB.setText("Masculino");
        Masculino_RB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Masculino_RBKeyPressed(evt);
            }
        });
        jPanel1.add(Masculino_RB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        Femenino_RB.setBackground(new java.awt.Color(51, 51, 51));
        Femenino_RB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Femenino_RB.setForeground(new java.awt.Color(204, 204, 204));
        Femenino_RB.setText("Femenino");
        Femenino_RB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Femenino_RBKeyPressed(evt);
            }
        });
        jPanel1.add(Femenino_RB, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 290, -1, -1));

        Nacimiento_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Nacimiento_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Nacimiento_Txt.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(Nacimiento_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 377, 363, -1));

        Telefono_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Telefono_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Telefono_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Telefono_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Telefono_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(Telefono_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 75, 363, -1));

        Email_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Email_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Email_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Email_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(Email_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 142, 363, -1));

        Domicilio_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Domicilio_Txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Domicilio_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Domicilio_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Domicilio_TxtKeyPressed(evt);
            }
        });
        jPanel1.add(Domicilio_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 209, 363, -1));

        Next_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Next_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Next_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Next_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Siguiente x48.png"))); // NOI18N
        Next_Btn.setText("Siguiente");
        Next_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Next_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 276, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 49, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 116, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Edad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        W1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        W2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        W3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        W5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        W4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        W6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 20, 10));

        W7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 20, 10));

        W8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        W8.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(W8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 20, 10));

        W5_1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        W5_1.setForeground(new java.awt.Color(204, 204, 204));
        W5_1.setText("Asegúrate de cambiar esta fecha por defecto.");
        jPanel1.add(W5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 405, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 940, 440));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 440));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Volver_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Volver_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Volver_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Volver.png"))); // NOI18N
        Volver_Btn.setText("Volver");
        Volver_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Volver_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 388, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 105, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 230, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Cargo del empleado");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Cargos_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Cargos_Tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 788, 240));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Fecha de registro:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        NoInss_Txt.setBackground(new java.awt.Color(51, 51, 51));
        NoInss_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NoInss_Txt.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(NoInss_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("No. INNS:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        FechaRegistro_Txt.setBackground(new java.awt.Color(51, 51, 51));
        FechaRegistro_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FechaRegistro_Txt.setForeground(new java.awt.Color(204, 204, 204));
        FechaRegistro_Txt.setEnabled(false);
        jPanel2.add(FechaRegistro_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 250, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Estado:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        Estado_CMB.setBackground(new java.awt.Color(51, 51, 51));
        Estado_CMB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Estado_CMB.setForeground(new java.awt.Color(204, 204, 204));
        Estado_CMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel2.add(Estado_CMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 250, -1));

        Registrar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Registrar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Registrar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Registrar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Add emp.png"))); // NOI18N
        Registrar_Btn.setText("Registrar");
        Registrar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Registrar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 940, 440));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_TxtKeyPressed

        Metodo.WaitEnter(evt, DNI_Txt);

    }//GEN-LAST:event_Nombre_TxtKeyPressed

    private void DNI_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNI_TxtKeyPressed

        Metodo.WaitEnter(evt, Edad_Txt);

    }//GEN-LAST:event_DNI_TxtKeyPressed

    private void Edad_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Edad_TxtKeyPressed

        Metodo.WaitEnter(evt, Masculino_RB);

    }//GEN-LAST:event_Edad_TxtKeyPressed

    private void Masculino_RBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Masculino_RBKeyPressed

        int cTeclaPresionada = evt.getKeyCode();

        if(cTeclaPresionada == 39){

            Femenino_RB.requestFocus();

        }else if(cTeclaPresionada == KeyEvent.VK_ENTER){

            Masculino_RB.setSelected(true);
            Telefono_Txt.requestFocus();

        }

    }//GEN-LAST:event_Masculino_RBKeyPressed

    private void Femenino_RBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Femenino_RBKeyPressed

        int cTeclaPresionada = evt.getKeyCode();

        if(cTeclaPresionada == 37){

            Masculino_RB.requestFocus();

        }else if(cTeclaPresionada == KeyEvent.VK_ENTER){

            Femenino_RB.setSelected(true);
            Telefono_Txt.requestFocus();

        }

    }//GEN-LAST:event_Femenino_RBKeyPressed

    private void Telefono_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Telefono_TxtKeyPressed

        Metodo.WaitEnter(evt, Email_Txt);

    }//GEN-LAST:event_Telefono_TxtKeyPressed

    private void Email_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Email_TxtKeyPressed

        Metodo.WaitEnter(evt, Domicilio_Txt);

    }//GEN-LAST:event_Email_TxtKeyPressed

    private void Domicilio_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Domicilio_TxtKeyPressed

        Metodo.WaitEnter(evt, Next_Btn);

    }//GEN-LAST:event_Domicilio_TxtKeyPressed

    private void Next_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_BtnActionPerformed

        //Reset warnings.
        W1.setText("");
        W2.setText("");
        W3.setText("");
        W4.setText("");
        W5.setText("");
        W5_1.setVisible(false);
        W6.setText("");
        W7.setText("");
        W8.setText("");
        Igual = false;

        //Variables.
        int V = 0;

        //Validando campos vacios.
        if(Nombre_Txt.getText().equals("")){

            V++;
            W1.setText("!");

        }if(DNI_Txt.getText().equals("")){

            V++;
            W2.setText("!");

        }if(Edad_Txt.getText().equals("")){

            V++;
            W3.setText("!");

        }if(!Masculino_RB.isSelected() && !Femenino_RB.isSelected()){

            V++;
            W4.setText("!");

        }if(Nacimiento_Txt.getDate().compareTo(date2) == 0){

            Igual = true;
            W5.setText("!");
            W5_1.setVisible(true);

        }if(Telefono_Txt.getText().equals("")){

            V++;
            W6.setText("!");

        }if(Email_Txt.getText().equals("")){

            V++;
            W7.setText("!");

        }if(Domicilio_Txt.getText().equals("")){

            V++;
            W8.setText("!");

        }

        if(V == 0){

            if(Igual == false){

                if(Val.IsAnInt(Edad_Txt.getText())){

                    Date temp = Nacimiento_Txt.getDate();
                    java.sql.Date Nacimiento = new java.sql.Date(temp.getTime());

                    if( (Integer.parseInt(Edad_Txt.getText())) == Val.GetEdadByFn(Nacimiento) ){

                        //Obteniendo datos ingresados.
                        Emp.setNombre(Nombre_Txt.getText().trim());
                        Emp.setDNI(DNI_Txt.getText().trim());
                        Emp.setEdad(Integer.parseInt(Edad_Txt.getText().trim()));
                        Emp.setSexo(Val.GetSelectedSex(Masculino_RB, Femenino_RB));
                        Emp.setFechaDeNacimiento(Nacimiento);
                        Emp.setTelefono(Telefono_Txt.getText().trim());
                        Emp.setEmail(Email_Txt.getText().trim());
                        Emp.setDomicilio(Domicilio_Txt.getText().trim());

                        Cargos_Tbl.setModel(Metodo.MostrarSalariosBase());
                        
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(true);     
                        
                        NoInss_Txt.requestFocus();

                    }else{

                        int Option = JOptionPane.showConfirmDialog(null, "Edad errónea para la fecha de nacimiento ingresada.\n"
                            + "¿Desea editar el campo por una edad válida?\nEdad válida: "+ Val.GetEdadByFn(Nacimiento),
                            " -  Mensaje de advertencia", JOptionPane.YES_NO_OPTION, 0,
                            Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));

                        if(Option == JOptionPane.YES_OPTION){

                            Edad_Txt.setText(Integer.toString(Val.GetEdadByFn(Nacimiento)));

                        }

                    }

                }else{

                    JOptionPane.showMessageDialog(null, "Por favor, ingresa una edad válida.\n(Sólo valores numéricos).",
                        " -  Mensaje de advertencia", 0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));

                    Edad_Txt.setText("");
                    W3.setText("!");

                }

            }else{

                JOptionPane.showMessageDialog(null, "Asegurate de cambiar la fecha de nacimiento por defecto.",
                    " -  Mensaje de advertencia", 0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));

            }

        }else{

            JOptionPane.showMessageDialog(null, "Por favor, rellena todos los campos vacios.", " -  Mensaje de advertencia",
                0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));

        }

    }//GEN-LAST:event_Next_BtnActionPerformed

    private void Volver_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_BtnActionPerformed

        jPanel1.setVisible(true);
        jPanel2.setVisible(false);

    }//GEN-LAST:event_Volver_BtnActionPerformed

    private void Registrar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_BtnActionPerformed
        
        //Reset warning
        NoInss_Txt.setBackground(new Color(51,51,51));
        
        
        //Variables.
        int V = 0;
        
        int[] Cargo = new int[Cargos_Tbl.getSelectedRowCount()];
        Cargo = Cargos_Tbl.getSelectedRows();
        
        
        //Validando campos.
        if(NoInss_Txt.getText().equalsIgnoreCase("")){
            
            V++;
            NoInss_Txt.setBackground(Color.RED);
            
        }
        
        
        //
        if( (V == 0) && (Cargo.length == 1) ){
            
            try {
                
                Connection cn2 = Conexion.Conectar();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "select NumeroINSS from Empleados where NumeroINSS = '"+ NoInss_Txt.getText() +"'");
                
                ResultSet rs = pst2.executeQuery();
                
                if(rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "Numero INSS ya registrado!\nPor favor, ingresa uno nuevo.", " -  Mensaje de advertencia",
                            0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
                    
                    NoInss_Txt.setBackground(Color.RED);
                    
                }else{
                    
                    Emp.setNumeroINSS(NoInss_Txt.getText());
                    Emp.setEstado(Val.GetSelectedStat(Estado_CMB.getSelectedIndex()));
                    Emp.setCargo((String) Cargos_Tbl.getValueAt(Cargo[0], 0));
                    Emp.setSalarioMensual(Float.parseFloat((String) Cargos_Tbl.getValueAt(Cargo[0], 1)));
                    Emp.setRegistradoBy(Username_Sesion);
                    Emp.setFechaDeAlta(FechaRegistro);

                    try {

                        Connection cn = Conexion.Conectar();
                        PreparedStatement pst = cn.prepareStatement(
                                "insert into Empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pst.setInt(1, 0);
                        pst.setString(2, Emp.getNombre());
                        pst.setString(3, Emp.getDNI());
                        pst.setInt(4, Emp.getEdad());
                        pst.setString(5, Emp.getSexo());
                        pst.setString(6, Emp.getTelefono());
                        pst.setString(7, Emp.getEmail());
                        pst.setString(8, Emp.getDomicilio());
                        pst.setDate(9, Emp.getFechaDeNacimiento());
                        pst.setString(10, Emp.getNumeroINSS());
                        pst.setString(11, Emp.getCargo());
                        pst.setFloat(12, Emp.getSalarioMensual());
                        pst.setInt(13, 0);
                        pst.setFloat(14, 0);
                        pst.setString(15, Username_Sesion);
                        pst.setDate(16, Emp.getFechaDeAlta());
                        pst.setString(17, Emp.getEstado());
                        pst.setFloat(18, 0);
                        pst.setFloat(19, 0);
                        pst.setFloat(20, 0);
                        pst.setFloat(21, 0);
                        pst.setFloat(22, 0);
                        pst.setFloat(23, 0);
                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente!", " -  Mensaje de información",
                            0, Metodo.GetIcon("src/JOIcons/Info JO.png"));

                        this.dispose();

                    } catch (SQLException e) {

                        System.err.println("Error al registrar empleado. "+ e);
                        JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error",
                            0, Metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));

                    }
                    
                }
                
            } catch (SQLException e) {
                
                System.err.println("Error al validar NO. INSS"+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error",
                            0, Metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));
                
            }
            
            
        }else if( (V == 0) && (Cargo.length == 0) ){
            
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un cargo de la tabla.", " -  Mensaje de advertencia",
                    0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }else if( (V == 0) && (Cargo.length > 1) ){
            
            JOptionPane.showMessageDialog(null, "El empleado solo podrá tener un cargo, por favor seleccionar\n"
                    + "sólamente uno.", " -  Mensaje de advertencia", 0, Metodo.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }
        
    }//GEN-LAST:event_Registrar_BtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Cargos_Tbl;
    private javax.swing.JTextField DNI_Txt;
    private javax.swing.JTextField Domicilio_Txt;
    private javax.swing.JTextField Edad_Txt;
    private javax.swing.JTextField Email_Txt;
    private javax.swing.JComboBox<String> Estado_CMB;
    private javax.swing.JTextField FechaRegistro_Txt;
    private javax.swing.JRadioButton Femenino_RB;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JRadioButton Masculino_RB;
    private com.toedter.calendar.JDateChooser Nacimiento_Txt;
    private javax.swing.JButton Next_Btn;
    private javax.swing.JTextField NoInss_Txt;
    private javax.swing.JTextField Nombre_Txt;
    private javax.swing.JButton Registrar_Btn;
    private javax.swing.JTextField Telefono_Txt;
    private javax.swing.JButton Volver_Btn;
    private javax.swing.JLabel W1;
    private javax.swing.JLabel W2;
    private javax.swing.JLabel W3;
    private javax.swing.JLabel W4;
    private javax.swing.JLabel W5;
    private javax.swing.JLabel W5_1;
    private javax.swing.JLabel W6;
    private javax.swing.JLabel W7;
    private javax.swing.JLabel W8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
