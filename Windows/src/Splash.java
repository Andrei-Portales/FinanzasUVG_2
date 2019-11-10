
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Splash extends JFrame {

	private JPanel contentPane;
	public JProgressBar progressBar;
	public JLabel num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		setBackground(new Color(0, 153, 255));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(626, 352);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 121, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(0, 336, 626, 15);
		contentPane.add(progressBar);
		
		num = new JLabel("");
		num.setHorizontalAlignment(SwingConstants.CENTER);
		num.setBounds(309, 297, 71, 28);
		contentPane.add(num);
		
		JLabel lblFinanzasUvg = new JLabel("Finanzas UVG");
		lblFinanzasUvg.setForeground(Color.WHITE);
		lblFinanzasUvg.setFont(new Font("Arial", Font.BOLD, 19));
		lblFinanzasUvg.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinanzasUvg.setBounds(0, 163, 626, 37);
		contentPane.add(lblFinanzasUvg);
	}
}
