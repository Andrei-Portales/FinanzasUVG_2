import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;

public class Settings extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Settings dialog = new Settings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Settings() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setLocation(600, 100);
		setSize(612, 387);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTemaOscuro = new JLabel("Tema oscuro");
			lblTemaOscuro.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTemaOscuro.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTemaOscuro.setBounds(64, 37, 129, 28);
			contentPanel.add(lblTemaOscuro);
		}
		{
			JLabel lblIngles = new JLabel("Ingles");
			lblIngles.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblIngles.setHorizontalAlignment(SwingConstants.RIGHT);
			lblIngles.setBounds(64, 76, 129, 28);
			contentPanel.add(lblIngles);
		}
		
		Icon temaSwitcher = new ImageIcon(Settings.class.getResource("resources/check.png"));
		
		JLabel label = new JLabel("", temaSwitcher, JLabel.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(193, 37, 129, 28);
		contentPanel.add(label);
		{
			JLabel label_1 = new JLabel("", temaSwitcher, JLabel.CENTER);
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_1.setBounds(193, 76, 129, 28);
			contentPanel.add(label_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.setForeground(new Color(255, 255, 255));
				okButton.setBackground(new Color(0, 153, 255));
				okButton.setBorder(null);
				okButton.setSize(70, 25);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(255, 255, 255));
				cancelButton.setBackground(new Color(255, 0, 153));
				cancelButton.setBorder(null);
				cancelButton.setSize(70, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
