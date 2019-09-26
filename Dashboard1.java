import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.border.CompoundBorder;
import javax.swing.JToggleButton;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Dashboard1 extends Login{
	
	
	private JFrame frame;
	Login login;
	static Dashboard1 window;
	
	private JLabel lblSidebarHome, lblSidebarHomeIcon, lblSidebarIngresos, lblSidebarIngresosIcon, lblSidebarGastos, lblSidebarGastosIcon, 
	lblSidebarPresupuestos, lblSidebarPrespuestosIcon, lblSidebarSalir;
	private JPanel sidebar;
		
	private JPanel btnSidebarHome, btnSidebarIngresos, btnSidebarGastos, btnSidebarPresupuestos, btnSidebarSalir;
	private JLabel lblSidebarSalirIcon;
	private JPanel pSidebarDashboard, pSidebarIngresos, pSidebarGastos, pSidebarPresupuestos, pSidebarSalir;
	private JLabel lblUserImage, lblUsername;
	private BufferedImage userImage = null;
	private JPanel main;
	private JPanel resumen;
	private JPanel ingresos2;
	private JPanel gastos;
	private JPanel presupuestos;
	private JLabel lblPresupuestos;
	private JLabel lblEdicionDe;
	private JLabel lblIngresos_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tfIngresos;
	
	private JComboBox<String> cb1Ingresos, cb2Ingresos, cb3Ingresos;
	private MiListener oyente;
	private JPanel pIngresos;
	private JPanel ingresos1;
	private JLabel lblNewLabel_5;
	private JLabel lblTotalIngresosQ;
	private JLabel lblTotalIngresos;
	private JButton btnIngresos1, btnIngresos2, btnIngresosRegresar;
	private JPanel panel_1,panel_2,panel_3,panel_4,panel_5,panel_6,panel_7;
	private JLabel lblIngresoN1,lblIngresoN2,lblIngresoN3,lblIngresoN4,lblIngresoN5,lblIngresoN6,lblIngresoN7;
	private JLabel lblIngresoR1,lblIngresoR2,lblIngresoR3,lblIngresoR4,lblIngresoR5,lblIngresoR6,lblIngresoR7;
	private JLabel lblNewLabel_6;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Dashboard1();
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
	public Dashboard1() {
		oyente = new MiListener();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setSize(1150, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon("src/google.png").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 746);
		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		
		
		lblUsername = new JLabel(DB.getNombre(DB.leerUsu()));
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsername.setToolTipText("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(0, 131, 245, 30);
		sidebar.add(lblUsername);
		
		
		
		btnSidebarHome = new JPanel();
		btnSidebarHome.setBounds(0, 195, 245, 36);
		sidebar.add(btnSidebarHome);
		btnSidebarHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarDashboard.setBackground(new Color(0, 153, 204));
				pSidebarGastos.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarHome.setForeground(new Color(0, 153, 204));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
				
				resumen.setVisible(true);
				ingresos2.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
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
				
				pSidebarIngresos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarGastos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarIngresos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
				
				resumen.setVisible(false);
				pIngresos.setVisible(true);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
			}
		});
		btnSidebarIngresos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarIngresos.setOpaque(false);
		btnSidebarIngresos.setBorder(new CompoundBorder());
		btnSidebarIngresos.setBackground(Color.CYAN);
		btnSidebarIngresos.setBounds(0, 241, 245, 36);
		sidebar.add(btnSidebarIngresos);
		
		btnSidebarGastos = new JPanel();
		btnSidebarGastos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarGastos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarGastos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
				
				resumen.setVisible(false);
				ingresos2.setVisible(false);
				gastos.setVisible(true);
				presupuestos.setVisible(false);
			}
		});
		btnSidebarGastos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarGastos.setOpaque(false);
		btnSidebarGastos.setBorder(new CompoundBorder());
		btnSidebarGastos.setBackground(Color.CYAN);
		btnSidebarGastos.setBounds(0, 287, 245, 36);
		sidebar.add(btnSidebarGastos);
		
		btnSidebarPresupuestos = new JPanel();
		btnSidebarPresupuestos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarPresupuestos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarGastos.setBackground(new Color(251,251,251));
				
				lblSidebarPresupuestos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				
				resumen.setVisible(false);
				ingresos2.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(true);
			}
		});
		btnSidebarPresupuestos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarPresupuestos.setOpaque(false);
		btnSidebarPresupuestos.setBorder(new CompoundBorder());
		btnSidebarPresupuestos.setBackground(Color.CYAN);
		btnSidebarPresupuestos.setBounds(0, 338, 245, 36);
		sidebar.add(btnSidebarPresupuestos);
		
		btnSidebarSalir = new JPanel();
		btnSidebarSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Login login = new Login();
				login.main(null);
				
			}
		});
		btnSidebarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarSalir.setOpaque(false);
		btnSidebarSalir.setBorder(new CompoundBorder());
		btnSidebarSalir.setBackground(Color.CYAN);
		btnSidebarSalir.setBounds(0, 389, 245, 36);
		sidebar.add(btnSidebarSalir);
		
		try {
			userImage = ImageIO.read(new File("src/user.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image userImg = userImage.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		
		lblUserImage = new JLabel(new ImageIcon(userImg) );
		lblUserImage.setBounds(0, 40, 245, 80);
		sidebar.add(lblUserImage);
		lblUserImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblSidebarHome = new JLabel("Dashboard");
		lblSidebarHome.setForeground(new Color(0, 153, 204));
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
		pSidebarDashboard.setBackground(new Color(0, 153, 204));
		pSidebarDashboard.setBounds(0, 195, 5, 36);
		sidebar.add(pSidebarDashboard);
		
		lblSidebarIngresos = new JLabel("Ingresos");
		lblSidebarIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarIngresos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresos.setBounds(60, 241, 185, 36);
		sidebar.add(lblSidebarIngresos);
		
		Icon ingresosIcon = new ImageIcon("src/ingresos.png");
		
		lblSidebarIngresosIcon = new JLabel("", ingresosIcon, JLabel.CENTER);
		lblSidebarIngresosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresosIcon.setBounds(30, 241, 25, 36);
		sidebar.add(lblSidebarIngresosIcon);
		
		
		lblSidebarGastos = new JLabel("Gastos");
		lblSidebarGastos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarGastos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastos.setBounds(60, 287, 185, 36);
		sidebar.add(lblSidebarGastos);
		
		Icon gastosIcon = new ImageIcon("src/gastos.png");
		
		lblSidebarGastosIcon = new JLabel("", gastosIcon, JLabel.CENTER);
		lblSidebarGastosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastosIcon.setBounds(30, 287, 25, 36);
		sidebar.add(lblSidebarGastosIcon);
		
		lblSidebarPresupuestos = new JLabel("Presupuestos");
		lblSidebarPresupuestos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarPresupuestos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPresupuestos.setBounds(60, 338, 185, 36);
		sidebar.add(lblSidebarPresupuestos);
		
		Icon presupuestosIcon = new ImageIcon("src/presupuestos.png");
		
		lblSidebarPrespuestosIcon = new JLabel("", presupuestosIcon, JLabel.CENTER);
		lblSidebarPrespuestosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPrespuestosIcon.setBounds(30, 338, 25, 36);
		sidebar.add(lblSidebarPrespuestosIcon);
		
		lblSidebarSalir = new JLabel("Salir");
		lblSidebarSalir.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalir.setBounds(60, 389, 185, 36);
		sidebar.add(lblSidebarSalir);
		
		Icon salirIcon = new ImageIcon("src/exit.png");
		
		lblSidebarSalirIcon = new JLabel("", salirIcon, JLabel.CENTER);
		lblSidebarSalirIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalirIcon.setBounds(30, 389, 25, 36);
		sidebar.add(lblSidebarSalirIcon);
		
		pSidebarIngresos = new JPanel();
		pSidebarIngresos.setBackground(new Color(251,251,251));
		pSidebarIngresos.setBounds(0, 241, 5, 36);
		sidebar.add(pSidebarIngresos);
		
		pSidebarGastos = new JPanel();
		pSidebarGastos.setBackground(new Color(251,251,251));
		pSidebarGastos.setBounds(0, 287, 5, 36);
		sidebar.add(pSidebarGastos);
		
		pSidebarPresupuestos = new JPanel();
		pSidebarPresupuestos.setBackground(new Color(251,251,251));
		pSidebarPresupuestos.setBounds(0, 338, 5, 36);
		sidebar.add(pSidebarPresupuestos);
		
		pSidebarSalir = new JPanel();
		pSidebarSalir.setBackground(new Color(251,251,251));
		pSidebarSalir.setBounds(0, 389, 5, 36);
		sidebar.add(pSidebarSalir);
		
		main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(245, 0, 1121, 746);
		frame.getContentPane().add(main);
		main.setLayout(new CardLayout(0, 0));
		
		resumen = new JPanel();
		resumen.setBackground(Color.WHITE);
		main.add(resumen, "name_336802300135327");
		resumen.setBounds(245, 0, 1121, 746);
		resumen.setLayout(null);
		
		JLabel lblResumen = new JLabel("RESUMEN");
		lblResumen.setBounds(408, 221, 241, 114);
		resumen.add(lblResumen);
		
		pIngresos = new JPanel();
		main.add(pIngresos, "name_542948344204800");
		pIngresos.setLayout(new CardLayout(0, 0));
		
		ingresos1 = new JPanel();
		ingresos1.setBackground(Color.WHITE);
		pIngresos.add(ingresos1, "name_542978187223400");
		ingresos1.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Ingresos");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(513, 52, 109, 50);
		ingresos1.add(lblNewLabel_5);
		
		lblTotalIngresosQ = new JLabel("Total ingresos:   Q");
		lblTotalIngresosQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalIngresosQ.setBounds(320, 139, 178, 37);
		ingresos1.add(lblTotalIngresosQ);
		
		lblTotalIngresos = new JLabel("");
		lblTotalIngresos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalIngresos.setBounds(508, 141, 148, 35);
		ingresos1.add(lblTotalIngresos);
		
		btnIngresos1 = new JButton("+");
		btnIngresos1.setForeground(Color.WHITE);
		btnIngresos1.setBackground(new Color(51, 153, 255));
		btnIngresos1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnIngresos1.setBounds(493, 247, 109, 37);
		btnIngresos1.addActionListener(oyente);
		ingresos1.add(btnIngresos1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(86, 358, 442, 37);
		ingresos1.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIngresoN1 = new JLabel("");
		lblIngresoN1.setForeground(Color.WHITE);
		lblIngresoN1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblIngresoN1);
		
		lblIngresoR1 = new JLabel();
		lblIngresoR1.setText("0");
		lblIngresoR1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR1.setForeground(Color.WHITE);
		panel_1.add(lblIngresoR1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(86, 419, 442, 37);
		ingresos1.add(panel_2);
		
		lblIngresoN2 = new JLabel("");
		lblIngresoN2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN2.setForeground(Color.WHITE);
		panel_2.add(lblIngresoN2);
		
		lblIngresoR2 = new JLabel();
		lblIngresoR2.setText("0");
		lblIngresoR2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR2.setForeground(Color.WHITE);
		panel_2.add(lblIngresoR2);
		
		panel_3 = new JPanel();
		panel_3.setBounds(86, 484, 442, 37);
		ingresos1.add(panel_3);
		
		lblIngresoN3 = new JLabel("");
		lblIngresoN3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN3.setForeground(Color.WHITE);
		panel_3.add(lblIngresoN3);
		
		lblIngresoR3 = new JLabel();
		lblIngresoR3.setText("0");
		lblIngresoR3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR3.setForeground(Color.WHITE);
		panel_3.add(lblIngresoR3);
		
		panel_4 = new JPanel();
		panel_4.setBounds(86, 546, 442, 37);
		ingresos1.add(panel_4);
		
		lblIngresoN4 = new JLabel("");
		lblIngresoN4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN4.setForeground(Color.WHITE);
		panel_4.add(lblIngresoN4);
		
		lblIngresoR4 = new JLabel();
		lblIngresoR4.setText("0");
		lblIngresoR4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR4.setForeground(Color.WHITE);
		panel_4.add(lblIngresoR4);
		
		panel_5 = new JPanel();
		panel_5.setBounds(568, 358, 406, 37);
		ingresos1.add(panel_5);
		
		lblIngresoN5 = new JLabel("");
		lblIngresoN5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN5.setForeground(Color.WHITE);
		panel_5.add(lblIngresoN5);
		
		lblIngresoR5 = new JLabel();
		lblIngresoR5.setText("0");
		lblIngresoR5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR5.setForeground(Color.WHITE);
		panel_5.add(lblIngresoR5);
		
		panel_6 = new JPanel();
		panel_6.setBounds(568, 419, 406, 37);
		ingresos1.add(panel_6);
		
		lblIngresoN6 = new JLabel("");
		lblIngresoN6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN6.setForeground(Color.WHITE);
		panel_6.add(lblIngresoN6);
		
		lblIngresoR6 = new JLabel();
		lblIngresoR6.setText("0");
		lblIngresoR6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR6.setForeground(Color.WHITE);
		panel_6.add(lblIngresoR6);
		
		panel_7 = new JPanel();
		panel_7.setBounds(568, 484, 406, 37);
		ingresos1.add(panel_7);
		
		lblIngresoN7 = new JLabel("");
		lblIngresoN7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoN7.setForeground(Color.WHITE);
		panel_7.add(lblIngresoN7);
		
		lblIngresoR7 = new JLabel();
		lblIngresoR7.setText("0");
		lblIngresoR7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresoR7.setForeground(Color.WHITE);
		panel_7.add(lblIngresoR7);
		
		//INGRESOS
		
		ingresos2 = new JPanel();
		pIngresos.add(ingresos2, "name_542969913736799");
		ingresos2.setBackground(Color.WHITE);
		ingresos2.setBounds(245, 0, 1121, 746);
		ingresos2.setLayout(null);
		
		JLabel lblIngresos = new JLabel("Ingresos");
		lblIngresos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIngresos.setBounds(432, 47, 120, 39);
		ingresos2.add(lblIngresos);
		
		JLabel lblNewLabel = new JLabel("Asigna las caracteristicas de tu ingreso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(330, 91, 371, 25);
		ingresos2.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(54, 149, 278, 434);
		ingresos2.add(panel);
		panel.setLayout(null);
		
		lblEdicionDe = new JLabel("Edicion de ");
		lblEdicionDe.setForeground(Color.WHITE);
		lblEdicionDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEdicionDe.setBounds(85, 199, 127, 25);
		panel.add(lblEdicionDe);
		
		lblIngresos_1 = new JLabel("ingresos");
		lblIngresos_1.setForeground(Color.WHITE);
		lblIngresos_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngresos_1.setBounds(95, 224, 94, 25);
		panel.add(lblIngresos_1);
		
		lblNewLabel_1 = new JLabel("Monto: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(420, 200, 130, 34);
		ingresos2.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Categoria: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(420, 261, 150, 35);
		ingresos2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Repetir: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(420, 326, 102, 34);
		ingresos2.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Recordatorio: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(420, 398, 132, 34);
		ingresos2.add(lblNewLabel_4);
		
		String[] strCB1 = {"Sueldos","Bonos","Reembolsos","Rentas","Subsidios","Inversiones","Otros"};
		
		String[] strCB2 = {"Nunca","Diario","Semanal","Mensual","Anaul"};
		
		String[] strCB3 = {"Nunca","Al vencer","Un dia previo a vencer"};
		
		tfIngresos = new JTextField();
		tfIngresos.setBounds(607, 204, 177, 34);
		ingresos2.add(tfIngresos);
		tfIngresos.setColumns(10);
		cb1Ingresos = new JComboBox(strCB1);
		cb1Ingresos.setBounds(607, 263, 177, 39);
		ingresos2.add(cb1Ingresos);
		cb2Ingresos = new JComboBox(strCB2);
		cb2Ingresos.setBounds(607, 328, 177, 39);
		ingresos2.add(cb2Ingresos);
		cb3Ingresos = new JComboBox(strCB3);
		cb3Ingresos.setBounds(607, 402, 177, 34);
		ingresos2.add(cb3Ingresos);
		
		btnIngresos2 = new JButton("Agregar");
		btnIngresos2.addActionListener(oyente);
		btnIngresos2.setForeground(Color.WHITE);
		btnIngresos2.setBackground(Color.GREEN);
		btnIngresos2.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnIngresos2.setBounds(652, 544, 145, 39);
		btnIngresos2.addActionListener(oyente);
		ingresos2.add(btnIngresos2);
		
		btnIngresosRegresar = new JButton("Regresar");
		btnIngresosRegresar.setBackground(Color.GREEN);
		btnIngresosRegresar.setForeground(Color.WHITE);
		btnIngresosRegresar.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnIngresosRegresar.setBounds(54, 11, 130, 39);
		ingresos2.add(btnIngresosRegresar);
		
		
		gastos = new JPanel();
		gastos.setBackground(Color.WHITE);
		gastos.setBounds(245, 0, 1121, 746);
		main.add(gastos, "name_337042041258590");
		gastos.setLayout(null);
		
		JLabel lblGastos = new JLabel("GASTOS");
		lblGastos.setBounds(429, 255, 168, 86);
		gastos.add(lblGastos);
		
		presupuestos = new JPanel();
		presupuestos.setBackground(Color.WHITE);
		presupuestos.setBounds(245, 0, 1121, 746);
		main.add(presupuestos, "name_337073441194312");
		presupuestos.setLayout(null);
		
		lblPresupuestos = new JLabel("PRESUPUESTOS");
		lblPresupuestos.setBounds(425, 227, 200, 118);
		presupuestos.add(lblPresupuestos);
		
		
		
	}
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnIngresos1) {
				ingresos1.setVisible(false);
				ingresos2.setVisible(true);
			}
			
			if(e.getSource() == btnIngresosRegresar) {
				ingresos1.setVisible(true);
				ingresos2.setVisible(false);
			}
			
			if(e.getSource() == btnIngresos2) {
				ingresos1.setVisible(true);
				ingresos2.setVisible(false);
				int categoria = cb1Ingresos.getSelectedIndex();
				String monto = tfIngresos.getText();
				
				switch(categoria) {
				case 0:
					panel_1.setBackground(new Color(51, 153, 255));
					lblIngresoN1.setText("Sueldos");
					lblIngresoR1.setText(monto);
					break;
				case 1:
					panel_2.setBackground(new Color(51, 153, 255));
					lblIngresoN2.setText("Bonos");
					lblIngresoR2.setText(monto);
					break;
				case 2:
					panel_3.setBackground(new Color(51, 153, 255));
					lblIngresoN3.setText("Reembolsos");
					lblIngresoR3.setText(monto);
					break;
				case 3:
					panel_4.setBackground(new Color(51, 153, 255));
					lblIngresoN4.setText("Rentas");
					lblIngresoR4.setText(monto);
					break;
				case 4:
					panel_5.setBackground(new Color(51, 153, 255));
					lblIngresoN5.setText("Subsidios");
					lblIngresoR5.setText(monto);
					break;
				case 5:
					panel_6.setBackground(new Color(51, 153, 255));
					lblIngresoN6.setText("Inversiones");
					lblIngresoR6.setText(monto);
					break;
				case 6:
					panel_7.setBackground(new Color(51, 153, 255));
					lblIngresoN7.setText("Otros");
					lblIngresoR7.setText(monto);
					break; 
				}
				
				
				int cantIng1 = 0, cantIng2 = 0, cantIng3 = 0, cantIng4 = 0, cantIng5 = 0, cantIng6 = 0, cantIng7 = 0;
				
				cantIng1 = Integer.parseInt(lblIngresoR1.getText()); 
				cantIng2 = Integer.parseInt(lblIngresoR2.getText()); 
				cantIng3 = Integer.parseInt(lblIngresoR3.getText()); 
				cantIng4 = Integer.parseInt(lblIngresoR4.getText()); 
				cantIng5 = Integer.parseInt(lblIngresoR5.getText()); 
				cantIng6 = Integer.parseInt(lblIngresoR6.getText()); 
				cantIng7 = Integer.parseInt(lblIngresoR7.getText()); 
						
				int totalIngresos = cantIng1+cantIng2+cantIng3+cantIng4+cantIng5+cantIng6+cantIng7;  
				lblTotalIngresos.setText(""+totalIngresos);
				
				ingresos1.setVisible(true);
				ingresos2.setVisible(false);
				
				
			}
		}
		
	}
}





