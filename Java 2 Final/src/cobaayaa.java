import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cobaayaa {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cobaayaa window = new cobaayaa();
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
	public cobaayaa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(SystemColor.text);
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 684, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOmaigle = new JLabel("OMAIGLE");
		lblOmaigle.setForeground(Color.WHITE);
		lblOmaigle.setFont(new Font("Yu Gothic Light", Font.PLAIN, 23));
		lblOmaigle.setBounds(10, 0, 115, 37);
		frame.getContentPane().add(lblOmaigle);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 35, 476, 280);
		frame.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(485, 35, 17, 280);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblListUserOnline = new JLabel("List User Online :");
		lblListUserOnline.setForeground(Color.WHITE);
		lblListUserOnline.setBounds(532, 35, 89, 14);
		frame.getContentPane().add(lblListUserOnline);
		
		JList list = new JList();
		list.setBounds(532, 60, 124, 250);
		frame.getContentPane().add(list);
		
		JLabel lblMessage = new JLabel("Message :");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setBounds(10, 328, 58, 14);
		frame.getContentPane().add(lblMessage);
		
		textField = new JTextField();
		textField.setBounds(10, 343, 408, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnSend.setBounds(428, 341, 65, 23);
		frame.getContentPane().add(btnSend);
		
		JButton btnWhisper = new JButton("Whisper");
		btnWhisper.setForeground(SystemColor.textHighlight);
		btnWhisper.setBackground(Color.WHITE);
		btnWhisper.setFont(new Font("Segoe Print", Font.PLAIN, 11));
		btnWhisper.setBounds(578, 341, 80, 23);
		frame.getContentPane().add(btnWhisper);
		
		JButton btnClearScreen = new JButton("Clear");
		btnClearScreen.setFont(new Font("Segoe Script", Font.PLAIN, 11));
		btnClearScreen.setBounds(503, 342, 65, 23);
		frame.getContentPane().add(btnClearScreen);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDisconnect.setBounds(567, 11, 89, 23);
		frame.getContentPane().add(btnDisconnect);
	}
}
