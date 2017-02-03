package assignment3;

public class Child extends Person{
	
	String schoolAttended;
	
	Child(String name, String school){
		super(name);
		this.schoolAttended = school;
	}
	
	public String toString(){
		return this.getName() + " attends " + schoolAttended;
	}
}
