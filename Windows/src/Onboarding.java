import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class Onboarding extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JComponent onboarding2;
	private JComponent onboarding3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Onboarding dialog = new Onboarding();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Onboarding() {
		setAlwaysOnTop(true);
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setSize(864, 524);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 864, 491);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
		
//		dashboard.sidebar.setVisible(false);
		
		JPanel onboarding1 = new JPanel();
		onboarding1.setBackground(Color.WHITE);
		contentPanel.add(onboarding1, "name_68652647760900");
		onboarding1.setLayout(null);
		
		JLabel label = new JLabel("\u00A1Bienvenido a Finanzas UVG!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setBounds(0, 73, 854, 40);
		onboarding1.add(label);
		
		JLabel label_1 = new JLabel("Toma el control");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.PLAIN, 16));
		label_1.setBounds(0, 144, 854, 40);
		onboarding1.add(label_1);
		
		JLabel label_2 = new JLabel("Vincula tus tarjetas y controla tus gastos, en un solo lugar. Gratis.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.PLAIN, 16));
		label_2.setBounds(0, 217, 854, 25);
		onboarding1.add(label_2);
		
		JLabel label_3 = new JLabel("Contamos con los mismo protocolos de seguraidad que tu banco.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.PLAIN, 16));
		label_3.setBounds(0, 247, 854, 25);
		onboarding1.add(label_3);
	
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onboarding1.setVisible(false);
				onboarding2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 153, 204));
		btnNewButton.setBounds(383, 345, 129, 32);
		onboarding1.add(btnNewButton);
		
		onboarding2 = new JPanel();
		onboarding2.setBackground(Color.WHITE);
		contentPanel.add(onboarding2, "name_68668221565400");
		onboarding2.setLayout(null);
		
		JLabel lblfinanzasUvg_1 = new JLabel("\u00A1Finanzas UVG!");
		lblfinanzasUvg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblfinanzasUvg_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblfinanzasUvg_1.setBounds(0, 73, 854, 40);
		onboarding2.add(lblfinanzasUvg_1);
		
		textField = new JTextField();
		textField.setBounds(423, 215, 165, 30);
		onboarding2.add(textField);
		textField.setColumns(10);
		
		JLabel lblJ = new JLabel("Recive notificaciones a tu telefono. Y controla tus gastos y presupuesto.");
		lblJ.setFont(new Font("Arial", Font.PLAIN, 13));
		lblJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblJ.setBounds(0, 145, 854, 23);
		onboarding2.add(lblJ);
		
		JLabel lblNewLabel = new JLabel("Tel:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(367, 215, 46, 30);
		onboarding2.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onboarding2.setVisible(false);
				onboarding3.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 153, 204));
		btnNewButton_1.setBounds(383, 345, 106, 30);
		onboarding2.add(btnNewButton_1);
		
		onboarding3 = new JPanel();
		onboarding3.setBackground(new Color(255, 255, 255));
		contentPanel.add(onboarding3, "name_69516835163400");
		onboarding3.setLayout(null);
		
		JLabel lblfinanzasUvg = new JLabel("\u00A1Finanzas UVG!");
		lblfinanzasUvg.setHorizontalAlignment(SwingConstants.CENTER);
		lblfinanzasUvg.setFont(new Font("Arial", Font.BOLD, 16));
		lblfinanzasUvg.setBounds(0, 73, 854, 40);
		onboarding3.add(lblfinanzasUvg);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnComenzar.setBackground(new Color(0, 153, 204));
		btnComenzar.setForeground(new Color(255, 255, 255));
		btnComenzar.setBounds(383, 345, 116, 31);
		onboarding3.add(btnComenzar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setBounds(0, 491, 864, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
