package test2;

public class Q1A extends Q1 {
	private static String input;
	public Q1A(String input){
		super(input);
		this.input = input;
	}
	
	public int m1(String s){
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return alphabets.indexOf(s);
	}
	
	public int m2(int x){
		return x+50;
	}
	
	public static String getS(){
		return input;
	}
	
	public static void hey(){
		Q1A myQ1A, anotherQ1A;
		Q1 myQ1, anotherQ1;
		myQ1A = new Q1A("cat");
		myQ1 = new Q1("Hi there");
		anotherQ1A = new Q1A("help");
		anotherQ1 = anotherQ1A;
		
		System.out.println("Q1A.getS() returns " + Q1A.getS());
		System.out.println("myQ1.getS() returns " + Q1.getS());
		System.out.println("anotherQ1.process(hello how are you) returns " + anotherQ1.process("hello how are you"));
		
		System.out.println("myQ1A.m1($) returns " + myQ1A.m1('$'));
		System.out.println("myQ1A.m1(ef) returns " + myQ1A.m1("ef"));
		System.out.println("myQ1A.m2(10) returns " + myQ1A.m2(10));
		System.out.println("anotherQ1.m2(10) returns " + anotherQ1.m2(10));
	}
}
