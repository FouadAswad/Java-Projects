package datalab1;

public class BCKmatcher {
	String line;
	int length;
	char temp1,temp2;
	STK stack;
	
	BCKmatcher(String line, int length){
		this.line = line;
		this.length = length;
		stack = new STK();
	}
	
	public boolean MatchTester() throws ToppedUpException, isEmptyException{
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) == '{' | line.charAt(i) == '(' | line.charAt(i) == '['){
				stack.push(line.charAt(i));
			}else if(line.charAt(i) == ']' | line.charAt(i) == '}' | line.charAt(i) == ')'){
				if(stack.isEmpty()) {
					System.out.println("Does not match.");
					return false;
				}else{
					temp1 = stack.pop();
					temp2 = line.charAt(i);
					if(temp1 == '[' && temp2 != ']'){
						System.out.println("Does not match.");
						return false;
					}else if(temp1 == '{' && temp2 != '}'){
						System.out.println("Does not match.");
						return false;
					}else if(temp1 == '(' && temp2 != ')'){
						System.out.println("Does not match.");
						return false;
					}
					
				}
			}
			
		}
		
		if(stack.isEmpty()){
			System.out.println("Matches");
			return true;
		}else{
			System.out.println("Does not match.");
			return false;
		}
	}
}
