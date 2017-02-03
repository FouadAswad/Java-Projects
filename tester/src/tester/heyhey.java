package tester;
import java.util.StringTokenizer;

public class heyhey {
	public static void main(String args[]){
		String hey = "Hello? ? how are you.? I am fine. ";

		String[] arg = hey.split("[\\s\\.\\?]+");
		
		for(int i = 0; i < arg.length; i++){
			System.out.println(arg[i]);
		}
		StringTokenizer mytokenizer = new StringTokenizer(hey, " .?");
		while(mytokenizer.hasMoreTokens()){
			System.out.println(mytokenizer.nextToken());
		}
	}
	
}
