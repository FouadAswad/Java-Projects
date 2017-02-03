package lab8;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Calc extends JFrame{
	
	private JLabel item1;
	private JButton addbutton = new JButton("+");
	private JButton minusbutton = new JButton("-");
	
	
	public Calc(){
		super("Calculator");
		setLayout(new FlowLayout());
		add(addbutton);
		add(minusbutton);
		
		
	}
}
