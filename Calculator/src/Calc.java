import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame{
	
	private JLabel outputfield, inputfield;
	private JTextField outputspace, inputspace;
	private JButton[] button;
	private int userinput =0, finalanswer =0;
	private JButton clear;
	
	public Calc(){
		super("Calculator");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		outputfield = new JLabel("result");
		
		add(outputfield);
		
		outputspace = new JTextField(10);
		outputspace.setEditable(false);
		add(outputspace);
		
		inputspace = new JTextField(13);
		inputspace.setEditable(true);
		add(inputspace);
		
		button = new JButton[4];
		char[] s = {'+','-','*','/'};
		for(int i = 0; i < 4; i++){
			button[i] = new JButton();
			button[i].setPreferredSize(new Dimension(50,25));
			button[i].setText(String.valueOf(s[i]));
			button[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					userinput = Integer.parseInt(inputspace.getText());
					operation(e.getActionCommand().charAt(0));
					inputspace.setText("");
				}
			});
		add(button[i]);
		}
		
		clear=  new JButton();
		clear.setText("CLR");
		clear.setPreferredSize(new Dimension(50,25));
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				finalanswer = 0;
				outputspace.setText("0");
			}
		});
		add(clear);
	}
	
	public void operation(String s){
		if(s=="CLR"){
			finalanswer = 0;
			String Display = "0";
			outputspace.setText(Display);
		}
	}
	
	public void operation(char c){
		if(c == '+') finalanswer += userinput;
		if(c == '-') finalanswer -= userinput;
		if(c == '*') finalanswer *= userinput;
		if(c == '/') finalanswer /= userinput;
		
		String display = String.valueOf(finalanswer);
		outputspace.setText(display);
		
	}
	

	
	public static void main(String args[]){
		Calc hey = new Calc();
		
	}
	
	
}