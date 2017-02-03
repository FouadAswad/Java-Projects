package ass6;
import assignment3.MyDate;

public class University {
	private Student[] listOfStudents;
	private static int cntr = 0;
	
	private int maxstudents;
	private MyDate minDate = new MyDate("01/01/2010");
	
	University(int maximumNumberOfStudents){
		listOfStudents = new Student[maximumNumberOfStudents];
		this.maxstudents = maximumNumberOfStudents;
	}
	
	public boolean insertStudent(Student aStudent){
		if(cntr < maxstudents){
			listOfStudents[cntr++] = aStudent;
			return true;
		}else{
			return false;
		}
	}
	
	public int numberOfStudents(String nameOfCountry){
		int howmany = 0;
		int hey = 0;
		while(listOfStudents[hey]!=null){
			if(listOfStudents[hey++].findCountry() == nameOfCountry) howmany++;
		}
		return howmany;
	}
	
	public int numberOfForeignStudentLivingInCanadaSince2010(){
		int howmany = 0;
		int q = 0;
		while(listOfStudents[q++]!=null){
			if(listOfStudents[q] instanceof ForeignStudent){
				if(((ForeignStudent)listOfStudents[q]).dateEntered().lessThan(minDate)){
					howmany++;
				}
			}
		
		}
		return howmany;
	}
	
	
	
	public String toString(){
		int howmany = 0;
		while(listOfStudents[howmany]!=null){
			howmany++;
		}
		
		String finalstring = "Number of students in University = " + howmany + "\n";
		int hey = 0;
		while(listOfStudents[hey]!=null){
			finalstring = finalstring + "\n" + listOfStudents[hey++].toString();
		}
		return finalstring;
	}
	
	public Student findLeastStudent(){
		int i = 0;
		int q = 0;
		int highestcount = 0;
		
		while(listOfStudents[i]!=null){
			
			while(listOfStudents[q]!=null){
				if(!(listOfStudents[i].lessThan(listOfStudents[q]))) break;
				else highestcount = i;
				
				q++;
			}
			i++;
		}
		return listOfStudents[highestcount];
		
	}

}
