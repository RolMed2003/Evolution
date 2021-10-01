package ventanas_nomina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import metodos.Conexion;
import metodos.FicheroTool;
import metodos.PlaceHolder;
import metodos.WindowTool;
import ventanas.Login;


public class ManageEmp extends javax.swing.JFrame {

    //Metodos.
    WindowTool metodo = new WindowTool();
    FicheroTool FiTool = new FicheroTool();
    
    
    //Variables.
    String Username_Sesion = Login.Username_Sesion;
    String NoINNS;
    
    
    public ManageEmp() {
        
        initComponents();
        
        
        //Modelando ventana.
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle(" -  Menu gestión de empleado.");
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Fondo.
        Fondo_Lbl.setIcon(metodo.SetFondo(Fondo_Lbl, "src/icons/Fondo2.jpg"));
        this.repaint();
        
        
        //Icono de ventana.
        this.setIconImage(metodo.GetIconImage("icons/Logo.jpg"));
        
        
        //PlaceHolder.
        PlaceHolder PH = new PlaceHolder("No. INSS", Buscar_Txt);
        
        
        //Setting tablemodel.
        Empleados_Tbl.setModel(metodo.MostrarEmpleados());
        
        
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
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo_Lbl = new javax.swing.JLabel();
        Buscar_Lbl = new javax.swing.JLabel();
        Buscar_Txt = new javax.swing.JTextField();
        Buscar_Btn = new javax.swing.JButton();
        Mostrar_Lbl = new javax.swing.JLabel();
        Filtro_Cmb = new javax.swing.JComboBox<>();
        Actualizar_Btn = new javax.swing.JButton();
        TblName_Lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Empleados_Tbl = new javax.swing.JTable();
        Editar_Btn = new javax.swing.JButton();
        Ayuda_Lbl = new javax.swing.JLabel();
        Consejo_Lbl = new javax.swing.JLabel();
        Eliminar_Btn = new javax.swing.JButton();
        Fondo_Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saludo_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Saludo_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Saludo_Lbl.setText("Gestión de empleado.");
        getContentPane().add(Saludo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Buscar_Lbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Buscar_Lbl.setForeground(new java.awt.Color(204, 204, 204));
        Buscar_Lbl.setText("Buscar:");
        getContentPane().add(Buscar_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 93, -1, -1));

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
        Filtro_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
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
        TblName_Lbl.setText("Tabla de empleados");
        getContentPane().add(TblName_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 170, -1));

        Empleados_Tbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Empleados_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Username", "Estado", "Nivel de acceso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(Empleados_Tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 820, 370));

        Editar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Editar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Editar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Editar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/Ver mas x32.png"))); // NOI18N
        Editar_Btn.setText("Ver más");
        Editar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

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

        Eliminar_Btn.setBackground(new java.awt.Color(51, 51, 51));
        Eliminar_Btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Eliminar_Btn.setForeground(new java.awt.Color(204, 204, 204));
        Eliminar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_x32/EliminarRegistro x32.png"))); // NOI18N
        Eliminar_Btn.setText("Eliminar");
        Eliminar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));
        getContentPane().add(Fondo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buscar_TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Buscar_TxtKeyPressed

        metodo.WaitEnter(evt, Buscar_Btn);

    }//GEN-LAST:event_Buscar_TxtKeyPressed

    private void Buscar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_BtnActionPerformed

        String Search = Buscar_Txt.getText().trim();
        String[] Titulos = {"No. INSS", "Nombre", "Telefono", "Cargo", "Estado"};
        String[] Registros = new String[5];

        DefaultTableModel Model = new DefaultTableModel(Titulos, 0);

        try {

            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                "select * from EmpleAdos where NumeroINSS like '%"+ Search +"%'");

            ResultSet rs = pst.executeQuery();

            if(rs.isBeforeFirst()){

                while(rs.next()){

                    Registros[0] = rs.getString("NumeroINSS");
                    Registros[1] = rs.getString("Nombre");
                    Registros[2] = rs.getString("Telefono");
                    Registros[3] = rs.getString("Cargo");
                    Registros[4] = rs.getString("Estado");

                    Model.addRow(Registros);

                    Empleados_Tbl.setModel(Model);

                }

            }else{

                JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias.");

            }

        } catch (SQLException e) {

            System.err.println("Error al filtar empleado. "+ e);
            JOptionPane.showMessageDialog(null, "Error de conexiòn.", " -  Mensaje de error",
                                0, metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));

        }

        Buscar_Txt.setText("");

    }//GEN-LAST:event_Buscar_BtnActionPerformed

    private void Filtro_CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro_CmbActionPerformed

        int SelectedIndex = Filtro_Cmb.getSelectedIndex();
        DefaultTableModel Model = (DefaultTableModel) Empleados_Tbl.getModel();

        switch(SelectedIndex){

            case 0:

            Empleados_Tbl.setModel(metodo.MostrarEmpleados());
            break;

            case 1:

            Empleados_Tbl.setModel(metodo.FiltrarEmpleados("Activo", Model));
            break;

            case 2:

            Empleados_Tbl.setModel(metodo.FiltrarEmpleados("Inactivo", Model));
            break;

            default:

            break;

        }

    }//GEN-LAST:event_Filtro_CmbActionPerformed

    private void Actualizar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_BtnActionPerformed

        Empleados_Tbl.setModel(metodo.MostrarEmpleados());

    }//GEN-LAST:event_Actualizar_BtnActionPerformed

    private void Editar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_BtnActionPerformed

        

    }//GEN-LAST:event_Editar_BtnActionPerformed

    private void Ayuda_LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ayuda_LblMouseClicked

        Ayuda_Lbl.setVisible(false);
        Consejo_Lbl.setVisible(false);

        Object[] Options = {"De acuerdo"};

        int Option = JOptionPane.showOptionDialog(null, "Puedes utilizar Ctrl para seleccionar varios registros\ny luego eliminarlos"
            + " a la vez.", " -  Ayuda", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            metodo.GetIcon("src/JOIcons/Idea JO.png"), Options, Options[0]);

    }//GEN-LAST:event_Ayuda_LblMouseClicked

    private void Eliminar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_BtnActionPerformed

        int[] Delete = new int[Empleados_Tbl.getSelectedRowCount()];
        int Cont = 0;

        Delete = Empleados_Tbl.getSelectedRows();

        for (int i = 0; i < Delete.length; i++) {

            NoINNS = (String) (Empleados_Tbl.getValueAt(Delete[i], 0));

            try {

                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "delete from empleados where NumeroINSS = '"+ NoINNS +"'");

                if(!pst.execute()){

                    Cont++;

                    if((Cont == (Delete.length)) && (Delete.length > 1)){

                        JOptionPane.showMessageDialog(null, "Registros eliminados.");

                    }else if((Cont == (Delete.length)) && (Delete.length == 1)){

                        JOptionPane.showMessageDialog(null, "Registro eliminado.");

                    }

                }

            } catch (SQLException e) {

                System.err.println("Error al eliminar registros de la tabla empleados. "+ e);
                JOptionPane.showMessageDialog(null, "Error de conexión.", " -  Mensaje de error", 0,
                        metodo.GetIcon("src/JOIcons/ErrorConexion JO.png"));

            }

        }

        Empleados_Tbl.setModel(metodo.MostrarEmpleados());

    }//GEN-LAST:event_Eliminar_BtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_Btn;
    private javax.swing.JLabel Ayuda_Lbl;
    private javax.swing.JButton Buscar_Btn;
    private javax.swing.JLabel Buscar_Lbl;
    private javax.swing.JTextField Buscar_Txt;
    private javax.swing.JLabel Consejo_Lbl;
    private javax.swing.JButton Editar_Btn;
    private javax.swing.JButton Eliminar_Btn;
    private javax.swing.JTable Empleados_Tbl;
    private javax.swing.JComboBox<String> Filtro_Cmb;
    private javax.swing.JLabel Fondo_Lbl;
    private javax.swing.JLabel Mostrar_Lbl;
    private javax.swing.JLabel Saludo_Lbl;
    private javax.swing.JLabel TblName_Lbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
