import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.border.CompoundBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JToggleButton;

import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;

import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.Window;

import javax.swing.JSeparator;
import java.awt.Dimension;
import com.toedter.calendar.JCalendar;
import javax.swing.border.LineBorder;
import com.toedter.components.JLocaleChooser;


import com.toedter.calendar.JDateChooser;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.text.JTextComponent;

public class Dashboard {

	
	
	private JFrame frame;
	
	static Dashboard window;
	Splash splash = new Splash();
	Onboarding onboarding = new Onboarding();
	
	private JLabel lblSidebarHome, lblSidebarHomeIcon, lblSidebarIngresos, lblSidebarIngresosIcon, lblSidebarGastos, lblSidebarGastosIcon, 
	lblSidebarPresupuestos, lblSidebarPrespuestosIcon, lblSidebarSalir, lblSidebarSalirIcon, btnAgregarIngreso;
	private JList listMostrarEventos;

	public JPanel sidebar;
	
	private JPanel pSidebarDashboard, pSidebarIngresos, pSidebarGastos, pSidebarPresupuestos, pSidebarSalir, main, resumen, ingresos, gastos,
	panelGraficaIngresos, presupuestos, ingresarIngresos, btnSidebarHome, btnSidebarIngresos, btnSidebarGastos, btnSidebarPresupuestos, btnSidebarSalir;
	private JLabel lblUserImage, lblUsername;

	private JButton btnGuardar,btnAgregarNombreIngreso, btnRegresar;

	private MiListener oyente;
	private ConexionMongoDB DB;
	private JTextField txtMontoingresos;
	private JComboBox cbCategoriaIngresos,cbEliminarIngreso;
	private JLabel lblNewLabel;
	private JLabel lblEditaLasCaracteristicas;
	private JList listMuestraIngresos;
	private JScrollPane scrollPane;
	private JLabel lblQ;
	private JLabel lblAgregarCategoria;
	private JLabel lblNombre;
	private JTextField txtAgregarCategoriaIngresos;
	private JLabel lblEliminarCategoria;
	private JLabel label_1;
	private JButton btnEliminar;
	private JPanel ingresarGastos;
	private JLabel lblGastos;
	private JLabel lblTotalGastos;
	private JLabel lblQ2;
	private JLabel btnAgregarGasto;
	private JLabel lblAgregarUnNuevo;
	private JList listGastos;
	private JScrollPane scrollPane_1;
	private JLabel lblGastos_1;
	private JButton btnRegresar2;
	private JPanel panel_1;
	private JLabel label_6;
	private JLabel lblDeGastos;
	private JLabel lblEditaLasCaracteristicas_1;
	private JLabel label_9;
	private JComboBox cbCategoriaGastos;
	private JLabel label_10;
	private JTextField txtMontoGasto;
	private JButton btnGuardar2;
	private JButton btnAgregarCategoriaGastos;
	private JTextField txtNombreGasto;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JComboBox cbEliminarGasto;
	private JButton btnEliminarCategoriaGastos;
	private JPanel panelGraficaGastos;
	private ChartPanel graph1;
	private ChartPanel graph2;
	private JButton btnCambiarFoto;
	private JPanel pSidebarPerfil;
	private JCalendar calendar;
	private JLabel lblSidebarPerfil;
	private JPanel perfil;

	private JPanel btnSidebarPerfil;

	private Container lblSidebarPerfilIcon;
	private JLabel lblPerfilPicture;
	private JTextField fPerfilNombre;
	private JTextField fPerfilCorreo;

	private JButton perfilCambiarContrasena;

	private JButton btnGuardarCambios;
	private JSeparator separator_2;
	private JTextField textField;

	private JLabel topbarBrandIcon;

	private JPanel topbar,panel_6;

	private JLabel topbarBuscarIcon;

	private JLabel topbarSettingsIcon;
	private JSeparator separator_3;
	
	
	Settings settings;
	private JPanel panel_2;
	private JLabel label_2;
	private JTextField textField_1;
	private JLabel label_3;
	private JLabel label_4;
	private JSeparator separator_4;
	private JDateChooser dcEstablecerEventos,dcMostrarEventos;
	private JTextField fPerfilApellido;
	private JLabel lblApellido;
	private JLabel lblCorre;
	
	private ImageIcon imgPerfil;
	private Image imgPer;

	private JLabel topbarNotificationIcon;
	private JLabel btbRegresarIngresos;
	private JLabel lblContrasena;
	private JTextField fNuevaContrasena;
	private JTextField fConfirmarContrasena;
	private JTextArea txtDescripcion,txtADescripcionMostrar;
	private JButton btnGuardarContrasena;

	private JButton btnCancelarCambio,btnAgregarEvento;

	private JPanel pCambiarContrasena;
	private JLabel lblContrasenaDebe;
	private JLabel lblDiferenteAl;
	private JLabel lblPerfilError;
	private ArrayList<String> usuarioLeer;
	private String[] nombres;
	private String tempNombre;
	private String tempApellido;
	private String tempCorreo;
	private JComboBox cbEliminar;

	private JPanel btnSidebarCalendario;

	private JPanel pSidebarCalendario,panel_4;
	private JPanel calendario;

	private JLabel lblSidebarCalendarioIcon;

	private JLabel lblSidebarCalendario;
	private JLabel lblMostrarEventos;
	private JLabel label;
	private JButton btnMostrar;
	private JTextField txtTitulo;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JSeparator separator_9;
	private JPanel panel_5;
	private JButton btnEliminarEvento;
	private JButton btnEstablecerEvento;
	private JLabel lblEliminarEvento;
	private JLabel label_7;
	private JDateChooser dcEliminar;
	private JButton btnMostrareliminar;
	private JLabel lblTitulo_1;
	private JButton btnEliminar_1;
	private JLabel lblNewLabel_3;
	private JButton btnSi;
	private JButton btnNo,btnDarkMode;
	private JPanel panel_7;
	private JPanel pPerfilMain;
	private JPanel presupuestoMain;
	private JPanel selecPresCateg;
	private JPanel presHogar;

	private JProgressBar progressBarPresupuestos;

	private Object oyentePresSalud;

	private JButton btnPresRegalos, btnPresViajes, btnPresRopa, btnPresFinanzas, btnPresSalud, btnHogarGuardar, btnAutoGuardar,
	btnPresAuto, btnPresHogar, btnPresAlimentos, btnPresEntretenimiento, btnPresEducacion;


	private JLabel lblAuto, lblAuto_1, lblArticulosParaEl2, label_12PA, lblMascotas2, lblConstruccionYRemodelacion2, lblLimpiezaYMantenimiento2, lblMueblesYAparatos2,
	label_8PA, label_3PA, lblRentaOCompra2, label_202, btnAutoRegresar, lblAutoYTransporte, btnEntretenimientoRegresar, label_19, label_21, lblEntretenimiento,
	lblEntretenimiento_1, lblCineYMsica, label_25, lblJuegos, lblMuseosYParqueos, lblSubscripcionesYApps, lblAlchoholYTabaco, label_8P, lblHogar_1, label_3P, label_12P, lblConstruccionYRemodelacion, lblArticulosParaEl, lblMascotas, lblLimpiezaYMantenimiento,
	lblMueblesYAparatos, lblRentaOCompra, label_20, lblHogar, btnHogarRegresar, lblPresupuestoTotal_1, lblQP, lblPresupuestoTotal, label_6P, presTotalIngresos, presIngresos, btnCrearPres, label_15, lblNewLabel_1P,
	lblSeleccioneUnaCategoria;

	private JTextField fieldAutoTotal, fieldAuto2,  fieldAuto3, fieldAuto5, fieldAuto4, fieldAuto6, fieldAuto7, fieldAuto8,
				fieldAlimentosTotal, fieldAlimentos2, fieldAlimentos3, fieldAlimentos4, fieldEntretenimiento2, fieldEntretenimiento3, fieldEntretenimiento4,
				fieldEntretenimiento5, fieldEntretenimiento6, fieldHogarTotal, fieldHogar2, fieldHogar3, fieldHogar4, fieldHogar5, fieldHogar6, fieldHogar7, fieldHogar8;

	private JPanel panel_17, panel_16, panel_15, panel_10, panelAuto3, panelAuto4, panelAuto5, panelAuto6, panelAuto7, panel_14, panel_9, presAlimentos, panelAuto8, panelAuto9, presEntretenimiento,
	panel_18, panel_19, panel_20, panelHogar, panelHogar2, panelHogar3, panelHogar4, panelHogar5, panelHogar6, panelHogar7, panelHogar8, panelHogar9, presAuto,
	panelAuto, panelAuto2, panel_21, presSalud, presEducacion, presFinanzas, panel_22, panel_23, panel_24;

	private JTextField fieldRegalos2, fieldRegalos3, fieldRegalos4, fieldRegalos5, fieldRegalos6,
						fieldRopaTotal, fieldRopa2, fieldRopa3, fieldRopa4, fieldRopa5, fieldRopa6,
						fieldFinanzasTotal, fieldFinanzas2, fieldFinanzas3, fieldFinanzas4, fieldFinanzas5, fieldFinanzas6, fieldFinanzas7, fieldFinanzas8,
						fieldEducacion2, fieldEducacion3, fieldEducacion4, fieldEducacion5, fieldEducacion6, fieldEducacion7, fieldEducacion8, fieldEducacionTotal,
						fieldSaludTotal, fieldSalud2, fieldSalud3, fieldSalud4, fieldSalud5, fieldSalud6, fieldSalud7, fieldSalud8,
						fieldViajes2, fieldViajes3, fieldViajes4, fieldViajes5, fieldViajes6, fieldViajesTotal, fieldRegalosTotal, fieldEntretenimiento7,
						fieldEntretenimiento8, fieldEntretenimientoTotal;
	
	private JButton btnRegalosGuardar, btnViajesGuardar, btnEducacionGuardar, btnAlimentosGuardar, btnRopaGuardar, btnFinanzasGuardar, btnSaludGuardar,
	btnEntretenimientoGuardar;
	private JLabel label_34, label_37, label_47, label_49, label_50, label_57, lblViajes, Viajes, lblSouvenir, lblTransporteDeViajes, lblBoletosYCruceros, lblHospedaje,
					lblAyudaHumanitaria, lblRegalos, lblApoyoAFamiliaresamigos, btnFinanzasRegresar, btnViajesRegresar, btnRegalosRegresar, btnRopaRegresar, lblDonaciones, 
					lblRegalosYAyuda_1, lblRegalosYAyuda, lblOtros_1, lblRopa, lblLavanderiaYTintoreria, lblAccesorios, lblCalzado, label_38, lblRopaYCalzado_1, 
					lblRopaYCalzado, label_33, label_32, label_43, lblTarjetasDeCredito, lblTransferenciosOCheques, lblServiviosFinancioer, lblMultas, lblImpuestos, label_36,
					lblSeguros, lblFinanzasEImpuestos, lblFinanzas, label_29, label_28, label_35, lblMdico, lblFarmacia, lblDeportesYEquipos, lblDentisat,
					lblCuidadoPersonal, lblEspectculosYEventos, label_31, btnSaludRegresar, label_22, label_23, lblSaludYBelleza, lblSaludYBelleza_1, label_27, lblPerfumesYCosmeticos;

	private JPanel panel_25, panel_26, panel_27, panel_28, panel_29, panel_30, panel_40, panel_41, panel_42, panel_43, panel_44, panel_45, panel_46, 
	panel_47, panel_48, panel_49, panel_50, panel_51, panel_52, panel_53, panel_54, panel_55, panel_56, panel_57, panel_58, panel_59, panel_60,
	panel_61, panel_62, panel_63, panel_64, panel_65, panel_66, panel_67, panel_68, panel_69, presViajes, presRegalos, presRopa;

	
	Presupuestos pres = new Presupuestos();
	private double presupuestoTotal = 0, fieldTotalHogar = 0, fieldTotalAuto = 0, fieldTotalAlimentos = 0, fieldTotalEntretenimiento = 0, fieldTotalSalud = 0,
			fieldTotalEducacion = 0, fieldTotalFinanzas = 0, fieldTotalRopa = 0, fieldTotalRegalos = 0, fieldTotalViajes = 0;
	
	
	boolean isDarkMode = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		DB = ConexionMongoDB.getConexion();
	
		usuarioLeer = DB.leerUsu();	
		
		// VARIABLES
		nombres = DB.getNombre(usuarioLeer.get(0));
		tempNombre =nombres[0];
		tempApellido = nombres[1];
		tempCorreo = usuarioLeer.get(0);
				
		isDarkMode = DB.getMode(tempCorreo);		
		
		if(isDarkMode == true) {
			UIManager.put("Label.foreground", new Color(252, 251, 254));
			UIManager.put("Label.background", new Color(252, 251, 254));
		}
		
		oyente = new MiListener();
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setSize(1354, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon(Dashboard.class.getResource("resources/Finanzas.png")).getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
				
		sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 745);
		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		
		btnSidebarPerfil = new JPanel();
		btnSidebarPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(isDarkMode == true) {
					pSidebarPerfil.setBackground(new Color(251, 251, 251));
					pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
					pSidebarDashboard.setBackground(new Color(36, 38, 46));
					pSidebarIngresos.setBackground(new Color(36, 38, 46));
					pSidebarCalendario.setBackground(new Color(36, 38, 46));
					pSidebarGastos.setBackground(new Color(36, 38, 46));
					
					lblSidebarPerfil.setForeground(new Color(252, 251, 254));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
				} else {
					pSidebarPerfil.setBackground(new Color(0, 0, 0));
					pSidebarPresupuestos.setBackground(new Color(251,251,251));
					pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarIngresos.setBackground(new Color(251,251,251));
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarGastos.setBackground(new Color(251,251,251));
					
					lblSidebarPerfil.setForeground(new Color(0, 0, 0));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
				}
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				calendario.setVisible(false);
				perfil.setVisible(true);
			}
		});
		btnSidebarPerfil.setOpaque(false);
		btnSidebarPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarPerfil.setBorder(new CompoundBorder());
		btnSidebarPerfil.setBackground(Color.CYAN);
		btnSidebarPerfil.setBounds(0, 450, 245, 36);
		sidebar.add(btnSidebarPerfil);
		
		
		
		lblUsername = new JLabel(tempNombre + " " + tempApellido );
		lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsername.setToolTipText("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(0, 122, 245, 30);
		sidebar.add(lblUsername);
		
		
		
		
		
		btnSidebarHome = new JPanel();
		btnSidebarHome.setBounds(0, 205, 245, 36);
		sidebar.add(btnSidebarHome);
		btnSidebarHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelGraficaIngresos.validate();
		        panelGraficaGastos.validate();
		        
		        if(isDarkMode == true) {
		        	pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarGastos.setBackground(new Color(36, 38, 46));
					pSidebarIngresos.setBackground(new Color(36, 38, 46));
					pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
					pSidebarCalendario.setBackground(new Color(36, 38, 46));
					pSidebarPerfil.setBackground(new Color(36, 38, 46));
					
					lblSidebarHome.setForeground(new Color(252, 251, 254));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
		        	
		        } else {
		        	pSidebarDashboard.setBackground(new Color(0, 0, 0));
					pSidebarGastos.setBackground(new Color(251,251,251));
					pSidebarIngresos.setBackground(new Color(251,251,251));
					pSidebarPresupuestos.setBackground(new Color(251,251,251));
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarPerfil.setBackground(new Color(251,251,251));
					
					lblSidebarHome.setForeground(new Color(0, 0, 0));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
		        }
		        
				
				resumen.setVisible(true);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				calendario.setVisible(false);
				perfil.setVisible(true);
				
				panelGraficaIngresos.removeAll();
				panelGraficaGastos.removeAll();
				
				graph1 = DB.getgrafica(usuarioLeer.get(0), "ingresos");
				graph2 = DB.getgrafica(usuarioLeer.get(0), "gastos");
				
				panelGraficaIngresos.add(graph1);
				panelGraficaGastos.add(graph2);
			}
		});
		btnSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarHome.setBorder(new CompoundBorder());
		btnSidebarHome.setBackground(Color.CYAN);
		btnSidebarHome.setOpaque(false);
		
		btnSidebarIngresos = new JPanel();
		btnSidebarIngresos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(isDarkMode == true) {
					pSidebarIngresos.setBackground(new Color(251, 251, 251));
					pSidebarDashboard.setBackground(new Color(36, 38, 46));
					pSidebarGastos.setBackground(new Color(36, 38, 46));
					pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
					pSidebarCalendario.setBackground(new Color(36, 38, 46));
					pSidebarPerfil.setBackground(new Color(36, 38, 46));
					
					lblSidebarIngresos.setForeground(new Color(252, 251, 254));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
					
				} else {
					pSidebarIngresos.setBackground(new Color(0, 0, 0));
					pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarGastos.setBackground(new Color(251,251,251));
					pSidebarPresupuestos.setBackground(new Color(251,251,251));
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarPerfil.setBackground(new Color(251,251,251));
					
					lblSidebarIngresos.setForeground(new Color(0, 0, 0));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				}
						
				resumen.setVisible(false);
				ingresos.setVisible(true);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				calendario.setVisible(false);
				perfil.setVisible(true);
				
				try {
					mostrarIngresos();
					}catch (Exception ex){}
			}
		});
		btnSidebarIngresos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarIngresos.setOpaque(false);
		btnSidebarIngresos.setBorder(new CompoundBorder());
		btnSidebarIngresos.setBackground(Color.CYAN);
		btnSidebarIngresos.setBounds(0, 251, 245, 36);
		sidebar.add(btnSidebarIngresos);
		
		btnSidebarGastos = new JPanel();
		btnSidebarGastos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(isDarkMode == true) {
					pSidebarGastos.setBackground(new Color(251, 251, 251));
					pSidebarDashboard.setBackground(new Color(36, 38, 46));
					pSidebarIngresos.setBackground(new Color(36, 38, 46));
					pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
					pSidebarCalendario.setBackground(new Color(36, 38, 46));
					pSidebarPerfil.setBackground(new Color(36, 38, 46));
				
					lblSidebarGastos.setForeground(new Color(252, 251, 254));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
					
				} else {
					pSidebarGastos.setBackground(new Color(0, 0, 0));
					pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarIngresos.setBackground(new Color(251,251,251));
					pSidebarPresupuestos.setBackground(new Color(251,251,251));
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarPerfil.setBackground(new Color(251,251,251));
					
					lblSidebarGastos.setForeground(new Color(0, 0, 0));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				}
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(true);
				presupuestos.setVisible(false);
				calendario.setVisible(false);
				perfil.setVisible(false);
				
				try {
					mostrarGastos();
					}catch (Exception ex){}
			}
		});
		btnSidebarGastos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarGastos.setOpaque(false);
		btnSidebarGastos.setBorder(new CompoundBorder());
		btnSidebarGastos.setBackground(Color.CYAN);
		btnSidebarGastos.setBounds(0, 297, 245, 36);
		sidebar.add(btnSidebarGastos);
		
		btnSidebarPresupuestos = new JPanel();
		btnSidebarPresupuestos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(isDarkMode == true) {
					pSidebarPresupuestos.setBackground(new Color(251, 251, 251));
					pSidebarDashboard.setBackground(new Color(36, 38, 46));
					pSidebarIngresos.setBackground(new Color(36, 38, 46));
					pSidebarGastos.setBackground(new Color(36, 38, 46));
					pSidebarCalendario.setBackground(new Color(36, 38, 46));
					pSidebarPerfil.setBackground(new Color(36, 38, 46));			
					
					lblSidebarPresupuestos.setForeground(new Color(252, 251, 254));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				} else {
					pSidebarPresupuestos.setBackground(new Color(0, 0, 0));
					pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarIngresos.setBackground(new Color(251,251,251));
					pSidebarGastos.setBackground(new Color(251,251,251));
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarPerfil.setBackground(new Color(251,251,251));			
					
					lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(119,119,119));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				}
		
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(true);
				calendario.setVisible(false);
				perfil.setVisible(false);
				
				mostrarIngresos();
			}
		});
		btnSidebarPresupuestos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarPresupuestos.setOpaque(false);
		btnSidebarPresupuestos.setBorder(new CompoundBorder());
		btnSidebarPresupuestos.setBackground(Color.CYAN);
		btnSidebarPresupuestos.setBounds(0, 348, 245, 36);
		sidebar.add(btnSidebarPresupuestos);
		
		btnSidebarSalir = new JPanel();
		btnSidebarSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int confirmado = JOptionPane.showConfirmDialog(null,"¿Estas seguro?");
				
				if (confirmado == 0) {
					frame.dispose();
					Login.main(null);
					DB.tempUsu(usuarioLeer.get(0), false);
					
				}
				
			}
		});
		btnSidebarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarSalir.setOpaque(false);
		btnSidebarSalir.setBorder(new CompoundBorder());
		btnSidebarSalir.setBackground(Color.CYAN);
		btnSidebarSalir.setBounds(0, 501, 245, 36);
		sidebar.add(btnSidebarSalir);
		
		
		ImageIcon userIcon = new ImageIcon(Dashboard.class.getResource("resources/user.png"));	
		Image image = userIcon.getImage();
		Image userImg = image.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		userIcon = new ImageIcon(userImg);
		
		lblUserImage = new JLabel("", userIcon, JLabel.CENTER);
		lblUserImage.setBounds(30, 28, 185, 80);
		sidebar.add(lblUserImage);
		lblUserImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPerfilPicture = new JLabel(new ImageIcon(userImg));			
		lblPerfilPicture.setLocation(122, 224);
		lblPerfilPicture.setSize(356, 200);
		lblPerfilPicture.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage img = DB.setImagen(usuarioLeer.get(0));
		 
		 if (img != null) {
			 ImageIcon imIcon = new ImageIcon(img);
			 Image imImg = imIcon.getImage().getScaledInstance(275, 160, Image.SCALE_SMOOTH);
			 lblPerfilPicture.setIcon(new ImageIcon(imImg));
			 
			 try {
		        
		        int diameter = Math.min(img.getWidth(), img.getHeight());
			    BufferedImage mask = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);

			    Graphics2D g2d = mask.createGraphics();
			    applyQualityRenderingHints(g2d);
			    g2d.fillOval(0, 0, diameter - 1, diameter - 1);
			    g2d.dispose();

			    BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
			    g2d = masked.createGraphics();
			    applyQualityRenderingHints(g2d);
			    int x = (diameter - img.getWidth()) / 2;
			    int y = (diameter - img.getHeight()) / 2;
			    g2d.drawImage(img, x, y, null);
			    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
			    g2d.drawImage(mask, 0, 0, null);
			    g2d.dispose();
			    
			    ImageIcon imgIcon = new ImageIcon(masked);
		        Image imgEscalada = imgIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
			    lblUserImage.setIcon(new ImageIcon(imgEscalada));
		        
		        
			 }catch(Exception e) {}
			 
		 }
		
		
		
		
		lblSidebarHome = new JLabel("Dashboard");
		if(isDarkMode == true) {
			lblSidebarHome.setForeground(new Color(252, 251, 254));
		} else {
			lblSidebarHome.setForeground(new Color(0, 0, 0));
		}
		lblSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarHome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHome.setBounds(60, 205, 185, 36);
		sidebar.add(lblSidebarHome);
		
		Icon homeIcon = new ImageIcon(Dashboard.class.getResource("resources/home.png"));
		Icon homeWIcon = new ImageIcon(Dashboard.class.getResource("resources/home_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarHomeIcon = new JLabel("", homeWIcon, JLabel.CENTER);
		} else {
			lblSidebarHomeIcon = new JLabel("", homeIcon, JLabel.CENTER);
		}
		lblSidebarHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHomeIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHomeIcon.setBounds(30, 205, 25, 36);
		sidebar.add(lblSidebarHomeIcon);
		
		pSidebarDashboard = new JPanel();
		if(isDarkMode == true) {
			pSidebarDashboard.setBackground(new Color(251, 251, 251));
		} else {
			pSidebarDashboard.setBackground(new Color(0, 0, 0));
		}
		
		pSidebarDashboard.setBounds(0, 205, 4, 36);
		sidebar.add(pSidebarDashboard);
		
		lblSidebarIngresos = new JLabel("Ingresos");
		lblSidebarIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarIngresos.setForeground(new Color(119,119,119));
		lblSidebarIngresos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresos.setBounds(60, 251, 185, 36);
		sidebar.add(lblSidebarIngresos);
		
		// 17px
		Icon ingresosIcon = new ImageIcon(Dashboard.class.getResource("resources/ingresos.png"));
		Icon ingresosWIcon = new ImageIcon(Dashboard.class.getResource("resources/ingresos_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarIngresosIcon = new JLabel("", ingresosWIcon, JLabel.CENTER);
		} else {
			lblSidebarIngresosIcon = new JLabel("", ingresosIcon, JLabel.CENTER);
		}
		lblSidebarIngresosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresosIcon.setBounds(30, 251, 25, 36);
		sidebar.add(lblSidebarIngresosIcon);
		
		
		lblSidebarGastos = new JLabel("Gastos");
		lblSidebarGastos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarGastos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastos.setForeground(new Color(119,119,119));
		lblSidebarGastos.setBounds(60, 297, 185, 36);
		sidebar.add(lblSidebarGastos);
		
		Icon gastosIcon = new ImageIcon(Dashboard.class.getResource("resources/gastos.png"));
		Icon gastosWIcon = new ImageIcon(Dashboard.class.getResource("resources/gastos_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarGastosIcon = new JLabel("", gastosWIcon, JLabel.CENTER);
		} else {
			lblSidebarGastosIcon = new JLabel("", gastosIcon, JLabel.CENTER);
		}
		lblSidebarGastosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastosIcon.setBounds(30, 297, 25, 36);
		sidebar.add(lblSidebarGastosIcon);
		
		lblSidebarPresupuestos = new JLabel("Presupuestos");
		lblSidebarPresupuestos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarPresupuestos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPresupuestos.setForeground(new Color(119,119,119));
		lblSidebarPresupuestos.setBounds(60, 348, 185, 36);
		sidebar.add(lblSidebarPresupuestos);
		
		Icon presupuestosIcon = new ImageIcon(Dashboard.class.getResource("resources/presupuestos.png"));
		Icon presupuestosWIcon = new ImageIcon(Dashboard.class.getResource("resources/presupuestos_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarPrespuestosIcon = new JLabel("", presupuestosWIcon, JLabel.CENTER);
		} else {
			lblSidebarPrespuestosIcon = new JLabel("", presupuestosIcon, JLabel.CENTER);
		}
		lblSidebarPrespuestosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPrespuestosIcon.setBounds(30, 348, 25, 36);
		sidebar.add(lblSidebarPrespuestosIcon);
		
		lblSidebarSalir = new JLabel("Salir");
		lblSidebarSalir.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalir.setForeground(new Color(119,119,119));
		lblSidebarSalir.setBounds(60, 501, 185, 36);
		sidebar.add(lblSidebarSalir);
		
		Icon salirIcon = new ImageIcon(Dashboard.class.getResource("resources/exit.png"));
		Icon salirWIcon = new ImageIcon(Dashboard.class.getResource("resources/salir_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarSalirIcon = new JLabel("", salirWIcon, JLabel.CENTER);
		} else {
			lblSidebarSalirIcon = new JLabel("", salirIcon, JLabel.CENTER);
		}
		
		lblSidebarSalirIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalirIcon.setBounds(30, 501, 25, 36);
		sidebar.add(lblSidebarSalirIcon);
		
		pSidebarIngresos = new JPanel();
		pSidebarIngresos.setBackground(new Color(251,251,251));
		pSidebarIngresos.setBounds(0, 251, 4, 36);
		sidebar.add(pSidebarIngresos);
		
		pSidebarGastos = new JPanel();
		pSidebarGastos.setBackground(new Color(251,251,251));
		pSidebarGastos.setBounds(0, 297, 4, 36);
		sidebar.add(pSidebarGastos);
		
		pSidebarPresupuestos = new JPanel();
		pSidebarPresupuestos.setBackground(new Color(251,251,251));
		pSidebarPresupuestos.setBounds(0, 348, 4, 36);
		sidebar.add(pSidebarPresupuestos);
		
		pSidebarSalir = new JPanel();
		pSidebarSalir.setBackground(new Color(251,251,251));
		pSidebarSalir.setBounds(0, 501, 4, 36);
		sidebar.add(pSidebarSalir);
		
		pSidebarPerfil = new JPanel();
		pSidebarPerfil.setBackground(new Color(251, 251, 251));
		pSidebarPerfil.setBounds(0, 450, 4, 36);
		sidebar.add(pSidebarPerfil);
		
		
		Icon perfilIcon = new ImageIcon(Dashboard.class.getResource("resources/perfil.png"));
		Icon perfilWIcon = new ImageIcon(Dashboard.class.getResource("resources/perfil_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarPerfilIcon = new JLabel("",perfilWIcon, JLabel.CENTER);
		} else {
			lblSidebarPerfilIcon = new JLabel("",perfilIcon, JLabel.CENTER);
		}
		lblSidebarPerfilIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPerfilIcon.setBounds(30, 450, 25, 36);
		sidebar.add(lblSidebarPerfilIcon);
		
		lblSidebarPerfil = new JLabel("Perfil");
		lblSidebarPerfil.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPerfil.setForeground(new Color(119,119,119));
		lblSidebarPerfil.setBounds(60, 450, 185, 36);
		sidebar.add(lblSidebarPerfil);
		
		
		btnSidebarCalendario = new JPanel();
		btnSidebarCalendario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtADescripcionMostrar.setText(null);
				
				if(isDarkMode == true) {
					pSidebarCalendario.setBackground(new Color(251, 251, 251));
					pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
					pSidebarDashboard.setBackground(new Color(36, 38, 46));
					pSidebarIngresos.setBackground(new Color(36, 38, 46));
					pSidebarGastos.setBackground(new Color(36, 38, 46));
					pSidebarPerfil.setBackground(new Color(36, 38, 46));		
					
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(252, 251, 254));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				} else {
					pSidebarCalendario.setBackground(new Color(0, 0, 0));
					pSidebarPresupuestos.setBackground(new Color(251, 251, 251));
					pSidebarDashboard.setBackground(new Color(251,251,251));
					pSidebarIngresos.setBackground(new Color(251,251,251));
					pSidebarGastos.setBackground(new Color(251,251,251));
					pSidebarPerfil.setBackground(new Color(251,251,251));		
					
					lblSidebarPresupuestos.setForeground(new Color(119,119,119));
					lblSidebarHome.setForeground(new Color(119,119,119));
					lblSidebarIngresos.setForeground(new Color(119,119,119));
					lblSidebarGastos.setForeground(new Color(119,119,119));
					lblSidebarCalendario.setForeground(new Color(0, 0, 0));
					lblSidebarPerfil.setForeground(new Color(119,119,119));
				}
				
				
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				calendario.setVisible(true);
				presupuestos.setVisible(false);
				perfil.setVisible(false);
				
				ArrayList<String> titulos = new ArrayList<String>();
				listMostrarEventos.setModel(new AbstractListModel() {
					
					public int getSize() {
						return titulos.size();
					}
					public Object getElementAt(int index) {
						return titulos.get(index);
					}
				
				});
				
				dcMostrarEventos.setDate(null);
			
				
			}
		});
		btnSidebarCalendario.setOpaque(false);
		btnSidebarCalendario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarCalendario.setBorder(new CompoundBorder());
		btnSidebarCalendario.setBackground(Color.CYAN);
		btnSidebarCalendario.setBounds(0, 399, 245, 36);
		sidebar.add(btnSidebarCalendario);
		
		lblSidebarCalendario = new JLabel("Calendario");
		lblSidebarCalendario.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarCalendario.setForeground(new Color(119, 119, 119));
		lblSidebarCalendario.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarCalendario.setBounds(60, 399, 185, 36);
		sidebar.add(lblSidebarCalendario);
		
		Icon calendarioIcon = new ImageIcon(Dashboard.class.getResource("resources/calendario.png"));
		Icon calendarioWIcon = new ImageIcon(Dashboard.class.getResource("resources/calendario_w.png"));
		
		if(isDarkMode == true) {
			lblSidebarCalendarioIcon = new JLabel("", calendarioWIcon, JLabel.CENTER);
		} else {
			lblSidebarCalendarioIcon = new JLabel("", calendarioIcon, JLabel.CENTER);
		}
		lblSidebarCalendarioIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarCalendarioIcon.setBounds(30, 399, 25, 36);
		sidebar.add(lblSidebarCalendarioIcon);
		
		pSidebarCalendario = new JPanel();
		pSidebarCalendario.setBackground(new Color(251, 251, 251));
		pSidebarCalendario.setBounds(0, 399, 4, 36);
		sidebar.add(pSidebarCalendario);
				
		main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(245, 54, 1120, 618);
		frame.getContentPane().add(main);
		main.setLayout(new CardLayout(0, 0));
		
		resumen = new JPanel();
		resumen.setBackground(Color.WHITE);
		main.add(resumen, "name_336802300135327");
		resumen.setBounds(245, 0, 1121, 746);
		resumen.setLayout(null);
		
		graph1 = DB.getgrafica(usuarioLeer.get(0), "ingresos");
		panelGraficaIngresos = new JPanel(new BorderLayout());
		panelGraficaIngresos.setBounds(40, 31, 450, 230);
		resumen.add(panelGraficaIngresos);
        panelGraficaIngresos.add(graph1);
        
		
		graph2 = DB.getgrafica(usuarioLeer.get(0), "gastos");
		panelGraficaGastos = new JPanel(new BorderLayout());
		panelGraficaGastos.setBounds(550, 31, 450, 230);

		resumen.add(panelGraficaGastos);
		panelGraficaGastos.add(graph2);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(520, 30, 12, 209);

		resumen.add(separator);
		
		Icon topbarBrandIcono = new ImageIcon(Dashboard.class.getResource("resources/Finanzas.png"));
		
		Icon topbarBuscarIcono = new ImageIcon(Dashboard.class.getResource("resources/search.png"));
		Icon topbarBuscarWIcono = new ImageIcon(Dashboard.class.getResource("resources/search_w.png"));
		
		Icon topbarSettingsIcono = new ImageIcon(Dashboard.class.getResource("resources/settings.png"));
		Icon topbarSettingsWIcono = new ImageIcon(Dashboard.class.getResource("resources/settings_w.png"));
		
		Icon topbarNotificationIcono = new ImageIcon(Dashboard.class.getResource("resources/notification.png"));
		Icon topbarNotificationWIcono = new ImageIcon(Dashboard.class.getResource("resources/notification_w.png"));
		
		Icon ingresosBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		Icon gastosBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		Icon presCategBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		
		
		Icon iconAgregar = new ImageIcon(Dashboard.class.getResource("resources/add.png"));
		
		
		
		ingresos = new JPanel();
		ingresos.setBackground(Color.WHITE);
		ingresos.setBounds(245, 0, 1121, 746);
		main.add(ingresos, "name_336916740574626");
		ingresos.setLayout(null);
		
		JLabel lblIngresos = new JLabel("Agregar un nuevo ingreso");
		lblIngresos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIngresos.setBounds(0, 233, 1120, 31);
		ingresos.add(lblIngresos);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 288, 800, 355);
		ingresos.add(scrollPane);
		
		
		
		
		listMuestraIngresos = new JList();
		listMuestraIngresos.setBorder(null);
		
	
		scrollPane.setViewportView(listMuestraIngresos);
		listMuestraIngresos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblIngresis = new JLabel("Ingresos");
		lblIngresis.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresis.setFont(new Font("Arial", Font.PLAIN, 22));
		lblIngresis.setBounds(0, 35, 1120, 30);
		ingresos.add(lblIngresis);
		
		JLabel lblNewLabel_1 = new JLabel("Total ingresos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(222, 91, 132, 31);
		ingresos.add(lblNewLabel_1);
		
		lblQ = new JLabel("");
		lblQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ.setBounds(359, 91, 253, 31);
		ingresos.add(lblQ);
		
		btnAgregarIngreso = new JLabel("", iconAgregar, JLabel.CENTER);
		btnAgregarIngreso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[][] a = DB.getCuenta(usuarioLeer.get(0), "ingresos");
				cbCategoriaIngresos.setModel(new DefaultComboBoxModel(a[2]));
				cbEliminarIngreso.setModel(new DefaultComboBoxModel(a[2]));
				
				ingresarIngresos.setVisible(true);
				ingresos.setVisible(false);
			}
		});
		btnAgregarIngreso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarIngreso.setBounds(0, 177, 1120, 55);
		ingresos.add(btnAgregarIngreso);
		
		

		
		
		ingresarIngresos = new JPanel();
		ingresarIngresos.setBackground(Color.WHITE);
		main.add(ingresarIngresos, "name_773665362949");
		ingresarIngresos.setLayout(null);
		

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(93,143,252));
		panel.setBounds(45, 144, 280, 477);
		ingresarIngresos.add(panel);
		panel.setLayout(null);
		
		JLabel lblDeIngresos = new JLabel("Edici\u00F3n de ingresos");
		lblDeIngresos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeIngresos.setForeground(new Color(255, 255, 255));
		lblDeIngresos.setFont(new Font("Arial", Font.PLAIN, 26));
		lblDeIngresos.setBounds(10, 206, 260, 55);
		panel.add(lblDeIngresos);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMonto.setFont(new Font("Arial", Font.PLAIN, 18));
		lblMonto.setBounds(499, 242, 111, 35);
		ingresarIngresos.add(lblMonto);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCategoria.setBounds(499, 184, 111, 35);
		ingresarIngresos.add(lblCategoria);
		
		
		
		
		cbCategoriaIngresos = new JComboBox();
		
		cbCategoriaIngresos.setFont(new Font("Arial", Font.PLAIN, 20));
		cbCategoriaIngresos.setBounds(622, 187, 178, 35);
		ingresarIngresos.add(cbCategoriaIngresos);
		
		txtMontoingresos = new JTextField();
		txtMontoingresos.setBounds(622, 244, 180, 35);
		ingresarIngresos.add(txtMontoingresos);
		txtMontoingresos.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBorder(null);
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnGuardar.setBackground(new Color(0, 139, 139));
		btnGuardar.setBounds(815, 244, 130, 35);
		ingresarIngresos.add(btnGuardar);
		btnGuardar.addActionListener(oyente);
		
		lblNewLabel = new JLabel("INGRESOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel.setBounds(325, 55, 785, 51);
		ingresarIngresos.add(lblNewLabel);
		
		lblEditaLasCaracteristicas = new JLabel("Agregar ingreso");
		lblEditaLasCaracteristicas.setFont(new Font("Arial", Font.BOLD, 18));
		lblEditaLasCaracteristicas.setBounds(434, 129, 280, 29);
		ingresarIngresos.add(lblEditaLasCaracteristicas);
		
		lblAgregarCategoria = new JLabel("Agregar Categoria");
		lblAgregarCategoria.setFont(new Font("Arial", Font.BOLD, 18));
		lblAgregarCategoria.setBounds(435, 333, 250, 29);
		ingresarIngresos.add(lblAgregarCategoria);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNombre.setBounds(517, 389, 93, 35);
		ingresarIngresos.add(lblNombre);
		
		txtAgregarCategoriaIngresos = new JTextField();
		txtAgregarCategoriaIngresos.setColumns(10);
		txtAgregarCategoriaIngresos.setBounds(622, 391, 180, 35);
		ingresarIngresos.add(txtAgregarCategoriaIngresos);
		
		btnAgregarNombreIngreso = new JButton("Agregar");
		btnAgregarNombreIngreso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarNombreIngreso.setBorder(null);
		btnAgregarNombreIngreso.setForeground(Color.WHITE);
		btnAgregarNombreIngreso.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnAgregarNombreIngreso.setBackground(new Color(0, 139, 139));
		btnAgregarNombreIngreso.setBounds(815, 389, 130, 35);
		ingresarIngresos.add(btnAgregarNombreIngreso);
		
		lblEliminarCategoria = new JLabel("Eliminar Categoria");
		lblEliminarCategoria.setFont(new Font("Arial", Font.BOLD, 18));
		lblEliminarCategoria.setBounds(434, 482, 250, 29);
		ingresarIngresos.add(lblEliminarCategoria);
		
		label_1 = new JLabel("Nombre:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 18));
		label_1.setBounds(517, 550, 93, 35);
		ingresarIngresos.add(label_1);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBorder(null);
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnEliminar.setBackground(new Color(0, 139, 139));
		btnEliminar.setBounds(815, 551, 130, 35);
		ingresarIngresos.add(btnEliminar);
		btnEliminar.addActionListener(oyente);
		
		cbEliminarIngreso = new JComboBox();
		cbEliminarIngreso.setBounds(622, 550, 178, 35);
		ingresarIngresos.add(cbEliminarIngreso);
		cbEliminarIngreso.setFont(new Font("Arial", Font.PLAIN, 20));
		
		btbRegresarIngresos = new JLabel("", ingresosBackIcon, JLabel.CENTER);
		btbRegresarIngresos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ingresarIngresos.setVisible(false);
				ingresos.setVisible(true);
				mostrarIngresos();
			}
		});
		btbRegresarIngresos.setBounds(10, 11, 93, 25);
		btbRegresarIngresos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresarIngresos.add(btbRegresarIngresos);
		
		btnAgregarNombreIngreso.addActionListener(oyente);
		
		gastos = new JPanel();
		gastos.setBackground(Color.WHITE);
		gastos.setBounds(245, 0, 1121, 746);
		main.add(gastos, "name_337042041258590");
		gastos.setLayout(null);
		
		lblGastos = new JLabel("Gastos");
		lblGastos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastos.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblGastos.setBounds(0, 35, 1120, 30);
		gastos.add(lblGastos);
		
		lblTotalGastos = new JLabel("Total Gastos:");
		lblTotalGastos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalGastos.setBounds(215, 106, 121, 31);
		gastos.add(lblTotalGastos);
		
		lblQ2 = new JLabel("");
		lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ2.setBounds(348, 106, 253, 31);
		gastos.add(lblQ2);
		
		
		lblAgregarUnNuevo = new JLabel("Agregar un nuevo gasto");
		lblAgregarUnNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarUnNuevo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAgregarUnNuevo.setBounds(0, 233, 1120, 31);
		gastos.add(lblAgregarUnNuevo);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 288, 800, 355);
		gastos.add(scrollPane_1);
		
		listGastos = new JList();
		scrollPane_1.setViewportView(listGastos);
		listGastos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		listGastos.setBorder(null);
		
		btnAgregarGasto = new JLabel("", iconAgregar, JLabel.CENTER);
		btnAgregarGasto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[][] s = DB.getCuenta(usuarioLeer.get(0), "gastos");
				cbCategoriaGastos.setModel(new DefaultComboBoxModel(s[2]));
				cbEliminarGasto.setModel(new DefaultComboBoxModel(s[2]));
				
				gastos.setVisible(false);
				ingresarGastos.setVisible(true);
			}
		});
		btnAgregarGasto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarGasto.setBounds(0, 177, 1120, 55);
		gastos.add(btnAgregarGasto);
		
		ingresarGastos = new JPanel();
		main.add(ingresarGastos, "name_23803773230142");
		ingresarGastos.setLayout(null);
		ingresarGastos.setBackground(Color.WHITE);
		
		lblGastos_1 = new JLabel("GASTOS");
		lblGastos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblGastos_1.setBounds(509, 51, 191, 51);
		ingresarGastos.add(lblGastos_1);
		
		btnRegresar2 = new JButton("Regresar");
		btnRegresar2.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnRegresar2.setBackground(new Color(0, 139, 139));
		btnRegresar2.setBounds(60, 51, 130, 42);
		ingresarGastos.add(btnRegresar2);
		btnRegresar2.addActionListener(oyente);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(60, 137, 280, 477);
		ingresarGastos.add(panel_1);
		
		label_6 = new JLabel("Edicion");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_6.setBounds(56, 147, 147, 46);
		panel_1.add(label_6);
		
		lblDeGastos = new JLabel("de Gastos");
		lblDeGastos.setForeground(Color.WHITE);
		lblDeGastos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDeGastos.setBounds(56, 194, 197, 55);
		panel_1.add(lblDeGastos);
		
		lblEditaLasCaracteristicas_1 = new JLabel("Edita las caracteristicas de tu gasto");
		lblEditaLasCaracteristicas_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblEditaLasCaracteristicas_1.setBounds(470, 97, 280, 29);
		ingresarGastos.add(lblEditaLasCaracteristicas_1);
		
		label_9 = new JLabel("Categoria:");
		label_9.setFont(new Font("Arial", Font.BOLD, 20));
		label_9.setBounds(369, 163, 111, 35);
		ingresarGastos.add(label_9);
		
		cbCategoriaGastos = new JComboBox();
		cbCategoriaGastos.setFont(new Font("Arial", Font.PLAIN, 20));
		cbCategoriaGastos.setBounds(492, 167, 178, 29);
		ingresarGastos.add(cbCategoriaGastos);
		
		label_10 = new JLabel("Monto:");
		label_10.setFont(new Font("Arial", Font.BOLD, 20));
		label_10.setBounds(402, 210, 78, 35);
		ingresarGastos.add(label_10);
		
		txtMontoGasto = new JTextField();
		txtMontoGasto.setColumns(10);
		txtMontoGasto.setBounds(495, 209, 180, 35);
		ingresarGastos.add(txtMontoGasto);
		
		btnGuardar2 = new JButton("Guardar");
		btnGuardar2.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnGuardar2.setBackground(new Color(0, 139, 139));
		btnGuardar2.setBounds(685, 209, 130, 42);
		ingresarGastos.add(btnGuardar2);
		btnGuardar2.addActionListener(oyente);
		
		btnAgregarCategoriaGastos = new JButton("Agregar");
		btnAgregarCategoriaGastos.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnAgregarCategoriaGastos.setBackground(new Color(0, 139, 139));
		btnAgregarCategoriaGastos.setBounds(685, 375, 130, 42);
		ingresarGastos.add(btnAgregarCategoriaGastos);
		btnAgregarCategoriaGastos.addActionListener(oyente);
		
		txtNombreGasto = new JTextField();
		txtNombreGasto.setColumns(10);
		txtNombreGasto.setBounds(495, 384, 180, 35);
		ingresarGastos.add(txtNombreGasto);
		
		label_11 = new JLabel("Agregar Categoria");
		label_11.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		label_11.setBounds(470, 303, 250, 51);
		ingresarGastos.add(label_11);
		
		label_12 = new JLabel("Nombre:");
		label_12.setFont(new Font("Arial", Font.BOLD, 20));
		label_12.setBounds(402, 382, 93, 35);
		ingresarGastos.add(label_12);
		
		label_13 = new JLabel("Eliminar Categoria");
		label_13.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		label_13.setBounds(470, 461, 250, 51);
		ingresarGastos.add(label_13);
		
		label_14 = new JLabel("Nombre:");
		label_14.setFont(new Font("Arial", Font.BOLD, 20));
		label_14.setBounds(402, 543, 93, 35);
		ingresarGastos.add(label_14);
		
		cbEliminarGasto = new JComboBox();
		cbEliminarGasto.setFont(new Font("Arial", Font.PLAIN, 20));
		cbEliminarGasto.setBounds(492, 547, 178, 29);
		ingresarGastos.add(cbEliminarGasto);
		
		btnEliminarCategoriaGastos = new JButton("Eliminar");
		btnEliminarCategoriaGastos.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnEliminarCategoriaGastos.setBackground(new Color(0, 139, 139));
		btnEliminarCategoriaGastos.setBounds(685, 543, 130, 42);
		ingresarGastos.add(btnEliminarCategoriaGastos);
		btnEliminarCategoriaGastos.addActionListener(oyente);
		
		presupuestos = new JPanel();
		presupuestos.setBackground(Color.WHITE);
		presupuestos.setBounds(245, 0, 1121, 746);
		main.add(presupuestos, "name_337073441194312");
		presupuestos.setLayout(new CardLayout(0, 0));
		
		presupuestoMain = new JPanel();
		presupuestoMain.setBackground(Color.WHITE);
		presupuestos.add(presupuestoMain, "name_226636006390500");
		presupuestoMain.setLayout(null);
	
		
		JLabel label_8 = new JLabel("Presupuestos");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.PLAIN, 22));
		label_8.setBounds(0, 35, 1120, 30);
		presupuestoMain.add(label_8);
		
		lblPresupuestoTotal_1 = new JLabel("Presupuesto total:");
		lblPresupuestoTotal_1.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblPresupuestoTotal_1.setBounds(113, 149, 158, 19);
		presupuestoMain.add(lblPresupuestoTotal_1);
		
		lblQP = new JLabel("Q");
		lblQP.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblQP.setBounds(281, 143, 19, 27);
		presupuestoMain.add(lblQP);
		
		lblPresupuestoTotal = new JLabel("");
		lblPresupuestoTotal.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblPresupuestoTotal.setBounds(300, 143, 111, 27);
		presupuestoMain.add(lblPresupuestoTotal);
		
		label_6P = new JLabel("Total Ingresos:");
		label_6P.setFont(new Font("Verdana", Font.PLAIN, 17));
		label_6P.setBounds(679, 149, 133, 19);
		presupuestoMain.add(label_6P);
		
		presIngresos = new JLabel("Q");
		presIngresos.setFont(new Font("Verdana", Font.PLAIN, 17));
		presIngresos.setBounds(817, 143, 19, 27);
		presupuestoMain.add(presIngresos);
		
		presTotalIngresos = new JLabel("");
		presTotalIngresos.setFont(new Font("Verdana", Font.PLAIN, 17));
		presTotalIngresos.setBounds(836, 143, 111, 27);
		presupuestoMain.add(presTotalIngresos);
		
		progressBarPresupuestos = new JProgressBar();
		progressBarPresupuestos.setStringPainted(true);
		progressBarPresupuestos.setForeground(new Color(50, 205, 50));
		progressBarPresupuestos.setBackground(Color.WHITE);
		progressBarPresupuestos.setBounds(113, 174, 800, 27);
		presupuestoMain.add(progressBarPresupuestos);
		
		btnCrearPres = new JLabel("",iconAgregar, JLabel.CENTER);
		btnCrearPres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presupuestoMain.setVisible(false);
				selecPresCateg.setVisible(true);
				
			}
		});
		btnCrearPres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearPres.setBounds(0, 250, 1120, 55);
		presupuestoMain.add(btnCrearPres);
		
		selecPresCateg = new JPanel();
		selecPresCateg.setBackground(Color.WHITE);
		presupuestos.add(selecPresCateg, "name_226684718454600");
		selecPresCateg.setLayout(null);
		
		label_15 = new JLabel("", presCategBackIcon, JLabel.CENTER);
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
		});
		label_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_15.setBounds(10, 11, 93, 25);
		selecPresCateg.add(label_15);
		
		lblNewLabel_1P = new JLabel("Nuevo presupuesto");
		lblNewLabel_1P.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1P.setBounds(409, 71, 194, 25);
		selecPresCateg.add(lblNewLabel_1P);
		
		lblSeleccioneUnaCategoria = new JLabel("Seleccione una categor\u00EDa");
		lblSeleccioneUnaCategoria.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblSeleccioneUnaCategoria.setBounds(409, 107, 210, 20);
		selecPresCateg.add(lblSeleccioneUnaCategoria);
		
		btnPresAuto = new JButton("Auto y Transporte");
		btnPresAuto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresAuto.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresAuto.setForeground(new Color(255, 255, 255));
		btnPresAuto.setBackground(new Color(61,172,219));
		btnPresAuto.setBounds(298, 191, 200, 87);
		btnPresAuto.setBorder(null);
		selecPresCateg.add(btnPresAuto);
		
		btnPresHogar = new JButton("Hogar");
		btnPresHogar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresHogar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresHogar.setForeground(new Color(255, 255, 255));
		btnPresHogar.setBackground(new Color(61,172,219));
		btnPresHogar.setBounds(70, 191, 200, 87);
		btnPresHogar.setBorder(null);
		selecPresCateg.add(btnPresHogar);
		
		btnPresAlimentos = new JButton("Alimentos");
		btnPresAlimentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresAlimentos.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresAlimentos.setForeground(new Color(255, 255, 255));
		btnPresAlimentos.setBackground(new Color(61,172,219));
		btnPresAlimentos.setBounds(525, 191, 200, 87);
		btnPresAlimentos.setBorder(null);
		selecPresCateg.add(btnPresAlimentos);
		
		btnPresEntretenimiento = new JButton("Entretenimiento");
		btnPresEntretenimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresEntretenimiento.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresEntretenimiento.setForeground(new Color(255, 255, 255));
		btnPresEntretenimiento.setBackground(new Color(61,172,219));
		btnPresEntretenimiento.setBounds(752, 191, 200, 87);
		btnPresEntretenimiento.setBorder(null);
		selecPresCateg.add(btnPresEntretenimiento);
		
		btnPresSalud = new JButton("Salud y Belleza");
		btnPresSalud.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresSalud.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresSalud.setForeground(new Color(255, 255, 255));
		btnPresSalud.setBackground(new Color(61,172,219));
		btnPresSalud.setBounds(70, 306, 200, 87);
		btnPresSalud.setBorder(null);
		selecPresCateg.add(btnPresSalud);
		
		btnPresEducacion = new JButton("Educaci\u00F3n");
		btnPresEducacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresEducacion.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresEducacion.setForeground(new Color(255, 255, 255));
		btnPresEducacion.setBackground(new Color(61,172,219));
		btnPresEducacion.setBounds(298, 306, 200, 87);
		btnPresEducacion.setBorder(null);
		selecPresCateg.add(btnPresEducacion);
		
		btnPresFinanzas = new JButton("Finanzas e Impuestos");
		btnPresFinanzas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresFinanzas.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresFinanzas.setForeground(new Color(255, 255, 255));
		btnPresFinanzas.setBackground(new Color(61,172,219));
		btnPresFinanzas.setBounds(525, 306, 200, 87);
		btnPresFinanzas.setBorder(null);
		selecPresCateg.add(btnPresFinanzas);
		
		btnPresRopa = new JButton("Ropa y Calzado");
		btnPresRopa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresRopa.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresRopa.setForeground(new Color(255, 255, 255));
		btnPresRopa.setBackground(new Color(61,172,219));
		btnPresRopa.setBounds(752, 306, 200, 87);
		btnPresRopa.setBorder(null);
		selecPresCateg.add(btnPresRopa);
		
		btnPresRegalos = new JButton("Regalos y Ayuda");
		btnPresRegalos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresRegalos.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresRegalos.setForeground(new Color(255, 255, 255));
		btnPresRegalos.setBackground(new Color(61,172,219));
		btnPresRegalos.setBounds(70, 422, 200, 87);
		btnPresRegalos.setBorder(null);
		selecPresCateg.add(btnPresRegalos);
		
		btnPresViajes = new JButton("Viajes");
		btnPresViajes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPresViajes.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresViajes.setForeground(new Color(255, 255, 255));
		btnPresViajes.setBackground(new Color(61,172,219));
		btnPresViajes.setBounds(298, 422, 200, 87);
		btnPresViajes.setBorder(null);
		selecPresCateg.add(btnPresViajes);
		
		// PRESUPUESTO HOGAR
		presHogar = new JPanel();
		presHogar.setBackground(Color.WHITE);
		presupuestos.add(presHogar, "name_226689740800200");
		presHogar.setLayout(null);
		
		label_3P = new JLabel("Editar tu presupuesto");
		label_3P.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_3P.setBounds(422, 53, 218, 25);
		presHogar.add(label_3P);
		
		label_8P = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_8P.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_8P.setBounds(309, 89, 460, 25);
		presHogar.add(label_8P);
		
		panelHogar = new JPanel();
		panelHogar.setLayout(null);
		panelHogar.setBackground(new Color(0, 153, 255));
		panelHogar.setBounds(129, 160, 252, 473);
		presHogar.add(panelHogar);
		
		lblHogar = new JLabel("Hogar");
		lblHogar.setForeground(Color.WHITE);
		lblHogar.setFont(new Font("Verdana", Font.BOLD, 20));
		lblHogar.setBounds(0, 199, 252, 31);
		panelHogar.add(lblHogar);
		
		panelHogar2 = new JPanel();
		panelHogar2.setBackground(new Color(0, 153, 255));
		panelHogar2.setBounds(414, 162, 252, 33);
		presHogar.add(panelHogar2);
		panelHogar2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblHogar_1 = new JLabel("Hogar");
		lblHogar_1.setForeground(Color.WHITE);
		lblHogar_1.setFont(new Font("Verdana", Font.BOLD, 14));
		panelHogar2.add(lblHogar_1);
		
		fieldHogarTotal = new JTextField();
		fieldHogarTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogarTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldHogarTotal.setColumns(10);
		fieldHogarTotal.setBounds(686, 162, 196, 33);
		TextPrompt ocultoHogarTotal = new TextPrompt("0", fieldHogarTotal);
		ocultoHogarTotal.setHorizontalAlignment(SwingConstants.CENTER);
		presHogar.add(fieldHogarTotal);
		
		label_12P = new JLabel("Subcategor\u00EDas");
		label_12P.setForeground(Color.BLACK);
		label_12P.setFont(new Font("Verdana", Font.BOLD, 15));
		label_12P.setBounds(543, 215, 123, 31);
		presHogar.add(label_12P);
		
		panelHogar3 = new JPanel();
		panelHogar3.setBackground(new Color(0, 153, 255));
		panelHogar3.setBounds(414, 257, 252, 33);
		presHogar.add(panelHogar3);
		
		lblConstruccionYRemodelacion = new JLabel("Construcci\u00F3n o Remodelaci\u00F3n");
		lblConstruccionYRemodelacion.setForeground(Color.WHITE);
		lblConstruccionYRemodelacion.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar3.add(lblConstruccionYRemodelacion);
		
		fieldHogar2 = new JTextField("0");
		fieldHogar2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar2.setColumns(10);
		fieldHogar2.setBounds(686, 257, 196, 33);
		presHogar.add(fieldHogar2);
		
		panelHogar4 = new JPanel();
		panelHogar4.setBackground(new Color(0, 153, 255));
		panelHogar4.setBounds(414, 301, 252, 33);
		presHogar.add(panelHogar4);
		
		lblArticulosParaEl = new JLabel("Art\u00EDculos, muebles y apartos");
		lblArticulosParaEl.setForeground(Color.WHITE);
		lblArticulosParaEl.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar4.add(lblArticulosParaEl);
		
		fieldHogar3 = new JTextField("0");
		fieldHogar3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar3.setColumns(10);
		fieldHogar3.setBounds(686, 301, 196, 33);
		presHogar.add(fieldHogar3);
		
		panelHogar5 = new JPanel();
		panelHogar5.setBackground(new Color(0, 153, 255));
		panelHogar5.setBounds(414, 345, 252, 33);
		presHogar.add(panelHogar5);
		
		lblMascotas = new JLabel("Mascotas");
		lblMascotas.setForeground(Color.WHITE);
		lblMascotas.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar5.add(lblMascotas);
		
		fieldHogar4 = new JTextField("0");
		fieldHogar4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar4.setColumns(10);
		fieldHogar4.setBounds(686, 345, 196, 33);
		presHogar.add(fieldHogar4);
		
		panelHogar6 = new JPanel();
		panelHogar6.setBackground(new Color(0, 153, 255));
		panelHogar6.setBounds(414, 389, 252, 33);
		presHogar.add(panelHogar6);
		
		lblLimpiezaYMantenimiento = new JLabel("Limpieza y Mantenimiento");
		lblLimpiezaYMantenimiento.setForeground(Color.WHITE);
		lblLimpiezaYMantenimiento.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar6.add(lblLimpiezaYMantenimiento);
		
		fieldHogar5 = new JTextField("0");
		fieldHogar5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar5.setColumns(10);
		fieldHogar5.setBounds(686, 389, 196, 33);
		presHogar.add(fieldHogar5);
		
		panelHogar7 = new JPanel();
		panelHogar7.setBackground(new Color(0, 153, 255));
		panelHogar7.setBounds(414, 433, 252, 33);
		presHogar.add(panelHogar7);
		
		lblMueblesYAparatos = new JLabel("Servicios P\u00FAblicos");
		lblMueblesYAparatos.setForeground(Color.WHITE);
		lblMueblesYAparatos.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar7.add(lblMueblesYAparatos);
		
		fieldHogar6 = new JTextField("0");
		fieldHogar6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar6.setColumns(10);
		fieldHogar6.setBounds(686, 433, 196, 33);
		presHogar.add(fieldHogar6);
		
		panelHogar8 = new JPanel();
		panelHogar8.setBackground(new Color(0, 153, 255));
		panelHogar8.setBounds(414, 477, 252, 33);
		presHogar.add(panelHogar8);
		
		lblRentaOCompra = new JLabel("Renta o Compra");
		lblRentaOCompra.setForeground(Color.WHITE);
		lblRentaOCompra.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar8.add(lblRentaOCompra);
		
		fieldHogar7 = new JTextField("0");
		fieldHogar7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar7.setColumns(10);
		fieldHogar7.setBounds(686, 477, 196, 33);
		fieldHogar7.setHorizontalAlignment(SwingConstants.CENTER);
		presHogar.add(fieldHogar7);
		
		panelHogar9 = new JPanel();
		panelHogar9.setBackground(new Color(0, 153, 255));
		panelHogar9.setBounds(414, 521, 252, 33);
		presHogar.add(panelHogar9);
		
		label_20 = new JLabel("Otros");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar9.add(label_20);
		
		fieldHogar8 = new JTextField("0");
		fieldHogar8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar8.setColumns(10);
		fieldHogar8.setBounds(686, 521, 196, 33);
		presHogar.add(fieldHogar8);
		
		// METODO PARA SUMAR AUTOMATICAMENTE 
		// TODO
		DocumentListener hogarDL = new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				suma();
			}

			protected void suma() {
				
				double total = Double.parseDouble(fieldHogar2.getText()) + Double.parseDouble(fieldHogar3.getText()) + Double.parseDouble(fieldHogar4.getText()) +
						Double.parseDouble(fieldHogar5.getText()) + Double.parseDouble(fieldHogar6.getText()) + Double.parseDouble(fieldHogar7.getText()) + Double.parseDouble(fieldHogar8.getText());
				fieldHogarTotal.setText(Double.toString(total));
			
			}

		};

		fieldHogar2.getDocument().addDocumentListener(hogarDL);
		fieldHogar3.getDocument().addDocumentListener(hogarDL);
		fieldHogar4.getDocument().addDocumentListener(hogarDL);
		fieldHogar5.getDocument().addDocumentListener(hogarDL);
		fieldHogar6.getDocument().addDocumentListener(hogarDL);
		fieldHogar7.getDocument().addDocumentListener(hogarDL);
		fieldHogar8.getDocument().addDocumentListener(hogarDL);
		fieldHogarTotal.setEditable(false);
		
		btnHogarGuardar = new JButton("Guardar");
		btnHogarGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHogarGuardar.setForeground(Color.WHITE);
		btnHogarGuardar.setBorder(null);
		btnHogarGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnHogarGuardar.setBackground(new Color(1, 162, 82));
		btnHogarGuardar.setBounds(686, 574, 196, 33);
		presHogar.add(btnHogarGuardar);
		
		Icon presHogarBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		btnHogarRegresar = new JLabel("", presHogarBackIcon, JLabel.CENTER);
		btnHogarRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHogarRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presHogar.setVisible(false);
				selecPresCateg.setVisible(true);
				
			}
		});
		btnHogarRegresar.setBounds(10, 11, 93, 25);
		presHogar.add(btnHogarRegresar);
		
		
		// PRESUPUESTO AUTO
		
		presAuto = new JPanel();
		presAuto.setBackground(Color.WHITE);
		presupuestos.add(presAuto, "name_3060860910800");
		presAuto.setLayout(null);
		presAuto.setLayout(null);
		
		label_3PA = new JLabel("Editar tu presupuesto");
		label_3PA.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_3PA.setBounds(422, 53, 218, 26);
		presAuto.add(label_3PA);
		
		label_8PA = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_8PA.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_8PA.setBounds(309, 89, 460, 23);
		presAuto.add(label_8PA);
		
		panelAuto = new JPanel();
		panelAuto.setLayout(null);
		panelAuto.setBackground(new Color(0, 153, 255));
		panelAuto.setBounds(746, 18, 1, 1);
		presAuto.add(panelAuto);
		
		lblAuto = new JLabel("Auto");
		lblAuto.setForeground(Color.WHITE);
		lblAuto.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAuto.setBounds(97, 199, 70, 31);
		panelAuto.add(lblAuto);
		
		panelAuto2 = new JPanel();
		panelAuto2.setBackground(new Color(0, 153, 255));
		panelAuto2.setBounds(129, 160, 252, 473);
		presAuto.add(panelAuto2);
		panelAuto2.setLayout(null);
		
		lblAuto_1 = new JLabel("Auto y Transporte");
		lblAuto_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuto_1.setBounds(0, 219, 252, 33);
		lblAuto_1.setForeground(Color.WHITE);
		lblAuto_1.setFont(new Font("Verdana", Font.BOLD, 14));
		panelAuto2.add(lblAuto_1);
		
		fieldAutoTotal = new JTextField();
		fieldAutoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAutoTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldAutoTotal.setColumns(10);
		fieldAutoTotal.setBounds(686, 162, 196, 33);
		TextPrompt ocultoAutoTotal = new TextPrompt("0", fieldAutoTotal);
		ocultoHogarTotal.setHorizontalAlignment(SwingConstants.CENTER);
		presAuto.add(fieldAutoTotal);
		
		label_12PA = new JLabel("Subcategor\u00EDas");
		label_12PA.setForeground(Color.BLACK);
		label_12PA.setFont(new Font("Verdana", Font.BOLD, 15));
		label_12PA.setBounds(543, 215, 116, 20);
		presAuto.add(label_12PA);
		
		panelAuto3 = new JPanel();
		panelAuto3.setBackground(new Color(0, 153, 255));
		panelAuto3.setBounds(414, 257, 252, 33);
		presAuto.add(panelAuto3);
		
		lblConstruccionYRemodelacion2 = new JLabel("Parqueo");
		lblConstruccionYRemodelacion2.setForeground(Color.WHITE);
		lblConstruccionYRemodelacion2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto3.add(lblConstruccionYRemodelacion2);
		
		fieldAuto2 = new JTextField("0");
		fieldAuto2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto2.setColumns(10);
		fieldAuto2.setBounds(686, 257, 196, 33);
		presAuto.add(fieldAuto2);
		
		panelAuto4 = new JPanel();
		panelAuto4.setBackground(new Color(0, 153, 255));
		panelAuto4.setBounds(414, 301, 252, 33);
		presAuto.add(panelAuto4);
		
		lblArticulosParaEl2 = new JLabel("Mantenimiento y Reparacion");
		lblArticulosParaEl2.setForeground(Color.WHITE);
		lblArticulosParaEl2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto4.add(lblArticulosParaEl2);
		
		fieldAuto3 = new JTextField("0");
		fieldAuto3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto3.setColumns(10);
		fieldAuto3.setBounds(686, 301, 196, 33);
		presAuto.add(fieldAuto3);
		
		panelAuto5 = new JPanel();
		panelAuto5.setBackground(new Color(0, 153, 255));
		panelAuto5.setBounds(414, 345, 252, 33);
		presAuto.add(panelAuto5);
		
		lblMascotas2 = new JLabel("Autolavado");
		lblMascotas2.setForeground(Color.WHITE);
		lblMascotas2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto5.add(lblMascotas2);
		
		fieldAuto4 = new JTextField("0");
		fieldAuto4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto4.setColumns(10);
		fieldAuto4.setBounds(686, 345, 196, 33);
		presAuto.add(fieldAuto4);
		
		panelAuto6 = new JPanel();
		panelAuto6.setBackground(new Color(0, 153, 255));
		panelAuto6.setBounds(414, 389, 252, 33);
		presAuto.add(panelAuto6);
		
		lblLimpiezaYMantenimiento2 = new JLabel("Transporte P\u00FAblico");
		lblLimpiezaYMantenimiento2.setForeground(Color.WHITE);
		lblLimpiezaYMantenimiento2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto6.add(lblLimpiezaYMantenimiento2);
		
		fieldAuto5 = new JTextField("0");
		fieldAuto5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto5.setColumns(10);
		fieldAuto5.setBounds(686, 389, 196, 33);
		presAuto.add(fieldAuto5);
		
		panelAuto7 = new JPanel();
		panelAuto7.setBackground(new Color(0, 153, 255));
		panelAuto7.setBounds(414, 433, 252, 33);
		presAuto.add(panelAuto7);
		
		lblMueblesYAparatos2 = new JLabel("Gasolina");
		lblMueblesYAparatos2.setForeground(Color.WHITE);
		lblMueblesYAparatos2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto7.add(lblMueblesYAparatos2);
		
		fieldAuto6 = new JTextField("0");
		fieldAuto6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto6.setColumns(10);
		fieldAuto6.setBounds(686, 433, 196, 33);
		presAuto.add(fieldAuto6);
		
		panelAuto8 = new JPanel();
		panelAuto8.setBackground(new Color(0, 153, 255));
		panelAuto8.setBounds(414, 477, 252, 33);
		presAuto.add(panelAuto8);
		
		lblRentaOCompra2 = new JLabel("Uber/Taxi");
		lblRentaOCompra2.setForeground(Color.WHITE);
		lblRentaOCompra2.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto8.add(lblRentaOCompra2);
		
		fieldAuto7 = new JTextField("0");
		fieldAuto7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto7.setColumns(10);
		fieldAuto7.setBounds(686, 477, 196, 33);
		fieldAuto7.setHorizontalAlignment(SwingConstants.CENTER);
		presAuto.add(fieldAuto7);
		
		panelAuto9 = new JPanel();
		panelAuto9.setBackground(new Color(0, 153, 255));
		panelAuto9.setBounds(414, 521, 252, 33);
		presAuto.add(panelAuto9);
		
		label_202 = new JLabel("Otros");
		label_202.setForeground(Color.WHITE);
		label_202.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAuto9.add(label_202);
		
		fieldAuto8 = new JTextField("0");
		fieldAuto8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto8.setColumns(10);
		fieldAuto8.setBounds(686, 521, 196, 33);
		presAuto.add(fieldAuto8);
		
		// METODO PARA SUMAR AUTOMATICAMENTE 
		// TODO
		DocumentListener autoDL = new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				suma();
			}

			protected void suma() {
				
				double total = Double.parseDouble(fieldAuto2.getText()) + Double.parseDouble(fieldAuto3.getText()) + Double.parseDouble(fieldAuto4.getText()) +
						Double.parseDouble(fieldAuto5.getText()) + Double.parseDouble(fieldAuto6.getText()) + Double.parseDouble(fieldAuto7.getText()) + Double.parseDouble(fieldAuto8.getText());
				fieldAutoTotal.setText(Double.toString(total));
			
			}

		};

		fieldAuto2.getDocument().addDocumentListener(autoDL);
		fieldAuto3.getDocument().addDocumentListener(autoDL);
		fieldAuto4.getDocument().addDocumentListener(autoDL);
		fieldAuto5.getDocument().addDocumentListener(autoDL);
		fieldAuto6.getDocument().addDocumentListener(autoDL);
		fieldAuto7.getDocument().addDocumentListener(autoDL);
		fieldAuto8.getDocument().addDocumentListener(autoDL);
		fieldAutoTotal.setEditable(false);
		
		btnAutoGuardar = new JButton("Guardar");
		btnAutoGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAutoGuardar.setForeground(Color.WHITE);
		btnAutoGuardar.setBorder(null);
		btnAutoGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAutoGuardar.setBackground(new Color(1, 162, 82));
		btnAutoGuardar.setBounds(686, 574, 196, 33);
		presAuto.add(btnAutoGuardar);
		
		Icon presAutoBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		btnAutoRegresar = new JLabel("", presAutoBackIcon, JLabel.CENTER);
		btnAutoRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAutoRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presHogar.setVisible(false);
				selecPresCateg.setVisible(true);
				
			}
		});
		btnAutoRegresar.setBounds(10, 11, 93, 25);
		presAuto.add(btnAutoRegresar);
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 153, 255));
		panel_9.setBounds(407, 162, 252, 33);
		presAuto.add(panel_9);
		
		lblAutoYTransporte = new JLabel("Auto y Transporte");
		lblAutoYTransporte.setForeground(Color.WHITE);
		lblAutoYTransporte.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_9.add(lblAutoYTransporte);
		
		presAlimentos = new JPanel();
		presAlimentos.setBackground(Color.WHITE);
		presupuestos.add(presAlimentos, "name_8206197714100");
		presAlimentos.setLayout(null);
		
		Icon presAlimentosBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		JLabel btnAlimentosRegresar = new JLabel("", presAlimentosBackIcon, JLabel.CENTER);
		btnAlimentosRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selecPresCateg.setVisible(true);
				presAlimentos.setVisible(false);
			}
		});
		btnAlimentosRegresar.setBounds(10, 11, 93, 25);
		presAlimentos.add(btnAlimentosRegresar);
		
		JLabel label_17 = new JLabel("Editar tu presupuesto");
		label_17.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_17.setBounds(422, 53, 218, 25);
		presAlimentos.add(label_17);
		
		JLabel label_18 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_18.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_18.setBounds(309, 89, 460, 25);
		presAlimentos.add(label_18);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 153, 255));
		panel_3.setBounds(129, 160, 252, 473);
		presAlimentos.add(panel_3);
		
		JLabel lblAlimentos = new JLabel("Alimentos");
		lblAlimentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlimentos.setForeground(Color.WHITE);
		lblAlimentos.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAlimentos.setBounds(0, 199, 252, 31);
		panel_3.add(lblAlimentos);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 153, 255));
		panel_8.setBounds(414, 162, 252, 33);
		presAlimentos.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblAlimentos_1 = new JLabel("Alimentos");
		lblAlimentos_1.setForeground(Color.WHITE);
		lblAlimentos_1.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_8.add(lblAlimentos_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 153, 255));
		panel_11.setBounds(414, 345, 252, 33);
		presAlimentos.add(panel_11);
		
		JLabel lblDespensa = new JLabel("Despensa");
		lblDespensa.setForeground(Color.WHITE);
		lblDespensa.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_11.add(lblDespensa);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 153, 255));
		panel_12.setBounds(414, 389, 252, 33);
		presAlimentos.add(panel_12);
		
		JLabel lblRestaurante = new JLabel("Restaurante");
		lblRestaurante.setForeground(Color.WHITE);
		lblRestaurante.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_12.add(lblRestaurante);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 153, 255));
		panel_13.setBounds(414, 433, 252, 33);
		presAlimentos.add(panel_13);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setForeground(Color.WHITE);
		lblOtros.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_13.add(lblOtros);
		
		fieldAlimentos2 = new JTextField("0");
		fieldAlimentos2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos2.setColumns(10);
		fieldAlimentos2.setBounds(686, 345, 196, 33);
		presAlimentos.add(fieldAlimentos2);
		
		fieldAlimentos3 = new JTextField("0");
		fieldAlimentos3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos3.setColumns(10);
		fieldAlimentos3.setBounds(686, 389, 196, 33);
		presAlimentos.add(fieldAlimentos3);
		
		fieldAlimentos4 = new JTextField("0");
		fieldAlimentos4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos4.setColumns(10);
		fieldAlimentos4.setBounds(686, 433, 196, 33);
		presAlimentos.add(fieldAlimentos4);
		
		fieldAlimentosTotal = new JTextField("0");
		fieldAlimentosTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentosTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentosTotal.setColumns(10);
		fieldAlimentosTotal.setBounds(686, 160, 196, 33);
		presAlimentos.add(fieldAlimentosTotal);
		
		// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener alimentosDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldAlimentos2.getText()) + Double.parseDouble(fieldAlimentos3.getText()) + Double.parseDouble(fieldAlimentos4.getText());
						fieldAlimentosTotal.setText(Double.toString(total));
					
					}

				};

				fieldAlimentos2.getDocument().addDocumentListener(alimentosDL);
				fieldAlimentos3.getDocument().addDocumentListener(alimentosDL);
				fieldAlimentos4.getDocument().addDocumentListener(alimentosDL);
				fieldAlimentosTotal.setEditable(false);
		
		btnAlimentosGuardar = new JButton("Guardar");
		btnAlimentosGuardar.setForeground(Color.WHITE);
		btnAlimentosGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAlimentosGuardar.setBorder(null);
		btnAlimentosGuardar.setBackground(new Color(1, 162, 82));
		btnAlimentosGuardar.setBounds(686, 574, 196, 33);
		presAlimentos.add(btnAlimentosGuardar);
		
		presEntretenimiento = new JPanel();
		presEntretenimiento.setBackground(Color.WHITE);
		presupuestos.add(presEntretenimiento, "name_9887584359500");
		presEntretenimiento.setLayout(null);
		
		Icon presEntretenimientoBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		btnEntretenimientoRegresar = new JLabel("", presEntretenimientoBackIcon, SwingConstants.CENTER);
		btnEntretenimientoRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presEntretenimiento.setVisible(false);
				selecPresCateg.setVisible(true);
			}
		});
		btnEntretenimientoRegresar.setBounds(10, 11, 93, 25);
		presEntretenimiento.add(btnEntretenimientoRegresar);
		
		label_19 = new JLabel("Editar tu presupuesto");
		label_19.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_19.setBounds(422, 53, 218, 25);
		presEntretenimiento.add(label_19);
		
		label_21 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_21.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_21.setBounds(309, 89, 460, 25);
		presEntretenimiento.add(label_21);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(0, 153, 255));
		panel_10.setBounds(129, 160, 252, 473);
		presEntretenimiento.add(panel_10);
		
		lblEntretenimiento = new JLabel("Entretenimiento");
		lblEntretenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntretenimiento.setForeground(Color.WHITE);
		lblEntretenimiento.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEntretenimiento.setBounds(0, 199, 252, 31);
		panel_10.add(lblEntretenimiento);
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 153, 255));
		panel_14.setBounds(414, 162, 252, 33);
		presEntretenimiento.add(panel_14);
		panel_14.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblEntretenimiento_1 = new JLabel("Entretenimiento");
		lblEntretenimiento_1.setForeground(Color.WHITE);
		lblEntretenimiento_1.setFont(new Font("Verdana", Font.BOLD, 14));
		panel_14.add(lblEntretenimiento_1);
		
		panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 153, 255));
		panel_15.setBounds(414, 257, 252, 33);
		presEntretenimiento.add(panel_15);
		
		lblCineYMsica = new JLabel("Cine y M\u00FAsica");
		lblCineYMsica.setForeground(Color.WHITE);
		lblCineYMsica.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_15.add(lblCineYMsica);
		
		label_25 = new JLabel("Subcategor\u00EDas");
		label_25.setForeground(Color.BLACK);
		label_25.setFont(new Font("Verdana", Font.BOLD, 15));
		label_25.setBounds(543, 215, 123, 31);
		presEntretenimiento.add(label_25);
		
		fieldEntretenimiento2 = new JTextField("0");
		fieldEntretenimiento2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento2.setColumns(10);
		fieldEntretenimiento2.setBounds(686, 257, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento2);
		
		panel_16 = new JPanel();
		panel_16.setBackground(new Color(0, 153, 255));
		panel_16.setBounds(414, 301, 252, 33);
		presEntretenimiento.add(panel_16);
		
		lblJuegos = new JLabel("Juegos");
		lblJuegos.setForeground(Color.WHITE);
		lblJuegos.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_16.add(lblJuegos);
		
		fieldEntretenimiento3 = new JTextField("0");
		fieldEntretenimiento3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento3.setColumns(10);
		fieldEntretenimiento3.setBounds(686, 301, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento3);
		
		panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 153, 255));
		panel_17.setBounds(414, 345, 252, 33);
		presEntretenimiento.add(panel_17);
		
		lblMuseosYParqueos = new JLabel("Museos y Parques");
		lblMuseosYParqueos.setForeground(Color.WHITE);
		lblMuseosYParqueos.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_17.add(lblMuseosYParqueos);
		
		fieldEntretenimiento4 = new JTextField("0");
		fieldEntretenimiento4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento4.setColumns(10);
		fieldEntretenimiento4.setBounds(686, 345, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento4);
		
		panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 153, 255));
		panel_18.setBounds(414, 389, 252, 33);
		presEntretenimiento.add(panel_18);
		
		lblSubscripcionesYApps = new JLabel("Subscripciones y Apps");
		lblSubscripcionesYApps.setForeground(Color.WHITE);
		lblSubscripcionesYApps.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_18.add(lblSubscripcionesYApps);
		
		fieldEntretenimiento5 = new JTextField("0");
		fieldEntretenimiento5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento5.setColumns(10);
		fieldEntretenimiento5.setBounds(686, 389, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento5);
		
		panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 153, 255));
		panel_19.setBounds(414, 433, 252, 33);
		presEntretenimiento.add(panel_19);
		
		lblAlchoholYTabaco = new JLabel("Alchohol y Tabaco");
		lblAlchoholYTabaco.setForeground(Color.WHITE);
		lblAlchoholYTabaco.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_19.add(lblAlchoholYTabaco);
		
		fieldEntretenimiento6 = new JTextField("0");
		fieldEntretenimiento6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento6.setColumns(10);
		fieldEntretenimiento6.setBounds(686, 433, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento6);
		
		panel_20 = new JPanel();
		panel_20.setBackground(new Color(0, 153, 255));
		panel_20.setBounds(414, 477, 252, 33);
		presEntretenimiento.add(panel_20);
		
		lblEspectculosYEventos = new JLabel("Espect\u00E1culos y Eventos");
		lblEspectculosYEventos.setForeground(Color.WHITE);
		lblEspectculosYEventos.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_20.add(lblEspectculosYEventos);
		
		fieldEntretenimiento7 = new JTextField("0");
		fieldEntretenimiento7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento7.setColumns(10);
		fieldEntretenimiento7.setBounds(686, 477, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento7);
		
		panel_21 = new JPanel();
		panel_21.setBackground(new Color(0, 153, 255));
		panel_21.setBounds(414, 521, 252, 33);
		presEntretenimiento.add(panel_21);
		
		label_31 = new JLabel("Otros");
		label_31.setForeground(Color.WHITE);
		label_31.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_21.add(label_31);
		
		fieldEntretenimiento8 = new JTextField("0");
		fieldEntretenimiento8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento8.setColumns(10);
		fieldEntretenimiento8.setBounds(686, 521, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento8);
		
		btnEntretenimientoGuardar = new JButton("Guardar");
		btnEntretenimientoGuardar.setForeground(Color.WHITE);
		btnEntretenimientoGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnEntretenimientoGuardar.setBorder(null);
		btnEntretenimientoGuardar.setBackground(new Color(1, 162, 82));
		btnEntretenimientoGuardar.setBounds(686, 574, 196, 33);
		presEntretenimiento.add(btnEntretenimientoGuardar);
		
		fieldEntretenimientoTotal = new JTextField("0");
		fieldEntretenimientoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimientoTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimientoTotal.setColumns(10);
		fieldEntretenimientoTotal.setBounds(686, 162, 196, 33);
		presEntretenimiento.add(fieldEntretenimientoTotal);
		
		// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener EntretenimientoDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldEntretenimiento2.getText()) + Double.parseDouble(fieldEntretenimiento3.getText()) + Double.parseDouble(fieldEntretenimiento4.getText()) +
								Double.parseDouble(fieldEntretenimiento5.getText()) + Double.parseDouble(fieldEntretenimiento6.getText()) + Double.parseDouble(fieldEntretenimiento7.getText()) + Double.parseDouble(fieldEntretenimiento8.getText());
						fieldEntretenimientoTotal.setText(Double.toString(total));
					
					}

				};

				fieldEntretenimiento2.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento3.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento4.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento5.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento6.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento7.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimiento8.getDocument().addDocumentListener(EntretenimientoDL);
				fieldEntretenimientoTotal.setEditable(false);
				
				presSalud = new JPanel();
				presSalud.setBackground(Color.WHITE);
				presupuestos.add(presSalud, "name_10955858738400");
				presSalud.setLayout(null);
				
				Icon presSaludBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
				
				btnSaludRegresar = new JLabel("", presSaludBackIcon, JLabel.CENTER);
				btnSaludRegresar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						presSalud.setVisible(false);
						selecPresCateg.setVisible(true);
					}
				});
				btnSaludRegresar.setBounds(10, 11, 93, 25);
				presSalud.add(btnSaludRegresar);
				
				label_22 = new JLabel("Editar tu presupuesto");
				label_22.setFont(new Font("Verdana", Font.PLAIN, 20));
				label_22.setBounds(422, 53, 218, 25);
				presSalud.add(label_22);
				
				label_23 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
				label_23.setFont(new Font("Verdana", Font.PLAIN, 18));
				label_23.setBounds(309, 89, 460, 25);
				presSalud.add(label_23);
				
				panel_22 = new JPanel();
				panel_22.setLayout(null);
				panel_22.setBackground(new Color(0, 153, 255));
				panel_22.setBounds(129, 160, 252, 473);
				presSalud.add(panel_22);
				
				lblSaludYBelleza = new JLabel("Salud y Belleza");
				lblSaludYBelleza.setHorizontalAlignment(SwingConstants.CENTER);
				lblSaludYBelleza.setForeground(Color.WHITE);
				lblSaludYBelleza.setFont(new Font("Verdana", Font.BOLD, 20));
				lblSaludYBelleza.setBounds(0, 199, 252, 31);
				panel_22.add(lblSaludYBelleza);
				
				panel_23 = new JPanel();
				panel_23.setBackground(new Color(0, 153, 255));
				panel_23.setBounds(414, 162, 252, 33);
				presSalud.add(panel_23);
				panel_23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				lblSaludYBelleza_1 = new JLabel("Salud y Belleza");
				lblSaludYBelleza_1.setForeground(Color.WHITE);
				lblSaludYBelleza_1.setFont(new Font("Verdana", Font.BOLD, 14));
				panel_23.add(lblSaludYBelleza_1);
				
				label_27 = new JLabel("Subcategor\u00EDas");
				label_27.setForeground(Color.BLACK);
				label_27.setFont(new Font("Verdana", Font.BOLD, 15));
				label_27.setBounds(543, 215, 123, 31);
				presSalud.add(label_27);
				
				panel_24 = new JPanel();
				panel_24.setBackground(new Color(0, 153, 255));
				panel_24.setBounds(414, 257, 252, 33);
				presSalud.add(panel_24);
				
				lblPerfumesYCosmeticos = new JLabel("Perfumes y Cosmeticos");
				lblPerfumesYCosmeticos.setForeground(Color.WHITE);
				lblPerfumesYCosmeticos.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_24.add(lblPerfumesYCosmeticos);
				
				fieldSalud2 = new JTextField("0");
				fieldSalud2.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud2.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud2.setColumns(10);
				fieldSalud2.setBounds(686, 257, 196, 33);
				presSalud.add(fieldSalud2);
				
				panel_25 = new JPanel();
				panel_25.setBackground(new Color(0, 153, 255));
				panel_25.setBounds(414, 301, 252, 33);
				presSalud.add(panel_25);
				
				lblCuidadoPersonal = new JLabel("Cuidado personal");
				lblCuidadoPersonal.setForeground(Color.WHITE);
				lblCuidadoPersonal.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_25.add(lblCuidadoPersonal);
				
				fieldSalud3 = new JTextField("0");
				fieldSalud3.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud3.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud3.setColumns(10);
				fieldSalud3.setBounds(686, 301, 196, 33);
				presSalud.add(fieldSalud3);
				
				panel_26 = new JPanel();
				panel_26.setBackground(new Color(0, 153, 255));
				panel_26.setBounds(414, 345, 252, 33);
				presSalud.add(panel_26);
				
				lblDentisat = new JLabel("Dentista");
				lblDentisat.setForeground(Color.WHITE);
				lblDentisat.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_26.add(lblDentisat);
				
				fieldSalud4 = new JTextField("0");
				fieldSalud4.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud4.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud4.setColumns(10);
				fieldSalud4.setBounds(686, 345, 196, 33);
				presSalud.add(fieldSalud4);
				
				panel_27 = new JPanel();
				panel_27.setBackground(new Color(0, 153, 255));
				panel_27.setBounds(414, 389, 252, 33);
				presSalud.add(panel_27);
				
				lblDeportesYEquipos = new JLabel("Deportes y Equipos deportivos");
				lblDeportesYEquipos.setForeground(Color.WHITE);
				lblDeportesYEquipos.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_27.add(lblDeportesYEquipos);
				
				fieldSalud5 = new JTextField("0");
				fieldSalud5.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud5.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud5.setColumns(10);
				fieldSalud5.setBounds(686, 389, 196, 33);
				presSalud.add(fieldSalud5);
				
				panel_28 = new JPanel();
				panel_28.setBackground(new Color(0, 153, 255));
				panel_28.setBounds(414, 433, 252, 33);
				presSalud.add(panel_28);
				
				lblFarmacia = new JLabel("Farmacia");
				lblFarmacia.setForeground(Color.WHITE);
				lblFarmacia.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_28.add(lblFarmacia);
				
				fieldSalud6 = new JTextField("0");
				fieldSalud6.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud6.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud6.setColumns(10);
				fieldSalud6.setBounds(686, 433, 196, 33);
				presSalud.add(fieldSalud6);
				
				fieldSalud7 = new JTextField("0");
				fieldSalud7.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud7.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud7.setColumns(10);
				fieldSalud7.setBounds(686, 477, 196, 33);
				presSalud.add(fieldSalud7);
				
				panel_29 = new JPanel();
				panel_29.setBackground(new Color(0, 153, 255));
				panel_29.setBounds(414, 477, 252, 33);
				presSalud.add(panel_29);
				
				lblMdico = new JLabel("M\u00E9dico");
				lblMdico.setForeground(Color.WHITE);
				lblMdico.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_29.add(lblMdico);
				
				panel_30 = new JPanel();
				panel_30.setBackground(new Color(0, 153, 255));
				panel_30.setBounds(414, 521, 252, 33);
				presSalud.add(panel_30);
				
				label_35 = new JLabel("Otros");
				label_35.setForeground(Color.WHITE);
				label_35.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_30.add(label_35);
				
				fieldSalud8 = new JTextField("0");
				fieldSalud8.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSalud8.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSalud8.setColumns(10);
				fieldSalud8.setBounds(686, 521, 196, 33);
				presSalud.add(fieldSalud8);
				
				btnSaludGuardar = new JButton("Guardar");
				btnSaludGuardar.setForeground(Color.WHITE);
				btnSaludGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
				btnSaludGuardar.setBorder(null);
				btnSaludGuardar.setBackground(new Color(1, 162, 82));
				btnSaludGuardar.setBounds(686, 574, 196, 33);
				presSalud.add(btnSaludGuardar);
				
				fieldSaludTotal = new JTextField("0");
				fieldSaludTotal.setHorizontalAlignment(SwingConstants.CENTER);
				fieldSaludTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldSaludTotal.setColumns(10);
				fieldSaludTotal.setBounds(686, 160, 196, 33);
				presSalud.add(fieldSaludTotal);
				
				// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener saludDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldSalud2.getText()) + Double.parseDouble(fieldSalud3.getText()) + Double.parseDouble(fieldSalud4.getText()) +
								Double.parseDouble(fieldSalud5.getText()) + Double.parseDouble(fieldSalud6.getText()) + Double.parseDouble(fieldSalud7.getText()) + Double.parseDouble(fieldSalud8.getText());
						fieldSaludTotal.setText(Double.toString(total));
					
					}

				};

				fieldSalud2.getDocument().addDocumentListener(saludDL);
				fieldSalud3.getDocument().addDocumentListener(saludDL);
				fieldSalud4.getDocument().addDocumentListener(saludDL);
				fieldSalud5.getDocument().addDocumentListener(saludDL);
				fieldSalud6.getDocument().addDocumentListener(saludDL);
				fieldSalud7.getDocument().addDocumentListener(saludDL);
				fieldSalud8.getDocument().addDocumentListener(saludDL);
				fieldSaludTotal.setEditable(false);
				
				
				presEducacion = new JPanel();
				presEducacion.setBackground(Color.WHITE);
				presupuestos.add(presEducacion, "name_10981010212400");
				presEducacion.setLayout(null);
				
				Icon presEducacionBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
				
				JLabel btnEducacionRegresar = new JLabel("", presEducacionBackIcon, JLabel.CENTER);
				btnEducacionRegresar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						presEducacion.setVisible(false);
						selecPresCateg.setVisible(true);
					}
				});
				btnEducacionRegresar.setBounds(10, 11, 93, 25);
				presEducacion.add(btnEducacionRegresar);
				
				JLabel label_24 = new JLabel("Editar tu presupuesto");
				label_24.setFont(new Font("Verdana", Font.PLAIN, 20));
				label_24.setBounds(422, 53, 218, 26);
				presEducacion.add(label_24);
				
				JLabel label_26 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
				label_26.setFont(new Font("Verdana", Font.PLAIN, 18));
				label_26.setBounds(309, 89, 460, 23);
				presEducacion.add(label_26);
				
				JPanel panel_31 = new JPanel();
				panel_31.setLayout(null);
				panel_31.setBackground(new Color(0, 153, 255));
				panel_31.setBounds(129, 160, 252, 473);
				presEducacion.add(panel_31);
				
				JLabel lblEducacion = new JLabel("Educacion");
				lblEducacion.setHorizontalAlignment(SwingConstants.CENTER);
				lblEducacion.setForeground(Color.WHITE);
				lblEducacion.setFont(new Font("Verdana", Font.BOLD, 14));
				lblEducacion.setBounds(0, 219, 252, 33);
				panel_31.add(lblEducacion);
				
				JPanel panel_32 = new JPanel();
				panel_32.setBackground(new Color(0, 153, 255));
				panel_32.setBounds(407, 162, 252, 33);
				presEducacion.add(panel_32);
				
				JLabel lblEducacion_1 = new JLabel("Educacion");
				lblEducacion_1.setForeground(Color.WHITE);
				lblEducacion_1.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_32.add(lblEducacion_1);
				
				JLabel label_30 = new JLabel("Subcategor\u00EDas");
				label_30.setForeground(Color.BLACK);
				label_30.setFont(new Font("Verdana", Font.BOLD, 15));
				label_30.setBounds(543, 215, 116, 20);
				presEducacion.add(label_30);
				
				JPanel panel_33 = new JPanel();
				panel_33.setBackground(new Color(0, 153, 255));
				panel_33.setBounds(414, 257, 252, 33);
				presEducacion.add(panel_33);
				
				JLabel lblColegiatura = new JLabel("Colegiatura");
				lblColegiatura.setForeground(Color.WHITE);
				lblColegiatura.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_33.add(lblColegiatura);
				
				fieldEducacion2 = new JTextField("0");
				fieldEducacion2.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion2.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion2.setColumns(10);
				fieldEducacion2.setBounds(686, 257, 196, 33);
				presEducacion.add(fieldEducacion2);
				
				JPanel panel_34 = new JPanel();
				panel_34.setBackground(new Color(0, 153, 255));
				panel_34.setBounds(414, 301, 252, 33);
				presEducacion.add(panel_34);
				
				JLabel lblPapelieria = new JLabel("Papeleria");
				lblPapelieria.setForeground(Color.WHITE);
				lblPapelieria.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_34.add(lblPapelieria);
				
				fieldEducacion3 = new JTextField("0");
				fieldEducacion3.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion3.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion3.setColumns(10);
				fieldEducacion3.setBounds(686, 301, 196, 33);
				presEducacion.add(fieldEducacion3);
				
				JPanel panel_35 = new JPanel();
				panel_35.setBackground(new Color(0, 153, 255));
				panel_35.setBounds(414, 345, 252, 33);
				presEducacion.add(panel_35);
				
				JLabel lblLibros = new JLabel("Libros");
				lblLibros.setForeground(Color.WHITE);
				lblLibros.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_35.add(lblLibros);
				
				fieldEducacion4 = new JTextField("0");
				fieldEducacion4.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion4.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion4.setColumns(10);
				fieldEducacion4.setBounds(686, 345, 196, 33);
				presEducacion.add(fieldEducacion4);
				
				JPanel panel_36 = new JPanel();
				panel_36.setBackground(new Color(0, 153, 255));
				panel_36.setBounds(414, 389, 252, 33);
				presEducacion.add(panel_36);
				
				JLabel lblSoftware = new JLabel("Software");
				lblSoftware.setForeground(Color.WHITE);
				lblSoftware.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_36.add(lblSoftware);
				
				fieldEducacion5 = new JTextField("0");
				fieldEducacion5.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion5.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion5.setColumns(10);
				fieldEducacion5.setBounds(686, 389, 196, 33);
				presEducacion.add(fieldEducacion5);
				
				JPanel panel_37 = new JPanel();
				panel_37.setBackground(new Color(0, 153, 255));
				panel_37.setBounds(414, 433, 252, 33);
				presEducacion.add(panel_37);
				
				JLabel lblCreditoEstudiantil = new JLabel("Credito estudiantil");
				lblCreditoEstudiantil.setForeground(Color.WHITE);
				lblCreditoEstudiantil.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_37.add(lblCreditoEstudiantil);
				
				fieldEducacion6 = new JTextField("0");
				fieldEducacion6.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion6.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion6.setColumns(10);
				fieldEducacion6.setBounds(686, 433, 196, 33);
				presEducacion.add(fieldEducacion6);
				
				JPanel panel_38 = new JPanel();
				panel_38.setBackground(new Color(0, 153, 255));
				panel_38.setBounds(414, 477, 252, 33);
				presEducacion.add(panel_38);
				
				JLabel lblViajesEscolares = new JLabel("Viajes escolares");
				lblViajesEscolares.setForeground(Color.WHITE);
				lblViajesEscolares.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_38.add(lblViajesEscolares);
				
				fieldEducacion7 = new JTextField("0");
				fieldEducacion7.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion7.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion7.setColumns(10);
				fieldEducacion7.setBounds(686, 477, 196, 33);
				presEducacion.add(fieldEducacion7);
				
				JPanel panel_39 = new JPanel();
				panel_39.setBackground(new Color(0, 153, 255));
				panel_39.setBounds(414, 521, 252, 33);
				presEducacion.add(panel_39);
				
				JLabel label_39 = new JLabel("Otros");
				label_39.setForeground(Color.WHITE);
				label_39.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_39.add(label_39);
				
				fieldEducacion8 = new JTextField("0");
				fieldEducacion8.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacion8.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacion8.setColumns(10);
				fieldEducacion8.setBounds(686, 521, 196, 33);
				presEducacion.add(fieldEducacion8);
				
				fieldEducacionTotal = new JTextField("0");
				fieldEducacionTotal.setHorizontalAlignment(SwingConstants.CENTER);
				fieldEducacionTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldEducacionTotal.setColumns(10);
				fieldEducacionTotal.setBounds(686, 160, 196, 33);
				presEducacion.add(fieldEducacionTotal);
				
				
				// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener educacionDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldEducacion2.getText()) + Double.parseDouble(fieldEducacion3.getText()) + Double.parseDouble(fieldEducacion4.getText()) +
								Double.parseDouble(fieldEducacion5.getText()) + Double.parseDouble(fieldEducacion6.getText()) + Double.parseDouble(fieldEducacion7.getText()) + Double.parseDouble(fieldEducacion8.getText());
						fieldEducacionTotal.setText(Double.toString(total));
					
					}

				};

				fieldEducacion2.getDocument().addDocumentListener(educacionDL);
				fieldEducacion3.getDocument().addDocumentListener(educacionDL);
				fieldEducacion4.getDocument().addDocumentListener(educacionDL);
				fieldEducacion5.getDocument().addDocumentListener(educacionDL);
				fieldEducacion6.getDocument().addDocumentListener(educacionDL);
				fieldEducacion7.getDocument().addDocumentListener(educacionDL);
				fieldEducacion8.getDocument().addDocumentListener(educacionDL);
				fieldEducacionTotal.setEditable(false);
				
				btnEducacionGuardar = new JButton("Guardar");
				btnEducacionGuardar.setForeground(Color.WHITE);
				btnEducacionGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
				btnEducacionGuardar.setBorder(null);
				btnEducacionGuardar.setBackground(new Color(1, 162, 82));
				btnEducacionGuardar.setBounds(686, 574, 196, 33);
				presEducacion.add(btnEducacionGuardar);
				
				
				
				presFinanzas = new JPanel();
				presFinanzas.setBackground(Color.WHITE);
				presupuestos.add(presFinanzas, "name_11031665595600");
				presFinanzas.setLayout(null);
				
				Icon presFinanzasBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
				
				btnFinanzasRegresar = new JLabel("", presFinanzasBackIcon, JLabel.CENTER);
				btnFinanzasRegresar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						presFinanzas.setVisible(false);
						selecPresCateg.setVisible(true);
					}
				});
				btnFinanzasRegresar.setBounds(10, 11, 93, 25);
				presFinanzas.add(btnFinanzasRegresar);
				
				label_28 = new JLabel("Editar tu presupuesto");
				label_28.setFont(new Font("Verdana", Font.PLAIN, 20));
				label_28.setBounds(422, 53, 218, 25);
				presFinanzas.add(label_28);
				
				label_29 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
				label_29.setFont(new Font("Verdana", Font.PLAIN, 18));
				label_29.setBounds(309, 89, 460, 25);
				presFinanzas.add(label_29);
				
				panel_40 = new JPanel();
				panel_40.setLayout(null);
				panel_40.setBackground(new Color(0, 153, 255));
				panel_40.setBounds(129, 160, 252, 473);
				presFinanzas.add(panel_40);
				
				lblFinanzas = new JLabel("Finanzas e Impuestos");
				lblFinanzas.setHorizontalAlignment(SwingConstants.CENTER);
				lblFinanzas.setForeground(Color.WHITE);
				lblFinanzas.setFont(new Font("Verdana", Font.BOLD, 20));
				lblFinanzas.setBounds(0, 199, 252, 31);
				panel_40.add(lblFinanzas);
				
				panel_41 = new JPanel();
				panel_41.setBackground(new Color(0, 153, 255));
				panel_41.setBounds(414, 162, 252, 33);
				presFinanzas.add(panel_41);
				panel_41.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				lblFinanzasEImpuestos = new JLabel("Finanzas e Impuestos");
				lblFinanzasEImpuestos.setForeground(Color.WHITE);
				lblFinanzasEImpuestos.setFont(new Font("Verdana", Font.BOLD, 14));
				panel_41.add(lblFinanzasEImpuestos);
				
				panel_42 = new JPanel();
				panel_42.setBackground(new Color(0, 153, 255));
				panel_42.setBounds(414, 257, 252, 33);
				presFinanzas.add(panel_42);
				
				lblSeguros = new JLabel("Seguros");
				lblSeguros.setForeground(Color.WHITE);
				lblSeguros.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_42.add(lblSeguros);
				
				label_36 = new JLabel("Subcategor\u00EDas");
				label_36.setForeground(Color.BLACK);
				label_36.setFont(new Font("Verdana", Font.BOLD, 15));
				label_36.setBounds(543, 215, 123, 31);
				presFinanzas.add(label_36);
				
				fieldFinanzas2 = new JTextField("0");
				fieldFinanzas2.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas2.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas2.setColumns(10);
				fieldFinanzas2.setBounds(686, 257, 196, 33);
				presFinanzas.add(fieldFinanzas2);
				
				panel_43 = new JPanel();
				panel_43.setBackground(new Color(0, 153, 255));
				panel_43.setBounds(414, 301, 252, 33);
				presFinanzas.add(panel_43);
				
				lblImpuestos = new JLabel("Impuestos");
				lblImpuestos.setForeground(Color.WHITE);
				lblImpuestos.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_43.add(lblImpuestos);
				
				fieldFinanzas3 = new JTextField("0");
				fieldFinanzas3.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas3.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas3.setColumns(10);
				fieldFinanzas3.setBounds(686, 301, 196, 33);
				presFinanzas.add(fieldFinanzas3);
				
				panel_44 = new JPanel();
				panel_44.setBackground(new Color(0, 153, 255));
				panel_44.setBounds(414, 345, 252, 33);
				presFinanzas.add(panel_44);
				
				lblMultas = new JLabel("Multas");
				lblMultas.setForeground(Color.WHITE);
				lblMultas.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_44.add(lblMultas);
				
				fieldFinanzas4 = new JTextField("0");
				fieldFinanzas4.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas4.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas4.setColumns(10);
				fieldFinanzas4.setBounds(686, 345, 196, 33);
				presFinanzas.add(fieldFinanzas4);
				
				panel_45 = new JPanel();
				panel_45.setBackground(new Color(0, 153, 255));
				panel_45.setBounds(414, 389, 252, 33);
				presFinanzas.add(panel_45);
				
				lblServiviosFinancioer = new JLabel("Servicios Financieros");
				lblServiviosFinancioer.setForeground(Color.WHITE);
				lblServiviosFinancioer.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_45.add(lblServiviosFinancioer);
				
				fieldFinanzas5 = new JTextField("0");
				fieldFinanzas5.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas5.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas5.setColumns(10);
				fieldFinanzas5.setBounds(686, 389, 196, 33);
				presFinanzas.add(fieldFinanzas5);
				
				panel_46 = new JPanel();
				panel_46.setBackground(new Color(0, 153, 255));
				panel_46.setBounds(414, 433, 252, 33);
				presFinanzas.add(panel_46);
				
				lblTransferenciosOCheques = new JLabel("Transferencios o Cheques");
				lblTransferenciosOCheques.setForeground(Color.WHITE);
				lblTransferenciosOCheques.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_46.add(lblTransferenciosOCheques);
				
				fieldFinanzas6 = new JTextField("0");
				fieldFinanzas6.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas6.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas6.setColumns(10);
				fieldFinanzas6.setBounds(686, 433, 196, 33);
				presFinanzas.add(fieldFinanzas6);
				
				panel_47 = new JPanel();
				panel_47.setBackground(new Color(0, 153, 255));
				panel_47.setBounds(414, 477, 252, 33);
				presFinanzas.add(panel_47);
				
				lblTarjetasDeCredito = new JLabel("Tarjetas de credito");
				lblTarjetasDeCredito.setForeground(Color.WHITE);
				lblTarjetasDeCredito.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_47.add(lblTarjetasDeCredito);
				
				fieldFinanzas7 = new JTextField("0");
				fieldFinanzas7.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas7.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas7.setColumns(10);
				fieldFinanzas7.setBounds(686, 477, 196, 33);
				presFinanzas.add(fieldFinanzas7);
				
				panel_48 = new JPanel();
				panel_48.setBackground(new Color(0, 153, 255));
				panel_48.setBounds(414, 521, 252, 33);
				presFinanzas.add(panel_48);
				
				label_43 = new JLabel("Otros");
				label_43.setForeground(Color.WHITE);
				label_43.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_48.add(label_43);
				
				fieldFinanzas8 = new JTextField("0");
				fieldFinanzas8.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzas8.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzas8.setColumns(10);
				fieldFinanzas8.setBounds(686, 521, 196, 33);
				presFinanzas.add(fieldFinanzas8);
				
				btnFinanzasGuardar = new JButton("Guardar");
				btnFinanzasGuardar.setForeground(Color.WHITE);
				btnFinanzasGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
				btnFinanzasGuardar.setBorder(null);
				btnFinanzasGuardar.setBackground(new Color(1, 162, 82));
				btnFinanzasGuardar.setBounds(686, 574, 196, 33);
				presFinanzas.add(btnFinanzasGuardar);
				
				fieldFinanzasTotal = new JTextField("0");
				fieldFinanzasTotal.setHorizontalAlignment(SwingConstants.CENTER);
				fieldFinanzasTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldFinanzasTotal.setColumns(10);
				fieldFinanzasTotal.setBounds(686, 162, 196, 33);
				presFinanzas.add(fieldFinanzasTotal);
				
				// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener finanzasDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldFinanzas2.getText()) + Double.parseDouble(fieldFinanzas3.getText()) + Double.parseDouble(fieldFinanzas4.getText()) +
								Double.parseDouble(fieldFinanzas5.getText()) + Double.parseDouble(fieldFinanzas6.getText()) + Double.parseDouble(fieldFinanzas7.getText()) + Double.parseDouble(fieldFinanzas8.getText());
						fieldFinanzasTotal.setText(Double.toString(total));
					
					}

				};

				fieldFinanzas2.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas3.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas4.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas5.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas6.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas7.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzas8.getDocument().addDocumentListener(finanzasDL);
				fieldFinanzasTotal.setEditable(false);
				
				presRopa = new JPanel();
				presRopa.setBackground(Color.WHITE);
				presupuestos.add(presRopa, "name_55010010732700");
				presRopa.setLayout(null);
				
				Icon presRopaBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
				
				btnRopaRegresar = new JLabel("", presRopaBackIcon, JLabel.CENTER);
				btnRopaRegresar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						presRopa.setVisible(false);
						selecPresCateg.setVisible(true);
					}
				});
				btnRopaRegresar.setBounds(10, 11, 93, 25);
				presRopa.add(btnRopaRegresar);
				
				label_32 = new JLabel("Editar tu presupuesto");
				label_32.setFont(new Font("Verdana", Font.PLAIN, 20));
				label_32.setBounds(422, 53, 218, 26);
				presRopa.add(label_32);
				
				label_33 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
				label_33.setFont(new Font("Verdana", Font.PLAIN, 18));
				label_33.setBounds(309, 89, 460, 23);
				presRopa.add(label_33);
				
				panel_49 = new JPanel();
				panel_49.setLayout(null);
				panel_49.setBackground(new Color(0, 153, 255));
				panel_49.setBounds(129, 160, 252, 473);
				presRopa.add(panel_49);
				
				lblRopaYCalzado = new JLabel("Ropa y Calzado");
				lblRopaYCalzado.setHorizontalAlignment(SwingConstants.CENTER);
				lblRopaYCalzado.setForeground(Color.WHITE);
				lblRopaYCalzado.setFont(new Font("Verdana", Font.BOLD, 14));
				lblRopaYCalzado.setBounds(0, 219, 252, 33);
				panel_49.add(lblRopaYCalzado);
				
				panel_50 = new JPanel();
				panel_50.setBackground(new Color(0, 153, 255));
				panel_50.setBounds(407, 162, 252, 33);
				presRopa.add(panel_50);
				
				lblRopaYCalzado_1 = new JLabel("Ropa y Calzado");
				lblRopaYCalzado_1.setForeground(Color.WHITE);
				lblRopaYCalzado_1.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_50.add(lblRopaYCalzado_1);
				
				label_38 = new JLabel("Subcategor\u00EDas");
				label_38.setForeground(Color.BLACK);
				label_38.setFont(new Font("Verdana", Font.BOLD, 15));
				label_38.setBounds(543, 215, 116, 20);
				presRopa.add(label_38);
				
				panel_51 = new JPanel();
				panel_51.setBackground(new Color(0, 153, 255));
				panel_51.setBounds(414, 257, 252, 33);
				presRopa.add(panel_51);
				
				lblCalzado = new JLabel("Calzado");
				lblCalzado.setForeground(Color.WHITE);
				lblCalzado.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_51.add(lblCalzado);
				
				fieldRopa2 = new JTextField("0");
				fieldRopa2.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopa2.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopa2.setColumns(10);
				fieldRopa2.setBounds(686, 257, 196, 33);
				presRopa.add(fieldRopa2);
				
				panel_52 = new JPanel();
				panel_52.setBackground(new Color(0, 153, 255));
				panel_52.setBounds(414, 315, 252, 33);
				presRopa.add(panel_52);
				
				lblAccesorios = new JLabel("Accesorios");
				lblAccesorios.setForeground(Color.WHITE);
				lblAccesorios.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_52.add(lblAccesorios);
				
				fieldRopa3 = new JTextField("0");
				fieldRopa3.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopa3.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopa3.setColumns(10);
				fieldRopa3.setBounds(686, 315, 196, 33);
				presRopa.add(fieldRopa3);
				
				panel_53 = new JPanel();
				panel_53.setBackground(new Color(0, 153, 255));
				panel_53.setBounds(414, 371, 252, 33);
				presRopa.add(panel_53);
				
				lblLavanderiaYTintoreria = new JLabel("Lavanderia y Tintoreria");
				lblLavanderiaYTintoreria.setForeground(Color.WHITE);
				lblLavanderiaYTintoreria.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_53.add(lblLavanderiaYTintoreria);
				
				fieldRopa4 = new JTextField("0");
				fieldRopa4.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopa4.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopa4.setColumns(10);
				fieldRopa4.setBounds(686, 371, 196, 33);
				presRopa.add(fieldRopa4);
				
				panel_54 = new JPanel();
				panel_54.setBackground(new Color(0, 153, 255));
				panel_54.setBounds(414, 432, 252, 33);
				presRopa.add(panel_54);
				
				lblRopa = new JLabel("Ropa");
				lblRopa.setForeground(Color.WHITE);
				lblRopa.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_54.add(lblRopa);
				
				fieldRopa5 = new JTextField("0");
				fieldRopa5.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopa5.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopa5.setColumns(10);
				fieldRopa5.setBounds(686, 432, 196, 33);
				presRopa.add(fieldRopa5);
				
				panel_55 = new JPanel();
				panel_55.setBackground(new Color(0, 153, 255));
				panel_55.setBounds(414, 494, 252, 33);
				presRopa.add(panel_55);
				
				lblOtros_1 = new JLabel("Otros");
				lblOtros_1.setForeground(Color.WHITE);
				lblOtros_1.setFont(new Font("Verdana", Font.BOLD, 13));
				panel_55.add(lblOtros_1);
				
				fieldRopa6 = new JTextField("0");
				fieldRopa6.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopa6.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopa6.setColumns(10);
				fieldRopa6.setBounds(686, 494, 196, 33);
				presRopa.add(fieldRopa6);
				
				btnRopaGuardar = new JButton("Guardar");
				btnRopaGuardar.setForeground(Color.WHITE);
				btnRopaGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
				btnRopaGuardar.setBorder(null);
				btnRopaGuardar.setBackground(new Color(1, 162, 82));
				btnRopaGuardar.setBounds(686, 574, 196, 33);
				presRopa.add(btnRopaGuardar);
				
				fieldRopaTotal = new JTextField("0");
				fieldRopaTotal.setHorizontalAlignment(SwingConstants.CENTER);
				fieldRopaTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
				fieldRopaTotal.setColumns(10);
				fieldRopaTotal.setBounds(686, 162, 196, 33);
				presRopa.add(fieldRopaTotal);
				
				// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener ropaDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldRopa2.getText()) + Double.parseDouble(fieldRopa3.getText()) + Double.parseDouble(fieldRopa4.getText()) +
								Double.parseDouble(fieldRopa5.getText()) + Double.parseDouble(fieldRopa6.getText());
						fieldRopaTotal.setText(Double.toString(total));
					
					}

				};

				fieldRopa2.getDocument().addDocumentListener(ropaDL);
				fieldRopa3.getDocument().addDocumentListener(ropaDL);
				fieldRopa4.getDocument().addDocumentListener(ropaDL);
				fieldRopa5.getDocument().addDocumentListener(ropaDL);
				fieldRopa6.getDocument().addDocumentListener(ropaDL);
				fieldRopaTotal.setEditable(false);
		
		presRegalos = new JPanel();
		presRegalos.setBackground(Color.WHITE);
		presupuestos.add(presRegalos, "name_56365497182200");
		presRegalos.setLayout(null);
		
		Icon presRegreBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		btnRegalosRegresar = new JLabel("", presRegreBackIcon, JLabel.CENTER);
		btnRegalosRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presRegalos.setVisible(false);
				selecPresCateg.setVisible(true);
			}
		});
		btnRegalosRegresar.setBounds(10, 11, 93, 25);
		presRegalos.add(btnRegalosRegresar);
		
		label_34 = new JLabel("Editar tu presupuesto");
		label_34.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_34.setBounds(422, 53, 218, 26);
		presRegalos.add(label_34);
		
		label_37 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_37.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_37.setBounds(309, 89, 460, 23);
		presRegalos.add(label_37);
		
		panel_56 = new JPanel();
		panel_56.setLayout(null);
		panel_56.setBackground(new Color(0, 153, 255));
		panel_56.setBounds(129, 160, 252, 473);
		presRegalos.add(panel_56);
		
		lblRegalosYAyuda = new JLabel("Regalos y Ayuda");
		lblRegalosYAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegalosYAyuda.setForeground(Color.WHITE);
		lblRegalosYAyuda.setFont(new Font("Verdana", Font.BOLD, 14));
		lblRegalosYAyuda.setBounds(0, 219, 252, 33);
		panel_56.add(lblRegalosYAyuda);
		
		panel_57 = new JPanel();
		panel_57.setBackground(new Color(0, 153, 255));
		panel_57.setBounds(407, 162, 252, 33);
		presRegalos.add(panel_57);
		
		lblRegalosYAyuda_1 = new JLabel("Regalos y Ayuda");
		lblRegalosYAyuda_1.setForeground(Color.WHITE);
		lblRegalosYAyuda_1.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_57.add(lblRegalosYAyuda_1);
		
		panel_58 = new JPanel();
		panel_58.setBackground(new Color(0, 153, 255));
		panel_58.setBounds(414, 257, 252, 33);
		presRegalos.add(panel_58);
		
		lblDonaciones = new JLabel("Donaciones");
		lblDonaciones.setForeground(Color.WHITE);
		lblDonaciones.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_58.add(lblDonaciones);
		
		fieldRegalos2 = new JTextField("0");
		fieldRegalos2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos2.setColumns(10);
		fieldRegalos2.setBounds(686, 257, 196, 33);
		presRegalos.add(fieldRegalos2);
		
		panel_59 = new JPanel();
		panel_59.setBackground(new Color(0, 153, 255));
		panel_59.setBounds(414, 315, 252, 33);
		presRegalos.add(panel_59);
		
		lblApoyoAFamiliaresamigos = new JLabel("Apoyo a familiares/amigos");
		lblApoyoAFamiliaresamigos.setForeground(Color.WHITE);
		lblApoyoAFamiliaresamigos.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_59.add(lblApoyoAFamiliaresamigos);
		
		fieldRegalos3 = new JTextField("0");
		fieldRegalos3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos3.setColumns(10);
		fieldRegalos3.setBounds(686, 315, 196, 33);
		presRegalos.add(fieldRegalos3);
		
		panel_60 = new JPanel();
		panel_60.setBackground(new Color(0, 153, 255));
		panel_60.setBounds(414, 371, 252, 33);
		presRegalos.add(panel_60);
		
		lblRegalos = new JLabel("Regalos");
		lblRegalos.setForeground(Color.WHITE);
		lblRegalos.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_60.add(lblRegalos);
		
		fieldRegalos4 = new JTextField("0");
		fieldRegalos4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos4.setColumns(10);
		fieldRegalos4.setBounds(686, 371, 196, 33);
		presRegalos.add(fieldRegalos4);
		
		panel_61 = new JPanel();
		panel_61.setBackground(new Color(0, 153, 255));
		panel_61.setBounds(414, 432, 252, 33);
		presRegalos.add(panel_61);
		
		lblAyudaHumanitaria = new JLabel("Ayuda Humanitaria");
		lblAyudaHumanitaria.setForeground(Color.WHITE);
		lblAyudaHumanitaria.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_61.add(lblAyudaHumanitaria);
		
		fieldRegalos5 = new JTextField("0");
		fieldRegalos5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos5.setColumns(10);
		fieldRegalos5.setBounds(686, 432, 196, 33);
		presRegalos.add(fieldRegalos5);
		
		panel_62 = new JPanel();
		panel_62.setBackground(new Color(0, 153, 255));
		panel_62.setBounds(414, 494, 252, 33);
		presRegalos.add(panel_62);
		
		label_47 = new JLabel("Otros");
		label_47.setForeground(Color.WHITE);
		label_47.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_62.add(label_47);
		
		fieldRegalos6 = new JTextField("0");
		fieldRegalos6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos6.setColumns(10);
		fieldRegalos6.setBounds(686, 494, 196, 33);
		presRegalos.add(fieldRegalos6);
		
		btnRegalosGuardar = new JButton("Guardar");
		btnRegalosGuardar.setForeground(Color.WHITE);
		btnRegalosGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnRegalosGuardar.setBorder(null);
		btnRegalosGuardar.setBackground(new Color(1, 162, 82));
		btnRegalosGuardar.setBounds(686, 574, 196, 33);
		presRegalos.add(btnRegalosGuardar);
		
		fieldRegalosTotal = new JTextField("0");
		fieldRegalosTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalosTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalosTotal.setColumns(10);
		fieldRegalosTotal.setBounds(686, 162, 196, 33);
		presRegalos.add(fieldRegalosTotal);
		
		// METODO PARA SUMAR AUTOMATICAMENTE 
		// TODO
		DocumentListener regalosaDL = new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				suma();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				suma();
			}

			protected void suma() {
				
				double total = Double.parseDouble(fieldRegalos2.getText()) + Double.parseDouble(fieldRegalos3.getText()) + Double.parseDouble(fieldRegalos4.getText()) +
						Double.parseDouble(fieldRegalos5.getText()) + Double.parseDouble(fieldRegalos6.getText());
				fieldRegalosTotal.setText(Double.toString(total));
			
			}

		};

		fieldRegalos2.getDocument().addDocumentListener(regalosaDL);
		fieldRegalos3.getDocument().addDocumentListener(regalosaDL);
		fieldRegalos4.getDocument().addDocumentListener(regalosaDL);
		fieldRegalos5.getDocument().addDocumentListener(regalosaDL);
		fieldRegalos6.getDocument().addDocumentListener(regalosaDL);
		fieldRegalosTotal.setEditable(false);
		
		presViajes = new JPanel();
		presViajes.setBackground(Color.WHITE);
		presupuestos.add(presViajes, "name_56372128937800");
		presViajes.setLayout(null);
		
		
		Icon presViajesBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
		btnViajesRegresar = new JLabel("", presViajesBackIcon, JLabel.CENTER);
		btnViajesRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presViajes.setVisible(false);
				selecPresCateg.setVisible(true);
			}
		});
		btnViajesRegresar.setBounds(10, 11, 93, 25);
		presViajes.add(btnViajesRegresar);
		
		label_49 = new JLabel("Editar tu presupuesto");
		label_49.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_49.setBounds(422, 53, 218, 26);
		presViajes.add(label_49);
		
		label_50 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_50.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_50.setBounds(309, 89, 460, 23);
		presViajes.add(label_50);
		
		panel_63 = new JPanel();
		panel_63.setLayout(null);
		panel_63.setBackground(new Color(0, 153, 255));
		panel_63.setBounds(129, 160, 252, 473);
		presViajes.add(panel_63);
		
		Viajes = new JLabel("Viajes");
		Viajes.setHorizontalAlignment(SwingConstants.CENTER);
		Viajes.setForeground(Color.WHITE);
		Viajes.setFont(new Font("Verdana", Font.BOLD, 14));
		Viajes.setBounds(0, 219, 252, 33);
		panel_63.add(Viajes);
		
		panel_64 = new JPanel();
		panel_64.setBackground(new Color(0, 153, 255));
		panel_64.setBounds(407, 162, 252, 33);
		presViajes.add(panel_64);
		
		lblViajes = new JLabel("Viajes");
		lblViajes.setForeground(Color.WHITE);
		lblViajes.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_64.add(lblViajes);
		
		panel_65 = new JPanel();
		panel_65.setBackground(new Color(0, 153, 255));
		panel_65.setBounds(414, 257, 252, 33);
		presViajes.add(panel_65);
		
		lblHospedaje = new JLabel("Hospedaje");
		lblHospedaje.setForeground(Color.WHITE);
		lblHospedaje.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_65.add(lblHospedaje);
		
		fieldViajes2 = new JTextField("0");
		fieldViajes2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes2.setColumns(10);
		fieldViajes2.setBounds(686, 257, 196, 33);
		presViajes.add(fieldViajes2);
		
		panel_66 = new JPanel();
		panel_66.setBackground(new Color(0, 153, 255));
		panel_66.setBounds(414, 315, 252, 33);
		presViajes.add(panel_66);
		
		lblBoletosYCruceros = new JLabel("Boletos y Cruceros");
		lblBoletosYCruceros.setForeground(Color.WHITE);
		lblBoletosYCruceros.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_66.add(lblBoletosYCruceros);
		
		fieldViajes3 = new JTextField("0");
		fieldViajes3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes3.setColumns(10);
		fieldViajes3.setBounds(686, 315, 196, 33);
		presViajes.add(fieldViajes3);
		
		panel_67 = new JPanel();
		panel_67.setBackground(new Color(0, 153, 255));
		panel_67.setBounds(414, 371, 252, 33);
		presViajes.add(panel_67);
		
		lblTransporteDeViajes = new JLabel("Vuelos");
		lblTransporteDeViajes.setForeground(Color.WHITE);
		lblTransporteDeViajes.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_67.add(lblTransporteDeViajes);
		
		fieldViajes4 = new JTextField("0");
		fieldViajes4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes4.setColumns(10);
		fieldViajes4.setBounds(686, 371, 196, 33);
		presViajes.add(fieldViajes4);
		
		panel_68 = new JPanel();
		panel_68.setBackground(new Color(0, 153, 255));
		panel_68.setBounds(414, 432, 252, 33);
		presViajes.add(panel_68);
		
		lblSouvenir = new JLabel("Souvenir");
		lblSouvenir.setForeground(Color.WHITE);
		lblSouvenir.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_68.add(lblSouvenir);
		
		fieldViajes5 = new JTextField("0");
		fieldViajes5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes5.setColumns(10);
		fieldViajes5.setBounds(686, 432, 196, 33);
		presViajes.add(fieldViajes5);
		
		panel_69 = new JPanel();
		panel_69.setBackground(new Color(0, 153, 255));
		panel_69.setBounds(414, 494, 252, 33);
		presViajes.add(panel_69);
		
		label_57 = new JLabel("Otros");
		label_57.setForeground(Color.WHITE);
		label_57.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_69.add(label_57);
		
		fieldViajes6 = new JTextField("0");
		fieldViajes6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes6.setColumns(10);
		fieldViajes6.setBounds(686, 494, 196, 33);
		presViajes.add(fieldViajes6);
		
		btnViajesGuardar = new JButton("Guardar");
		btnViajesGuardar.setForeground(Color.WHITE);
		btnViajesGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnViajesGuardar.setBorder(null);
		btnViajesGuardar.setBackground(new Color(1, 162, 82));
		btnViajesGuardar.setBounds(686, 574, 196, 33);
		presViajes.add(btnViajesGuardar);
		
		fieldViajesTotal = new JTextField("0");
		fieldViajesTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajesTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajesTotal.setColumns(10);
		fieldViajesTotal.setBounds(686, 160, 196, 33);
		presViajes.add(fieldViajesTotal);
				
		// METODO PARA SUMAR AUTOMATICAMENTE 
				// TODO
				DocumentListener viajesDL = new DocumentListener() {

					@Override
					public void changedUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void insertUpdate(DocumentEvent arg0) {
						suma();
					}

					@Override
					public void removeUpdate(DocumentEvent arg0) {
						suma();
					}

					protected void suma() {
						
						double total = Double.parseDouble(fieldViajes2.getText()) + Double.parseDouble(fieldViajes3.getText()) + Double.parseDouble(fieldViajes4.getText()) +
								Double.parseDouble(fieldViajes5.getText()) + Double.parseDouble(fieldViajes6.getText());
						fieldViajesTotal.setText(Double.toString(total));
					
					}

				};

				fieldViajes2.getDocument().addDocumentListener(viajesDL);
				fieldViajes3.getDocument().addDocumentListener(viajesDL);
				fieldViajes4.getDocument().addDocumentListener(viajesDL);
				fieldViajes5.getDocument().addDocumentListener(viajesDL);
				fieldViajes6.getDocument().addDocumentListener(viajesDL);
				fieldViajesTotal.setEditable(false);

		
		
		
		
		// FIN AUTO
		
		perfil = new JPanel();
		main.add(perfil, "name_656442519169700");
		
		pCambiarContrasena = new JPanel();
		pCambiarContrasena.setVisible(false);
		perfil.setLayout(new CardLayout(0, 0));
		
		pPerfilMain = new JPanel();
		pPerfilMain.setBackground(Color.WHITE);
		perfil.add(pPerfilMain, "name_151000322866600");
		pPerfilMain.setLayout(null);
		pCambiarContrasena.setBackground(new Color(255, 255, 255));
		perfil.add(pCambiarContrasena, "name_151000425973700");
		pCambiarContrasena.setLayout(null);
		
		JLabel lblCambiarContrasea = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiarContrasea.setBounds(0, 90, 1120, 29);
		lblCambiarContrasea.setFont(new Font("Arial", Font.BOLD, 24));
		pCambiarContrasena.add(lblCambiarContrasea);
		
		fNuevaContrasena = new JTextField();
		fNuevaContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
		fNuevaContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		TextPrompt nuevacontrasea = new TextPrompt("Nueva contrase�a", fNuevaContrasena);
		nuevacontrasea.setFont(new Font("Arial", Font.PLAIN, 13));
		fNuevaContrasena.setBounds(433, 222, 263, 30);
		pCambiarContrasena.add(fNuevaContrasena);
		fNuevaContrasena.setColumns(10);
		
		fConfirmarContrasena = new JTextField();
		fConfirmarContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		TextPrompt cambiarContra2 = new TextPrompt("Confirmar contrase�a", fConfirmarContrasena);
		cambiarContra2.setFont(new Font("Arial", Font.PLAIN, 13));
		fConfirmarContrasena.setColumns(10);
		fConfirmarContrasena.setBounds(433, 283, 263, 30);
		pCambiarContrasena.add(fConfirmarContrasena);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(433, 252, 263, 1);
		pCambiarContrasena.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(433, 313, 263, 1);
		pCambiarContrasena.add(separator_7);
		
		btnGuardarContrasena = new JButton("Guardar");
		MiListener oyentebtnGuardarContrasena = new MiListener();
		btnGuardarContrasena.addActionListener(oyentebtnGuardarContrasena);
		btnGuardarContrasena.setBorder(null);
		btnGuardarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarContrasena.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardarContrasena.setBackground(new Color(0, 153, 255));
		btnGuardarContrasena.setForeground(Color.WHITE);
		btnGuardarContrasena.setBounds(433, 462, 120, 30);
		pCambiarContrasena.add(btnGuardarContrasena);
		
		btnCancelarCambio = new JButton("Cancelar");
		MiListener oyentebtnCancelarCambio = new MiListener();
		btnCancelarCambio.addActionListener(oyentebtnCancelarCambio);
		btnCancelarCambio.setBorder(null);
		btnCancelarCambio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelarCambio.setBackground(new Color(255, 0, 153));
		btnCancelarCambio.setForeground(new Color(255, 255, 255));
		btnCancelarCambio.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelarCambio.setBounds(576, 462, 120, 30);
		pCambiarContrasena.add(btnCancelarCambio);
		
		lblContrasenaDebe = new JLabel("- Debe tener minimo 8 caracteres");
		lblContrasenaDebe.setFont(new Font("Arial", Font.PLAIN, 13));
		lblContrasenaDebe.setBounds(433, 347, 261, 21);
		pCambiarContrasena.add(lblContrasenaDebe);
		
		lblDiferenteAl = new JLabel("- Diferente al anterior");
		lblDiferenteAl.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDiferenteAl.setBounds(433, 379, 261, 21);
		pCambiarContrasena.add(lblDiferenteAl);
		
		lblPerfilError = new JLabel("");
		lblPerfilError.setForeground(new Color(255, 0, 0));
		lblPerfilError.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPerfilError.setBounds(433, 322, 263, 25);
		pCambiarContrasena.add(lblPerfilError);

		
		
		
		
		fPerfilNombre = new JTextField();
		fPerfilNombre.setLocation(660, 170);
		fPerfilNombre.setSize(250, 30);
		fPerfilNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerfilNombre.setText(tempNombre);
		pPerfilMain.add(fPerfilNombre, "name_151000515415800");
		fPerfilNombre.setColumns(10);
		
		fPerfilApellido = new JTextField();
		fPerfilApellido.setLocation(660, 220);
		fPerfilApellido.setSize(250, 30);
		fPerfilApellido.setText(tempApellido);
		fPerfilApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		pPerfilMain.add(fPerfilApellido, "name_151000570008400");
		fPerfilApellido.setColumns(10);
		
		fPerfilCorreo = new JTextField();
		fPerfilCorreo.setLocation(660, 265);
		fPerfilCorreo.setSize(250, 30);
		fPerfilCorreo.setText(usuarioLeer.get(0));
		fPerfilCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		pPerfilMain.add(fPerfilCorreo, "name_151000619920200");
		fPerfilCorreo.setColumns(10);
		
		
		DocumentListener dl = new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				if(!fPerfilNombre.getText().equals(tempNombre) || !fPerfilApellido.getText().equals(tempApellido)
						|| !fPerfilCorreo.getText().equals(tempCorreo)) {
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(new Color(93,143,252));
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnGuardarCambios.setEnabled(true);
				} else {
					btnGuardarCambios.setEnabled(false);
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(Color.LIGHT_GRAY);
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				if(!fPerfilNombre.getText().equals(tempNombre) || !fPerfilApellido.getText().equals(tempApellido)
						|| !fPerfilCorreo.getText().equals(tempCorreo)) {
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(new Color(93,143,252));
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnGuardarCambios.setEnabled(true);
				} else {
					btnGuardarCambios.setEnabled(false);
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(Color.LIGHT_GRAY);
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				if(!fPerfilNombre.getText().equals(tempNombre) || !fPerfilApellido.getText().equals(tempApellido)
						|| !fPerfilCorreo.getText().equals(tempCorreo)) {
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(new Color(93,143,252));
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnGuardarCambios.setEnabled(true);
				} else {
					btnGuardarCambios.setEnabled(false);
					btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnGuardarCambios.setForeground(Color.WHITE);
					btnGuardarCambios.setBackground(Color.LIGHT_GRAY);
					btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
			}
			
		};
		
		fPerfilNombre.getDocument().addDocumentListener(dl);
		fPerfilApellido.getDocument().addDocumentListener(dl);
		fPerfilCorreo.getDocument().addDocumentListener(dl);
		
		perfilCambiarContrasena = new JButton("Cambiar contrasena");
		perfilCambiarContrasena.setLocation(660, 122);
		perfilCambiarContrasena.setSize(250, 30);
		MiListener oyentePerfilCambiarContrasena = new MiListener();
		perfilCambiarContrasena.addActionListener(oyentePerfilCambiarContrasena);
		perfilCambiarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		perfilCambiarContrasena.setForeground(Color.WHITE);
		perfilCambiarContrasena.setBackground(new Color(93,143,252));
		perfilCambiarContrasena.setBorder(null);
		perfilCambiarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pPerfilMain.add(perfilCambiarContrasena, "name_151000669620600");
		
		btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setLocation(660, 394);
		btnGuardarCambios.setSize(250, 30);
		btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardarCambios.setForeground(Color.WHITE);
		btnGuardarCambios.setBackground(Color.LIGHT_GRAY);
		btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarCambios.setEnabled(false);
		pPerfilMain.add(btnGuardarCambios, "name_151000716498700");
		btnGuardarCambios.addActionListener(oyente);
		
		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.setLocation(176, 435);
		btnCambiarFoto.setSize(250, 30);
		btnCambiarFoto.setForeground(Color.WHITE);
		btnCambiarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pPerfilMain.add(btnCambiarFoto, "name_151000756312900");
		btnCambiarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DB.subirImagen(usuarioLeer.get(0));
				BufferedImage img = DB.setImagen(usuarioLeer.get(0));
				
				imgPerfil = new ImageIcon(img);
				imgPer = imgPerfil.getImage().getScaledInstance(275, 160, Image.SCALE_SMOOTH);
			    lblPerfilPicture.setIcon(new ImageIcon(imgPer));
				
				try {
					int diameter = Math.min(img.getWidth(), img.getHeight());
				    BufferedImage mask = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);

				    Graphics2D g2d = mask.createGraphics();
				    applyQualityRenderingHints(g2d);
				    g2d.fillOval(0, 0, diameter - 1, diameter - 1);
				    g2d.dispose();

				    BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
				    g2d = masked.createGraphics();
				    applyQualityRenderingHints(g2d);
				    int x = (diameter - img.getWidth()) / 2;
				    int y = (diameter - img.getHeight()) / 2;
				    g2d.drawImage(img, x, y, null);
				    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
				    g2d.drawImage(mask, 0, 0, null);
				    g2d.dispose();
				    
				    ImageIcon imgIcon = new ImageIcon(masked);
			        Image imgEscalada = imgIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
				    lblUserImage.setIcon(new ImageIcon(imgEscalada));
				      
				}catch(Exception e) {}
				
			}
		});
		btnCambiarFoto.setBackground(new Color(93,143,252));
		btnCambiarFoto.setBorder(null);
		btnCambiarFoto.setFont(new Font("Arial", Font.PLAIN, 12));
		
	
		pPerfilMain.add(lblPerfilPicture, "name_151000800914400");
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setLocation(660, 200);
		separator_1.setSize(250, 1);
		pPerfilMain.add(separator_1, "name_151000840562400");
		
		separator_2 = new JSeparator();
		separator_2.setLocation(660, 250);
		separator_2.setSize(250, 1);
		pPerfilMain.add(separator_2, "name_151000882103600");
		
		
	
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:   ");
		lblNewLabel_2.setLocation(452, 170);
		lblNewLabel_2.setSize(200, 30);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		pPerfilMain.add(lblNewLabel_2, "name_151000925900900");
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setLocation(660, 295);
		separator_5.setSize(250, 1);
		pPerfilMain.add(separator_5, "name_151000964773500");
		
		lblApellido = new JLabel("Apellido:   ");
		lblApellido.setLocation(452, 220);
		lblApellido.setSize(200, 30);
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 13));
		pPerfilMain.add(lblApellido, "name_151001001733700");
		
		lblCorre = new JLabel("Correo:   ");
		lblCorre.setLocation(450, 265);
		lblCorre.setSize(200, 30);
		lblCorre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorre.setFont(new Font("Arial", Font.PLAIN, 13));
		pPerfilMain.add(lblCorre, "name_151001034996400");
		
		lblContrasena = new JLabel("Contrasena:   ");
		lblContrasena.setSize(200, 30);
		lblContrasena.setLocation(450, 122);
		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 13));
		pPerfilMain.add(lblContrasena, "name_151001068787000");
		
		String darkText = "";
		
		if (isDarkMode == false) {
			darkText = "Cambiar a DarkMode";
		}else {
			darkText = "Cambiar a LightMode";
		}
		
		btnDarkMode = new JButton(darkText);
		btnDarkMode.setBounds(725, 506, 200, 29);
		pPerfilMain.add(btnDarkMode);
		btnDarkMode.addActionListener(oyente);
		
		calendario = new JPanel();
		calendario.setBackground(Color.WHITE);
		main.add(calendario, "name_1698860894200");
		calendario.setLayout(null);
		
		calendar = new JCalendar();
		
		
		calendar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		calendar.setBounds(59, 76, 554, 231);
		calendario.add(calendar);
		
		JLabel lblCalendario = new JLabel("Calendario");
		lblCalendario.setFont(new Font("Arial", Font.BOLD, 18));
		lblCalendario.setBounds(71, 30, 117, 34);
		calendario.add(lblCalendario);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(653, 6, 15, 314);
		calendario.add(separator_8);
		
		dcMostrarEventos = new JDateChooser();
		dcMostrarEventos.setBounds(110, 396, 119, 26);
		calendario.add(dcMostrarEventos);
		
		lblMostrarEventos = new JLabel("Mostrar Eventos");
		lblMostrarEventos.setFont(new Font("Arial", Font.BOLD, 18));
		lblMostrarEventos.setBounds(59, 350, 170, 34);
		calendario.add(lblMostrarEventos);
		
		label = new JLabel("Fecha:");
		label.setBounds(59, 396, 61, 16);
		calendario.add(label);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(241, 396, 117, 29);
		calendario.add(btnMostrar);
		btnMostrar.addActionListener(oyente);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(59, 440, 428, 147);
		calendario.add(scrollPane_2);
		
		listMostrarEventos = new JList();
		listMostrarEventos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				try {
				Date an = dcMostrarEventos.getDate();
				String fecha = "";
				
				if (an != null) {
				String[] datee = an.toString().split(" ");
				fecha = datee[1] +"/"+ datee[2] +"/"+ datee[5];
				
				}
				
				String split = listMostrarEventos.getSelectedValue().toString();
				String[] a = split.split(" - ");
				
				ArrayList<String> get = DB.getEventos(tempCorreo, fecha);
				
				for (String z:get) {
					String[] as = z.split(" @@ ");

					if (fecha.equals(as[0]) && a[1].equals(as[1])) {
						txtADescripcionMostrar.setText(as[2]);
					}	
				}
				}catch (Exception f) {}
				
				
			}
		});
		listMostrarEventos.setFont(new Font("Arial", Font.PLAIN, 16));
		
		scrollPane_2.setViewportView(listMostrarEventos);
		
		JLabel label_5 = new JLabel("Descripcion:");
		label_5.setBounds(514, 412, 96, 16);
		calendario.add(label_5);
		 
		 scrollPane_4 = new JScrollPane();
		 scrollPane_4.setBounds(514, 440, 375, 140);
		 calendario.add(scrollPane_4);
		
		 txtADescripcionMostrar = new JTextArea();
		 scrollPane_4.setViewportView(txtADescripcionMostrar);
		txtADescripcionMostrar.setWrapStyleWord(true);
		txtADescripcionMostrar.setLineWrap(true);
		txtADescripcionMostrar.setFont(new Font("Arial", Font.PLAIN, 15));
		txtADescripcionMostrar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(6, 315, 653, 14);
		calendario.add(separator_9);
		
		panel_5 = new JPanel();
		panel_5.setBounds(680, 6, 428, 418);
		calendario.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_5.add(panel_4, "name_41518890215445");
		panel_4.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_5.add(panel_6, "name_41518890215446");
		panel_6.setLayout(null);
		
		btnEstablecerEvento = new JButton("Establecer evento");
		btnEstablecerEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cbEliminar.setModel(new DefaultComboBoxModel(new String[] {}));
				dcEliminar.setDate(null);
				
				panel_4.setVisible(true);
				panel_6.setVisible(false);
			}
		});
		btnEstablecerEvento.setBounds(242, 16, 141, 29);
		panel_6.add(btnEstablecerEvento);
		
		lblEliminarEvento = new JLabel("Eliminar Evento");
		lblEliminarEvento.setFont(new Font("Arial", Font.BOLD, 18));
		lblEliminarEvento.setBounds(18, 11, 212, 34);
		panel_6.add(lblEliminarEvento);
		
		label_7 = new JLabel("Fecha:");
		label_7.setBounds(18, 57, 61, 16);
		panel_6.add(label_7);
		
		dcEliminar = new JDateChooser();
		dcEliminar.setBounds(69, 57, 119, 26);
		panel_6.add(dcEliminar);
		
		btnMostrareliminar = new JButton("Mostrar");
		btnMostrareliminar.setBounds(200, 57, 117, 29);
		panel_6.add(btnMostrareliminar);
		
		cbEliminar = new JComboBox();
		
		cbEliminar.setBounds(76, 138, 261, 34);
		panel_6.add(cbEliminar);
		
		lblTitulo_1 = new JLabel("Titulo:");
		lblTitulo_1.setBounds(18, 146, 61, 16);
		panel_6.add(lblTitulo_1);
		
		btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminar_1.setEnabled(false);
				panel_7.setVisible(true);
				btnMostrareliminar.setEnabled(false);
				
				cbEliminar.setEnabled(false);
				dcEliminar.setEnabled(false);
				btnEstablecerEvento.setEnabled(false);
				
				
			}
		});
		btnEliminar_1.setBounds(224, 184, 117, 29);
		panel_6.add(btnEliminar_1);
		
		panel_7 = new JPanel();
		panel_7.setBounds(130, 225, 165, 89);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setVisible(false);
		
		lblNewLabel_3 = new JLabel("¿Estas seguro?");
		lblNewLabel_3.setBounds(38, 6, 119, 26);
		panel_7.add(lblNewLabel_3);
		
		btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Date f = dcEliminar.getDate();
				
				if (f != null) {
					String[] datee = f.toString().split(" ");
					String fecha = datee[1] +"/"+ datee[2] +"/"+ datee[5];
					
					String cb = cbEliminar.getSelectedItem().toString();
					String[] bc = cb.split(" - ");
					
					boolean resultado = DB.eliminarEvento(tempCorreo, fecha, bc[1]);
					
					if ( resultado == true) {
						JOptionPane.showMessageDialog(null, "Se elimino evento con exito");
					}else {
						JOptionPane.showMessageDialog(null, "No se ha podido eliminar el evento");
					}
					

					
					btnEliminar_1.setEnabled(true);
					panel_7.setVisible(false);
					btnMostrareliminar.setEnabled(true);
					cbEliminar.setEnabled(true);
					dcEliminar.setEnabled(true);
					btnEstablecerEvento.setEnabled(true);
					cbEliminar.setModel(new DefaultComboBoxModel(new String[] {}));
					dcEliminar.setDate(null);
					
				}
						
				
			}
		});
		btnSi.setBounds(33, 36, 43, 34);
		panel_7.add(btnSi);
		
		btnNo = new JButton("No");
		btnNo.setBounds(88, 36, 43, 34);
		panel_7.add(btnNo);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminar_1.setEnabled(true);
				panel_7.setVisible(false);
				btnMostrareliminar.setEnabled(true);
				cbEliminar.setEnabled(true);
				dcEliminar.setEnabled(true);
				btnEstablecerEvento.setEnabled(true);
			}
		});
		btnMostrareliminar.addActionListener(oyente);
		
		
		dcEstablecerEventos = new JDateChooser();
		dcEstablecerEventos.setBounds(91, 75, 159, 26);
		panel_4.add(dcEstablecerEventos);
		
		JLabel lblEstablecerRecordatorio = new JLabel("Establecer Evento");
		lblEstablecerRecordatorio.setBackground(Color.WHITE);
		lblEstablecerRecordatorio.setBounds(38, 17, 212, 34);
		panel_4.add(lblEstablecerRecordatorio);
		lblEstablecerRecordatorio.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(38, 75, 61, 16);
		panel_4.add(lblFecha);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(38, 161, 96, 16);
		panel_4.add(lblDescripcion);
		
		btnAgregarEvento = new JButton("Agregar");
		btnAgregarEvento.setBounds(303, 341, 117, 29);
		panel_4.add(btnAgregarEvento);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(38, 189, 375, 140);
		panel_4.add(scrollPane_3);
		
		txtDescripcion = new JTextArea();
		scrollPane_3.setViewportView(txtDescripcion);
		txtDescripcion.setFont(new Font("Arial", Font.PLAIN, 15));
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);
		txtDescripcion.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(38, 133, 61, 16);
		panel_4.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(98, 128, 212, 26);
		panel_4.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		btnEliminarEvento = new JButton("Eliminar Evento");
		btnEliminarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(false);
				panel_6.setVisible(true);
				
			}
		});
		btnEliminarEvento.setBounds(262, 6, 141, 29);
		panel_4.add(btnEliminarEvento);
		btnAgregarEvento.addActionListener(oyente);
		
		
		
		topbar = new JPanel();
		topbar.setBounds(245, 0, 1120, 55);
		frame.getContentPane().add(topbar);
		topbar.setBackground(new Color(251, 251, 251));
//		topbar.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(249, 249, 249)));
		topbar.setLayout(null);
		
		topbarBrandIcon = new JLabel("",topbarBrandIcono, JLabel.CENTER );
		topbarBrandIcon.setBounds(79, 12, 60, 33);
		topbar.add(topbarBrandIcon);
		
		textField = new JTextField();
		textField.setBounds(360, 12, 370, 30);
		textField.setBackground(new Color(251, 251, 251));
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		topbar.add(textField);
		textField.setColumns(10);
		TextPrompt oculto = new TextPrompt("Buscar contenido", textField);
		
		if(isDarkMode == true) {
			topbarBuscarIcon = new JLabel("", topbarBuscarWIcono, JLabel.CENTER);
		}else {
			topbarBuscarIcon = new JLabel("", topbarBuscarIcono, JLabel.CENTER);
		}
		
		topbarBuscarIcon.setBounds(731, 12, 35, 27);
		topbarBuscarIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarBuscarIcon);
		
		if(isDarkMode == true) {
			topbarSettingsIcon = new JLabel("", topbarSettingsWIcono, JLabel.CENTER);
		}else {
			topbarSettingsIcon = new JLabel("", topbarSettingsIcono, JLabel.CENTER);
		}
		topbarSettingsIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				settings = new Settings();
				settings.setVisible(true);
				
			}
		});
		topbarSettingsIcon.setBounds(950, 15, 46, 25);
		topbarSettingsIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarSettingsIcon);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(360, 42, 370, 1);
		topbar.add(separator_3);
		
		if(isDarkMode == true) {
			topbarNotificationIcon = new JLabel("", topbarNotificationWIcono, JLabel.CENTER);
		} else {
			topbarNotificationIcon = new JLabel("", topbarNotificationIcono, JLabel.CENTER);
		}
		topbarNotificationIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SystemTray.isSupported()) {
		            try {
						displayTray();
					} catch (AWTException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        } else {
		            System.err.println("System tray not supported!");
		        }
			}
		});
		topbarNotificationIcon.setBounds(895, 15, 46, 25);
		topbarNotificationIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarNotificationIcon);
		
		// Listeners
		
		btnPresHogar.addActionListener(new MiListener());
		btnPresAuto.addActionListener(new MiListener());
		btnPresAlimentos.addActionListener(new MiListener());
		btnPresEntretenimiento.addActionListener(new MiListener());
		btnPresSalud.addActionListener(new MiListener());
		btnPresEducacion.addActionListener(new MiListener());
		btnPresFinanzas.addActionListener(new MiListener());
		btnPresRopa.addActionListener(new MiListener());
		btnPresRegalos.addActionListener(new MiListener());
		btnPresViajes.addActionListener(new MiListener());
		
		btnHogarGuardar.addActionListener(new MiListener());
		btnAutoGuardar.addActionListener(new MiListener());
		btnAlimentosGuardar.addActionListener(new MiListener());
		btnEntretenimientoGuardar.addActionListener(new MiListener());
		btnSaludGuardar.addActionListener(new MiListener());
		btnEducacionGuardar.addActionListener(new MiListener());
		btnFinanzasGuardar.addActionListener(new MiListener());
		btnRopaGuardar.addActionListener(new MiListener());
		btnRegalosGuardar.addActionListener(new MiListener());
		btnViajesGuardar.addActionListener(new MiListener());
		
		// 
		
		if(isDarkMode == true) {
			frame.setBackground(new Color(31, 31, 37 ));
			sidebar.setBackground(new Color(36, 38, 46));
			lblUsername.setForeground(new Color(252, 251, 254));
			pSidebarDashboard.setBackground(new Color(36, 38, 46));
			pSidebarIngresos.setBackground(new Color(36, 38, 46));
			pSidebarGastos.setBackground(new Color(36, 38, 46));
			pSidebarPerfil.setBackground(new Color(36, 38, 46));
			pSidebarCalendario.setBackground(new Color(36, 38, 46));
			pSidebarPresupuestos.setBackground(new Color(36, 38, 46));
			pSidebarSalir.setBackground(new Color(36, 38, 46));
		
			
			topbar.setBackground(new Color(36, 38, 46));
			textField.setBackground(new Color(36, 38, 46));
			
			resumen.setBackground(new Color(31, 31, 37));
			ingresos.setBackground(new Color(31, 31, 37));
			ingresarIngresos.setBackground(new Color(31, 31, 37));
			gastos.setBackground(new Color(31, 31, 37));
			ingresarGastos.setBackground(new Color(31, 31, 37));
			presupuestoMain.setBackground(new Color(31, 31, 37));
			selecPresCateg.setBackground(new Color(31, 31, 37));
			presHogar.setBackground(new Color(31, 31, 37));
			presAuto.setBackground(new Color(31, 31, 37));
			presAlimentos.setBackground(new Color(31, 31, 37));
			presEntretenimiento.setBackground(new Color(31, 31, 37));
			presSalud.setBackground(new Color(31, 31, 37));
			presEducacion.setBackground(new Color(31, 31, 37));
			presFinanzas.setBackground(new Color(31, 31, 37));
			presRopa.setBackground(new Color(31, 31, 37));
			presRegalos.setBackground(new Color(31, 31, 37));
			presViajes.setBackground(new Color(31, 31, 37));
			
			calendario.setBackground(new Color(31, 31, 37));
			pPerfilMain.setBackground(new Color(31, 31, 37));
			
			mostrarIngresos();
			mostrarGastos();
			
			System.out.println(lblQ2.getText());
			
			if(lblQ2.getText().equals("0.0") && lblQ.getText().equals("0.0")) {
				onboarding.setVisible(true);
			}
			
		}
		
	}
	


	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void mostrarGastos() {
		
		String[][] r = DB.getCuenta(usuarioLeer.get(0), "gastos");
		
		listGastos.setModel(new AbstractListModel() {
			
			String[] values = r[0];
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		lblQ2.setText(r[1][0].toString());
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused", "serial" })
	private void mostrarIngresos(){
		
		String[][] r = DB.getCuenta(usuarioLeer.get(0), "ingresos");
		
		listMuestraIngresos.setModel(new AbstractListModel() {
			
			String[] values = r[0];
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		lblQ.setText(r[1][0].toString());
		presTotalIngresos.setText(r[1][0].toString());
		
	}
	
	public void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("src/google.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Finanzas UVG");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("Finanzas UVG");
        tray.add(trayIcon);

        trayIcon.displayMessage("Finanzas UVG", "Nueva actualizacion disponible", MessageType.INFO);
    }
	
	
	private class MiListener implements ActionListener{

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public void actionPerformed(ActionEvent e) {
			
			lblPerfilError.setText("");
			
			
			if(e.getSource() == btnPresHogar) {
				presHogar.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			
			if(e.getSource() == btnPresAuto) {
				presAuto.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresAlimentos) {
				presAlimentos.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresEntretenimiento) {
				presEntretenimiento.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			
			if(e.getSource() == btnPresSalud) {
				presSalud.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresEducacion) {
				presEducacion.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresFinanzas) {
				presFinanzas.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresRopa) {
				presRopa.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresRegalos) {
				presRegalos.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresViajes) {
				presViajes.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			
			// GUARDAR HOGAR
			if(e.getSource() == btnHogarGuardar) {
				System.out.println("fn");
				fieldTotalHogar = Double.parseDouble(fieldHogarTotal.getText());				
				presHogar.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// GUARDAR AUTO Y TRANSPORTE
			if(e.getSource() == btnAutoGuardar) {
				fieldTotalAuto = Double.parseDouble(fieldAutoTotal.getText());
				presAuto.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// ALIMENTOS
			if(e.getSource() == btnAlimentosGuardar) {
				fieldTotalAlimentos = Double.parseDouble(fieldAlimentosTotal.getText());
				presAlimentos.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// ENTRETENIMIENTO
			if(e.getSource() == btnEntretenimientoGuardar) {
				fieldTotalEntretenimiento = Double.parseDouble(fieldEntretenimientoTotal.getText());
				presEntretenimiento.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// SALUD Y BELLEZA
			if(e.getSource() == btnSaludGuardar) {
				fieldTotalSalud = Double.parseDouble(fieldSaludTotal.getText());
								
				presSalud.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
				
			}
			// EDUCACION
			if(e.getSource() == btnEducacionGuardar) {
				fieldTotalEducacion = Double.parseDouble(fieldEducacionTotal.getText());
				presEducacion.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// FINANZAS E IMPUESTOS
			if(e.getSource() == btnFinanzasGuardar) {
				fieldTotalFinanzas = Double.parseDouble(fieldFinanzasTotal.getText());		
				presFinanzas.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// ROPA y CALZADO
			if(e.getSource() == btnRopaGuardar) {
				fieldTotalRopa = Double.parseDouble(fieldRopaTotal.getText());
				presRopa.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// REGALOS
			if(e.getSource() == btnRegalosGuardar) {
				fieldTotalRegalos = Double.parseDouble(fieldRegalos2.getText());
				presRegalos.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// VIAJES
			if(e.getSource() == btnViajesGuardar) {
				fieldTotalViajes = Double.parseDouble(fieldViajes2.getText());	
				presViajes.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			
			
			presupuestoTotal = pres.totalPresupuesto(fieldTotalHogar, fieldTotalAuto, fieldTotalAlimentos, fieldTotalEntretenimiento, fieldTotalSalud, fieldTotalEducacion,
					fieldTotalFinanzas, fieldTotalRopa, fieldTotalRegalos, fieldTotalViajes);
			
			try{
				progressBar.setValue((int) pres.porcentajePresupuesto(presupuestoTotal,  Double.parseDouble(presTotalIngresos.getText())));
			}catch(Exception ew) {}

			
			lblPresupuestoTotal.setText(Double.toString(presupuestoTotal));
			
			// TODO
			
			if (e.getSource() == btnGuardar){
				
				try{
				DB.modificarCuenta(usuarioLeer.get(0), "ingresos", cbCategoriaIngresos.getSelectedItem().toString(), Double.parseDouble(txtMontoingresos.getText()));
				ingresarIngresos.setVisible(false);
				ingresos.setVisible(true);
				txtMontoingresos.setText(null);
				txtAgregarCategoriaIngresos.setText(null);
				}catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Ha ingresado una cantidad no numerica");
					txtMontoingresos.setText(null);
					
				}
				try {
					mostrarIngresos();
				}catch (Exception ex){}
				
				
			}
			
			
			if (e.getSource() == btnAgregarNombreIngreso){
				
				try{
					String nombre = txtAgregarCategoriaIngresos.getText();
					DB.modificarCuenta(usuarioLeer.get(0), "ingresos", nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase(), 0);
					
					ingresarIngresos.setVisible(false);
					ingresos.setVisible(true);
					txtMontoingresos.setText(null);
					txtAgregarCategoriaIngresos.setText(null);
					
					}catch (Exception error) {
						txtAgregarCategoriaIngresos.setText(null);
					}
				
				try {
					mostrarIngresos();
				}catch (Exception ex){}
				
				
			}
			
			
			if (e.getSource() == btnEliminar){
				
				DB.eliminarCuenta(usuarioLeer.get(0), "ingresos", cbEliminarIngreso.getSelectedItem().toString());
				
				
				ingresarIngresos.setVisible(false);
				ingresos.setVisible(true);
				txtMontoingresos.setText(null);
				txtAgregarCategoriaIngresos.setText(null);
				
				try {
					mostrarIngresos();
				}catch (Exception ex){}
			}
			
			
			
			if (e.getSource() == btnRegresar2){
				
				gastos.setVisible(true);
				ingresarGastos.setVisible(false);
				
				txtMontoGasto.setText(null);
				txtNombreGasto.setText(null);	
			}
			
			
			if (e.getSource() == btnGuardar2){
				
			try{
				DB.modificarCuenta(usuarioLeer.get(0), "gastos", cbCategoriaGastos.getSelectedItem().toString(), Double.parseDouble(txtMontoGasto.getText()));
				ingresarGastos.setVisible(false);
				gastos.setVisible(true);
				txtMontoGasto.setText(null);
				txtNombreGasto.setText(null);
				}catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Ha ingresado una cantidad no numerica");
					txtMontoGasto.setText(null);
					
				}
				try {
					mostrarGastos();
				}catch (Exception ex){}
				
			}
			
			if (e.getSource() == btnEliminarCategoriaGastos){
				
				DB.eliminarCuenta(usuarioLeer.get(0), "gastos", cbEliminarGasto.getSelectedItem().toString());
				ingresarGastos.setVisible(false);
				gastos.setVisible(true);
				txtMontoGasto.setText(null);
				txtNombreGasto.setText(null);
				
				try {
					mostrarGastos();
				}catch (Exception ex){}
			}

			
			if (e.getSource() == btnAgregarCategoriaGastos){
				
				try{
					String nombre = txtNombreGasto.getText();
					DB.modificarCuenta(usuarioLeer.get(0), "gastos", nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase(), 0);
					
					ingresarGastos.setVisible(false);
					gastos.setVisible(true);
					txtMontoGasto.setText(null);
					txtNombreGasto.setText(null);
					
					}catch (Exception error) {
						txtNombreGasto.setText(null);
					}
				
				try {
					mostrarGastos();
				}catch (Exception ex){}
				
				
			}
			
			// Guarda la informacion que se modifico por el usuario en su perfil
			if(e.getSource() == btnGuardarCambios) {
				
				boolean ret = false;
				try {
				ret = DB.cambiarPerfil(fPerfilCorreo.getText(), fPerfilNombre.getText(), fPerfilApellido.getText());
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "error");
				}
				
				if (ret == true) {
					JOptionPane.showMessageDialog(null, "Los cambios se guardaron exitosamente");
					nombres = DB.getNombre(usuarioLeer.get(0));
					tempNombre =nombres[0];
					tempApellido = nombres[1];
					tempCorreo = usuarioLeer.get(0);
					lblUsername.setText(tempNombre + " " + tempApellido);
				}
				else if (ret == false) {
					JOptionPane.showMessageDialog(null, "No se logro guardar los cambios");
				}
				
				
				
				
				
				
				
				
				// verificamos si alguno de los campos siguen siendo iguales, si son iguales entonces solo actualizamos los que son diferentes
				// o los datos seguiran siendo los mismo
				
			}
			
			// Metodo para cambiar la contrasena del usuarario ya estando dentro de la aplicacion. 
			if(e.getSource() == perfilCambiarContrasena) {
				pPerfilMain.setVisible(false);
				pCambiarContrasena.setVisible(true);
				
			}
			
			// Metodo para guardar la nueva contrasena
			if(e.getSource() == btnGuardarContrasena) {
				//AQUI VAMOS HACER TODOS LOS INTENTOS DE VEIRIFCAR SI LA CONTRASENA ES VALIDA PARA CAMBIAR
				
				if (fNuevaContrasena.getText().isEmpty() == false &&  fConfirmarContrasena.getText().isEmpty() == false) {
					
					if (fNuevaContrasena.getText().equals(fConfirmarContrasena.getText())  ) {
						
						
						if (fConfirmarContrasena.getText().length() >=8) {
							boolean resp = DB.cambiarContrasena(usuarioLeer.get(0), fConfirmarContrasena.getText());
							if (resp == true) {
								JOptionPane.showMessageDialog(null, "La constrasena se ha cambiado correctamente");
							}
							else if (resp == false) {
								JOptionPane.showMessageDialog(null, "No se logro cambiar la contrasena");
							}
							perfilCambiarContrasena.setVisible(true);
							fNuevaContrasena.setText(null);
							fConfirmarContrasena.setText(null);
							pCambiarContrasena.setVisible(false);
						}else {
							JOptionPane.showMessageDialog(null, "La contrasena debe contener 8 o mas caracteres");
							fNuevaContrasena.setText(null);
							fConfirmarContrasena.setText(null);
						}
						
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Las casillas no son iguales");
						fNuevaContrasena.setText(null);
						fConfirmarContrasena.setText(null);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}
				
				
					
					
				
			}
			
			// Metdo para cancelar el proceso de cambiar contrasena
			if(e.getSource() == btnCancelarCambio) {
				pCambiarContrasena.setVisible(false);
				pPerfilMain.setVisible(true);
				fNuevaContrasena.setText(null);
				fConfirmarContrasena.setText(null);
			}
			
			if(e.getSource() == btnAgregarEvento) {
				Date d = dcEstablecerEventos.getDate();
				
				if (d != null && txtDescripcion.getText().isEmpty() == false && txtTitulo.getText().isEmpty() == false) {
					if (txtTitulo.getText().length() <= 15) {
						String[] date = d.toString().split(" ");
						String fecha = date[1] +"/"+ date[2] +"/"+ date[5];
					
						try {
							DB.agregarEvento(tempCorreo, fecha, txtTitulo.getText(), txtDescripcion.getText());
							JOptionPane.showMessageDialog(null, "Evento se agrego exitosamente");
							txtDescripcion.setText(null);
							txtTitulo.setText(null);
							dcEstablecerEventos.setDate(null);
					}
					catch(Exception ex){}
						
				}else {
					JOptionPane.showMessageDialog(null, "Titulo tiene que ser manor a 15 caracteres");
					txtTitulo.setText(null);
				}
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Te falta llenar campos");
				}
			}
			
			if(e.getSource() == btnMostrar) {
				txtADescripcionMostrar.setText(null);
				try {
				Date a = dcMostrarEventos.getDate();
				
				if (a != null) {
					
				String[] datee = a.toString().split(" ");
				String fecha = datee[1] +"/"+ datee[2] +"/"+ datee[5];
				ArrayList<String> eventos = DB.getEventos(tempCorreo, fecha);
				
				ArrayList<String> titulos = new ArrayList<String>();
				int contador = 1;
				for (String elemento : eventos) {
					String[] split = elemento.split(" @@ ");
					titulos.add(contador + ". " + split[0]+ " - " +  split[1]);
					contador++;
					
				}
				
				
				listMostrarEventos.setModel(new AbstractListModel() {
					
					public int getSize() {
						return titulos.size();
					}
					public Object getElementAt(int index) {
						return titulos.get(index);
					}
				
				});
				}
				}catch(Exception es) {}	
			}
			
			
			
			
			if(e.getSource() == btnMostrareliminar) {
				txtADescripcionMostrar.setText(null);
				try {
				Date a = dcEliminar.getDate();
				
				if (a != null) {
					
				String[] datee = a.toString().split(" ");
				String fecha = datee[1] +"/"+ datee[2] +"/"+ datee[5];
				ArrayList<String> eventos = DB.getEventos(tempCorreo, fecha);
				
				ArrayList<String> titulos = new ArrayList<String>();
				int contador = 1;
				for (String elemento : eventos) {
					String[] split = elemento.split(" @@ ");
					titulos.add(contador + ". " + split[0]+ " - " +  split[1]);
					contador++;
					
				}
				String[] tituloss = new String[titulos.size()];
				for(int i = 0;i<= titulos.size() - 1; i++) {
					tituloss[i] = titulos.get(i);
				}
				
				cbEliminar.setModel(new DefaultComboBoxModel(tituloss));
				
				}
				}catch(Exception es) {}	
			}
			
			
			if(e.getSource() == btnDarkMode) {
				
				int resp=JOptionPane.showConfirmDialog(null,"Para aplicar cambios es necesario reiniciar, ¿Estas seguro?");
				if (resp == 0) {
					DB.changeMode(tempCorreo);
					frame.dispose();
					DarkModeChange.main(null);
					
					
				}
				
			}
			
			
		
		}
		
	}



	public static void applyQualityRenderingHints(Graphics2D g2d) {

	    g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	    g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
	    g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
	    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

	}
}





