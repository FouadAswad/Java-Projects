package assignment4;

public class MyStringTokenizer {

	private static String[] array;
	private static String finalsplit;

	public MyStringTokenizer(String stringToTokenize, String delimiterString) {
		finalsplit = delimiterString;
		if(delimiterString.matches("(.+)?\\+(.+)?|(.+)?\\*(.+)?|(.+)?\\?(.+)?|(.+)?\\.(.+)?")){
			if(delimiterString.matches("(.+)?\\+(.+)?")){
				finalsplit = finalsplit + "\\+";
			}
			if(delimiterString.matches("(.+)?\\*(.+)?")){
				finalsplit = finalsplit + "\\*";
			}
			if(delimiterString.matches("(.+)?\\?(.+)?")){
				finalsplit = finalsplit + "\\?";
			}
			if(delimiterString.matches("(.+)?\\.(.+)?")){
				finalsplit = finalsplit + "\\.";
			}
		}
		finalsplit = "[" + finalsplit + "]+";
		array = stringToTokenize.split(finalsplit);
	}
	
	//Tester code to see if constructor is working properly
	public void printmethod(){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	private int i = 0;
	
	public int countTokens(){
		
		return array.length - i;
		
	}
	
	public String nextToken(){
		if(i!=array.length){
			
			return array[i++];
		}else return "";
		}	
}
