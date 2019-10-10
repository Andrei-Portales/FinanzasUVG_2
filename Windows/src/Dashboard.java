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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.border.CompoundBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JToggleButton;

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
import java.awt.LayoutManager;
import javax.swing.JSeparator;

public class Dashboard extends Login{
	
	
	private JFrame frame;
	
	static Dashboard window;
	
	private JLabel lblSidebarHome, lblSidebarHomeIcon, lblSidebarIngresos, lblSidebarIngresosIcon, lblSidebarGastos, lblSidebarGastosIcon, 
	lblSidebarPresupuestos, lblSidebarPrespuestosIcon, lblSidebarSalir;
	private JPanel sidebar;
		
	private JPanel btnSidebarHome, btnSidebarIngresos, btnSidebarGastos, btnSidebarPresupuestos, btnSidebarSalir;
	private JLabel lblSidebarSalirIcon;
	private JPanel pSidebarDashboard, pSidebarIngresos, pSidebarGastos, pSidebarPresupuestos, pSidebarSalir;
	private JLabel lblUserImage, lblUsername;
	private BufferedImage userImage = null, perfilImagen = null;
	private JPanel main;
	private JPanel resumen;
	private JPanel ingresos;
	private JPanel gastos,panelGraficaIngresos;
	private JPanel presupuestos;
	private JLabel lblPresupuestos;
	private JButton btnGuardar,btnAgregarNombreIngreso;
	private JPanel ingresarIngresos;
	private JButton btnAgregarIngreso;
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
	private JButton btnAgregarGastos;
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

	private JLabel lblSidebarPerfil;
	private JPanel perfil;

	private JPanel btnSidebarPerfil;

	private Container lblSidebarPerfilIcon;
	private JLabel lblPerfilPicture;
	private JTextField fPerfilUsuario;
	private JTextField fPerilCorreo;

	private JButton perfilCambiarContrasena;

	private JButton btnGuardarCambios;
	private JSeparator separator_2;
	private JTextField textField;

	private JLabel topbarBrandIcon;

	private JPanel topbar;

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

	private JTextField fPerilApellido;
	private JLabel lblApellido;
	private JLabel lblCorre;
	


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
		
		
		oyente = new MiListener();
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setSize(1268, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon("src/google.png").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 831);
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
				pSidebarGastos.setBackground(new Color(251,251,251));
				
				
				lblSidebarPerfil.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(119,119,119));
				lblSidebarHome.setForeground(new Color(119,119,119));
				lblSidebarIngresos.setForeground(new Color(119,119,119));
				lblSidebarGastos.setForeground(new Color(119,119,119));
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				perfil.setVisible(true);
			}
		});
		btnSidebarPerfil.setOpaque(false);
		btnSidebarPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarPerfil.setBorder(new CompoundBorder());
		btnSidebarPerfil.setBackground(Color.CYAN);
		btnSidebarPerfil.setBounds(0, 399, 245, 36);
		sidebar.add(btnSidebarPerfil);
		
		
		
		lblUsername = new JLabel(DB.getNombre(DB.leerUsu()));
		lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsername.setToolTipText("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(0, 122, 245, 30);
		sidebar.add(lblUsername);
		
		
		
		btnSidebarHome = new JPanel();
		btnSidebarHome.setBounds(0, 195, 245, 36);
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
				pSidebarPerfil.setBackground(new Color(251,251,251));
				
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarGastos.setForeground(new Color(119,119,119));
				lblSidebarIngresos.setForeground(new Color(119,119,119));
				lblSidebarPresupuestos.setForeground(new Color(119,119,119));
				lblSidebarPerfil.setForeground(new Color(119,119,119));
				
				resumen.setVisible(true);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				perfil.setVisible(true);
				
				panelGraficaIngresos.removeAll();
				panelGraficaGastos.removeAll();
				
				graph1 = DB.getgrafica(DB.leerUsu(), "ingresos");
				graph2 = DB.getgrafica(DB.leerUsu(), "gastos");
				
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
				pSidebarPerfil.setBackground(new Color(251,251,251));
				
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarHome.setForeground(new Color(119,119,119));
				lblSidebarGastos.setForeground(new Color(119,119,119));
				lblSidebarPresupuestos.setForeground(new Color(119,119,119));
				lblSidebarPerfil.setForeground(new Color(119,119,119));
				
				resumen.setVisible(false);
				ingresos.setVisible(true);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
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
				pSidebarPerfil.setBackground(new Color(251,251,251));
			
				
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				lblSidebarHome.setForeground(new Color(119,119,119));
				lblSidebarIngresos.setForeground(new Color(119,119,119));
				lblSidebarPresupuestos.setForeground(new Color(119,119,119));
				lblSidebarPerfil.setForeground(new Color(119,119,119));
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(true);
				presupuestos.setVisible(false);
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
				pSidebarPerfil.setBackground(new Color(251,251,251));
				
				
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
				lblSidebarHome.setForeground(new Color(119,119,119));
				lblSidebarIngresos.setForeground(new Color(119,119,119));
				lblSidebarGastos.setForeground(new Color(119,119,119));
				lblSidebarPerfil.setForeground(new Color(119,119,119));
				
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(true);
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
				
			}
		});
		btnSidebarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarSalir.setOpaque(false);
		btnSidebarSalir.setBorder(new CompoundBorder());
		btnSidebarSalir.setBackground(Color.CYAN);
		btnSidebarSalir.setBounds(0, 450, 245, 36);
		sidebar.add(btnSidebarSalir);
		
		try {
			userImage = ImageIO.read(new File("src/user.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image userImg = userImage.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		
		lblUserImage = new JLabel(new ImageIcon(userImg) );
		lblUserImage.setBounds(30, 28, 185, 80);
		sidebar.add(lblUserImage);
		lblUserImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage img = DB.setImagen(DB.leerUsu());
		 
		 if (img != null) {
			 
			 try {
			 
			 ImageIcon imgIcon = new ImageIcon(img);
		        Image imgEscalada = imgIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
		        Icon iconoEscalado = new ImageIcon(imgEscalada);
		        lblUserImage.setIcon(iconoEscalado);
			 }catch(Exception e) {}
			 
		 }
		
		
		
		
		lblSidebarHome = new JLabel("Dashboard");
//		lblSidebarHome.setForeground(new Color(0, 153, 204));
		lblSidebarHome.setForeground(new Color(0, 0, 0));
		lblSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarHome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHome.setBounds(60, 195, 185, 36);
		sidebar.add(lblSidebarHome);
		
		Icon user = new ImageIcon("src/home.png");
		
		lblSidebarHomeIcon = new JLabel("", user, JLabel.CENTER);
		lblSidebarHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHomeIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHomeIcon.setBounds(30, 195, 25, 36);
		sidebar.add(lblSidebarHomeIcon);
		
		pSidebarDashboard = new JPanel();
//		pSidebarDashboard.setBackground(new Color(0, 153, 204));
		pSidebarDashboard.setBackground(new Color(0, 0, 0));
		pSidebarDashboard.setBounds(0, 195, 4, 36);
		sidebar.add(pSidebarDashboard);
		
		lblSidebarIngresos = new JLabel("Ingresos");
		lblSidebarIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarIngresos.setForeground(new Color(119,119,119));
		lblSidebarIngresos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresos.setBounds(60, 251, 185, 36);
		sidebar.add(lblSidebarIngresos);
		
		// 17px
		Icon ingresosIcon = new ImageIcon("src/ingresos.png");
		
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
		
		Icon gastosIcon = new ImageIcon("src/gastos.png");
		
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
		
		Icon presupuestosIcon = new ImageIcon("src/presupuestos.png");
		
		lblSidebarPrespuestosIcon = new JLabel("", presupuestosIcon, JLabel.CENTER);
		lblSidebarPrespuestosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPrespuestosIcon.setBounds(30, 348, 25, 36);
		sidebar.add(lblSidebarPrespuestosIcon);
		
		lblSidebarSalir = new JLabel("Salir");
		lblSidebarSalir.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalir.setForeground(new Color(119,119,119));
		lblSidebarSalir.setBounds(60, 450, 185, 36);
		sidebar.add(lblSidebarSalir);
		
		Icon salirIcon = new ImageIcon("src/exit.png");
		
		lblSidebarSalirIcon = new JLabel("", salirIcon, JLabel.CENTER);
		lblSidebarSalirIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalirIcon.setBounds(30, 450, 25, 36);
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
		pSidebarSalir.setBounds(0, 450, 4, 36);
		sidebar.add(pSidebarSalir);
		
		pSidebarPerfil = new JPanel();
		pSidebarPerfil.setBackground(new Color(251, 251, 251));
		pSidebarPerfil.setBounds(0, 399, 4, 36);
		sidebar.add(pSidebarPerfil);
		
		
		Icon perfilIcon = new ImageIcon("src/perfil.png");
		
		lblSidebarPerfilIcon = new JLabel("",perfilIcon, JLabel.CENTER);
		lblSidebarPerfilIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPerfilIcon.setBounds(30, 399, 25, 36);
		sidebar.add(lblSidebarPerfilIcon);
		
		lblSidebarPerfil = new JLabel("Perfil");
		lblSidebarPerfil.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPerfil.setForeground(new Color(119,119,119));
		lblSidebarPerfil.setBounds(60, 399, 185, 36);
		sidebar.add(lblSidebarPerfil);
		
		
		main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(245, 0, 1120, 672);
		frame.getContentPane().add(main);
		main.setLayout(new CardLayout(0, 0));
		
		resumen = new JPanel();
		resumen.setBackground(Color.WHITE);
		main.add(resumen, "name_336802300135327");
		resumen.setBounds(245, 0, 1121, 746);
		resumen.setLayout(null);
		
		graph1 = DB.getgrafica(DB.leerUsu(), "ingresos");
		panelGraficaIngresos = new JPanel(new BorderLayout());
		panelGraficaIngresos.setBounds(40, 118, 450, 230);

		resumen.add(panelGraficaIngresos);
        panelGraficaIngresos.add(graph1);
        
		
		graph2 = DB.getgrafica(DB.leerUsu(), "gastos");
		panelGraficaGastos = new JPanel(new BorderLayout());
		panelGraficaGastos.setBounds(550, 118, 450, 230);

		resumen.add(panelGraficaGastos);
		panelGraficaGastos.add(graph2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(520, 117, 12, 209);

		resumen.add(separator);
		
		topbar = new JPanel();
		topbar.setBounds(0, 0, 1120, 55);
		topbar.setBackground(new Color(251, 251, 251));
		resumen.add(topbar);
		topbar.setLayout(null);
		
		Icon topbarBrandIcono = new ImageIcon("src/google.png");
		
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
		
		Icon topbarBuscarIcono = new ImageIcon("src/search.png");
		
		topbarBuscarIcon = new JLabel("", topbarBuscarIcono, JLabel.CENTER);
		topbarBuscarIcon.setBounds(731, 12, 35, 27);
		topbarBuscarIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarBuscarIcon);
		
		Icon topbarSettingsIcono = new ImageIcon("src/settings.png");
		
		topbarSettingsIcon = new JLabel("", topbarSettingsIcono, JLabel.CENTER);
		topbarSettingsIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				settings = new Settings();
				settings.setVisible(true);
			}
		});
		topbarSettingsIcon.setBounds(883, 15, 46, 25);
		topbarSettingsIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topbar.add(topbarSettingsIcon);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(360, 42, 370, 1);
		topbar.add(separator_3);
		
		
		
		
		ingresos = new JPanel();
		ingresos.setBackground(Color.WHITE);
		ingresos.setBounds(245, 0, 1121, 746);
		main.add(ingresos, "name_336916740574626");
		ingresos.setLayout(null);
		
		JLabel lblIngresos = new JLabel("Agregar un nuevo ingreso");
		lblIngresos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIngresos.setBounds(469, 209, 189, 31);
		ingresos.add(lblIngresos);
		
		btnAgregarIngreso = new JButton("+");
		btnAgregarIngreso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarIngreso.setBorder(null);
		btnAgregarIngreso.setForeground(Color.WHITE);
		btnAgregarIngreso.setBackground(new Color(93,143,252));
		btnAgregarIngreso.setFont(new Font("Arial", Font.PLAIN, 30));
		btnAgregarIngreso.setBounds(526, 171, 70, 40);
		ingresos.add(btnAgregarIngreso);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 275, 719, 358);
		ingresos.add(scrollPane);
		
		
		
		
		listMuestraIngresos = new JList();
		listMuestraIngresos.setBorder(null);
		
	
		scrollPane.setViewportView(listMuestraIngresos);
		listMuestraIngresos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel label = new JLabel("INGRESOS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 28));
		label.setBounds(10, 35, 1100, 51);
		ingresos.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Total ingresos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(225, 108, 132, 31);
		ingresos.add(lblNewLabel_1);
		
		lblQ = new JLabel("Q ");
		lblQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ.setBounds(362, 108, 253, 31);
		ingresos.add(lblQ);
		
		
		
	
		btnAgregarIngreso.addActionListener(oyente);
		
		
		ingresarIngresos = new JPanel();
		ingresarIngresos.setBackground(Color.WHITE);
		main.add(ingresarIngresos, "name_773665362949");
		ingresarIngresos.setLayout(null);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegresar.setBorder(null);
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setBackground(new Color(93,143,252));
		btnRegresar.setFont(new Font("Bangla MN", Font.PLAIN, 15));
		btnRegresar.setBounds(10, 11, 130, 34);
		ingresarIngresos.add(btnRegresar);
		
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
		btnRegresar.addActionListener(oyente);
		btnAgregarNombreIngreso.addActionListener(oyente);
		
		gastos = new JPanel();
		gastos.setBackground(Color.WHITE);
		gastos.setBounds(245, 0, 1121, 746);
		main.add(gastos, "name_337042041258590");
		gastos.setLayout(null);
		
		lblGastos = new JLabel("GASTOS");
		lblGastos.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblGastos.setBounds(348, 29, 191, 65);
		gastos.add(lblGastos);
		
		lblTotalGastos = new JLabel("Total Gastos:");
		lblTotalGastos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalGastos.setBounds(215, 106, 121, 31);
		gastos.add(lblTotalGastos);
		
		lblQ2 = new JLabel("Q ");
		lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ2.setBounds(348, 106, 253, 31);
		gastos.add(lblQ2);
		
		btnAgregarGastos = new JButton("+");
		btnAgregarGastos.setFont(new Font("Arial", Font.PLAIN, 30));
		btnAgregarGastos.setBackground(new Color(0, 191, 255));
		btnAgregarGastos.setBounds(367, 164, 107, 65);
		gastos.add(btnAgregarGastos);
		btnAgregarGastos.addActionListener(oyente);
		
		lblAgregarUnNuevo = new JLabel("Agregar un nuevo gasto");
		lblAgregarUnNuevo.setBounds(342, 227, 189, 31);
		gastos.add(lblAgregarUnNuevo);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(97, 288, 715, 354);
		gastos.add(scrollPane_1);
		
		listGastos = new JList();
		scrollPane_1.setViewportView(listGastos);
		listGastos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		listGastos.setBorder(null);
		
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
		
		lblPresupuestos = new JLabel("PRESUPUESTOS");
		lblPresupuestos.setBounds(425, 227, 200, 118);
		presupuestos.add(lblPresupuestos);
		
		perfil = new JPanel();
		perfil.setBackground(Color.WHITE);
		main.add(perfil, "name_656442519169700");
		perfil.setLayout(null);
		
		
		try {
			perfilImagen = ImageIO.read(new File("src/user.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		lblPerfilPicture = new JLabel(new ImageIcon(userImg) );
		lblPerfilPicture.setBounds(464, 117, 276, 168);
		perfil.add(lblPerfilPicture);
		lblPerfilPicture.setHorizontalAlignment(SwingConstants.CENTER);
		
		fPerfilUsuario = new JTextField();
		fPerfilUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerfilUsuario.setText(DB.getNombre(DB.leerUsu()));
		fPerfilUsuario.setBounds(170, 332, 207, 30);
		perfil.add(fPerfilUsuario);
		fPerfilUsuario.setColumns(10);
		
		fPerilApellido = new JTextField();
		fPerilApellido.setText("Apellido");
		fPerilApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerilApellido.setBounds(170, 396, 207, 30);
		perfil.add(fPerilApellido);
		fPerilApellido.setColumns(10);
		
		fPerilCorreo = new JTextField();
		fPerilCorreo.setText("Correo");
		fPerilCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerilCorreo.setBounds(170, 453, 207, 30);
		perfil.add(fPerilCorreo);
		fPerilCorreo.setColumns(10);
		
		
		
		perfilCambiarContrasena = new JButton("Cambiar contrasena");
		perfilCambiarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		perfilCambiarContrasena.setForeground(Color.WHITE);
		perfilCambiarContrasena.setBackground(new Color(93,143,252));
		perfilCambiarContrasena.setBorder(null);
		perfilCambiarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		perfilCambiarContrasena.setBounds(170, 495, 207, 30);
		perfil.add(perfilCambiarContrasena);
		
		btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardarCambios.setForeground(Color.WHITE);
		btnGuardarCambios.setBackground(new Color(93,143,252));
		btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarCambios.setBounds(516, 551, 207, 30);
		perfil.add(btnGuardarCambios);
		
		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.setForeground(Color.WHITE);
		btnCambiarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCambiarFoto.setBounds(544, 296, 120, 30);
		perfil.add(btnCambiarFoto);
		btnCambiarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DB.subirImagen(DB.leerUsu());
				BufferedImage img = DB.setImagen(DB.leerUsu());
				
				try {
				ImageIcon imgIcon = new ImageIcon(img);
		        Image imgEscalada = imgIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		        Icon iconoEscalado = new ImageIcon(imgEscalada);
		        lblUserImage.setIcon(iconoEscalado);
		        lblPerfilPicture.setIcon(iconoEscalado);
				}catch(Exception e) {}
				
			}
		});
		btnCambiarFoto.setBackground(new Color(93,143,252));
		btnCambiarFoto.setBorder(null);
		btnCambiarFoto.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(170, 362, 210, 1);
		perfil.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(170, 483, 210, 1);
		perfil.add(separator_2);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(251, 251, 251));
		panel_2.setBounds(0, 0, 1120, 55);
		perfil.add(panel_2);
		
		label_2 = new JLabel("", topbarBrandIcono, JLabel.CENTER );
		label_2.setBounds(79, 12, 60, 33);
		panel_2.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_1.setBackground(new Color(251, 251, 251));
		textField_1.setBounds(360, 12, 370, 30);
		panel_2.add(textField_1);
		TextPrompt oculto2 = new TextPrompt("Buscar contenido", textField_1);
		
		label_3 = new JLabel("", topbarBuscarIcono, JLabel.CENTER );
		label_3.setBounds(731, 12, 35, 27);
		panel_2.add(label_3);
		
		label_4 = new JLabel("", topbarSettingsIcono, JLabel.CENTER );
		label_4.setBounds(883, 15, 46, 25);
		panel_2.add(label_4);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(360, 42, 370, 1);
		panel_2.add(separator_4);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:   ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(57, 332, 103, 30);
		perfil.add(lblNewLabel_2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(167, 426, 210, 1);
		perfil.add(separator_5);
		
		lblApellido = new JLabel("Apellido:   ");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 13));
		lblApellido.setBounds(57, 396, 103, 30);
		perfil.add(lblApellido);
		
		lblCorre = new JLabel("Corre:   ");
		lblCorre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorre.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCorre.setBounds(57, 453, 103, 30);
		perfil.add(lblCorre);
		
		///
		
		BufferedImage perfilFoto = DB.setImagen(DB.leerUsu());
		 
		 if (perfilFoto != null) {
			 
			 try {
			 
			 ImageIcon imgIcon = new ImageIcon(perfilFoto);
		        Image imgEscalada = imgIcon.getImage();
		        Icon iconoEscalado = new ImageIcon(imgEscalada);
		        
		        lblPerfilPicture.setIcon(iconoEscalado);
			 }catch(Exception e) {}
			 
		 }
		

	}
	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void mostrarGastos() {
		
		String[][] r = DB.getCuenta(DB.leerUsu(), "gastos");
		
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
		
		String[][] r = DB.getCuenta(DB.leerUsu(), "ingresos");
		
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
	
	private class MiListener implements ActionListener{

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == btnAgregarIngreso){
				
				String[][] a = DB.getCuenta(DB.leerUsu(), "ingresos");
				cbCategoriaIngresos.setModel(new DefaultComboBoxModel(a[2]));
				cbEliminarIngreso.setModel(new DefaultComboBoxModel(a[2]));
				
				ingresarIngresos.setVisible(true);
				ingresos.setVisible(false);
			}
			
			
			if (e.getSource() == btnRegresar){
				ingresarIngresos.setVisible(false);
				ingresos.setVisible(true);
				mostrarIngresos();
			}
			
			
			if (e.getSource() == btnGuardar){
				
				try{
				DB.modificarCuenta(DB.leerUsu(), "ingresos", cbCategoriaIngresos.getSelectedItem().toString(), Double.parseDouble(txtMontoingresos.getText()));
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
					DB.modificarCuenta(DB.leerUsu(), "ingresos", nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase(), 0);
					
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
				
				DB.eliminarCuenta(DB.leerUsu(), "ingresos", cbEliminarIngreso.getSelectedItem().toString());
				
				
				ingresarIngresos.setVisible(false);
				ingresos.setVisible(true);
				txtMontoingresos.setText(null);
				txtAgregarCategoriaIngresos.setText(null);
				
				try {
					mostrarIngresos();
				}catch (Exception ex){}
			}
			
			
			if (e.getSource() == btnAgregarGastos){
				
				String[][] s = DB.getCuenta(DB.leerUsu(), "gastos");
				cbCategoriaGastos.setModel(new DefaultComboBoxModel(s[2]));
				cbEliminarGasto.setModel(new DefaultComboBoxModel(s[2]));
				
				gastos.setVisible(false);
				ingresarGastos.setVisible(true);
			}
			
			if (e.getSource() == btnRegresar2){
				
				gastos.setVisible(true);
				ingresarGastos.setVisible(false);
				
				txtMontoGasto.setText(null);
				txtNombreGasto.setText(null);	
			}
			
			
			if (e.getSource() == btnGuardar2){
				
			try{
				DB.modificarCuenta(DB.leerUsu(), "gastos", cbCategoriaGastos.getSelectedItem().toString(), Double.parseDouble(txtMontoGasto.getText()));
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
				
				DB.eliminarCuenta(DB.leerUsu(), "gastos", cbEliminarGasto.getSelectedItem().toString());
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
					DB.modificarCuenta(DB.leerUsu(), "gastos", nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase(), 0);
					
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
		
		}
		
	}
}





