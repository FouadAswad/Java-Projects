package ass6;

public class SeniorStudent extends Student{
	private double pension = 0.0;
	
	SeniorStudent(String studentName, int numberOfCoursesTaken, double pension){
		super(studentName, numberOfCoursesTaken);
		this.pension = pension;
	}
	
	public double returnPension(){
		return this.pension;
	}
	
	public String findCountry(){
		return "Canada";
	}
	
	public double computeFees(){
		return 50.0;
	}
	
	public String toString(){
		return super.toString() + " senior citizen who gets pension $" + returnPension();
	}
	
	public boolean lessThan(Student anotherStudent){
		if(anotherStudent instanceof SeniorStudent){
			if(anotherStudent.valueLexi() < this.valueLexi()) return  false;
			else return true;
		}else{
			return true;
		}
	}
	
}
