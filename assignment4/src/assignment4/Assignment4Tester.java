package assignment4;

public class Assignment4Tester {
	public static void main(String args[]){ 
		
		MyStringTokenizer aStringTokenizer = new MyStringTokenizer("Hello? ? how are you.? I am fine. ", " .?");
		System.out.println("Now processing the following string:\nHello? ? how are you.? I am fine. ");
		while (aStringTokenizer.countTokens() > 0){ 
			System.out.println("countTokens returns " + aStringTokenizer. countTokens() +
					"; nextToken returns " + aStringTokenizer. nextToken());  
		}
		System.out.println("********************************************");
		System.out.println("Now processing the following string:\n7.2 + 18 * 53 -8  ");
		aStringTokenizer = new MyStringTokenizer("7.2 + 18 * 53 -8 ", "* .+-/");
		while (aStringTokenizer.countTokens() > 0){ 
			System.out.println("countTokens returns " + aStringTokenizer. countTokens() +
					"; nextToken returns " + aStringTokenizer. nextToken());
		}
		
	} 
} 
