package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calctester extends JFrame{
	private int output = 0;
	private int userinput = 0;
	private JTextField inputspace;
	private JTextField outputspace;
	private JLabel entertext;
	private JButton[] Button;
	

	public static void main (String a []){
		Calctester Calc = new Calctester();
		Calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void Operation(char operation){
		String Display;
		if(operation == '+') output += userinput;
		if(operation == '-') output -= userinput;
		if(operation == '*') output *= userinput;
		if(operation == '/') output /= userinput;
		
		Display = String.valueOf(output);
		outputspace.setText(Display);
	}

	public Calctester (){
		super("Calculator");
		setLayout(new FlowLayout());

		entertext = new JLabel ("Result");
		add(entertext);
		
		outputspace =new JTextField (10);
		add (outputspace);
		outputspace.setEditable(false);
		outputspace.setText(String.valueOf(output));
		
		entertext = new JLabel ("Input");
		add (entertext);
		inputspace = new JTextField(13);
		add (inputspace);
		char operatorArray [] = {'+','-','*','/'};
		Button = new JButton [4];
		for (int i = 0 ; i<4 ; i++){
			Button[i] = new JButton();
			Button[i].setPreferredSize(new Dimension (50,25));
			Button[i].setText(String.valueOf(operatorArray[i]));
			Button[i].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e){
					userinput = Integer.parseInt(inputspace.getText());
					Operation (e.getActionCommand().charAt(0));
					inputspace.setText("");
				}
			});
		add (Button[i]);
		}
		setSize(300,300);
		setVisible(true);

	}
}