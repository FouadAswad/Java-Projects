//Learning regex

package RegexPractice;

public class stringX {
	public static void main(String args[]){
		String hey = "hello? ? how are you.? I am fine.";
		String[] boom = hey.split("[\\s\\.\\?]+");
		
		
		for(int i = 0; i <boom.length; i++){
			System.out.println(boom[i]);
		}
	}
}
