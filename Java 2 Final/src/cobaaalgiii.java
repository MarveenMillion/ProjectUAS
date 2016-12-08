import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class cobaaalgiii {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cobaaalgiii window = new cobaaalgiii();
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
	public cobaaalgiii() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 473, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToOmaigle = new JLabel("WELCOME TO OMAIGLE !");
		lblWelcomeToOmaigle.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lblWelcomeToOmaigle.setBounds(120, 11, 219, 42);
		frame.getContentPane().add(lblWelcomeToOmaigle);
		
		JLabel lblTypeTheUsername = new JLabel("Type The Username You Want ");
		lblTypeTheUsername.setBounds(144, 46, 168, 14);
		frame.getContentPane().add(lblTypeTheUsername);
		
		textField = new JTextField();
		textField.setBounds(98, 67, 241, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(108, 98, 89, 23);
		frame.getContentPane().add(btnCheck);
		
		JButton btnGo = new JButton("Go!");
		btnGo.setBounds(226, 98, 89, 23);
		frame.getContentPane().add(btnGo);
	}

}
