package test2;
import java.util.*;

public class Q3 {
	private String name, major;
	private int gradeList[];
	
	public Q3(String inputString){
		StringTokenizer aTokenizer = new StringTokenizer(inputString,";");
		name = aTokenizer.nextToken();
		major = aTokenizer.nextToken();
		int b = aTokenizer.countTokens();
		gradeList = new int[b];
		
		for(int i = 0; i < aTokenizer.countTokens()+b; i++){
			gradeList[i] = Integer.parseInt(aTokenizer.nextToken());
			
		}
		
		
	}
	
	public String toString(){
		String result = "";
		result +="Name is " + name + ". Major is " + major + "\n";
		for(int i = 0; i <gradeList.length;i++){
			result+=gradeList[i] + "\n";
		}
		return result;
	}
	public static void lol(String args[]){
		
		String inputString = "John Smith;Computer Science;87;45;72";
		Q3 hey = new Q3(inputString);
		System.out.println(hey);
		
	}
}
