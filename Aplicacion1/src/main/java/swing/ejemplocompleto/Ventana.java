/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing.ejemplocompleto;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cic
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    private DefaultListModel<Prestamos> modeloLista;
    private AccesoBaseDatos bd = AccesoBaseDatos.getInstance();
    private DefaultTableModel modeloTabla;
    private Dimension dim;

    public Ventana() {

        initComponents();
//        this.setSize(new Dimension(1300, 1100));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(10000, 14000));

        this.setLocationRelativeTo(null);
        Inicio.setVisible(true);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        mostrarImagen();
        cargarItems();
        modeloTabla = (DefaultTableModel) jTableClientes.getModel();
        this.modeloLista = new DefaultListModel<Prestamos>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListarPrestamos = new javax.swing.JPanel();
        jScrollPanepropietarios = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btnVolver2 = new javax.swing.JButton();
        InicioBanquero = new javax.swing.JPanel();
        InicioBanqueLbl = new javax.swing.JLabel();
        NumeroBanqueLbl = new javax.swing.JLabel();
        PasswordBanqueLbl = new javax.swing.JLabel();
        NumBanqueTxt = new javax.swing.JTextField();
        EntrarBanqBtn = new javax.swing.JButton();
        PasswordBanqueTxt = new javax.swing.JPasswordField();
        EntrarCliBtn = new javax.swing.JButton();
        OpcionesBanquero = new javax.swing.JPanel();
        MenOpLbl = new javax.swing.JLabel();
        OfrecerCreditoBtn = new javax.swing.JButton();
        ListarClientesBtn = new javax.swing.JButton();
        RegistrarClienteBtn = new javax.swing.JButton();
        RevisarSolicitudesBtn = new javax.swing.JButton();
        CerrarSesionBanqBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        InicioSesion = new javax.swing.JPanel();
        EnterBt = new javax.swing.JButton();
        InicioLbl = new javax.swing.JLabel();
        EnterBanqueroBt = new javax.swing.JToggleButton();
        UsuarioTxt = new javax.swing.JTextField();
        UsuarioLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        PasswordUsuarioTxt = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        OpcionesUsuario = new javax.swing.JPanel();
        BienvenidoLbl = new javax.swing.JLabel();
        ConsultarCuentaBtn = new javax.swing.JButton();
        RealizarOperacionBtn = new javax.swing.JButton();
        AceptarPrestamoBtn = new javax.swing.JButton();
        SolicitarPrestamoBtn = new javax.swing.JButton();
        ConsultarPrestamosLbl = new javax.swing.JButton();
        CerrarSesionUsuBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AceptarPrestamosUsu = new javax.swing.JPanel();
        jScrollPanepropietarios1 = new javax.swing.JScrollPane();
        jTablePrestamosAceptar = new javax.swing.JTable();
        btnVolver3 = new javax.swing.JButton();
        AceptarPrest = new javax.swing.JButton();
        ListarPrestamosOfrecidos = new javax.swing.JPanel();
        jScrollPaneClientes = new javax.swing.JScrollPane();
        jTableClientes1 = new javax.swing.JTable();
        btnVolver4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ConsultarCuenta = new javax.swing.JPanel();
        jScrollPanepropietarios2 = new javax.swing.JScrollPane();
        jTableClientes2 = new javax.swing.JTable();
        btnVolver5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPanepropietarios6 = new javax.swing.JScrollPane();
        jTableClientes3 = new javax.swing.JTable();
        RealizarOperacion = new javax.swing.JPanel();
        jPanelRegistrarCliente1 = new javax.swing.JPanel();
        txtApellido1 = new javax.swing.JTextField();
        jLabelApellidos1 = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelLocalidad1 = new javax.swing.JLabel();
        jLabelIBAN1 = new javax.swing.JLabel();
        txtDireccionReg1 = new javax.swing.JTextField();
        comboOperacion = new javax.swing.JComboBox<>();
        txtIBAN1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnAceptarOperacion = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        RegistroCliente = new javax.swing.JPanel();
        jPanelRegistrarCliente2 = new javax.swing.JPanel();
        jLabelNif2 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelTelefono2 = new javax.swing.JLabel();
        txtDNINIF2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        btnComprobar2 = new javax.swing.JButton();
        jLabelApellidos2 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        jLabelDireccion2 = new javax.swing.JLabel();
        jLabelLocalidad2 = new javax.swing.JLabel();
        jLabelIBAN2 = new javax.swing.JLabel();
        txtDireccionReg2 = new javax.swing.JTextField();
        cmbLocalidad2 = new javax.swing.JComboBox<>();
        txtIBAN2 = new javax.swing.JTextField();
        jLabelidUsuario2 = new javax.swing.JLabel();
        txtIdUsua2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanelDatosCuenta2 = new javax.swing.JPanel();
        jLabelUsuarioReg2 = new javax.swing.JLabel();
        jLabelContrasena2 = new javax.swing.JLabel();
        jLabelSitCivil2 = new javax.swing.JLabel();
        jLabelTipRegi2 = new javax.swing.JLabel();
        jLabelsitLaboral2 = new javax.swing.JLabel();
        txtUsuReg2 = new javax.swing.JTextField();
        jLabelidConyuge2 = new javax.swing.JLabel();
        txtConyuge2 = new javax.swing.JTextField();
        jCheckBoxAntecedentesJudi2 = new javax.swing.JCheckBox();
        comboTipoCuenta = new javax.swing.JComboBox<>();
        jLabelTipoCuenta2 = new javax.swing.JLabel();
        comboSituacionLaboral = new javax.swing.JComboBox<>();
        comboTipoRegimen = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        btnAceptarOperacion1 = new javax.swing.JButton();
        btnVolver6 = new javax.swing.JButton();
        QuienesSomos = new javax.swing.JPanel();
        BienvenidoLbl1 = new javax.swing.JLabel();
        AtrasBoton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Contacto = new javax.swing.JPanel();
        BienvenidoLbl2 = new javax.swing.JLabel();
        CerrarSesionUsuBtn2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        RevisarSolicitudes = new javax.swing.JPanel();
        jScrollPanepropietarios3 = new javax.swing.JScrollPane();
        jTablePrestamosAceptar1 = new javax.swing.JTable();
        btnVolver7 = new javax.swing.JButton();
        AceptarPrest1 = new javax.swing.JButton();
        jLabelidenPrestAcep1 = new javax.swing.JLabel();
        jTextIdenPrestAcept1 = new javax.swing.JTextField();
        FiltrarEdad1 = new javax.swing.JTextField();
        LocalidadcomboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        OfrecerCredito = new javax.swing.JPanel();
        jScrollPanepropietarios4 = new javax.swing.JScrollPane();
        jTablePrestamosAceptar2 = new javax.swing.JTable();
        btnVolver8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ListarClientes = new javax.swing.JPanel();
        jScrollPanepropietarios5 = new javax.swing.JScrollPane();
        jTablePrestamosAceptar3 = new javax.swing.JTable();
        btnVolver9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        btnWebsite = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        btnQuienesSomos = new javax.swing.JButton();
        btnIniciarSesion2 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jMenuBarArchivo = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jTableClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPresupuesto", "periodo", "fechaOfer", "plazo", "interes", "cantidad", "fechaFirma", "cantMensual", "uuid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios.setViewportView(jTableClientes);

        btnVolver2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListarPrestamosLayout = new javax.swing.GroupLayout(ListarPrestamos);
        ListarPrestamos.setLayout(ListarPrestamosLayout);
        ListarPrestamosLayout.setHorizontalGroup(
            ListarPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarPrestamosLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(ListarPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ListarPrestamosLayout.createSequentialGroup()
                        .addGap(941, 941, 941)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(jScrollPanepropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        ListarPrestamosLayout.setVerticalGroup(
            ListarPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarPrestamosLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jScrollPanepropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(btnVolver2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(227, 227, 227))
        );

        getContentPane().add(ListarPrestamos, "card4");

        InicioBanqueLbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        InicioBanqueLbl.setForeground(new java.awt.Color(51, 153, 255));
        InicioBanqueLbl.setText("INICIO SESIÓN");

        NumeroBanqueLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumeroBanqueLbl.setText("Nº de empleado");

        PasswordBanqueLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordBanqueLbl.setText("Contraseña");

        NumBanqueTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumBanqueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumBanqueTxtActionPerformed(evt);
            }
        });

        EntrarBanqBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EntrarBanqBtn.setText("Entrar");
        EntrarBanqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarBanqBtnActionPerformed(evt);
            }
        });

        PasswordBanqueTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordBanqueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBanqueTxtActionPerformed(evt);
            }
        });

        EntrarCliBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EntrarCliBtn.setText("Entrar como cliente");
        EntrarCliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarCliBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioBanqueroLayout = new javax.swing.GroupLayout(InicioBanquero);
        InicioBanquero.setLayout(InicioBanqueroLayout);
        InicioBanqueroLayout.setHorizontalGroup(
            InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioBanqueroLayout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addGroup(InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioBanqueroLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(InicioBanqueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioBanqueroLayout.createSequentialGroup()
                        .addGroup(InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InicioBanqueroLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(PasswordBanqueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(NumeroBanqueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumBanqueTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordBanqueTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioBanqueroLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(EntrarBanqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioBanqueroLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(EntrarCliBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)))
                .addGap(432, 432, 432))
        );
        InicioBanqueroLayout.setVerticalGroup(
            InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioBanqueroLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(InicioBanqueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97)
                .addGroup(InicioBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioBanqueroLayout.createSequentialGroup()
                        .addComponent(NumBanqueTxt)
                        .addGap(49, 49, 49)
                        .addComponent(PasswordBanqueTxt))
                    .addGroup(InicioBanqueroLayout.createSequentialGroup()
                        .addComponent(NumeroBanqueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(PasswordBanqueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addGap(74, 74, 74)
                .addComponent(EntrarBanqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(EntrarCliBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(188, 188, 188))
        );

        getContentPane().add(InicioBanquero, "card3");

        MenOpLbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        MenOpLbl.setForeground(new java.awt.Color(51, 153, 255));
        MenOpLbl.setText("MENÚ DE OPCIONES");

        OfrecerCreditoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OfrecerCreditoBtn.setText("Ofrecer Crédito");
        OfrecerCreditoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfrecerCreditoBtnActionPerformed(evt);
            }
        });

        ListarClientesBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListarClientesBtn.setText("Listar Clientes");
        ListarClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClientesBtnActionPerformed(evt);
            }
        });

        RegistrarClienteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegistrarClienteBtn.setText("Registrar Cliente");
        RegistrarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteBtnActionPerformed(evt);
            }
        });

        RevisarSolicitudesBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RevisarSolicitudesBtn.setText("Revisar Solicitudes");
        RevisarSolicitudesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisarSolicitudesBtnActionPerformed(evt);
            }
        });

        CerrarSesionBanqBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CerrarSesionBanqBtn.setText("Cerrar Sesión");
        CerrarSesionBanqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionBanqBtnActionPerformed(evt);
            }
        });

        jTextArea22.setColumns(20);
        jTextArea22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea22.setRows(5);
        jTextArea22.setText("¡Saludos!\n\nLes recordamos que el ");
        jScrollPane3.setViewportView(jTextArea22);

        javax.swing.GroupLayout OpcionesBanqueroLayout = new javax.swing.GroupLayout(OpcionesBanquero);
        OpcionesBanquero.setLayout(OpcionesBanqueroLayout);
        OpcionesBanqueroLayout.setHorizontalGroup(
            OpcionesBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesBanqueroLayout.createSequentialGroup()
                .addGroup(OpcionesBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OpcionesBanqueroLayout.createSequentialGroup()
                        .addGap(1150, 1150, 1150)
                        .addComponent(CerrarSesionBanqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(OpcionesBanqueroLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jScrollPane3)
                        .addGap(89, 89, 89)
                        .addGroup(OpcionesBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RevisarSolicitudesBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OfrecerCreditoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarClientesBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistrarClienteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesBanqueroLayout.createSequentialGroup()
                .addGap(552, 552, 552)
                .addComponent(MenOpLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(552, 552, 552))
        );
        OpcionesBanqueroLayout.setVerticalGroup(
            OpcionesBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesBanqueroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(OpcionesBanqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OpcionesBanqueroLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(RegistrarClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RevisarSolicitudesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(OfrecerCreditoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ListarClientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(OpcionesBanqueroLayout.createSequentialGroup()
                        .addComponent(MenOpLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
                .addGap(199, 199, 199)
                .addComponent(CerrarSesionBanqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(OpcionesBanquero, "card4");

        EnterBt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnterBt.setText("Entrar");
        EnterBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBtActionPerformed(evt);
            }
        });

        InicioLbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        InicioLbl.setForeground(new java.awt.Color(51, 153, 255));
        InicioLbl.setText("INICIO SESIÓN");

        EnterBanqueroBt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnterBanqueroBt.setText("Entrar como personal del banco");
        EnterBanqueroBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBanqueroBtActionPerformed(evt);
            }
        });

        UsuarioTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTxtActionPerformed(evt);
            }
        });

        UsuarioLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsuarioLbl.setText("Usuario");

        PasswordLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordLbl.setText("Contraseña");

        PasswordUsuarioTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordUsuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordUsuarioTxtActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioSesionLayout = new javax.swing.GroupLayout(InicioSesion);
        InicioSesion.setLayout(InicioSesionLayout);
        InicioSesionLayout.setHorizontalGroup(
            InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSesionLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                        .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(InicioSesionLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(UsuarioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioTxt)
                            .addComponent(PasswordUsuarioTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(EnterBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(InicioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(EnterBanqueroBt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addGap(493, 493, 493))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                .addGap(649, 649, 649)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(556, 556, 556))
        );
        InicioSesionLayout.setVerticalGroup(
            InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSesionLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(InicioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioSesionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(UsuarioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(UsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioSesionLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PasswordUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(EnterBt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(EnterBanqueroBt, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );

        getContentPane().add(InicioSesion, "card3");

        BienvenidoLbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        BienvenidoLbl.setForeground(new java.awt.Color(51, 153, 255));
        BienvenidoLbl.setText("Menu de opciones");

        ConsultarCuentaBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultarCuentaBtn.setText("Consultar mi cuenta");
        ConsultarCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCuentaBtnActionPerformed(evt);
            }
        });

        RealizarOperacionBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RealizarOperacionBtn.setText("Realizar Operación");
        RealizarOperacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarOperacionBtnActionPerformed(evt);
            }
        });

        AceptarPrestamoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AceptarPrestamoBtn.setText("Aceptar préstamo preconcedido");
        AceptarPrestamoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarPrestamoBtnActionPerformed(evt);
            }
        });

        SolicitarPrestamoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SolicitarPrestamoBtn.setText("Solicitar préstamo");
        SolicitarPrestamoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarPrestamoBtnActionPerformed(evt);
            }
        });

        ConsultarPrestamosLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultarPrestamosLbl.setText("Consultar el estado de mis préstamos");
        ConsultarPrestamosLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPrestamosLblActionPerformed(evt);
            }
        });

        CerrarSesionUsuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CerrarSesionUsuBtn.setText("Cerrar Sesión");
        CerrarSesionUsuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionUsuBtnActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenid@\n\nLes recordamos a todos nuestros clientes que el 20 de Junio de 2023 será el último \ndía para actualizar sus datos personales mediante un documentode identidad. \n\n\n\nÚltimo cambio de su clave de acceso hace 42 día(s).");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout OpcionesUsuarioLayout = new javax.swing.GroupLayout(OpcionesUsuario);
        OpcionesUsuario.setLayout(OpcionesUsuarioLayout);
        OpcionesUsuarioLayout.setHorizontalGroup(
            OpcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesUsuarioLayout.createSequentialGroup()
                .addGroup(OpcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OpcionesUsuarioLayout.createSequentialGroup()
                        .addGap(1178, 1178, 1178)
                        .addComponent(CerrarSesionUsuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(OpcionesUsuarioLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(OpcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RealizarOperacionBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AceptarPrestamoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultarPrestamosLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SolicitarPrestamoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultarCuentaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(52, 52, 52))
            .addGroup(OpcionesUsuarioLayout.createSequentialGroup()
                .addGap(542, 542, 542)
                .addComponent(BienvenidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(625, 625, 625))
        );
        OpcionesUsuarioLayout.setVerticalGroup(
            OpcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesUsuarioLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ConsultarCuentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SolicitarPrestamoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarPrestamosLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AceptarPrestamoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealizarOperacionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(126, 126, 126)
                .addComponent(CerrarSesionUsuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(51, 51, 51))
            .addGroup(OpcionesUsuarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BienvenidoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(300, 300, 300))
        );

        getContentPane().add(OpcionesUsuario, "card5");

        jTablePrestamosAceptar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPrestamo", "periodo", "fechaOferta", "plazo", "interes", "cantidad", "fechaFirma", "cantMensual", "uuid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios1.setViewportView(jTablePrestamosAceptar);

        btnVolver3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver3.setText("Volver");
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        AceptarPrest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AceptarPrest.setText("Aceptar");
        AceptarPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarPrestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AceptarPrestamosUsuLayout = new javax.swing.GroupLayout(AceptarPrestamosUsu);
        AceptarPrestamosUsu.setLayout(AceptarPrestamosUsuLayout);
        AceptarPrestamosUsuLayout.setHorizontalGroup(
            AceptarPrestamosUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AceptarPrestamosUsuLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(AceptarPrestamosUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AceptarPrestamosUsuLayout.createSequentialGroup()
                        .addGap(959, 959, 959)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addComponent(jScrollPanepropietarios1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
                    .addGroup(AceptarPrestamosUsuLayout.createSequentialGroup()
                        .addGap(818, 818, 818)
                        .addComponent(AceptarPrest, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addGap(195, 195, 195)))
                .addGap(116, 116, 116))
        );
        AceptarPrestamosUsuLayout.setVerticalGroup(
            AceptarPrestamosUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AceptarPrestamosUsuLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jScrollPanepropietarios1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(AceptarPrest)
                .addGap(24, 24, 24)
                .addComponent(btnVolver3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(182, 182, 182))
        );

        getContentPane().add(AceptarPrestamosUsu, "card4");

        jTableClientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneClientes.setViewportView(jTableClientes1);

        btnVolver4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver4.setText("Volver");
        btnVolver4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Préstamos en oferta");

        javax.swing.GroupLayout ListarPrestamosOfrecidosLayout = new javax.swing.GroupLayout(ListarPrestamosOfrecidos);
        ListarPrestamosOfrecidos.setLayout(ListarPrestamosOfrecidosLayout);
        ListarPrestamosOfrecidosLayout.setHorizontalGroup(
            ListarPrestamosOfrecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarPrestamosOfrecidosLayout.createSequentialGroup()
                .addGroup(ListarPrestamosOfrecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListarPrestamosOfrecidosLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(ListarPrestamosOfrecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ListarPrestamosOfrecidosLayout.createSequentialGroup()
                                .addGap(1024, 1024, 1024)
                                .addComponent(btnVolver4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPaneClientes)))
                    .addGroup(ListarPrestamosOfrecidosLayout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(463, 463, 463)))
                .addGap(121, 121, 121))
        );
        ListarPrestamosOfrecidosLayout.setVerticalGroup(
            ListarPrestamosOfrecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarPrestamosOfrecidosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(142, 142, 142)
                .addComponent(btnVolver4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(98, 98, 98))
        );

        getContentPane().add(ListarPrestamosOfrecidos, "card4");

        jTableClientes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iban", "tipoCuenta", "Saldo", "NominaUltimoMes", "MediaNominaAnual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios2.setViewportView(jTableClientes2);

        btnVolver5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver5.setText("Volver");
        btnVolver5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Datos de Cuenta");

        jTableClientes3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdOperacion", "Cantidad", "Concepto", "IbanDestinatario", "IbanEmisor", "Iban"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios6.setViewportView(jTableClientes3);

        javax.swing.GroupLayout ConsultarCuentaLayout = new javax.swing.GroupLayout(ConsultarCuenta);
        ConsultarCuenta.setLayout(ConsultarCuentaLayout);
        ConsultarCuentaLayout.setHorizontalGroup(
            ConsultarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarCuentaLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(595, 595, 595))
            .addGroup(ConsultarCuentaLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(ConsultarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarCuentaLayout.createSequentialGroup()
                        .addGap(918, 918, 918)
                        .addComponent(btnVolver5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))
                    .addGroup(ConsultarCuentaLayout.createSequentialGroup()
                        .addGroup(ConsultarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPanepropietarios6)
                            .addComponent(jScrollPanepropietarios2))
                        .addGap(138, 138, 138))))
        );
        ConsultarCuentaLayout.setVerticalGroup(
            ConsultarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultarCuentaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPanepropietarios2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(128, 128, 128)
                .addComponent(jScrollPanepropietarios6, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(81, 81, 81)
                .addComponent(btnVolver5, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(ConsultarCuenta, "card4");

        jPanelRegistrarCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Cliente"));

        txtApellido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        jLabelApellidos1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelApellidos1.setText("IBAN Receptor:");

        jLabelDireccion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDireccion1.setText("Tipo de Operación:");

        jLabelLocalidad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLocalidad1.setText("IBAN Emisor:");

        jLabelIBAN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIBAN1.setText("Cantidad:");

        txtDireccionReg1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionReg1ActionPerformed(evt);
            }
        });

        comboOperacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOperacionActionPerformed(evt);
            }
        });

        txtIBAN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIBAN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIBAN1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Realizar Operación");

        jCheckBox1.setText("Comprobante impreso");

        javax.swing.GroupLayout jPanelRegistrarCliente1Layout = new javax.swing.GroupLayout(jPanelRegistrarCliente1);
        jPanelRegistrarCliente1.setLayout(jPanelRegistrarCliente1Layout);
        jPanelRegistrarCliente1Layout.setHorizontalGroup(
            jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarCliente1Layout.createSequentialGroup()
                .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarCliente1Layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jLabel1)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(jPanelRegistrarCliente1Layout.createSequentialGroup()
                        .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarCliente1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDireccion1)
                                .addGap(18, 18, 18))
                            .addGroup(jPanelRegistrarCliente1Layout.createSequentialGroup()
                                .addGap(408, 408, 408)
                                .addComponent(jLabelLocalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccionReg1)
                            .addComponent(comboOperacion, 0, 228, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarCliente1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellidos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIBAN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIBAN1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jCheckBox1)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanelRegistrarCliente1Layout.setVerticalGroup(
            jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarCliente1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion1)
                    .addComponent(comboOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocalidad1)
                    .addComponent(txtDireccionReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos1)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanelRegistrarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIBAN1)
                    .addComponent(txtIBAN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jCheckBox1)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        btnAceptarOperacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptarOperacion.setText("Aceptar");
        btnAceptarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarOperacionActionPerformed(evt);
            }
        });

        btnVolver1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RealizarOperacionLayout = new javax.swing.GroupLayout(RealizarOperacion);
        RealizarOperacion.setLayout(RealizarOperacionLayout);
        RealizarOperacionLayout.setHorizontalGroup(
            RealizarOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RealizarOperacionLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanelRegistrarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RealizarOperacionLayout.createSequentialGroup()
                .addGap(983, 983, 983)
                .addComponent(btnAceptarOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
        RealizarOperacionLayout.setVerticalGroup(
            RealizarOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarOperacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelRegistrarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(RealizarOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnAceptarOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        getContentPane().add(RealizarOperacion, "card3");

        jPanelRegistrarCliente2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Cliente"));

        jLabelNif2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNif2.setText("NIF:");

        jLabelNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombre2.setText("Nombre:");

        jLabelTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTelefono2.setText("Telefono:");

        txtDNINIF2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNINIF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNINIF2ActionPerformed(evt);
            }
        });

        txtNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });

        txtApellido2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });

        btnComprobar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComprobar2.setText("Comprobar Cliente");
        btnComprobar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobar2ActionPerformed(evt);
            }
        });

        jLabelApellidos2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelApellidos2.setText("Apellidos:");

        txtTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        jLabelDireccion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDireccion2.setText("Direccion:");

        jLabelLocalidad2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLocalidad2.setText("Localidad:");

        jLabelIBAN2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIBAN2.setText("IBAN:");

        txtDireccionReg2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionReg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionReg2ActionPerformed(evt);
            }
        });

        cmbLocalidad2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLocalidad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbLocalidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocalidad2ActionPerformed(evt);
            }
        });

        txtIBAN2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIBAN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIBAN2ActionPerformed(evt);
            }
        });

        jLabelidUsuario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelidUsuario2.setText("ID usuario");

        txtIdUsua2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdUsua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsua2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Registro de Cliente");

        jButton5.setText("Generar ID");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("FechaNac: ");

        javax.swing.GroupLayout jPanelRegistrarCliente2Layout = new javax.swing.GroupLayout(jPanelRegistrarCliente2);
        jPanelRegistrarCliente2.setLayout(jPanelRegistrarCliente2Layout);
        jPanelRegistrarCliente2Layout.setHorizontalGroup(
            jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addComponent(jLabelTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addComponent(jLabelNif2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelApellidos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNINIF2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelidUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocalidad2)
                            .addComponent(jLabelIBAN2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdUsua2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIBAN2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLocalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)
                                        .addComponent(btnComprobar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(102, 102, 102))
                                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                        .addGap(307, 307, 307)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanelRegistrarCliente2Layout.setVerticalGroup(
            jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccion2)
                            .addComponent(txtDNINIF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNif2)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelLocalidad2)
                                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelNombre2))
                                    .addComponent(cmbLocalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIBAN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIBAN2)
                                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelApellidos2)))
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanelRegistrarCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdUsua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelidUsuario2)
                                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTelefono2)))))
                    .addGroup(jPanelRegistrarCliente2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnComprobar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
        );

        jPanelDatosCuenta2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta"));

        jLabelUsuarioReg2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsuarioReg2.setText("Usuario:");

        jLabelContrasena2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContrasena2.setText("Contaseña:");

        jLabelSitCivil2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSitCivil2.setText("Situación Civil:");

        jLabelTipRegi2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTipRegi2.setText("Tipo de Régimen:");

        jLabelsitLaboral2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelsitLaboral2.setText("Situación Laboral:");

        txtUsuReg2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuReg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuReg2ActionPerformed(evt);
            }
        });

        jLabelidConyuge2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelidConyuge2.setText("ID Cónyuge:");

        txtConyuge2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConyuge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConyuge2ActionPerformed(evt);
            }
        });

        jCheckBoxAntecedentesJudi2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxAntecedentesJudi2.setText("Antecedentes Judiciales");
        jCheckBoxAntecedentesJudi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAntecedentesJudi2ActionPerformed(evt);
            }
        });

        comboTipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCuentaActionPerformed(evt);
            }
        });

        jLabelTipoCuenta2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTipoCuenta2.setText("Tipo de Cuenta:");

        comboSituacionLaboral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboSituacionLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboSituacionLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacionLaboralActionPerformed(evt);
            }
        });

        comboTipoRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboTipoRegimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoRegimenActionPerformed(evt);
            }
        });

        jLabel5.setText("NominaUltimoMes");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casado", "Soltero", "Viudo" }));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosCuenta2Layout = new javax.swing.GroupLayout(jPanelDatosCuenta2);
        jPanelDatosCuenta2.setLayout(jPanelDatosCuenta2Layout);
        jPanelDatosCuenta2Layout.setHorizontalGroup(
            jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                        .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSitCivil2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipRegi2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelidConyuge2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelsitLaboral2)
                            .addComponent(jLabelContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSituacionLaboral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboTipoRegimen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosCuenta2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConyuge2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                        .addComponent(jLabelUsuarioReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAntecedentesJudi2)
                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(comboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosCuenta2Layout.setVerticalGroup(
            jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelSitCivil2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelTipRegi2)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelidConyuge2)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelsitLaboral2))
                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                        .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTipoCuenta2))
                                .addGap(33, 33, 33)
                                .addComponent(jCheckBoxAntecedentesJudi2))
                            .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                                .addGroup(jPanelDatosCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                                        .addComponent(jLabelUsuarioReg2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelContrasena2)
                                        .addGap(19, 19, 19))
                                    .addGroup(jPanelDatosCuenta2Layout.createSequentialGroup()
                                        .addComponent(txtUsuReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtConyuge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(comboSituacionLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptarOperacion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptarOperacion1.setText("Aceptar");
        btnAceptarOperacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarOperacion1ActionPerformed(evt);
            }
        });

        btnVolver6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver6.setText("Volver");
        btnVolver6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroClienteLayout = new javax.swing.GroupLayout(RegistroCliente);
        RegistroCliente.setLayout(RegistroClienteLayout);
        RegistroClienteLayout.setHorizontalGroup(
            RegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroClienteLayout.createSequentialGroup()
                .addGroup(RegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroClienteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(RegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDatosCuenta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(RegistroClienteLayout.createSequentialGroup()
                                .addComponent(jPanelRegistrarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(795, 795, 795))))
                    .addGroup(RegistroClienteLayout.createSequentialGroup()
                        .addGap(1031, 1031, 1031)
                        .addComponent(btnAceptarOperacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        RegistroClienteLayout.setVerticalGroup(
            RegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelRegistrarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanelDatosCuenta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnAceptarOperacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(RegistroCliente, "card3");

        BienvenidoLbl1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        BienvenidoLbl1.setForeground(new java.awt.Color(51, 153, 255));
        BienvenidoLbl1.setText("Menu de opciones");

        AtrasBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasBoton.setText("Atras");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Descripción del banco");
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout QuienesSomosLayout = new javax.swing.GroupLayout(QuienesSomos);
        QuienesSomos.setLayout(QuienesSomosLayout);
        QuienesSomosLayout.setHorizontalGroup(
            QuienesSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuienesSomosLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(QuienesSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuienesSomosLayout.createSequentialGroup()
                        .addGroup(QuienesSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addGroup(QuienesSomosLayout.createSequentialGroup()
                                .addGap(1031, 1031, 1031)
                                .addComponent(AtrasBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuienesSomosLayout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(BienvenidoLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(554, 554, 554))))
        );
        QuienesSomosLayout.setVerticalGroup(
            QuienesSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuienesSomosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BienvenidoLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(195, 195, 195)
                .addComponent(AtrasBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        getContentPane().add(QuienesSomos, "card5");

        BienvenidoLbl2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        BienvenidoLbl2.setForeground(new java.awt.Color(51, 153, 255));
        BienvenidoLbl2.setText("Contacto");

        CerrarSesionUsuBtn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CerrarSesionUsuBtn2.setText("Atras");
        CerrarSesionUsuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionUsuBtn2ActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("¡Contáctanos!\n\nEstamos aquí para responder a tus preguntas y brindarte la asistencia que necesitas. No dudes en comunicarte con nosotros a través de los siguientes canales:\n\nTeléfono: Puedes comunicarte con nuestro servicio de atención al cliente las 24 horas del día, los 7 días de la semana, al número + 34 942 887 799. Nuestro equipo de profesionales estará encantado de ayudarte con cualquier consulta o solicitud que tengas.\n\nCorreo electrónico: Si prefieres comunicarte por escrito, puedes enviarnos un correo electrónico a bnp@contact.com. Responderemos rápidamente y te proporcionaremos la información necesaria.\n\nRedes sociales: Síguenos en nuestras redes sociales para estar al tanto de las últimas noticias, promociones y actualizaciones. Encuéntranos en Facebook, Instagram y Twitter (@BancoProyecto) para interactuar con nuestra comunidad y obtener información útil sobre servicios financieros, consejos de ahorro e inversiones.\n\nSucursales: Si prefieres una atención personalizada, te invitamos a visitar una de nuestras sucursales. Tenemos una red de sucursales convenientemente ubicadas en todo el país, donde nuestro personal capacitado estará encantado de atenderte y brindarte el apoyo necesario en tus transacciones y consultas financieras.\n\nRecuerda que en Banco Nuevo Proyecto trabajamos para brindarte soluciones financieras a medida y superar tus expectativas. ¡Esperamos con ansias poder asistirte y ser parte de tus proyectos financieros!\n\n\n\n\n¿Quienes somos?\n\n\"En Banco Nuevo Proyecto, hemos establecido una trayectoria sólida y confiable en el mundo financiero desde nuestra fundación en 1995. Nuestro banco se ha convertido en un referente en la industria, ofreciendo soluciones financieras integrales y servicios de primera clase a nuestros clientes.\n\nNuestra historia comenzó con una visión audaz de brindar un enfoque bancario innovador y centrado en las necesidades de las personas y las empresas. Desde entonces, hemos trabajado arduamente para establecer relaciones sólidas y duraderas con nuestros clientes, basadas en la confianza, la transparencia y la excelencia en el servicio.\n\nA lo largo de los años, hemos logrado un crecimiento sostenido y una expansión estratégica, ampliando nuestra red de sucursales y adaptándonos a los avances tecnológicos para ofrecer servicios bancarios más accesibles y eficientes. Nuestro compromiso con la innovación nos ha permitido desarrollar soluciones financieras personalizadas, desde productos de ahorro y préstamos hasta inversiones y servicios de banca digital.\n\nEn Banco Nuevo Proyecto, nos enorgullece contar con un equipo altamente capacitado y comprometido, compuesto por expertos en diversas áreas financieras. Nuestro personal está dedicado a brindar asesoramiento personalizado y soluciones adaptadas a las necesidades específicas de cada cliente.\n\nAdemás de nuestra dedicación a nuestros clientes, también estamos comprometidos con la responsabilidad social y la sostenibilidad. Colaboramos activamente con organizaciones benéficas y programas comunitarios, y nos esforzamos por contribuir al desarrollo y bienestar de las comunidades en las que operamos.\n\nEn resumen, en Banco Nuevo Proyecto combinamos una historia de éxito y una trayectoria confiable con una visión orientada al futuro y una pasión por brindar soluciones financieras innovadoras. Estamos aquí para ayudar a nuestros clientes a alcanzar sus metas financieras y construir un futuro próspero\".");
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout ContactoLayout = new javax.swing.GroupLayout(Contacto);
        Contacto.setLayout(ContactoLayout);
        ContactoLayout.setHorizontalGroup(
            ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactoLayout.createSequentialGroup()
                .addGap(1178, 1178, 1178)
                .addComponent(CerrarSesionUsuBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(ContactoLayout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(BienvenidoLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContactoLayout.setVerticalGroup(
            ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BienvenidoLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(CerrarSesionUsuBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        getContentPane().add(Contacto, "card5");

        jTablePrestamosAceptar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPrestamo", "periodo", "fechaOferta", "plazo", "interes", "cantidad", "fechaFirma", "cantMensual", "uuid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios3.setViewportView(jTablePrestamosAceptar1);

        btnVolver7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver7.setText("Volver");
        btnVolver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver7ActionPerformed(evt);
            }
        });

        AceptarPrest1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AceptarPrest1.setText("Aceptar");
        AceptarPrest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarPrest1ActionPerformed(evt);
            }
        });

        jLabelidenPrestAcep1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelidenPrestAcep1.setText("Introduce el identificador del cliente:");

        jTextIdenPrestAcept1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextIdenPrestAcept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdenPrestAcept1ActionPerformed(evt);
            }
        });

        FiltrarEdad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FiltrarEdad1.setText("Edad Cliente");

        LocalidadcomboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LocalidadcomboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LocalidadcomboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalidadcomboBox2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Actualizar");

        javax.swing.GroupLayout RevisarSolicitudesLayout = new javax.swing.GroupLayout(RevisarSolicitudes);
        RevisarSolicitudes.setLayout(RevisarSolicitudesLayout);
        RevisarSolicitudesLayout.setHorizontalGroup(
            RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RevisarSolicitudesLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RevisarSolicitudesLayout.createSequentialGroup()
                        .addComponent(jLabelidenPrestAcep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextIdenPrestAcept1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(AceptarPrest1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(355, 355, 355))
                    .addGroup(RevisarSolicitudesLayout.createSequentialGroup()
                        .addComponent(LocalidadcomboBox2, 0, 176, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(FiltrarEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(765, 765, 765))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RevisarSolicitudesLayout.createSequentialGroup()
                        .addGap(809, 809, 809)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jScrollPanepropietarios3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        RevisarSolicitudesLayout.setVerticalGroup(
            RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RevisarSolicitudesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPanepropietarios3, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocalidadcomboBox2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RevisarSolicitudesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(FiltrarEdad1)))
                .addGap(18, 18, 18)
                .addGroup(RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RevisarSolicitudesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextIdenPrestAcept1))
                    .addGroup(RevisarSolicitudesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelidenPrestAcep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AceptarPrest1))
                .addGap(24, 24, 24)
                .addGroup(RevisarSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(225, 225, 225))
        );

        getContentPane().add(RevisarSolicitudes, "card4");

        jTablePrestamosAceptar2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPrestamo", "periodo", "fechaOferta", "plazo", "interes", "cantidad", "fechaFirma", "cantMensual", "uuid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios4.setViewportView(jTablePrestamosAceptar2);

        btnVolver8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver8.setText("Volver");
        btnVolver8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver8ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Solicitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Plazo: ");

        jLabel9.setText("Periodo");

        jLabel10.setText("Interes");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton6.setText("Listar Prestamos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Uuid:");

        javax.swing.GroupLayout OfrecerCreditoLayout = new javax.swing.GroupLayout(OfrecerCredito);
        OfrecerCredito.setLayout(OfrecerCreditoLayout);
        OfrecerCreditoLayout.setHorizontalGroup(
            OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                        .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPanepropietarios4, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                            .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                                .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(jTextField7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(29, 29, 29)
                                .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addComponent(btnVolver8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117))))
        );
        OfrecerCreditoLayout.setVerticalGroup(
            OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OfrecerCreditoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPanepropietarios4, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(2, 2, 2)
                        .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(5, 5, 5)
                        .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(OfrecerCreditoLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(OfrecerCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(134, 134, 134))
        );

        getContentPane().add(OfrecerCredito, "card4");

        jTablePrestamosAceptar3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uuid", "dni", "nombre", "apellidos", "telefono", "direccion", "localidad", "fechaNac", "iban"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanepropietarios5.setViewportView(jTablePrestamosAceptar3);

        btnVolver9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver9.setText("Volver");
        btnVolver9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver9ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Uuid: ");

        javax.swing.GroupLayout ListarClientesLayout = new javax.swing.GroupLayout(ListarClientes);
        ListarClientes.setLayout(ListarClientesLayout);
        ListarClientesLayout.setHorizontalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarClientesLayout.createSequentialGroup()
                .addGroup(ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ListarClientesLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPanepropietarios5, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE))
                    .addGroup(ListarClientesLayout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(jLabel12)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addGap(147, 147, 147)
                        .addComponent(btnVolver9, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                .addGap(117, 117, 117))
        );
        ListarClientesLayout.setVerticalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarClientesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPanepropietarios5, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel12))
                .addGap(254, 254, 254))
        );

        getContentPane().add(ListarClientes, "card4");

        Inicio.setPreferredSize(new java.awt.Dimension(1000, 500));

        btnWebsite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnWebsite.setText("Website");
        btnWebsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWebsiteActionPerformed(evt);
            }
        });

        btnContacto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnContacto.setText("Contacto");
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });

        btnQuienesSomos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuienesSomos.setText("Quienes Somos");
        btnQuienesSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuienesSomosActionPerformed(evt);
            }
        });

        btnIniciarSesion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIniciarSesion2.setText("Iniciar Sesión");
        btnIniciarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion2ActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(btnIniciarSesion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(btnContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnQuienesSomos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(131, 131, 131)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnQuienesSomos, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(Inicio, "card2");

        jMenuArchivo.setText("Archivo");

        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardar);
        jMenuArchivo.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarArchivo.add(jMenuArchivo);

        setJMenuBar(jMenuBarArchivo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarItems() {
        comboSituacionLaboral.addItem("empleado");
        comboSituacionLaboral.addItem("desempleado");
        comboSituacionLaboral.addItem("estudiante");
        comboSituacionLaboral.addItem("autónomo");
        comboSituacionLaboral.addItem("pensionista");
        comboSituacionLaboral.addItem("rentista");
        comboSituacionLaboral.addItem("responsable del hogar");
        comboTipoCuenta.addItem("ahorro");
        comboTipoCuenta.addItem("corriente");
        comboTipoRegimen.addItem("gananciales");
        comboTipoRegimen.addItem("separación de bienes");
        comboOperacion.addItem(" ");
        comboOperacion.addItem("Transferencia");
        comboOperacion.addItem("Ingreso");
        comboOperacion.addItem("Retirada de efectivo");
        LocalidadcomboBox2.addItem("Santander");
        LocalidadcomboBox2.addItem("Torrelavega");
        LocalidadcomboBox2.addItem("Reinosa");
        LocalidadcomboBox2.addItem("Cabezón de la Sal");
        LocalidadcomboBox2.addItem("Suances");

        cmbLocalidad2.addItem("Santander");
        cmbLocalidad2.addItem("Torrelavega");
        cmbLocalidad2.addItem("Reinosa");
        cmbLocalidad2.addItem("Cabezón de la Sal");
        cmbLocalidad2.addItem("Suances");

    }

    private void mostrarImagen() {
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Imagen/logocor.png"));
        Icon icon = new ImageIcon(img.getImage().
                getScaledInstance(lblIcono.getWidth(),
                        lblIcono.getHeight(), img.getIconWidth()));
        lblIcono.setIcon(icon);
    }

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        // BOTON VOLVER DE CONSULTAR PRESTAMOS CLIENTE
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
//        escribirFichero();
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void EntrarBanqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarBanqBtnActionPerformed
        //BOTON ENTRAR INICIAR SESION BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(true);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_EntrarBanqBtnActionPerformed

    private void EntrarCliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarCliBtnActionPerformed
//      BOTON INICIAR SESION COMO USUARIO EN INICIO DE BANQUERO
        InicioSesion.setVisible(true);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_EntrarCliBtnActionPerformed

    private void OfrecerCreditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfrecerCreditoBtnActionPerformed
        // BOTON OFRECER PRESTAMO OPCIONES BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(true);
        ListarClientes.setVisible(false);


    }//GEN-LAST:event_OfrecerCreditoBtnActionPerformed

    private void CerrarSesionBanqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionBanqBtnActionPerformed
        //BOTON CERRAR SESION BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(true);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_CerrarSesionBanqBtnActionPerformed

    private void EnterBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBtActionPerformed
        //BOTON ENTRAR EN INICIO DE SESION DE USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
        MetodosAplicacion.escUuid(UsuarioTxt.getText());

    }//GEN-LAST:event_EnterBtActionPerformed

    private void EnterBanqueroBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBanqueroBtActionPerformed
        //BOTON ENTRAR COMO BANQUERO EN INICIO DE SESION USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(true);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);


    }//GEN-LAST:event_EnterBanqueroBtActionPerformed

    private void UsuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTxtActionPerformed
        // TEXTO USUARIO DE INICIO DE SESION DE USUARIO
    }//GEN-LAST:event_UsuarioTxtActionPerformed

    private void PasswordUsuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordUsuarioTxtActionPerformed
        // TEXTO CONTRASEÑA DE INICIO DE SESION USUARIO
    }//GEN-LAST:event_PasswordUsuarioTxtActionPerformed

    private void SolicitarPrestamoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarPrestamoBtnActionPerformed
        // BOTON SOLICITAR PRESTAMO EN OPCIONES DE USUARIO
    }//GEN-LAST:event_SolicitarPrestamoBtnActionPerformed

    private void CerrarSesionUsuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionUsuBtnActionPerformed
        //BOTON CERRAR SERION EN OPCIONES DE USUARIO
        InicioSesion.setVisible(true);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_CerrarSesionUsuBtnActionPerformed

    private void ConsultarPrestamosLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPrestamosLblActionPerformed
        // BOTON CONSULTAR ESTADO DE LOS PRESTAMOS EN USUARIOS
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(true);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);

        jTableClientes.setModel(limpiarTabla((DefaultTableModel) jTableClientes.getModel(), jTableClientes));//limpia la tabla

        //DEFINIR VALORES A LA TABLA
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        FuncionesPrestamo funcPrestamo = new FuncionesPrestamo();
        Object[] prueba = new Object[9];

        String uuid = MetodosAplicacion.leeUuid();
        List<Prestamos> prestamo = funcPrestamo.listar(uuid);
        for (Prestamos prestamos : prestamo) {
            prueba[0] = prestamos.getIdPres();
            prueba[1] = prestamos.getPeriodo();
            prueba[2] = prestamos.getFechaOfer();
            prueba[3] = prestamos.getPlazo();
            prueba[4] = prestamos.getInteres();
            prueba[5] = prestamos.getCantidad();
            prueba[6] = prestamos.getFechaFirma();
            prueba[7] = prestamos.getCantMens();
            prueba[8] = prestamos.getUuid();
            modelo.addRow(prueba);
        }

        jTableClientes.setModel(modelo);

    }//GEN-LAST:event_ConsultarPrestamosLblActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        //BOTON VOLVER DE ACEPTAR PRESTAMO POR EL USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private DefaultTableModel limpiarTabla(DefaultTableModel d, JTable t) {//metodo auxiliar de tabla aceptarPrestamos
        for (int i = 0; i < t.getRowCount();) {
            d.removeRow(i);
        }
        return d;
    }

    private void actualizaTabla() { //metodo auxiliar de tabla aceptarPrestamos, depende de limpiarTabla
        jTablePrestamosAceptar.setModel(limpiarTabla((DefaultTableModel) jTablePrestamosAceptar.getModel(), jTablePrestamosAceptar));//limpia la tabla
        //DEFINIR VALORES A TABLA
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar.getModel();
        FuncionesPrestamo funcPrestamo = new FuncionesPrestamo();
        Object[] prueba = new Object[10];

        String uuid = MetodosAplicacion.leeUuid();
        List<Prestamos> prestamo = funcPrestamo.listarNoAceptados(uuid);
        for (Prestamos prestamos : prestamo) {
            prueba[0] = prestamos.getIdPres();
            prueba[1] = prestamos.getPeriodo();
            prueba[2] = prestamos.getFechaOfer();
            prueba[3] = prestamos.getPlazo();
            prueba[4] = prestamos.getInteres();
            prueba[5] = prestamos.getCantidad();
            prueba[6] = prestamos.getFechaFirma();
            prueba[7] = prestamos.getCantMens();
            prueba[8] = prestamos.getUuid();
            modelo.addRow(prueba);
        }

        jTablePrestamosAceptar.setModel(modelo);
    }
    private void AceptarPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarPrestActionPerformed
        // BOTON ACEPTAR PRESTAMO DE USUARIO
        int idPres = 0;
        int fila = jTablePrestamosAceptar.getSelectedRow(); //IDENTIFICA LA FILA SELECCIONADA
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila");// MENSAJE DE INFO
        } else {
            //ACTUALIZA BASE DE DATOS Y LA TABLA
            idPres = Integer.parseInt(jTablePrestamosAceptar.getValueAt(fila, 0).toString());
            MetodosAplicacion.concedePrestamo(idPres);
            actualizaTabla();

        }


    }//GEN-LAST:event_AceptarPrestActionPerformed

    private void AceptarPrestamoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarPrestamoBtnActionPerformed
        // BOTON ACEPTAR PRESTAMOS EN OPCIONES DE USUARIO

        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(true);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);

        jTablePrestamosAceptar.setModel(limpiarTabla((DefaultTableModel) jTablePrestamosAceptar.getModel(), jTablePrestamosAceptar));//limpia la tabla
        // DEFINICION DE VALORES TABLA
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar.getModel();
        FuncionesPrestamo funcPrestamo = new FuncionesPrestamo();
        Object[] prueba = new Object[10];

        String uuid = MetodosAplicacion.leeUuid();
        List<Prestamos> prestamo = funcPrestamo.listarNoAceptados(uuid);
        for (Prestamos prestamos : prestamo) {
            prueba[0] = prestamos.getIdPres();
            prueba[1] = prestamos.getPeriodo();
            prueba[2] = prestamos.getFechaOfer();
            prueba[3] = prestamos.getPlazo();
            prueba[4] = prestamos.getInteres();
            prueba[5] = prestamos.getCantidad();
            prueba[6] = prestamos.getFechaFirma();
            prueba[7] = prestamos.getCantMens();
            prueba[8] = prestamos.getUuid();
            modelo.addRow(prueba);
        }

        jTablePrestamosAceptar.setModel(modelo);
    }//GEN-LAST:event_AceptarPrestamoBtnActionPerformed


    private void btnVolver4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver4ActionPerformed
        // BOTON DE VOLVER EN LISTAR PRESTAMOS OFRECIDO A CLIENTES
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver4ActionPerformed

    private void NumBanqueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumBanqueTxtActionPerformed
        // NUMERO DE INICIO DE SESION BANQUERO
    }//GEN-LAST:event_NumBanqueTxtActionPerformed

    private void PasswordBanqueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBanqueTxtActionPerformed
        // CONTRASEÑA DE INICIO DE SESION DE BANQUERO
    }//GEN-LAST:event_PasswordBanqueTxtActionPerformed

    private void ListarClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClientesBtnActionPerformed
        // BOTON LISTAR CLIENTE OPCIONES BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(true);
        FuncionesClientes funcCliente = new FuncionesClientes();

        jTablePrestamosAceptar3.setModel(limpiarTabla((DefaultTableModel) jTablePrestamosAceptar3.getModel(), jTablePrestamosAceptar3));//limpia la tabla
        // DEFINICION DE VALORES TABLA
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar3.getModel();
        Object[] prueba = new Object[10];

        List<Clientes> lista = funcCliente.listaClientes();
        for (Clientes cliente : lista) {
            prueba[0] = cliente.getUuid();
            prueba[1] = cliente.getDni();
            prueba[2] = cliente.getNombre();
            prueba[3] = cliente.getApellidos();
            prueba[4] = cliente.getTelefono();
            prueba[5] = cliente.getDireccion();
            prueba[6] = cliente.getLocalidad();
            prueba[7] = cliente.getFechaNac();
            prueba[8] = cliente.getIban();
            modelo.addRow(prueba);
        }

        jTablePrestamosAceptar3.setModel(modelo);
    }//GEN-LAST:event_ListarClientesBtnActionPerformed

    private void RevisarSolicitudesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarSolicitudesBtnActionPerformed
        // BOTON REVISAR SOLICITUDES OPCIONES BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(true);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_RevisarSolicitudesBtnActionPerformed

    private void RegistrarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteBtnActionPerformed
        // BOTON REGISTRAR CLIENTE OPCIONES BANQUERO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(true);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_RegistrarClienteBtnActionPerformed

    private void ConsultarCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCuentaBtnActionPerformed
        // BOTON CONSULTAR MI CUENTA EN OPCIONES DE USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(true);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);

        jTableClientes2.setModel(limpiarTabla((DefaultTableModel) jTableClientes2.getModel(), jTableClientes2));//limpia la tabla
        // DEFINICION DE VALORES TABLA
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes2.getModel();
        FuncionesCuentas funcCuenta = new FuncionesCuentas();
        FuncionesClientes funcCliente = new FuncionesClientes();
        Object[] prueba = new Object[5];

        String uuid = MetodosAplicacion.leeUuid();
        String ibanCliente = funcCliente.porId(uuid).getIban();
        Cuentas cuenta = funcCuenta.porId(ibanCliente);
        if (cuenta != null) {
            prueba[0] = cuenta.getIban();
            prueba[1] = cuenta.getTipoCuenta().name();
            prueba[2] = cuenta.getSaldo();
            prueba[3] = cuenta.getNominaUltimo();
            prueba[4] = cuenta.getNominaMedAnual();

            modelo.addRow(prueba);

            jTableClientes2.setModel(modelo);
        }

    }//GEN-LAST:event_ConsultarCuentaBtnActionPerformed

    private void RealizarOperacionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarOperacionBtnActionPerformed
        // BOTON REALIZAR OPERACION EN OPCIONES USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(true);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_RealizarOperacionBtnActionPerformed

    private void btnVolver5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver5ActionPerformed
        // BOTON VOLVER DE CONSULTAR CUENTA USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver5ActionPerformed

    private void btnConsultarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentaActionPerformed
        // BOTON CONSULTAR CUENTA DE USUARIO
    }//GEN-LAST:event_btnConsultarCuentaActionPerformed

    private void btnAceptarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarOperacionActionPerformed
        // BOTON DE ACEPTAR OPERACION DE USUARIO

        String opcion = comboOperacion.getSelectedItem().toString();
        String uuid = MetodosAplicacion.leeUuid();
        if (txtApellido1.getText() == null || txtIBAN1.getText() == null) {
            JOptionPane.showMessageDialog(null, "No se han introducido los datos requeridos");
        } else {
            if (opcion.equalsIgnoreCase("Transferencia")) {
                if (MetodosAplicacion.porIban(txtDireccionReg1.getText()).getUuid().equalsIgnoreCase(uuid)) {
                    MetodosAplicacion.transferencia(MetodosAplicacion.porIban(txtDireccionReg1.getText()).getUuid(), MetodosAplicacion.porIban(txtApellido1.getText()).getUuid(), Double.parseDouble(txtIBAN1.getText()));//transferencia del emisor al receptor con la cantidad
                } else {
                    JOptionPane.showMessageDialog(null, "El iban del emisor no coincide con el usuario que esta pidiendo la transferencia");
                }
            } else if (opcion.equalsIgnoreCase("Ingreso")) {
                MetodosAplicacion.ingresar(MetodosAplicacion.porIban(txtApellido1.getText()).getUuid(), Double.parseDouble(txtIBAN1.getText()));
            } else {
                MetodosAplicacion.retirar(MetodosAplicacion.porIban(txtApellido1.getText()).getUuid(), Double.parseDouble(txtIBAN1.getText()));
            }
        }


    }//GEN-LAST:event_btnAceptarOperacionActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // BOTON VOLVER EN OPERACIONES DE USUARIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(true);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        //BOTON CONTACTO INICIO
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(true);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnWebsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWebsiteActionPerformed
        //        // BOTON AÑADIR PÁGINA WEB
        //        Panel1.setVisible(false);
        //        Panel2.setVisible(true);
        //        Panel3.setVisible(false);
        //        txtNombre.setEnabled(false);
        //        txtTelefono.setEnabled(false);
    }//GEN-LAST:event_btnWebsiteActionPerformed

    private void btnQuienesSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuienesSomosActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(true);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnQuienesSomosActionPerformed

    private void btnIniciarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion2ActionPerformed
        // BOTON PASAR A INICIAR SESIÓN
        InicioSesion.setVisible(true);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesion2ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // BOTON SALIR
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void txtIBAN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIBAN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIBAN1ActionPerformed

    private void comboOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOperacionActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_comboOperacionActionPerformed

    private void txtDireccionReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionReg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionReg1ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtDNINIF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNINIF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNINIF2ActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void btnComprobar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobar2ActionPerformed
        // TODO add your handling code here:
        FuncionesClientes funcCliente = new FuncionesClientes();
        if (funcCliente.porId(txtIdUsua2.getText()) != null) {
            JOptionPane.showMessageDialog(null, "El id introducido no esta disponible");
        } else {
            JOptionPane.showMessageDialog(null, "El id introducido esta disponible");
        }
    }//GEN-LAST:event_btnComprobar2ActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void txtDireccionReg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionReg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionReg2ActionPerformed

    private void cmbLocalidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocalidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocalidad2ActionPerformed

    private void txtIBAN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIBAN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIBAN2ActionPerformed

    private void txtIdUsua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsua2ActionPerformed

    private void txtUsuReg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuReg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuReg2ActionPerformed

    private void txtConyuge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConyuge2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConyuge2ActionPerformed

    private void jCheckBoxAntecedentesJudi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAntecedentesJudi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAntecedentesJudi2ActionPerformed

    private void comboTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoCuentaActionPerformed

    private void comboSituacionLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacionLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSituacionLaboralActionPerformed

    private void btnAceptarOperacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarOperacion1ActionPerformed
        // TODO add your handling code here:
        Cuentas cuenta = null;
        Perfiles perfil = null;
        Clientes cliente = null;
        FuncionesClientes funcCliente = new FuncionesClientes();
        if (funcCliente.porId(txtIdUsua2.getText()) != null ) {
            JOptionPane.showMessageDialog(null, "El id introducido no esta disponible");
        } else {
            String idconyuge = jTextField4.getText();
            cuenta = new Cuentas(txtIBAN2.getText(), GestionEnum.transTipoCuenta(comboTipoCuenta.getSelectedItem().toString()), 0, Double.parseDouble(jTextField3.getText()), Double.parseDouble(jTextField3.getText()));
            if (funcCliente.porId(idconyuge) == null) {
                JOptionPane.showMessageDialog(null, "El id del conyuge no esta en este banco");
            } else {
                perfil = new Perfiles(txtUsuReg2.getText(), txtIdUsua2.getText(), txtConyuge2.getText(), GestionEnum.transSitCivil(jComboBox1.getSelectedItem().toString()), GestionEnum.transSitLaboral(comboSituacionLaboral.getSelectedItem().toString()), false, jCheckBoxAntecedentesJudi2.getHideActionText(), idconyuge, GestionEnum.transRegimen(comboTipoRegimen.getSelectedItem().toString()));
                Date prueba = jDateChooser1.getDate();
                LocalDate prueba2 = prueba.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                cliente = new Clientes(txtIdUsua2.getText(), jTextField5.getText(), txtNombre2.getText(), txtApellido2.getText(), txtTelefono2.getText(), txtDireccionReg2.getText(), cmbLocalidad2.getSelectedItem().toString(), prueba2, txtIBAN2.getText());
            }
        }
        MetodosAplicacion.registrarUsuario(cliente, perfil, cuenta);
    }//GEN-LAST:event_btnAceptarOperacion1ActionPerformed

    private void btnVolver6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver6ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(true);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver6ActionPerformed

    private void comboTipoRegimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoRegimenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoRegimenActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(true);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_AtrasBotonActionPerformed

    private void CerrarSesionUsuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionUsuBtn2ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(true);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_CerrarSesionUsuBtn2ActionPerformed

    private void btnVolver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver7ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(true);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver7ActionPerformed

    private void AceptarPrest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarPrest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarPrest1ActionPerformed

    private void jTextIdenPrestAcept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdenPrestAcept1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdenPrestAcept1ActionPerformed

    private void btnVolver8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver8ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(true);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver8ActionPerformed

    private void btnVolver9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver9ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(true);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(false);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_btnVolver9ActionPerformed

    private void LocalidadcomboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalidadcomboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalidadcomboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InicioSesion.setVisible(false);
        InicioBanquero.setVisible(false);
        OpcionesBanquero.setVisible(false);
        OpcionesUsuario.setVisible(false);
        Inicio.setVisible(true);
        RegistroCliente.setVisible(false);
        ListarPrestamos.setVisible(false);
        AceptarPrestamosUsu.setVisible(false);
        ListarPrestamosOfrecidos.setVisible(false);
        Contacto.setVisible(false);
        QuienesSomos.setVisible(false);
        RealizarOperacion.setVisible(false);
        ConsultarCuenta.setVisible(false);
        RevisarSolicitudes.setVisible(false);
        OfrecerCredito.setVisible(false);
        ListarClientes.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        UUID uuid = UUID.randomUUID();
        txtIdUsua2.setText(uuid.toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FuncionesClientes funcCliente = new FuncionesClientes();
        String uuid = "";
        FuncionesPrestamo funcPrestamo = new FuncionesPrestamo();
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar2.getModel();
        Object[] prueba = new Object[9];
        if (jTextField9.getText() != null && funcCliente.porId(jTextField9.getText()) != null) {
            uuid = jTextField9.getText();
            MetodosAplicacion.ofrecePrestamo(uuid, Integer.parseInt(jTextField7.getText()), Integer.parseInt(jTextField6.getText()), Double.parseDouble(jTextField8.getText()));
            jTablePrestamosAceptar2.setModel(limpiarTabla((DefaultTableModel) jTablePrestamosAceptar2.getModel(), jTablePrestamosAceptar2));
            List<Prestamos> prestamo = funcPrestamo.listar(uuid);
            for (Prestamos prestamos : prestamo) {
                prueba[0] = prestamos.getIdPres();
                prueba[1] = prestamos.getPeriodo();
                prueba[2] = prestamos.getFechaOfer();
                prueba[3] = prestamos.getPlazo();
                prueba[4] = prestamos.getInteres();
                prueba[5] = prestamos.getCantidad();
                prueba[6] = prestamos.getFechaFirma();
                prueba[7] = prestamos.getCantMens();
                prueba[8] = prestamos.getUuid();
                modelo.addRow(prueba);
            }

            jTablePrestamosAceptar2.setModel(modelo);

        } else {
            JOptionPane.showMessageDialog(null, "el uuid esta vacio");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTablePrestamosAceptar2.setModel(limpiarTabla((DefaultTableModel) jTablePrestamosAceptar2.getModel(), jTablePrestamosAceptar2));//limpia la tabla

        //DEFINIR VALORES A LA TABLA
        FuncionesClientes funcCliente = new FuncionesClientes();
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar2.getModel();
        FuncionesPrestamo funcPrestamo = new FuncionesPrestamo();
        Object[] prueba = new Object[9];
        String uuid = "";
        if (jTextField9.getText() != null && funcCliente.porId(jTextField9.getText()) != null) {
            uuid = jTextField9.getText();
            List<Prestamos> prestamo = funcPrestamo.listar(uuid);
            for (Prestamos prestamos : prestamo) {
                prueba[0] = prestamos.getIdPres();
                prueba[1] = prestamos.getPeriodo();
                prueba[2] = prestamos.getFechaOfer();
                prueba[3] = prestamos.getPlazo();
                prueba[4] = prestamos.getInteres();
                prueba[5] = prestamos.getCantidad();
                prueba[6] = prestamos.getFechaFirma();
                prueba[7] = prestamos.getCantMens();
                prueba[8] = prestamos.getUuid();
                modelo.addRow(prueba);
            }

            jTablePrestamosAceptar2.setModel(modelo);

        } else {
            JOptionPane.showMessageDialog(null, "el uuid esta vacio");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosAceptar3.getModel();
        FuncionesClientes funcCliente = new FuncionesClientes();
        Clientes cliente = funcCliente.porId(jTextField1.getText());
        Object[] prueba = new Object[9];
        prueba[0] = cliente.getUuid();
        prueba[1] = cliente.getDni();
        prueba[2] = cliente.getNombre();
        prueba[3] = cliente.getApellidos();
        prueba[4] = cliente.getTelefono();
        prueba[5] = cliente.getDireccion();
        prueba[6] = cliente.getLocalidad();
        prueba[7] = cliente.getFechaNac();
        prueba[8] = cliente.getIban();
        modelo.addRow(prueba);
        jTablePrestamosAceptar3.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarPrest;
    private javax.swing.JButton AceptarPrest1;
    private javax.swing.JButton AceptarPrestamoBtn;
    private javax.swing.JPanel AceptarPrestamosUsu;
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JLabel BienvenidoLbl;
    private javax.swing.JLabel BienvenidoLbl1;
    private javax.swing.JLabel BienvenidoLbl2;
    private javax.swing.JButton CerrarSesionBanqBtn;
    private javax.swing.JButton CerrarSesionUsuBtn;
    private javax.swing.JButton CerrarSesionUsuBtn2;
    private javax.swing.JPanel ConsultarCuenta;
    private javax.swing.JButton ConsultarCuentaBtn;
    private javax.swing.JButton ConsultarPrestamosLbl;
    private javax.swing.JPanel Contacto;
    private javax.swing.JToggleButton EnterBanqueroBt;
    private javax.swing.JButton EnterBt;
    private javax.swing.JButton EntrarBanqBtn;
    private javax.swing.JButton EntrarCliBtn;
    private javax.swing.JTextField FiltrarEdad1;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel InicioBanqueLbl;
    private javax.swing.JPanel InicioBanquero;
    private javax.swing.JLabel InicioLbl;
    private javax.swing.JPanel InicioSesion;
    private javax.swing.JPanel ListarClientes;
    private javax.swing.JButton ListarClientesBtn;
    private javax.swing.JPanel ListarPrestamos;
    private javax.swing.JPanel ListarPrestamosOfrecidos;
    private javax.swing.JComboBox<String> LocalidadcomboBox2;
    private javax.swing.JLabel MenOpLbl;
    private javax.swing.JTextField NumBanqueTxt;
    private javax.swing.JLabel NumeroBanqueLbl;
    private javax.swing.JPanel OfrecerCredito;
    private javax.swing.JButton OfrecerCreditoBtn;
    private javax.swing.JPanel OpcionesBanquero;
    private javax.swing.JPanel OpcionesUsuario;
    private javax.swing.JLabel PasswordBanqueLbl;
    private javax.swing.JPasswordField PasswordBanqueTxt;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JPasswordField PasswordUsuarioTxt;
    private javax.swing.JPanel QuienesSomos;
    private javax.swing.JPanel RealizarOperacion;
    private javax.swing.JButton RealizarOperacionBtn;
    private javax.swing.JButton RegistrarClienteBtn;
    private javax.swing.JPanel RegistroCliente;
    private javax.swing.JPanel RevisarSolicitudes;
    private javax.swing.JButton RevisarSolicitudesBtn;
    private javax.swing.JButton SolicitarPrestamoBtn;
    private javax.swing.JLabel UsuarioLbl;
    private javax.swing.JTextField UsuarioTxt;
    private javax.swing.JButton btnAceptarOperacion;
    private javax.swing.JButton btnAceptarOperacion1;
    private javax.swing.JButton btnComprobar2;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnIniciarSesion2;
    private javax.swing.JButton btnQuienesSomos;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JButton btnVolver4;
    private javax.swing.JButton btnVolver5;
    private javax.swing.JButton btnVolver6;
    private javax.swing.JButton btnVolver7;
    private javax.swing.JButton btnVolver8;
    private javax.swing.JButton btnVolver9;
    private javax.swing.JButton btnWebsite;
    private javax.swing.JComboBox<String> cmbLocalidad2;
    private javax.swing.JComboBox<String> comboOperacion;
    private javax.swing.JComboBox<String> comboSituacionLaboral;
    private javax.swing.JComboBox<String> comboTipoCuenta;
    private javax.swing.JComboBox<String> comboTipoRegimen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxAntecedentesJudi2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellidos1;
    private javax.swing.JLabel jLabelApellidos2;
    private javax.swing.JLabel jLabelContrasena2;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelDireccion2;
    private javax.swing.JLabel jLabelIBAN1;
    private javax.swing.JLabel jLabelIBAN2;
    private javax.swing.JLabel jLabelLocalidad1;
    private javax.swing.JLabel jLabelLocalidad2;
    private javax.swing.JLabel jLabelNif2;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelSitCivil2;
    private javax.swing.JLabel jLabelTelefono2;
    private javax.swing.JLabel jLabelTipRegi2;
    private javax.swing.JLabel jLabelTipoCuenta2;
    private javax.swing.JLabel jLabelUsuarioReg2;
    private javax.swing.JLabel jLabelidConyuge2;
    private javax.swing.JLabel jLabelidUsuario2;
    private javax.swing.JLabel jLabelidenPrestAcep1;
    private javax.swing.JLabel jLabelsitLaboral2;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarArchivo;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanelDatosCuenta2;
    private javax.swing.JPanel jPanelRegistrarCliente1;
    private javax.swing.JPanel jPanelRegistrarCliente2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneClientes;
    private javax.swing.JScrollPane jScrollPanepropietarios;
    private javax.swing.JScrollPane jScrollPanepropietarios1;
    private javax.swing.JScrollPane jScrollPanepropietarios2;
    private javax.swing.JScrollPane jScrollPanepropietarios3;
    private javax.swing.JScrollPane jScrollPanepropietarios4;
    private javax.swing.JScrollPane jScrollPanepropietarios5;
    private javax.swing.JScrollPane jScrollPanepropietarios6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableClientes1;
    private javax.swing.JTable jTableClientes2;
    private javax.swing.JTable jTableClientes3;
    private javax.swing.JTable jTablePrestamosAceptar;
    private javax.swing.JTable jTablePrestamosAceptar1;
    private javax.swing.JTable jTablePrestamosAceptar2;
    private javax.swing.JTable jTablePrestamosAceptar3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextIdenPrestAcept1;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtConyuge2;
    private javax.swing.JTextField txtDNINIF2;
    private javax.swing.JTextField txtDireccionReg1;
    private javax.swing.JTextField txtDireccionReg2;
    private javax.swing.JTextField txtIBAN1;
    private javax.swing.JTextField txtIBAN2;
    private javax.swing.JTextField txtIdUsua2;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtUsuReg2;
    // End of variables declaration//GEN-END:variables
}
