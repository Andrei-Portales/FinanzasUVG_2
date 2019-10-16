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
import java.awt.LayoutManager;
import java.awt.RenderingHints;

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

	private JTextField fPerfilApellido;
	private JLabel lblApellido;
	private JLabel lblCorre;
	private JPanel pIngreso1;
	
	ImageIcon imgPerfil;
	Image imgPer;

	private JLabel topbarNotificationIcon;
	private JLabel btbRegresarIngresos;
	private JLabel lblContrasena;
	private JTextField fNuevaContrasena;
	private JTextField fConfirmarContrasena;

	private JButton btnGuardarContrasena;

	private JButton btnCancelarCambio;

	private JPanel pCambiarContrasena;
	private JLabel lblContrasenaDebe;
	private JLabel lblDiferenteAl;
	private JLabel lblPerfilError;
	private ArrayList<String> usuarioLeer;
	


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
		frame.setSize(1268, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon("src/google.png").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		
		// VARIABLES
		String[] nombres = DB.getNombre(usuarioLeer.get(0));
		String tempNombre =nombres[0];
		String tempApellido = nombres[1];
		String tempCorreo = usuarioLeer.get(0);
		
		
		
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
				DB.tempUsu(usuarioLeer.get(0), false);
				
				
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
		
		Image userImge = userImage.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		
		lblUserImage = new JLabel(new ImageIcon(userImge) );
		lblUserImage.setBounds(30, 28, 185, 80);
		sidebar.add(lblUserImage);
		lblUserImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPerfilPicture = new JLabel("");			
		lblPerfilPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfilPicture.setBounds(120, 0, 276, 607);
		
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
		
		Icon user = new ImageIcon("src/home.png");
		
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
		
		Icon topbarBrandIcono = new ImageIcon("src/google.png");
		
		Icon topbarBuscarIcono = new ImageIcon("src/search.png");
		
		Icon topbarSettingsIcono = new ImageIcon("src/settings.png");
		
		Icon topbarNotificationIcono = new ImageIcon("src/notification.png");
		
		Icon ingresosBackIcon = new ImageIcon("src/back.png");
		
		Icon iconAgregar = new ImageIcon("src/add.png");
		
		
		
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
		scrollPane.setBounds(600, 275, 328, 194);
		ingresos.add(scrollPane);
		
		
		
		
		listMuestraIngresos = new JList();
		listMuestraIngresos.setBorder(null);
		
	
		scrollPane.setViewportView(listMuestraIngresos);
		listMuestraIngresos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel label = new JLabel("INGRESOS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 22));
		label.setBounds(0, 35, 1120, 30);
		ingresos.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Total ingresos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(222, 91, 132, 31);
		ingresos.add(lblNewLabel_1);
		
		lblQ = new JLabel("Q ");
		lblQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ.setBounds(359, 91, 253, 31);
		ingresos.add(lblQ);
		
		pIngreso1 = new JPanel();
		pIngreso1.setBounds(106, 316, 426, 30);
		pIngreso1.setBorder(null);
		pIngreso1.setBackground(new Color(251, 251, 251));
		ingresos.add(pIngreso1);
		pIngreso1.setLayout(null);
		
		JLabel lblIngreso1 = new JLabel("");
		lblIngreso1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIngreso1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIngreso1.setBounds(0, 0, 202, 30);
		pIngreso1.add(lblIngreso1);
		
		JLabel lblIngreso11 = new JLabel("");
		lblIngreso11.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso11.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIngreso11.setBounds(203, 0, 223, 30);
		pIngreso1.add(lblIngreso11);
		
		JPanel pIngreso2 = new JPanel();
		pIngreso2.setLayout(null);
		pIngreso2.setBorder(null);
		pIngreso2.setBackground(new Color(251, 251, 251));
		pIngreso2.setBounds(106, 357, 426, 30);
		ingresos.add(pIngreso2);
		
		JLabel lblIngreso2 = new JLabel("");
		lblIngreso2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIngreso2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIngreso2.setBounds(0, 0, 202, 30);
		pIngreso2.add(lblIngreso2);
		
		JLabel lblIngreso22 = new JLabel("");
		lblIngreso22.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso22.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIngreso22.setBounds(203, 0, 223, 30);
		pIngreso2.add(lblIngreso22);
		
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
		
		lblGastos = new JLabel("GASTOS");
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
		scrollPane_1.setBounds(97, 288, 715, 354);
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
		
		lblPresupuestos = new JLabel("PRESUPUESTOS");
		lblPresupuestos.setBounds(425, 227, 200, 118);
		presupuestos.add(lblPresupuestos);
		
		perfil = new JPanel();
		perfil.setBackground(Color.WHITE);
		main.add(perfil, "name_656442519169700");
		perfil.setLayout(null);
		
		pCambiarContrasena = new JPanel();
		pCambiarContrasena.setVisible(false);
		pCambiarContrasena.setBackground(new Color(255, 255, 255));
		pCambiarContrasena.setBounds(0, 0, 1120, 691);
		perfil.add(pCambiarContrasena);
		pCambiarContrasena.setLayout(null);
		
		JLabel lblCambiarContrasea = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiarContrasea.setBounds(0, 90, 1120, 29);
		lblCambiarContrasea.setFont(new Font("Arial", Font.BOLD, 24));
		pCambiarContrasena.add(lblCambiarContrasea);
		
		fNuevaContrasena = new JTextField();
		fNuevaContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
		fNuevaContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		TextPrompt nuevacontrasea = new TextPrompt("Nueva contraseña", fNuevaContrasena);
		nuevacontrasea.setFont(new Font("Arial", Font.PLAIN, 13));
		fNuevaContrasena.setBounds(433, 222, 263, 30);
		pCambiarContrasena.add(fNuevaContrasena);
		fNuevaContrasena.setColumns(10);
		
		fConfirmarContrasena = new JTextField();
		fConfirmarContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		TextPrompt cambiarContra2 = new TextPrompt("Confirmar contraseña", fConfirmarContrasena);
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
		fPerfilNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerfilNombre.setText(tempNombre);
		fPerfilNombre.setBounds(672, 252, 207, 30);
		perfil.add(fPerfilNombre);
		fPerfilNombre.setColumns(10);
		
		fPerfilApellido = new JTextField();
		fPerfilApellido.setText(tempApellido);
		fPerfilApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerfilApellido.setBounds(672, 316, 207, 30);
		perfil.add(fPerfilApellido);
		fPerfilApellido.setColumns(10);
		
		fPerfilCorreo = new JTextField();
		fPerfilCorreo.setText(usuarioLeer.get(0));
		fPerfilCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		fPerfilCorreo.setBounds(672, 373, 207, 30);
		perfil.add(fPerfilCorreo);
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
		MiListener oyentePerfilCambiarContrasena = new MiListener();
		perfilCambiarContrasena.addActionListener(oyentePerfilCambiarContrasena);
		perfilCambiarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		perfilCambiarContrasena.setForeground(Color.WHITE);
		perfilCambiarContrasena.setBackground(new Color(93,143,252));
		perfilCambiarContrasena.setBorder(null);
		perfilCambiarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		perfilCambiarContrasena.setBounds(672, 190, 207, 30);
		perfil.add(perfilCambiarContrasena);
		
		btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardarCambios.setForeground(Color.WHITE);
		btnGuardarCambios.setBackground(Color.LIGHT_GRAY);
		btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarCambios.setEnabled(false);
		btnGuardarCambios.setBounds(672, 449, 207, 30);
		perfil.add(btnGuardarCambios);
		
		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.setForeground(Color.WHITE);
		btnCambiarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCambiarFoto.setBounds(200, 412, 120, 30);
		perfil.add(btnCambiarFoto);
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
		
	
		perfil.add(lblPerfilPicture);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(672, 282, 210, 1);
		perfil.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(672, 403, 210, 1);
		perfil.add(separator_2);
		
		
	
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:   ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(559, 252, 103, 30);
		perfil.add(lblNewLabel_2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(669, 346, 210, 1);
		perfil.add(separator_5);
		
		lblApellido = new JLabel("Apellido:   ");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 13));
		lblApellido.setBounds(559, 316, 103, 30);
		perfil.add(lblApellido);
		
		lblCorre = new JLabel("Correo:   ");
		lblCorre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorre.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCorre.setBounds(559, 373, 103, 30);
		perfil.add(lblCorre);
		
		lblContrasena = new JLabel("Contrasena:   ");
		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 13));
		lblContrasena.setBounds(559, 190, 103, 30);
		perfil.add(lblContrasena);
		
		topbar = new JPanel();
		topbar.setBounds(245, 0, 1120, 55);
		frame.getContentPane().add(topbar);
		topbar.setBackground(new Color(251, 251, 251));
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
				// verificamos si alguno de los campos siguen siendo iguales, si son iguales entonces solo actualizamos los que son diferentes
				// o los datos seguiran siendo los mismo
				
			}
			
			// Metodo para cambiar la contrasena del usuarario ya estando dentro de la aplicacion. 
			if(e.getSource() == perfilCambiarContrasena) {
				pCambiarContrasena.setVisible(true);
				perfilCambiarContrasena.setVisible(false);
				
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
				perfilCambiarContrasena.setVisible(true);
				fNuevaContrasena.setText(null);
				fConfirmarContrasena.setText(null);
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





