import java.awt.Graphics;
import javax.swing.*;



public class Circle extends JApplet{

	double sum;
	
	public void init(){
		String firstNum, secondNum;
		double num1, num2, sum;
		
		firstNum = JOptionPane.showInputDialog("Enter First value");
		secondNum = JOptionPane.showInputDialog("Enter second num");
		
		num1 = Double.parseDouble(firstNum);
		num2 = Double.parseDouble(secondNum);
		sum = num1+num2;
		
		
	}
	
	public void paint(Graphics G){
		G.drawRect(15, 10, 270, 20);
		
		G.drawString("The sum is" + sum, 25,25);
	}
}
