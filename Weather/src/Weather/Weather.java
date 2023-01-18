package Weather;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class Weather extends JFrame {

	private JPanel contentPane;
	private JTextField txtUnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weather frame = new Weather();
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
	public Weather() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUnos = new JTextField();
		txtUnos.setBounds(242, 159, 132, 32);
		contentPane.add(txtUnos);
		txtUnos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("UNESITE GRAD / KOORDINATE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(193, 103, 231, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnPotvrdi = new JButton("POTVRDI");
		btnPotvrdi.setBounds(386, 158, 103, 32);
		contentPane.add(btnPotvrdi);
	}
}
