package ventanas_nomina;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import metodos.Conexion;
import metodos.FicheroTool;
import metodos.WindowTool;
import ventanas.Login;
import metodos.PlaceHolder;
import metodos.Validacion;


public class SalarioBase extends javax.swing.JFrame {

    //Metodos.
    WindowTool WinTool = new WindowTool();
    FicheroTool FiTool = new FicheroTool();
    Validacion Val = new Validacion();

    
    //Variables.
    String Username_Sesion = Login.Username_Sesion;
    String PreguntSecreta = Login.PreguntaSecreta;
    String Sexo = Login.Sexo_Sesion;
    String Nombre_Sesion = Login.Nombre_Sesion;
    boolean ventana = true;
    int IDSalario_Update = 0;
    
    public SalarioBase() {
        
        initComponents();
        
        
        //Modelando ventana.
        this.setVisible(true);
        this.setTitle(" -  Nomina y empleados");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Setting Fondo.
        Fondo_Lbl.setIcon(WinTool.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        
        //Setting icon.
        this.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        
        //Setting PlaceHolder.
        PlaceHolder PH = new PlaceHolder("Cargo", Buscar_Txt);
        
        
        //Ocultando Mensajes de ayuda.
        Consejo_Lbl.setVisible(false);
        Ayuda_Lbl.setVisible(false);
        
        
        //Mensajes de ayuda.
        if( (FiTool.LeerFichero(Username_Sesion, 1)).equalsIgnoreCase("Si") ){
            
            Timer timer = new Timer();
            int Vel = 3;
            int VelMil = Vel * 1000;

            TimerTask task = new TimerTask(){

                @Override
                public void run(){

                    Consejo_Lbl.setVisible(true);
                    Ayuda_Lbl.setVisible(true);

                }

            };

            timer.schedule(task, VelMil);
            
        }
        
        
        //Modelando la tabla de salarios base.
        Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());
        
        
        //Modelando la ventana de agregar salario.
        Agregar.setVisible(false);
        Agregar.setTitle(" -  Agregar nuevo salario base");
        Agregar.setSize(700, 439);      
        Agregar.setResizable(false);
        Agregar.setLocationRelativeTo(null);
        
        Agregar.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        ImageIcon Fondo = new ImageIcon("src/icons/Fondo2.jpg");
        Icon icono = new ImageIcon(Fondo.getImage().getScaledInstance(700,
                500, Image.SCALE_DEFAULT));
        Fondo_Lbl2.setIcon(icono);
        
        
        //
        Editar.setVisible(false);
        Editar.setTitle(" -  Editar salario base");
        Editar.setSize(700, 439);      
        Editar.setResizable(false);
        Editar.setLocationRelativeTo(null);
        
        Editar.setIconImage(WinTool.GetIconImage("icons/Logo.jpg"));
        
        ImageIcon Fondo2 = new ImageIcon("src/icons/Fondo2.jpg");
        Icon icono2 = new ImageIcon(Fondo.getImage().getScaledInstance(700,
                500, Image.SCALE_DEFAULT));
        Fondo_Lbl3.setIcon(icono2);
        
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JFrame();
        Titulo2_Lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cargo_Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Salario_Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HoraExtra_Txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AgregarSalario_Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Antiguedad_CMB = new javax.swing.JComboBox<>();
        TipoCargo_CMB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Fondo_Lbl2 = new javax.swing.JLabel();
        Editar = new javax.swing.JFrame();
        Titulo2_Lbl1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Cargo_Txt1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Salario_Txt1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        HoraExtra_Txt1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        EditarSalario_Btn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Antiguedad_CMB1 = new javax.swing.JComboBox<>();
        TipoCargo_CMB1 = new javax.swing.JComboBox<>();
        Volver_Btn = new javax.swing.JButton();
        Fondo_Lbl3 = new javax.swing.JLabel();
        Saludo_Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Buscar_Txt = new javax.swing.JTextField();
        Buscar_Btn = new javax.swing.JButton();
        Mostrar_Lbl = new javax.swing.JLabel();
        Filtro_Cmb = new javax.swing.JComboBox<>();
        Actualizar_Btn = new javax.swing.JButton();
        TblName_Lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salarios_Tbl = new javax.swing.JTable();
        Eliminar_Btn = new javax.swing.JButton();
        Editar_Btn = new javax.swing.JButton();
        Ayuda_Lbl = new javax.swing.JLabel();
        Consejo_Lbl = new javax.swing.JLabel();
        Fondo_Lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Agregar_Btn = new javax.swing.JMenuItem();

        Agregar.setUndecorated(true);
        Agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titulo2_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Titulo2_Lbl.setText("Agregar nuevo salario base.");
        Agregar.getContentPane().add(Titulo2_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cargo:");

        Cargo_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Cargo_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Cargo_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Cargo_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cargo_TxtKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Salario Mensual:");

        Salario_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Salario_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Salario_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Salario_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Salario_TxtKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ingresos por antiguedad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ingreso por hora extra:");

        HoraExtra_Txt.setBackground(new java.awt.Color(51, 51, 51));
        HoraExtra_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        HoraExtra_Txt.setForeground(new java.awt.Color(204, 204, 204));
        HoraExtra_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HoraExtra_TxtKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Tipo de cargo:");

        AgregarSalario_Btn.setBackground(new java.awt.Color(51, 51, 51));
        AgregarSalario_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AgregarSalario_Btn.setForeground(new java.awt.Color(204, 204, 204));
        AgregarSalario_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Agregar salario.png"))); // NOI18N
        AgregarSalario_Btn.setText("Agregar");
        AgregarSalario_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSalario_BtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        Antiguedad_CMB.setBackground(new java.awt.Color(51, 51, 51));
        Antiguedad_CMB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Antiguedad_CMB.setForeground(new java.awt.Color(204, 204, 204));
        Antiguedad_CMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12%", "10%", "08%", "06%" }));
        Antiguedad_CMB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Antiguedad_CMBKeyPressed(evt);
            }
        });

        TipoCargo_CMB.setBackground(new java.awt.Color(51, 51, 51));
        TipoCargo_CMB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TipoCargo_CMB.setForeground(new java.awt.Color(204, 204, 204));
        TipoCargo_CMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerencial", "Administrativo", "Operativo" }));
        TipoCargo_CMB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TipoCargo_CMBKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Antiguedad_CMB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarSalario_Btn)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cargo_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Salario_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HoraExtra_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TipoCargo_CMB, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargo_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TipoCargo_CMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salario_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarSalario_Btn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(Antiguedad_CMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoraExtra_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Agregar.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 640, 310));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Volver.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Agregar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));
        Agregar.getContentPane().add(Fondo_Lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        Editar.setUndecorated(true);
        Editar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titulo2_Lbl1.setForeground(new java.awt.Color(204, 204, 204));
        Titulo2_Lbl1.setText("Editar salario base.");
        Editar.getContentPane().add(Titulo2_Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Cargo:");

        Cargo_Txt1.setBackground(new java.awt.Color(51, 51, 51));
        Cargo_Txt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Cargo_Txt1.setForeground(new java.awt.Color(204, 204, 204));
        Cargo_Txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cargo_Txt1KeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Salario Mensual:");

        Salario_Txt1.setBackground(new java.awt.Color(51, 51, 51));
        Salario_Txt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Salario_Txt1.setForeground(new java.awt.Color(204, 204, 204));
        Salario_Txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Salario_Txt1KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Ingresos por antiguedad:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Ingreso por hora extra:");

        HoraExtra_Txt1.setBackground(new java.awt.Color(51, 51, 51));
        HoraExtra_Txt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        HoraExtra_Txt1.setForeground(new java.awt.Color(204, 204, 204));
        HoraExtra_Txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HoraExtra_Txt1KeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Tipo de cargo:");

        EditarSalario_Btn.setBackground(new java.awt.Color(51, 51, 51));
        EditarSalario_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EditarSalario_Btn.setForeground(new java.awt.Color(204, 204, 204));
        EditarSalario_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Editar Salario.png"))); // NOI18N
        EditarSalario_Btn.setText("Editar");
        EditarSalario_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarSalario_BtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));

        Antiguedad_CMB1.setBackground(new java.awt.Color(51, 51, 51));
        Antiguedad_CMB1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Antiguedad_CMB1.setForeground(new java.awt.Color(204, 204, 204));
        Antiguedad_CMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12%", "10%", "08%", "06%" }));
        Antiguedad_CMB1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Antiguedad_CMB1KeyPressed(evt);
            }
        });

        TipoCargo_CMB1.setBackground(new java.awt.Color(51, 51, 51));
        TipoCargo_CMB1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TipoCargo_CMB1.setForeground(new java.awt.Color(204, 204, 204));
        TipoCargo_CMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerencial", "Administrativo", "Operativo" }));
        TipoCargo_CMB1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TipoCargo_CMB1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(Antiguedad_CMB1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditarSalario_Btn)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Cargo_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Salario_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(HoraExtra_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(TipoCargo_CMB1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargo_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TipoCargo_CMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salario_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarSalario_Btn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3)
                        .addComponent(Antiguedad_CMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoraExtra_Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Editar.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 640, 310));

        Volver_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Volver_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Volver.png"))); // NOI18N
        Volver_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_BtnActionPerformed(evt);
            }
        });
        Editar.getContentPane().add(Volver_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));
        Editar.getContentPane().add(Fondo_Lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Saludo_Lbl.setText("Gestión de salarios base.");
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 93, -1, -1));

        Buscar_Txt.setBackground(new java.awt.Color(51, 51, 51));
        Buscar_Txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Buscar_Txt.setForeground(new java.awt.Color(204, 204, 204));
        Buscar_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Buscar_TxtKeyPressed(evt);
            }
        });
        getContentPane().add(Buscar_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, -1));

        Buscar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Buscar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Buscar x32.png"))); // NOI18N
        Buscar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 40, 30));

        Mostrar_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Mostrar_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Mostrar_Lbl.setText("Mostrar:");
        getContentPane().add(Mostrar_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 93, -1, -1));

        Filtro_Cmb.setBackground(new java.awt.Color(51, 51, 51));
        Filtro_Cmb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Filtro_Cmb.setForeground(new java.awt.Color(204, 204, 204));
        Filtro_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Gerenciales", "Administrativos", "Operativos" }));
        Filtro_Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro_CmbActionPerformed(evt);
            }
        });
        getContentPane().add(Filtro_Cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        Actualizar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Actualizar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Actualizar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Actualizar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Actualizar x32.png"))); // NOI18N
        Actualizar_Btn.setText("Actualizar");
        Actualizar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        TblName_Lbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TblName_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        TblName_Lbl.setText("Tabla de salarios base");
        getContentPane().add(TblName_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, -1));

        Salarios_Tbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Salarios_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Salario Mensual", "Ingresos por antiguedad", "Ingreso por hora extra", "Tipo de cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Salarios_Tbl);
        if (Salarios_Tbl.getColumnModel().getColumnCount() > 0) {
            Salarios_Tbl.getColumnModel().getColumn(0).setResizable(false);
            Salarios_Tbl.getColumnModel().getColumn(1).setResizable(false);
            Salarios_Tbl.getColumnModel().getColumn(2).setResizable(false);
            Salarios_Tbl.getColumnModel().getColumn(3).setResizable(false);
            Salarios_Tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 820, 350));

        Eliminar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Eliminar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Eliminar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Eliminar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Eliminar salario.png"))); // NOI18N
        Eliminar_Btn.setText("Eliminar");
        Eliminar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        Editar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Editar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Editar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Editar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Editar x32.png"))); // NOI18N
        Editar_Btn.setText("Editar");
        Editar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        Ayuda_Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Ayuda x32.png"))); // NOI18N
        Ayuda_Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ayuda_LblMouseClicked(evt);
            }
        });
        getContentPane().add(Ayuda_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        Consejo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Consejo_Lbl.setForeground(new java.awt.Color(255, 204, 0));
        Consejo_Lbl.setText("Help");
        getContentPane().add(Consejo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 280, -1, -1));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jMenu1.setText("Ventana");

        Agregar_Btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        Agregar_Btn.setText("Agregar nuevo salario base");
        Agregar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_BtnActionPerformed(evt);
            }
        });
        jMenu1.add(Agregar_Btn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Filtro_CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro_CmbActionPerformed

        if(Filtro_Cmb.getSelectedIndex() == 0){
            
            Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());
            
        }else if(Filtro_Cmb.getSelectedIndex() == 1){
            
            Salarios_Tbl.setModel(WinTool.FiltrarSalarios("Gerencial", (DefaultTableModel) Salarios_Tbl.getModel()));
            
        }else if(Filtro_Cmb.getSelectedIndex() == 2){
            
            Salarios_Tbl.setModel(WinTool.FiltrarSalarios("Administrativo", (DefaultTableModel) Salarios_Tbl.getModel()));
            
        }else if(Filtro_Cmb.getSelectedIndex() == 3){
            
            Salarios_Tbl.setModel(WinTool.FiltrarSalarios("Operativo", (DefaultTableModel) Salarios_Tbl.getModel()));
            
        }

    }//GEN-LAST:event_Filtro_CmbActionPerformed

    private void Actualizar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_BtnActionPerformed

        Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());

    }//GEN-LAST:event_Actualizar_BtnActionPerformed

    private void Eliminar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_BtnActionPerformed

        int[] Delete = new int[Salarios_Tbl.getSelectedRowCount()];
        int Cont = 0;
        
        Delete = Salarios_Tbl.getSelectedRows();
        
        for (int i = 0; i < Delete.length; i++) {
            
            String Cargo = (String) (Salarios_Tbl.getValueAt(Delete[i], 0));
            
            try {
                
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "delete from salariosbase where Cargo = '"+ Cargo +"'");
              
                if(!pst.execute()){
                    
                    Cont++;
                    
                    if((Cont == (Delete.length)) && (Delete.length > 1)){
                        
                        JOptionPane.showMessageDialog(null, "Registros eliminados.", " -  Mensaje de información", 0,
                                WinTool.GetIcon("src/JOIcons/Info JO.png"));
                        
                    }else if((Cont == (Delete.length)) && (Delete.length == 1)){
                        
                        JOptionPane.showMessageDialog(null, "Registro eliminado.", " -  Mensaje de información", 0,
                                WinTool.GetIcon("src/JOIcons/Info JO.png"));
                        
                    }
                    
                }
                                    
            } catch (SQLException e) {
                
                System.err.println("Error al eliminar registros de la tabla usuarios. "+ e);
                JOptionPane.showMessageDialog(null, "Error al eliminar registros.", " -  Mensaje de error", 0,
                                WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));
                
            }
            
        }

        Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());

    }//GEN-LAST:event_Eliminar_BtnActionPerformed

    private void Editar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_BtnActionPerformed

        int SelectedRow = Salarios_Tbl.getSelectedRow();
        String Cargo_Update = (String) (Salarios_Tbl.getValueAt(SelectedRow, 0));
        
        Editar.setVisible(true);
        
        int Antiguedad = 0, TipoCargo = 0;
        
        
        
        try {
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from salariosbase where Cargo = '"+ Cargo_Update +"'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                IDSalario_Update = rs.getInt(1);
                Cargo_Txt1.setText(rs.getString(2));
                Salario_Txt1.setText(Float.toString(rs.getFloat(3)));
                HoraExtra_Txt1.setText(Float.toString(rs.getFloat(5)));
                
                //Setting Antiguedad.
                if(rs.getString(4).equals("12%")){
            
                    Antiguedad_CMB1.setSelectedIndex(0);

                }if(rs.getString(4).equals("10%")){
            
                    Antiguedad_CMB1.setSelectedIndex(1);

                }if(rs.getString(4).equals("08%")){
            
                    Antiguedad_CMB1.setSelectedIndex(2);

                }if(rs.getString(4).equals("06%")){
            
                    Antiguedad_CMB1.setSelectedIndex(3);

                }
                
                //Setting Tipo Cargo.
                if(rs.getString(6).equals("Gerencial")){
            
                    TipoCargo_CMB1.setSelectedIndex(0);

                }if(rs.getString(6).equals("Administrativo")){
            
                    TipoCargo_CMB1.setSelectedIndex(1);

                }if(rs.getString(6).equals("Operativo")){
            
                    TipoCargo_CMB1.setSelectedIndex(2);

                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha podido obtener la información.", " -  Mensaje de error",
                        0, WinTool.GetIcon("src/JOIcons/Error JO.png"));
                
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error",
                        0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }

    }//GEN-LAST:event_Editar_BtnActionPerformed

    private void Ayuda_LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ayuda_LblMouseClicked

        Ayuda_Lbl.setVisible(false);
        Consejo_Lbl.setVisible(false);

        Object[] Options = {"De acuerdo"};

        int Option = JOptionPane.showOptionDialog(null, "Puedes utilizar Ctrl para seleccionar varios registros\ny luego eliminarlos"
            + " a la vez.\n(Necesitaras permisos de administrador).", " -  Ayuda", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            WinTool.GetIcon("src/JOIcons/Idea JO.png"), Options, Options[0]);

    }//GEN-LAST:event_Ayuda_LblMouseClicked

    private void Agregar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_BtnActionPerformed
        
        Agregar.setVisible(true);
        Cargo_Txt.requestFocus();
        
    }//GEN-LAST:event_Agregar_BtnActionPerformed

    private void AgregarSalario_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSalario_BtnActionPerformed
        
        //Reset Warnings.
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel10.setText("");
        
        
        //Variables.
        int V = 0;
        String Antiguedad = "", TipoCargo = "";
        
        
        //Validando campos vacios.
        if(Cargo_Txt.getText().equals("")){
            
            V++;
            jLabel7.setText("!");
            
        }if(Salario_Txt.getText().equals("")){
            
            V++;
            jLabel8.setText("!");
            
        }if(HoraExtra_Txt.getText().equals("")){
            
            V++;
            jLabel10.setText("!");
            
        }
        
        
        //Obteniendo la antiguedad.
        if(Antiguedad_CMB.getSelectedIndex() == 0){
            
            Antiguedad = "12%";
            
        }if(Antiguedad_CMB.getSelectedIndex() == 1){
            
            Antiguedad = "10%";
            
        }if(Antiguedad_CMB.getSelectedIndex() == 2){
            
            Antiguedad = "08%";
            
        }if(Antiguedad_CMB.getSelectedIndex() == 3){
            
            Antiguedad = "06%";
            
        }
        
        
        //Obteniendo tipo de cargo.
        if(TipoCargo_CMB.getSelectedIndex() == 0){
            
            TipoCargo = "Gerencial";
            
        }if(TipoCargo_CMB.getSelectedIndex() == 1){
            
            TipoCargo = "Administrativo";
            
        }if(TipoCargo_CMB.getSelectedIndex() == 2){
            
            TipoCargo = "Operativo";
            
        }
        
        
        if(V == 0){
            
            try {
            
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select Cargo from salariosbase where Cargo = '"+ Cargo_Txt.getText() +"'");

                ResultSet rs = pst.executeQuery();

                if(rs.next()){

                    JOptionPane.showMessageDialog(null, "Cargo ya existente, por favor ingresar uno nuevo.", " -  Mensaje de advertencia",
                            0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));

                    Cargo_Txt.setText("");
                    jLabel7.setText("!");

                }else{
                    
                    if( (Val.IsAFloat(Salario_Txt.getText()) == true) && (Val.IsAFloat(HoraExtra_Txt.getText()) == true) ){
                        
                        try {
                        
                            Connection cn2 = Conexion.Conectar();
                            PreparedStatement pst2 = cn2.prepareStatement(
                                    "insert into salariosbase values (?,?,?,?,?,?)");

                            pst2.setInt(1, 0);
                            pst2.setString(2, Cargo_Txt.getText());
                            pst2.setFloat(3, Float.parseFloat(Salario_Txt.getText()));
                            pst2.setString(4, Antiguedad);
                            pst2.setFloat(5, Float.parseFloat(HoraExtra_Txt.getText()));
                            pst2.setString(6, TipoCargo);
                            pst2.executeUpdate();
                            
                            Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());

                            JOptionPane.showMessageDialog(null, "Salario base registrado exitosamente.", " -  Mensaje de información",
                                0, WinTool.GetIcon("src/JOIcons/Info JO.png"));
                            
                            Cargo_Txt.setText("");
                            Salario_Txt.setText("");
                            Antiguedad_CMB.setSelectedIndex(0);
                            HoraExtra_Txt.setText("");
                            TipoCargo_CMB.setSelectedIndex(0);

                            Agregar.setVisible(false);

                            cn.close();
                            cn2.close();

                        } catch (SQLException e) {

                            System.err.println("Error al registrar salario base. "+ e);
                            JOptionPane.showMessageDialog(null, "Error de conexión.",
                                    " -  Mensaje de error", 0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

                        }
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo datos numericos para 'Salario Mensual'\n"
                                + "e 'Ingreso por hora extra'.",
                                " -  Mensaje de advertencia", 0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
                                
                        jLabel10.setText("!");
                        jLabel8.setText("!");
                        
                    }
                    
                    
                }

            } catch (SQLException e) {

                System.err.println("Error al validar Cargo. "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.",
                        " -  Mensaje de error", 0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por favor, rellenar todos los campos vacios.", " -  Mensaje de advertencia",
                            0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }
                
    }//GEN-LAST:event_AgregarSalario_BtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Agregar.setVisible(false);
        
        Cargo_Txt.setText("");
        Salario_Txt.setText("");
        Antiguedad_CMB.setSelectedIndex(0);
        HoraExtra_Txt.setText("");
        TipoCargo_CMB.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cargo_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cargo_TxtKeyPressed
        
        WinTool.WaitEnter(evt, Salario_Txt);
        
    }//GEN-LAST:event_Cargo_TxtKeyPressed

    private void Salario_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Salario_TxtKeyPressed
        
        WinTool.WaitEnter(evt, Antiguedad_CMB);
        
    }//GEN-LAST:event_Salario_TxtKeyPressed

    private void Antiguedad_CMBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Antiguedad_CMBKeyPressed
        
        WinTool.WaitEnter(evt, HoraExtra_Txt);
        
    }//GEN-LAST:event_Antiguedad_CMBKeyPressed

    private void HoraExtra_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HoraExtra_TxtKeyPressed
        
        WinTool.WaitEnter(evt, TipoCargo_CMB);
        
    }//GEN-LAST:event_HoraExtra_TxtKeyPressed

    private void TipoCargo_CMBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoCargo_CMBKeyPressed
        
        WinTool.WaitEnter(evt, AgregarSalario_Btn);
        
    }//GEN-LAST:event_TipoCargo_CMBKeyPressed

    private void Buscar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_BtnActionPerformed
        
        String Search = Buscar_Txt.getText().trim();
        String[] Titulos = {"Cargo", "Salario Mensual", "Ingresos por antiguedad", "Ingreso por hora extra", "Tipo de cargo"};
        String[] Registros = new String[5];
        
        DefaultTableModel Model = new DefaultTableModel(Titulos, 0);
        
        try {
            
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from salariosbase where Cargo like '%"+ Search +"%'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.isBeforeFirst()){
                
                while(rs.next()){
                    
                    Registros[0] = rs.getString("Cargo");
                    Registros[1] = Float.toString(rs.getFloat("SalarioMensual"));
                    Registros[2] = rs.getString("Antiguedad");
                    Registros[3] = Float.toString(rs.getFloat("HoraExtra"));
                    Registros[4] = rs.getString("TipoDeCargo");
                    
                    Model.addRow(Registros);
                    
                    Salarios_Tbl.setModel(Model);
                    
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias.", " -  Mensaje de error",
                            0, WinTool.GetIcon("src/JOIcons/Error JO.png"));
                
                
            }
            
        } catch (SQLException e) {
            
            System.err.println("Error al filtar usuario. "+ e);
            JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error", 0,
                        WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));
            
        }
        
        Buscar_Txt.setText("");
        
    }//GEN-LAST:event_Buscar_BtnActionPerformed

    private void Buscar_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Buscar_TxtKeyPressed
        
        WinTool.WaitEnter(evt, Buscar_Btn);
        
    }//GEN-LAST:event_Buscar_TxtKeyPressed

    private void Cargo_Txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cargo_Txt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cargo_Txt1KeyPressed

    private void Salario_Txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Salario_Txt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salario_Txt1KeyPressed

    private void HoraExtra_Txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HoraExtra_Txt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraExtra_Txt1KeyPressed

    private void EditarSalario_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarSalario_BtnActionPerformed
        
        //Reset Warnings.
        jLabel15.setText("");
        jLabel16.setText("");
        jLabel17.setText("");
        
        
        //Variables.
        int V = 0;
        String Antiguedad = "", TipoCargo = "";
        
        
        //Validando campos vacios.
        if(Cargo_Txt1.getText().equals("")){
            
            V++;
            jLabel15.setText("!");
            
        }if(Salario_Txt1.getText().equals("")){
            
            V++;
            jLabel16.setText("!");
            
        }if(HoraExtra_Txt1.getText().equals("")){
            
            V++;
            jLabel17.setText("!");
            
        }
        
        
        //Obteniendo la antiguedad.
        if(Antiguedad_CMB1.getSelectedIndex() == 0){
            
            Antiguedad = "12%";
            
        }if(Antiguedad_CMB1.getSelectedIndex() == 1){
            
            Antiguedad = "10%";
            
        }if(Antiguedad_CMB1.getSelectedIndex() == 2){
            
            Antiguedad = "08%";
            
        }if(Antiguedad_CMB1.getSelectedIndex() == 3){
            
            Antiguedad = "06%";
            
        }
        
        
        //Obteniendo tipo de cargo.
        if(TipoCargo_CMB1.getSelectedIndex() == 0){
            
            TipoCargo = "Gerencial";
            
        }if(TipoCargo_CMB1.getSelectedIndex() == 1){
            
            TipoCargo = "Administrativo";
            
        }if(TipoCargo_CMB1.getSelectedIndex() == 2){
            
            TipoCargo = "Operativo";
            
        }
        
        
        if(V == 0){
            
            try {
            
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select Cargo from salariosbase where Cargo = '"+ Cargo_Txt1.getText() +"'"
                                + " and not IDSalario = '"+ IDSalario_Update +"'");

                ResultSet rs = pst.executeQuery();

                if(rs.next()){

                    JOptionPane.showMessageDialog(null, "Cargo ya existente, por favor ingresar uno nuevo.", " -  Mensaje de advertencia",
                            0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));

                    Cargo_Txt1.setText("");
                    jLabel15.setText("!");

                }else{
                    
                    if( (Val.IsAFloat(Salario_Txt1.getText()) == true) && (Val.IsAFloat(HoraExtra_Txt1.getText()) == true) ){
                        
                        try {
                        
                            Connection cn2 = Conexion.Conectar();
                            PreparedStatement pst2 = cn2.prepareStatement(
                                    "update salariosbase set Cargo = '"+ Cargo_Txt1.getText() +"', SalarioMensual = ?, Antiguedad = ?, HoraExtra = ?, "
                                            + "TipoDeCargo = ? where IDSalario = '"+ IDSalario_Update +"'");

                            pst2.setFloat(1, Float.parseFloat(Salario_Txt1.getText()));
                            pst2.setString(2, Antiguedad);
                            pst2.setFloat(3, Float.parseFloat(HoraExtra_Txt1.getText()));
                            pst2.setString(4, TipoCargo);
                            pst2.executeUpdate();
                            
                            Salarios_Tbl.setModel(WinTool.MostrarSalariosBase());

                            JOptionPane.showMessageDialog(null, "Salario base actualizado exitosamente.", " -  Mensaje de información",
                                0, WinTool.GetIcon("src/JOIcons/Info JO.png"));
                            
                            Cargo_Txt1.setText("");
                            Salario_Txt1.setText("");
                            Antiguedad_CMB1.setSelectedIndex(0);
                            HoraExtra_Txt1.setText("");
                            TipoCargo_CMB1.setSelectedIndex(0);

                            Editar.setVisible(false);

                            cn.close();
                            cn2.close();

                        } catch (SQLException e) {

                            System.err.println("Error al actualizar salario base. "+ e);
                            JOptionPane.showMessageDialog(null, "Error de conexión.",
                                    " -  Mensaje de error", 0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

                        }
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo datos numericos para 'Salario Mensual'\n"
                                + "e 'Ingreso por hora extra'.",
                                " -  Mensaje de advertencia", 0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
                                
                        jLabel17.setText("!");
                        jLabel16.setText("!");
                        
                    }
                    
                    
                }

            } catch (SQLException e) {

                System.err.println("Error al validar Cargo. "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.",
                        " -  Mensaje de error", 0, WinTool.GetIcon("src/JOIcons/ErrorConexion JO.png"));

            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por favor, rellenar todos los campos vacios.", " -  Mensaje de advertencia",
                            0, WinTool.GetIcon("src/JOIcons/Advertencia JO.png"));
            
        }
        
    }//GEN-LAST:event_EditarSalario_BtnActionPerformed

    private void Antiguedad_CMB1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Antiguedad_CMB1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Antiguedad_CMB1KeyPressed

    private void TipoCargo_CMB1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoCargo_CMB1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoCargo_CMB1KeyPressed

    private void Volver_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_BtnActionPerformed
        
        Editar.setVisible(false);
        
        Cargo_Txt1.setText("");
        Salario_Txt1.setText("");
        Antiguedad_CMB1.setSelectedIndex(0);
        HoraExtra_Txt1.setText("");
        TipoCargo_CMB1.setSelectedIndex(0);
        
    }//GEN-LAST:event_Volver_BtnActionPerformed

   
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
            java.util.logging.Logger.getLogger(SalarioBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalarioBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalarioBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalarioBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalarioBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_Btn;
    private javax.swing.JFrame Agregar;
    private javax.swing.JButton AgregarSalario_Btn;
    private javax.swing.JMenuItem Agregar_Btn;
    private javax.swing.JComboBox<String> Antiguedad_CMB;
    private javax.swing.JComboBox<String> Antiguedad_CMB1;
    private javax.swing.JLabel Ayuda_Lbl;
    private javax.swing.JButton Buscar_Btn;
    private javax.swing.JTextField Buscar_Txt;
    private javax.swing.JTextField Cargo_Txt;
    private javax.swing.JTextField Cargo_Txt1;
    private javax.swing.JLabel Consejo_Lbl;
    private javax.swing.JFrame Editar;
    private javax.swing.JButton EditarSalario_Btn;
    private javax.swing.JButton Editar_Btn;
    private javax.swing.JButton Eliminar_Btn;
    private javax.swing.JComboBox<String> Filtro_Cmb;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JLabel Fondo_Lbl2;
    private javax.swing.JLabel Fondo_Lbl3;
    private javax.swing.JTextField HoraExtra_Txt;
    private javax.swing.JTextField HoraExtra_Txt1;
    private javax.swing.JLabel Mostrar_Lbl;
    private javax.swing.JTextField Salario_Txt;
    private javax.swing.JTextField Salario_Txt1;
    private javax.swing.JTable Salarios_Tbl;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JLabel TblName_Lbl;
    private javax.swing.JComboBox<String> TipoCargo_CMB;
    private javax.swing.JComboBox<String> TipoCargo_CMB1;
    private javax.swing.JLabel Titulo2_Lbl;
    private javax.swing.JLabel Titulo2_Lbl1;
    private javax.swing.JButton Volver_Btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
