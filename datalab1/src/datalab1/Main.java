//This program takes an input of 3 different types of brackets
// i.e '[','{', and '('
// and checks to see if the brackets are met with their correct 
//counter parts (i.e ']', '}', ')')

//This program checks for the requirement by 'pushing' each opening bracket
//input into a stack and then 'popping' the stack of its elements if the correct
//closing bracket is found in the right area.
//The program then checks if the stack is empty or not to determine the validity of the input.

//Example run -- Input "((234){23})"
//would output "Matches" -- because all brackets are accompied by correct closing brackets

//Example run -- Input "(){"
//would output "Does not match." -- because a bracket is left opened and the stack will not be empty.

package datalab1;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws ToppedUpException, isEmptyException{
		String line;
		Scanner keyboard = new Scanner(System.in);
		line = keyboard.nextLine();
		
		BCKmatcher myMatcher = new BCKmatcher(line, line.length());
		myMatcher.MatchTester();
		
	}
}
