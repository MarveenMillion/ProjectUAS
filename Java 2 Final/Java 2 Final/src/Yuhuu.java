import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Yuhuu extends JFrame{

	Yuhuu(){
		setTitle("Yuhuu! Messenger");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lbl_teks1 = new JLabel("Username :");
		
		JTextArea tarea = new JTextArea(280,100);
		tarea.setEnabled(false);
		
		JButton btn1 = new JButton("Go!");
		btn1.setPreferredSize(new Dimension(40,40));
		JButton btn2 = new JButton("Whisper");
		btn2.setPreferredSize(new Dimension(40,40));
		JButton btn3 = new JButton("Login/Sign-Up");
		btn3.setPreferredSize(new Dimension(40,40));
		JButton btn4 = new JButton("FriendList");
		btn4.setPreferredSize(new Dimension(40,40));
		
		
		JTextField tfield1 = new JTextField(6);
		JTextField tfield2 = new JTextField();
		
		JPanel p1 = new JPanel(new GridLayout());
		//p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
	    JPanel p2 = new JPanel(new GridLayout(1,2));
	    JPanel p3 = new JPanel(new GridLayout(1,4));
		
	    p1.setPreferredSize(new Dimension(280,100));
	    p2.setPreferredSize(new Dimension(280,30));
	    p3.setPreferredSize(new Dimension(280,30));
	    
	    p1.add(tarea);
	    
	    p2.add(tfield1);
	    p2.add(btn1);
	    
	    p3.add(btn3);
	    p3.add(btn2);
	    p3.add(btn4);
	    
	    setLayout(new GridBagLayout());
	    add(p1);
	    add(p2);
	    add(p3);
	    setVisible(true);
	}
	
	public static void main(String[] args){
		new Yuhuu();
	}
	    	}
