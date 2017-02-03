package ass6;
import assignment3.MyDate;


public class ForeignStudent extends Student{
	private String countryOfOrigin;
	private static int numberOfForeignStudents = 0;
	private MyDate dateOfEntryToCanada;
	
	
	ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada){
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
		numberOfForeignStudents++;
		
	}
	
	public static int getNumberOfForeignStudents(){
		return numberOfForeignStudents;
	}
	
	public MyDate dateEntered(){
		return dateOfEntryToCanada;
	}
	public double computeFees(){
		return super.getAmountOfCourses()*1000.0;
	}
	
	public String findCountry(){
		return this.countryOfOrigin;
	}
	
	public boolean livingInCanadaBeforeSpecifiedDate(MyDate latestDateOfEntry){
		return dateOfEntryToCanada.lessThan(latestDateOfEntry);
	}
	
	public boolean lessThan(Student anotherStudent){
		if(anotherStudent instanceof SeniorStudent) return false;
		if(anotherStudent instanceof ForeignStudent){
			if(anotherStudent.valueLexi() < this.valueLexi()) return false;
			else return true;
		}
		else return true;
	}
	
	
}
