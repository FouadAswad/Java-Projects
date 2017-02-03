package ass6;

public class Student {
	private static int studentnum = 1;
	private int actualstudentnum;
	private String studentName;
	private int numberOfCoursesTaken = 0;
	
	 Student(String studentName, int numberOfCoursesTaken){
		 this.studentName = studentName;
		 this.numberOfCoursesTaken = numberOfCoursesTaken;
		 actualstudentnum = studentnum++;
		 
	 }
	 
	 public int getAmountOfCourses(){
		 return this.numberOfCoursesTaken;
	 }

	 Student(String studentName){
		 this.studentName = studentName;
		 this.numberOfCoursesTaken = 5;
		 actualstudentnum = studentnum++;
	 }
	 
	 public double computeFees(){
		 if(numberOfCoursesTaken >= 4){
			 return 800.0;
		 }else{
			 return numberOfCoursesTaken*200.0;
		 }
	 }
	 
	 public String findCountry(){
		 return "Canada";
	 }
	 public String toString(){
		 return "Student #:" + actualstudentnum + ", Name: " + studentName + " is from " + findCountry() + "; pays fees $" + computeFees();
	 }
	 
	 public String getName(){
		 return this.studentName;
	 }
	 
	 public int valueLexi(){
		 return Character.getNumericValue(getName().charAt(0));
	 }
	 
	 
	 
	public boolean lessThan(Student anotherStudent){
		 if(anotherStudent instanceof ForeignStudent) return false;
		 if(anotherStudent instanceof SeniorStudent) return false;
		 if(anotherStudent.findCountry() == "Canada" && !(anotherStudent instanceof SeniorStudent)){
			 if(anotherStudent.valueLexi() > this.valueLexi()) return true;
			 else return false;
		 }else return true;
	 }
	 
	 
}
