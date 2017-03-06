/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.awt.Color;
import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListModel;

/**
 *
 * @author denni
 */
public class Frame extends javax.swing.JFrame {

    Color color;
    int NumTicket;
    int ID;
    int NumJefes = 0;
    ArrayList<Cliente> ListaClientes = new ArrayList<>();
    ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
    ArrayList<String> ListaIngredientes = new ArrayList<>();
    ArrayList<Gato> ListaGatos = new ArrayList<>();
    ArrayList<Baleada> ListaBaleadas = new ArrayList<>();
    ArrayList<Venta> ListaVentas = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    DefaultListModel model1 = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    SaveData Data = new SaveData(this);

    public Frame() {
        initComponents();
        //
        JD1_CB_Trabajos.removeAllItems();
        JD1_CB_Trabajos.addItem("Venta de Gatos");
        JD1_CB_Trabajos.addItem("Venta de Baleadas");
        JD1_CB_Trabajos.addItem("Cocina");
        //
        CB_JD5_Tablas.removeAllItems();
        CB_JD5_Tablas.addItem("Clientes");
        CB_JD5_Tablas.addItem("Empleados");
        CB_JD5_Tablas.addItem("Familiares");
        //
        CB_JD4_Ingredientes.removeAllItems();
        CB_JD4_Ingredientes.addItem("Lechuga");
        CB_JD4_Ingredientes.addItem("Carne");
        CB_JD4_Ingredientes.addItem("Mantequilla");
        //
        ListaEmpleados = Data.LoadEmpleados();
        ListaClientes = Data.LoadClientes();
        ListaVentas = Data.LoadVentas();
        System.out.println(ListaEmpleados.size());
        System.out.println(ListaClientes.size());
        System.out.println(ListaVentas.size());
        //
        CB_JD7_Empleados.removeAllItems();
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            CB_JD7_Empleados.addItem(ListaEmpleados.get(i).getNombre());
        }
        CB_JD8_Clientes.removeAllItems();
        for (int i = 0; i < ListaClientes.size(); i++) {
            CB_JD8_Clientes.addItem(ListaClientes.get(i).getNombre());
        }
        //
        
        //
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_AgregarEmpleado = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        JD1_TF_Nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JD1_TF_Nacionalidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JD1_SP_Edad = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        JD1_TF_Nacimiento = new javax.swing.JTextField();
        JD1_CB_Trabajos = new javax.swing.JComboBox<String>();
        SP_JD1_HIn = new javax.swing.JSpinner();
        SP_JD1_MIn = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        SP_JD1_HOut = new javax.swing.JSpinner();
        SP_JD1_MOut = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        CHB_Jefe = new javax.swing.JCheckBox();
        JD_AgregarPersona = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JD_AgregarCliente = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JD3_TF_Nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JD_3_TF_Nacionalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JD3_SP_Edad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JD3_TF_Ticket = new javax.swing.JTextField();
        JD3_TF_Dinero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JD3_TF_Nacimiento = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        JD_AgregarOrden = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_JD4_Orden = new javax.swing.JList<String>();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        TF_JD4_Peso = new javax.swing.JTextField();
        TF_JD$_Altura = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JL_JD4_Ingredientes = new javax.swing.JList<String>();
        jButton13 = new javax.swing.JButton();
        CB_JD4_Ingredientes = new javax.swing.JComboBox<String>();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CB_JD4_Empleado = new javax.swing.JComboBox<String>();
        jLabel22 = new javax.swing.JLabel();
        CB_JD4_Cliente = new javax.swing.JComboBox<String>();
        jTextField5 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        JD_Listar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Tabla = new javax.swing.JTable();
        CB_JD5_Tablas = new javax.swing.JComboBox<String>();
        jButton7 = new javax.swing.JButton();
        JD_ReporteVentas = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        JT_Tabla2 = new javax.swing.JTable();
        JD_ModificarEmpleado = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        JD7_TF_Nombre = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        JD7_TF_Nacionalidad = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        SP_JD7_Edad = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        JD7_TF_Nacimiento = new javax.swing.JTextField();
        JD7_CB_Trabajos = new javax.swing.JComboBox<String>();
        SP_JD7_HIn = new javax.swing.JSpinner();
        SP_JD7_MIn = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        SP_JD7_HOut = new javax.swing.JSpinner();
        SP_JD7_MOut = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        CB_JD7_Empleados = new javax.swing.JComboBox();
        jButton12 = new javax.swing.JButton();
        JD_ModificarCliente = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        TF_JD8_Nombre = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        TF_JD8_Nacionalidad = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        SP_JD8_Edad = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        TF_JD8_Ticket = new javax.swing.JTextField();
        TF_JD8_Dinero = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        TF_JD8_Nacimiento = new javax.swing.JTextField();
        CB_JD8_Clientes = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        JD_Remover = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        CB_JD9_DelEmpleados = new javax.swing.JComboBox();
        CB_JD9_delClientes = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jLabel13.setText("Nombre");

        jLabel14.setText("Nacionalidad");

        jLabel15.setText("Nacimiento");

        jLabel16.setText("Edad");

        jLabel17.setText("Color");

        jButton5.setText("jButton2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel18.setText("Trabajo");

        JD1_CB_Trabajos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setText("Hora de Entrada");

        jLabel21.setText("Hora de Salida");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JD1_TF_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JD1_TF_Nacionalidad)
                    .addComponent(JD1_SP_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(JD1_TF_Nacimiento)
                    .addComponent(JD1_CB_Trabajos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SP_JD1_HOut, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(SP_JD1_HIn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SP_JD1_MIn)
                            .addComponent(SP_JD1_MOut))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD1_TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD1_TF_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD1_TF_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD1_SP_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD1_CB_Trabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SP_JD1_HIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD1_MIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SP_JD1_HOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD1_MOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton6.setText("Agregar Empleado");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        CHB_Jefe.setText("Jefe?");

        javax.swing.GroupLayout JD_AgregarEmpleadoLayout = new javax.swing.GroupLayout(JD_AgregarEmpleado.getContentPane());
        JD_AgregarEmpleado.getContentPane().setLayout(JD_AgregarEmpleadoLayout);
        JD_AgregarEmpleadoLayout.setHorizontalGroup(
            JD_AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(JD_AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(CHB_Jefe))
                .addContainerGap())
        );
        JD_AgregarEmpleadoLayout.setVerticalGroup(
            JD_AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_AgregarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(CHB_Jefe)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JD_AgregarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))))
        );

        jLabel1.setText("Nombre");

        jTextField1.setText("jTextField1");

        jLabel2.setText("Nacionalidad");

        jTextField2.setText("jTextField1");

        jLabel3.setText("Nacimiento");

        jLabel4.setText("Edad");

        jLabel5.setText("Color");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinner1))
                    .addComponent(jButton2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout JD_AgregarPersonaLayout = new javax.swing.GroupLayout(JD_AgregarPersona.getContentPane());
        JD_AgregarPersona.getContentPane().setLayout(JD_AgregarPersonaLayout);
        JD_AgregarPersonaLayout.setHorizontalGroup(
            JD_AgregarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        JD_AgregarPersonaLayout.setVerticalGroup(
            JD_AgregarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_AgregarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_AgregarPersonaLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setText("Nombre");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Nacimiento");

        jLabel9.setText("Edad");

        jLabel10.setText("Color");

        jButton3.setText("jButton2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("#Ticket");

        JD3_TF_Ticket.setText("jTextField5");
        JD3_TF_Ticket.setEnabled(false);

        jLabel12.setText("Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JD3_TF_Dinero)
                    .addComponent(JD3_TF_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JD_3_TF_Nacionalidad)
                    .addComponent(JD3_SP_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(JD3_TF_Ticket, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JD3_TF_Nacimiento))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD3_TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD_3_TF_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD3_TF_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD3_SP_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(JD3_TF_Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JD3_TF_Dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jButton4.setText("Crear Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_AgregarClienteLayout = new javax.swing.GroupLayout(JD_AgregarCliente.getContentPane());
        JD_AgregarCliente.getContentPane().setLayout(JD_AgregarClienteLayout);
        JD_AgregarClienteLayout.setHorizontalGroup(
            JD_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        JD_AgregarClienteLayout.setVerticalGroup(
            JD_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(JD_AgregarClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JL_JD4_Orden.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JL_JD4_Orden);

        jLabel23.setText("Gatos");

        jLabel25.setText("Peso");

        jLabel26.setText("Altura");

        jButton8.setText("Agregar Gato");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_JD4_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_JD$_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(TF_JD4_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TF_JD$_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jLabel24.setText("Baleadas");

        jButton9.setText("Agregar Baleada");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        JL_JD4_Ingredientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(JL_JD4_Ingredientes);

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        CB_JD4_Ingredientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CB_JD4_Ingredientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_JD4_Ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap())
        );

        jLabel19.setText("Empleado");

        CB_JD4_Empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Cliente");

        CB_JD4_Cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField5.setText("jTextField5");

        jLabel27.setText("Precio Total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(CB_JD4_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(CB_JD4_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(CB_JD4_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(CB_JD4_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.setText("Nueva Orden");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_AgregarOrdenLayout = new javax.swing.GroupLayout(JD_AgregarOrden.getContentPane());
        JD_AgregarOrden.getContentPane().setLayout(JD_AgregarOrdenLayout);
        JD_AgregarOrdenLayout.setHorizontalGroup(
            JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_AgregarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_AgregarOrdenLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        JD_AgregarOrdenLayout.setVerticalGroup(
            JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AgregarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_AgregarOrdenLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(JD_AgregarOrdenLayout.createSequentialGroup()
                        .addGroup(JD_AgregarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        JT_Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_Tabla);

        CB_JD5_Tablas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_ListarLayout = new javax.swing.GroupLayout(JD_Listar.getContentPane());
        JD_Listar.getContentPane().setLayout(JD_ListarLayout);
        JD_ListarLayout.setHorizontalGroup(
            JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB_JD5_Tablas, 0, 115, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JD_ListarLayout.setVerticalGroup(
            JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_ListarLayout.createSequentialGroup()
                        .addComponent(CB_JD5_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        JT_Tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(JT_Tabla2);

        javax.swing.GroupLayout JD_ReporteVentasLayout = new javax.swing.GroupLayout(JD_ReporteVentas.getContentPane());
        JD_ReporteVentas.getContentPane().setLayout(JD_ReporteVentasLayout);
        JD_ReporteVentasLayout.setHorizontalGroup(
            JD_ReporteVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ReporteVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addContainerGap())
        );
        JD_ReporteVentasLayout.setVerticalGroup(
            JD_ReporteVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ReporteVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel28.setText("Nombre");

        jLabel29.setText("Nacionalidad");

        jLabel30.setText("Nacimiento");

        jLabel31.setText("Edad");

        jLabel32.setText("Color");

        jButton11.setText("jButton2");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel33.setText("Trabajo");

        JD7_CB_Trabajos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel34.setText("Hora de Entrada");

        jLabel35.setText("Hora de Salida");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(104, 104, 104)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JD7_TF_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JD7_TF_Nacionalidad)
                    .addComponent(SP_JD7_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(JD7_TF_Nacimiento)
                    .addComponent(JD7_CB_Trabajos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SP_JD7_HOut, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(SP_JD7_HIn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SP_JD7_MIn)
                            .addComponent(SP_JD7_MOut))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD7_TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD7_TF_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD7_TF_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD7_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JD7_CB_Trabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SP_JD7_HIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD7_MIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SP_JD7_HOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD7_MOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        CB_JD7_Empleados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_JD7_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_JD7_EmpleadosActionPerformed(evt);
            }
        });

        jButton12.setText("Modificar Empleado");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_ModificarEmpleadoLayout = new javax.swing.GroupLayout(JD_ModificarEmpleado.getContentPane());
        JD_ModificarEmpleado.getContentPane().setLayout(JD_ModificarEmpleadoLayout);
        JD_ModificarEmpleadoLayout.setHorizontalGroup(
            JD_ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JD_ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(CB_JD7_Empleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JD_ModificarEmpleadoLayout.setVerticalGroup(
            JD_ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_ModificarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_JD7_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JD_ModificarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))))
        );

        jLabel36.setText("Nombre");

        jLabel37.setText("Nacionalidad");

        jLabel38.setText("Nacimiento");

        jLabel39.setText("Edad");

        jLabel40.setText("Color");

        jButton14.setText("jButton2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel41.setText("#Ticket");

        TF_JD8_Ticket.setText("jTextField5");
        TF_JD8_Ticket.setEnabled(false);

        jLabel42.setText("Dinero");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_JD8_Dinero)
                    .addComponent(TF_JD8_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_JD8_Nacionalidad)
                    .addComponent(SP_JD8_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(TF_JD8_Ticket, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_JD8_Nacimiento))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_JD8_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_JD8_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_JD8_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_JD8_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(TF_JD8_Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_JD8_Dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        CB_JD8_Clientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_JD8_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_JD8_ClientesActionPerformed(evt);
            }
        });

        jButton15.setText("Modificar Cliente");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_ModificarClienteLayout = new javax.swing.GroupLayout(JD_ModificarCliente.getContentPane());
        JD_ModificarCliente.getContentPane().setLayout(JD_ModificarClienteLayout);
        JD_ModificarClienteLayout.setHorizontalGroup(
            JD_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JD_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ModificarClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CB_JD8_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JD_ModificarClienteLayout.setVerticalGroup(
            JD_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_ModificarClienteLayout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_JD8_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JD_ModificarClienteLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))))
        );

        CB_JD9_DelEmpleados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CB_JD9_delClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB_JD9_DelEmpleados, 0, 105, Short.MAX_VALUE)
                    .addComponent(CB_JD9_delClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CB_JD9_DelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(CB_JD9_delClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jButton16.setText("jButton16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("jButton16");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_RemoverLayout = new javax.swing.GroupLayout(JD_Remover.getContentPane());
        JD_Remover.getContentPane().setLayout(JD_RemoverLayout);
        JD_RemoverLayout.setHorizontalGroup(
            JD_RemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_RemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JD_RemoverLayout.setVerticalGroup(
            JD_RemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_RemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_RemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenu3.setText("Agregar");

        jMenuItem1.setText("Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setText("Orden");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenu4.setText("Eliminar");

        jMenuItem2.setText("Remover de Listas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu1.add(jMenu4);

        jMenu5.setText("Listar");

        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu1.add(jMenu5);

        jMenu6.setText("Modificar");

        jMenuItem8.setText("Modificar Empleado");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Modificar Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Venta");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Reporte de Ventas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Guardar");

        jMenuItem7.setText("Guardar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem10.setText("Guardar Como");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setText("Cargar Datos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JD_AgregarEmpleado.pack();
        JD_AgregarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.color = JColorChooser.showDialog(this, "algo", Color.yellow);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.color = JColorChooser.showDialog(this, "Color", Color.BLACK);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int Edad = (int) (JD3_SP_Edad.getValue());
        int IDh = this.ID;
        this.ID++;
        String Nacionalidad = JD_3_TF_Nacionalidad.getText();
        String Nacimiento = JD3_TF_Nacimiento.getText();
        String Nombre = JD3_TF_Nombre.getText();
        Color Piel = color;
        int numTicket = NumTicket;
        this.NumTicket++;
        double Dinero = Double.parseDouble(JD3_TF_Dinero.getText());
        Cliente e = new Cliente(numTicket, Dinero, Edad, IDh, Nacionalidad, Nacimiento, Nombre, Piel);
        ListaClientes.add(e);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.color = JColorChooser.showDialog(this, "Color", Color.BLACK);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Time Entrada = new Time((int) SP_JD1_HIn.getValue(), (int) SP_JD1_MIn.getValue(), 0);
        Time Salida = new Time((int) SP_JD1_HOut.getValue(), (int) SP_JD1_MOut.getValue(), 0);
        String Nombre = JD1_TF_Nombre.getText();
        String Nacionalidad = JD1_TF_Nacionalidad.getText();
        String Nacimiento = JD1_TF_Nacimiento.getText();
        int Edad = (int) JD1_SP_Edad.getValue();
        String Trabajo = JD1_CB_Trabajos.getSelectedItem().toString();
        ID++;
        Empleado e = new Empleado(Trabajo, Entrada, Salida, Edad, Trabajo, Edad, ID, Nacionalidad, Nacimiento, Nombre, color);
        if (CHB_Jefe.isSelected()) {
            if (VerificarJefe(e.getNombre(), e.getPiel())) {
                e.setJefe(true);
                NumJefes++;
            } else {
                JOptionPane.showMessageDialog(this, "Usted no puede ser jefe por NEGRO LATINO HUEVON QUE SE LLAMA " + e.getNombre() + "!!!");
            }
        }
        ListaEmpleados.add(e);
        JOptionPane.showMessageDialog(this, "Empleado Agregado Exitosamente");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JD_AgregarCliente.pack();
        JD_AgregarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        CB_JD4_Cliente.removeAllItems();
        CB_JD4_Empleado.removeAllItems();
        for (int i = 0; i < ListaClientes.size(); i++) {
            CB_JD4_Cliente.addItem(ListaClientes.get(i).getNombre());
        }
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            CB_JD4_Empleado.addItem(ListaEmpleados.get(i).getNombre());
        }
        ListaIngredientes = new ArrayList();
        ListaGatos = new ArrayList();
        JL_JD4_Ingredientes.setModel(model1);
        JL_JD4_Orden.setModel(model2);
        JD_AgregarOrden.pack();
        JD_AgregarOrden.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.model = new DefaultTableModel();
        model.addColumn("Edad");
        model.addColumn("ID");
        model.addColumn("Nacionalidad");
        model.addColumn("Nacimiento");
        model.addColumn("Nombre");
        model.addColumn("Piel");
        if (ListaClientes.size() >= 0) {
            Object[] o = new Object[model.getColumnCount()];
            for (int i = 0; i < ListaClientes.size(); i++) {
                o[0] = ListaClientes.get(i).getEdad();
                o[1] = ListaClientes.get(i).getID();
                o[2] = ListaClientes.get(i).getNacionalidad();
                o[3] = ListaClientes.get(i).getNacimiento();
                o[4] = ListaClientes.get(i).getNombre();
                o[5] = ListaClientes.get(i).getPiel();
                model.addRow(o);
            }
        }
        JT_Tabla.setModel(model);
        JD_Listar.pack();
        JD_Listar.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int op = CB_JD5_Tablas.getSelectedIndex();
        System.out.println("op: " + op);
        switch (op) {
            case 0:
                this.model = new DefaultTableModel();
                model.addColumn("Edad");
                model.addColumn("ID");
                model.addColumn("Nacionalidad");
                model.addColumn("Nacimiento");
                model.addColumn("Nombre");
                model.addColumn("Piel");
                if (ListaClientes.size() >= 0) {
                    Object[] o = new Object[model.getColumnCount()];
                    for (int i = 0; i < ListaClientes.size(); i++) {
                        o[0] = ListaClientes.get(i).getEdad();
                        o[1] = ListaClientes.get(i).getID();
                        o[2] = ListaClientes.get(i).getNacionalidad();
                        o[3] = ListaClientes.get(i).getNacimiento();
                        o[4] = ListaClientes.get(i).getNombre();
                        o[5] = ListaClientes.get(i).getPiel();
                        model.addRow(o);
                    }
                }
                JT_Tabla.setModel(model);
                break;

            case 1:
                this.model = new DefaultTableModel();
                model.addColumn("Trabajo");
                model.addColumn("Entrada");
                model.addColumn("Salida");
                model.addColumn("Sueldo");
                model.addColumn("Estado");
                model.addColumn("Edad");
                model.addColumn("ID");
                model.addColumn("Nacionalidad");
                model.addColumn("Nacimiento");
                model.addColumn("Nombre");
                if (ListaEmpleados.size() >= 0) {
                    Object[] o = new Object[model.getColumnCount()];
                    for (int i = 0; i < ListaEmpleados.size(); i++) {
                        o[0] = ListaEmpleados.get(i).getTrabajo();
                        o[1] = ListaEmpleados.get(i).getEntrada();
                        o[2] = ListaEmpleados.get(i).getSalida();
                        o[3] = ListaEmpleados.get(i).getSueldo();
                        o[4] = ListaEmpleados.get(i).getEstado();
                        o[5] = ListaEmpleados.get(i).getEdad();
                        o[6] = ListaEmpleados.get(i).getID();
                        o[7] = ListaEmpleados.get(i).getNacionalidad();
                        o[8] = ListaEmpleados.get(i).getNacimiento();
                        o[9] = ListaEmpleados.get(i).getNombre();
                        model.addRow(o);
                    }
                }
                JT_Tabla.setModel(model);
                break;
            case 2:

                break;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cliente");
        model.addColumn("Empleado");
        model.addColumn("Cantidad");
        model.addColumn("Total");
        model.addColumn("Fecha");
        if (ListaVentas.size() >= 0) {
            Object[] o = new Object[model.getColumnCount()];
            for (int i = 0; i < ListaVentas.size(); i++) {
                o[0] = ListaVentas.get(i).getCliente();
                o[1] = ListaVentas.get(i).getEmpleado();
                o[2] = ListaVentas.get(i).getCantidad();
                o[3] = ListaVentas.get(i).getTotal();
                o[4] = ListaVentas.get(i).getFecha();
                model.addRow(o);
            }
        }
        JT_Tabla2.setModel(model);
        JD_ReporteVentas.pack();
        JD_ReporteVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        model1.addElement(CB_JD4_Ingredientes.getSelectedItem().toString());
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        double Peso = Double.parseDouble(TF_JD4_Peso.getText());
        double Altura = Double.parseDouble(TF_JD$_Altura.getText());
        Gato g = new Gato(Peso, Altura);
        ListaGatos.add(g);
        actualizar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Baleada B = new Baleada();
        for (int i = 0; i < model1.getSize(); i++) {
            B.addIngrediente(model1.get(i).toString());
        }
        ListaBaleadas.add(B);
        model1.removeAllElements();
        actualizar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int i = CB_JD4_Empleado.getSelectedIndex();
        int j = CB_JD4_Cliente.getSelectedIndex();
        Empleado p = ListaEmpleados.get(i);
        Cliente c = ListaClientes.get(j);
        Venta v = new Venta(c.getNombre(), p.getNombre(), model2.getSize(), (model2.getSize() * 5));
        ListaVentas.add(v);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Data.Save();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CB_JD7_Empleados.removeAllItems();
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            CB_JD7_Empleados.addItem(ListaEmpleados.get(i).getNombre());
        }
        JD7_CB_Trabajos.removeAllItems();
        JD7_CB_Trabajos.addItem("Venta de Gatos");
        JD7_CB_Trabajos.addItem("Venta de Baleadas");
        JD7_CB_Trabajos.addItem("Cocina");
        JD_ModificarEmpleado.pack();
        JD_ModificarEmpleado.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        color = JColorChooser.showDialog(this, "Color", color);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CB_JD7_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_JD7_EmpleadosActionPerformed
        int i;
        i = CB_JD7_Empleados.getSelectedIndex();
        try {
            JD7_TF_Nombre.setText(ListaEmpleados.get(i).getNombre());
            JD7_TF_Nacionalidad.setText(ListaEmpleados.get(i).getNacionalidad());
            JD7_TF_Nacimiento.setText(ListaEmpleados.get(i).getNacionalidad());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_CB_JD7_EmpleadosActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int i;
        i = CB_JD7_Empleados.getSelectedIndex();
        Time Entrada = new Time((int) SP_JD7_HIn.getValue(), (int) SP_JD7_MIn.getValue(), 0);
        Time Salida = new Time((int) SP_JD7_HOut.getValue(), (int) SP_JD7_MOut.getValue(), 0);
        String Nombre = JD7_TF_Nombre.getText();
        String Nacionalidad = JD7_TF_Nacionalidad.getText();
        String Nacimiento = JD7_TF_Nacimiento.getText();
        int Edad = (int) SP_JD7_Edad.getValue();
        String Trabajo = JD7_CB_Trabajos.getSelectedItem().toString();
        ID++;
        Empleado e = new Empleado(Trabajo, Entrada, Salida, Edad, Trabajo, Edad, ID, Nacionalidad, Nacimiento, Nombre, color);
        ListaEmpleados.set(i, e);
        JOptionPane.showMessageDialog(this, "Empleado Modificado Exitosamente");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CB_JD8_Clientes.removeAllItems();
        for (int i = 0; i < ListaClientes.size(); i++) {
            CB_JD8_Clientes.addItem(ListaClientes.get(i).getNombre());
        }
        JD_ModificarCliente.pack();
        JD_ModificarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void CB_JD8_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_JD8_ClientesActionPerformed
        int op;
        op = CB_JD8_Clientes.getSelectedIndex();
        System.out.println(op);
        try {
            TF_JD8_Nombre.setText(ListaClientes.get(op).getNombre());
            TF_JD8_Nacimiento.setText(ListaClientes.get(op).getNacimiento());
            TF_JD8_Nacionalidad.setText(ListaClientes.get(op).getNacionalidad());
            SP_JD8_Edad.setValue((int) ListaClientes.get(op).getEdad());
            TF_JD8_Dinero.setText("" + ListaClientes.get(op).getEdad());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_CB_JD8_ClientesActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int i;
        i = CB_JD8_Clientes.getSelectedIndex();
        int Edad = (int) (SP_JD8_Edad.getValue());
        int IDh = this.ID;
        this.ID++;
        String Nacionalidad = TF_JD8_Nacionalidad.getText();
        String Nacimiento = TF_JD8_Nacimiento.getText();
        String Nombre = TF_JD8_Nombre.getText();
        Color Piel = color;
        int numTicket = NumTicket;
        this.NumTicket++;
        double Dinero = Double.parseDouble(JD3_TF_Dinero.getText());
        Cliente e = new Cliente(numTicket, Dinero, Edad, IDh, Nacionalidad, Nacimiento, Nombre, Piel);
        ListaClientes.set(i, e);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CB_JD9_DelEmpleados.removeAllItems();
        CB_JD9_delClientes.removeAllItems();
        for (int i = 0; i < ListaClientes.size(); i++) {
            CB_JD9_DelEmpleados.addItem(ListaEmpleados.get(i).getNombre());
        }
        for (int i = 0; i < ListaClientes.size(); i++) {
            CB_JD9_delClientes.addItem(ListaClientes.get(i).getNombre());
        }
        JD_Remover.pack();
        JD_Remover.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            if (CB_JD9_DelEmpleados.getSelectedItem().toString().equals(ListaEmpleados.get(i).getNombre())) {
                ListaEmpleados.remove(i);
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Data.SaveAs();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Data.LoadAs();
        Data.LoadEmpleados();
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    private boolean VerificarJefe(String nombre, Color color) {
        if (NumJefes <= 2) {
            System.out.println("num jefes es menor a dos");
            if (!color.equals(Color.BLACK)) {
                System.out.println("No es negro");
                switch (nombre) {
                    case "Carlos":
                        return false;
                    case "Juan":
                        return false;
                    case "Roberto":
                        return false;
                    case "Eduardo":
                        return false;
                    default:
                        System.out.println("Nombre Correcto");
                        return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    public void actualizar() {
        model2.removeAllElements();
        for (int i = 0; i < ListaGatos.size(); i++) {
            model2.addElement(ListaGatos.get(i));
        }
        for (int i = 0; i < ListaGatos.size(); i++) {
            model2.addElement(ListaBaleadas.get(i));
        }

        JL_JD4_Orden.setModel(model2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_JD4_Cliente;
    private javax.swing.JComboBox<String> CB_JD4_Empleado;
    private javax.swing.JComboBox<String> CB_JD4_Ingredientes;
    private javax.swing.JComboBox<String> CB_JD5_Tablas;
    private javax.swing.JComboBox CB_JD7_Empleados;
    private javax.swing.JComboBox CB_JD8_Clientes;
    private javax.swing.JComboBox CB_JD9_DelEmpleados;
    private javax.swing.JComboBox CB_JD9_delClientes;
    private javax.swing.JCheckBox CHB_Jefe;
    private javax.swing.JComboBox<String> JD1_CB_Trabajos;
    private javax.swing.JSpinner JD1_SP_Edad;
    private javax.swing.JTextField JD1_TF_Nacimiento;
    private javax.swing.JTextField JD1_TF_Nacionalidad;
    private javax.swing.JTextField JD1_TF_Nombre;
    private javax.swing.JSpinner JD3_SP_Edad;
    private javax.swing.JTextField JD3_TF_Dinero;
    private javax.swing.JTextField JD3_TF_Nacimiento;
    private javax.swing.JTextField JD3_TF_Nombre;
    private javax.swing.JTextField JD3_TF_Ticket;
    private javax.swing.JComboBox<String> JD7_CB_Trabajos;
    private javax.swing.JTextField JD7_TF_Nacimiento;
    private javax.swing.JTextField JD7_TF_Nacionalidad;
    private javax.swing.JTextField JD7_TF_Nombre;
    private javax.swing.JTextField JD_3_TF_Nacionalidad;
    private javax.swing.JDialog JD_AgregarCliente;
    private javax.swing.JDialog JD_AgregarEmpleado;
    private javax.swing.JDialog JD_AgregarOrden;
    private javax.swing.JDialog JD_AgregarPersona;
    private javax.swing.JDialog JD_Listar;
    private javax.swing.JDialog JD_ModificarCliente;
    private javax.swing.JDialog JD_ModificarEmpleado;
    private javax.swing.JDialog JD_Remover;
    private javax.swing.JDialog JD_ReporteVentas;
    private javax.swing.JList<String> JL_JD4_Ingredientes;
    private javax.swing.JList<String> JL_JD4_Orden;
    private javax.swing.JTable JT_Tabla;
    private javax.swing.JTable JT_Tabla2;
    private javax.swing.JSpinner SP_JD1_HIn;
    private javax.swing.JSpinner SP_JD1_HOut;
    private javax.swing.JSpinner SP_JD1_MIn;
    private javax.swing.JSpinner SP_JD1_MOut;
    private javax.swing.JSpinner SP_JD7_Edad;
    private javax.swing.JSpinner SP_JD7_HIn;
    private javax.swing.JSpinner SP_JD7_HOut;
    private javax.swing.JSpinner SP_JD7_MIn;
    private javax.swing.JSpinner SP_JD7_MOut;
    private javax.swing.JSpinner SP_JD8_Edad;
    private javax.swing.JTextField TF_JD$_Altura;
    private javax.swing.JTextField TF_JD4_Peso;
    private javax.swing.JTextField TF_JD8_Dinero;
    private javax.swing.JTextField TF_JD8_Nacimiento;
    private javax.swing.JTextField TF_JD8_Nacionalidad;
    private javax.swing.JTextField TF_JD8_Nombre;
    private javax.swing.JTextField TF_JD8_Ticket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
