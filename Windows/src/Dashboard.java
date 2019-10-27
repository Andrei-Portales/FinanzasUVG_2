import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
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
import javax.swing.JPanel;
import java.awt.Font;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;

import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

import javax.swing.JSeparator;
import java.awt.Dimension;
import com.toedter.calendar.JCalendar;
import javax.swing.border.LineBorder;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Dashboard extends Login{
	
	
	private JFrame frame;
	
	static Dashboard window;
	
	private JLabel lblSidebarHome, lblSidebarHomeIcon, lblSidebarIngresos, lblSidebarIngresosIcon, lblSidebarGastos, lblSidebarGastosIcon, 
	lblSidebarPresupuestos, lblSidebarPrespuestosIcon, lblSidebarSalir;
	private JPanel sidebar;
	private JList listMostrarEventos;
	private JPanel btnSidebarHome, btnSidebarIngresos, btnSidebarGastos, btnSidebarPresupuestos, btnSidebarSalir;
	private JLabel lblSidebarSalirIcon;
	private JPanel pSidebarDashboard, pSidebarIngresos, pSidebarGastos, pSidebarPresupuestos, pSidebarSalir;
	private JLabel lblUserImage, lblUsername;
	private JPanel main;
	private JPanel resumen;
	private JPanel ingresos;
	private JPanel gastos,panelGraficaIngresos;
	private JPanel presupuestos;
	private JButton btnGuardar,btnAgregarNombreIngreso;
	private JPanel ingresarIngresos;
	private JLabel btnAgregarIngreso;
	private MiListener oyente;
	private JButton btnRegresar;
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
	
	ImageIcon imgPerfil;
	Image imgPer;

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

	private JLabel lblEliminarPresupuesto;
	private JLabel lblPresupuesto;

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
	private JButton btnNo;
	private JPanel panel_7;
	private JPanel pPerfilMain;


	


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
		usuarioLeer = DB.leerUsu();
		
		oyente = new MiListener();
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setSize(1354, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon(Dashboard.class.getResource("resources/google.png")).getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		
		// VARIABLES
		nombres = DB.getNombre(usuarioLeer.get(0));
		tempNombre =nombres[0];
		tempApellido = nombres[1];
		tempCorreo = usuarioLeer.get(0);
		
		
		
		sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 745);
		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		btnSidebarPerfil = new JPanel();
		btnSidebarPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
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
		        
//				pSidebarDashboard.setBackground(new Color(0, 153, 204));
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
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(true);
				calendario.setVisible(false);
				perfil.setVisible(false);
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
				frame.dispose();
				Login.main(null);
				DB.tempUsu(usuarioLeer.get(0), false);
				
				
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
//		lblSidebarHome.setForeground(new Color(0, 153, 204));
		lblSidebarHome.setForeground(new Color(0, 0, 0));
		lblSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarHome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHome.setBounds(60, 205, 185, 36);
		sidebar.add(lblSidebarHome);
		
		Icon user = new ImageIcon(Dashboard.class.getResource("resources/home.png"));
		
		lblSidebarHomeIcon = new JLabel("", user, JLabel.CENTER);
		lblSidebarHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHomeIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHomeIcon.setBounds(30, 205, 25, 36);
		sidebar.add(lblSidebarHomeIcon);
		
		pSidebarDashboard = new JPanel();
//		pSidebarDashboard.setBackground(new Color(0, 153, 204));
		pSidebarDashboard.setBackground(new Color(0, 0, 0));
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
		
		lblSidebarIngresosIcon = new JLabel("", ingresosIcon, JLabel.CENTER);
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
		
		lblSidebarGastosIcon = new JLabel("", gastosIcon, JLabel.CENTER);
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
		
		lblSidebarPrespuestosIcon = new JLabel("", presupuestosIcon, JLabel.CENTER);
		lblSidebarPrespuestosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPrespuestosIcon.setBounds(30, 348, 25, 36);
		sidebar.add(lblSidebarPrespuestosIcon);
		
		lblSidebarSalir = new JLabel("Salir");
		lblSidebarSalir.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalir.setForeground(new Color(119,119,119));
		lblSidebarSalir.setBounds(60, 501, 185, 36);
		sidebar.add(lblSidebarSalir);
		
		Icon salirIcon = new ImageIcon(Dashboard.class.getResource("resources/exit.png"));
		
		lblSidebarSalirIcon = new JLabel("", salirIcon, JLabel.CENTER);
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
		
		lblSidebarPerfilIcon = new JLabel("",perfilIcon, JLabel.CENTER);
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
		
		lblSidebarCalendarioIcon = new JLabel("", calendarioIcon, JLabel.CENTER);
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
		
		Icon topbarBrandIcono = new ImageIcon(Dashboard.class.getResource("resources/google.png"));
		
		Icon topbarBuscarIcono = new ImageIcon(Dashboard.class.getResource("resources/search.png"));
		
		Icon topbarSettingsIcono = new ImageIcon(Dashboard.class.getResource("resources/settings.png"));
		
		Icon topbarNotificationIcono = new ImageIcon(Dashboard.class.getResource("resources/notification.png"));
		
		Icon ingresosBackIcon = new ImageIcon(Dashboard.class.getResource("resources/back.png"));
		
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
		
		lblQ = new JLabel("Q ");
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
		
		lblQ2 = new JLabel("Q ");
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
		presupuestos.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEliminarPresupuesto.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEliminarPresupuesto.setVisible(false);
			}
		});
		panel_3.setBounds(83, 182, 350, 30);
		presupuestos.add(panel_3);
		panel_3.setLayout(null);
		
		lblEliminarPresupuesto = new JLabel("x");
		lblEliminarPresupuesto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEliminarPresupuesto.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEliminarPresupuesto.setVisible(false);
			}
		});
		lblEliminarPresupuesto.setToolTipText("Eliminar presupuesto");
		lblEliminarPresupuesto.setForeground(Color.RED);
		lblEliminarPresupuesto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEliminarPresupuesto.setVisible(false);
		lblEliminarPresupuesto.setFont(new Font("Arial", Font.BOLD, 15));
		lblEliminarPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarPresupuesto.setBounds(320, 0, 30, 15);
		panel_3.add(lblEliminarPresupuesto);
		
		lblPresupuesto = new JLabel("Presupuestos");
		lblPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresupuesto.setFont(new Font("Arial", Font.PLAIN, 22));
		lblPresupuesto.setBounds(0, 35, 1120, 30);
		presupuestos.add(lblPresupuesto);
		
		perfil = new JPanel();
		perfil.setBackground(Color.WHITE);
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
		
		topbarBuscarIcon = new JLabel("", topbarBuscarIcono, JLabel.CENTER);
		topbarBuscarIcon.setBounds(731, 12, 35, 27);
		topbarBuscarIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarBuscarIcon);
		
		topbarSettingsIcon = new JLabel("", topbarSettingsIcono, JLabel.CENTER);
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
		TextPrompt oculto3 = new TextPrompt("Buscar contenido", textField);
		
		topbarNotificationIcon = new JLabel("", topbarNotificationIcono, JLabel.CENTER);
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
		
		lblQ2.setText("Q " + r[1][0].toString());
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
		
		lblQ.setText("Q " + r[1][0].toString());
		
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





