package datalab1;

public class STK {
	char[] stk ;
	int size = 0;
	int top = 0;
	
	public STK(){
		stk = new char[20];
	}
	
	public void push(char x) throws ToppedUpException{
		if(top == stk.length) throw new ToppedUpException();
		else{
			top++;
			stk[top] = x;
			return;
		}
	}
	
	public boolean isEmpty(){
		if(top==0) return true;
		else return false;
	}
	
	public char pop() throws isEmptyException{
		if(isEmpty()) throw new isEmptyException();
		else{
			top--;
			return stk[top+1];
		}
	}
	
	public char top() throws isEmptyException{
		if(isEmpty()) throw new isEmptyException();
		else{
			return stk[top];
		}
	}
	
	public int getSize(){
		return top;
	}
}
