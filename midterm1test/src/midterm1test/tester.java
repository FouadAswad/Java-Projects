package midterm1test;
import java.util.StringTokenizer;

public class tester {
	public static void findmaximum(int a, int b, int result){
		if(a>b){
			result = a;
		}else{
			result = b;
		}
	}
	
	public static void main(String x[]){
		String s = "hello..    how are you??";
		
		int a = 5;
		int b = 7;
		int result = 0;
		
		String words[];
		String nextToken;
		StringTokenizer myTokenizer = new StringTokenizer(s, " .?");
		
		for(int i =0; i < myTokenizer.countTokens(); i++){
			i = 0;
			nextToken = myTokenizer.nextToken();
			System.out.println("next token is " + nextToken);
		}
		
		findmaximum(a,b,result);
		System.out.println("The maximum of a and b is " + result);
		
		
		words = s.split("[\\s\\.\\?]+");
		System.out.println("The words are as follows: ");
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}
	}
}
