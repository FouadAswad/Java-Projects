

import assignment3.MyDate;
import assignment3.Name;

public class NewWorker extends Person {
	private static int howManyWorkers = 0;
	private static int workerNumber = 1;
	public int permworkernum;
	MyDate dateJoiningCompany;
	private double salary ;
	NewWorker Supervisor;
	
	public NewWorker(String name, String datejoined, double Salary){
		
		super(name);
		
		dateJoiningCompany = new MyDate(datejoined);
		this.salary = Salary;
		howManyWorkers++;
		permworkernum = workerNumber;
		workerNumber++;
	}
	
	public NewWorker(String name, String datejoined){
		
		super(name);
		this.salary = 0.0;
		dateJoiningCompany = new MyDate(datejoined);
		permworkernum = workerNumber;
		howManyWorkers++;
		workerNumber++;
	}
	
	public void setSupervisor(NewWorker ob2){
		this.Supervisor = ob2;
	}
	
	public void heyyou(){
		System.out.println(Supervisor.toString());
	}
	
	public String toString() {
		String info = "Worker Number: " + this.permworkernum + " " + this.getName() + "\n" + "Joined the company on: " + dateJoiningCompany.toString();
		
		
		
		if(Supervisor == null){
			info = info + " has no supervisor" +"\nSalary: "+ salary;
		}else{
			info = info + "\nName of supervisor: " + getSupervisorName() +"\nSalary: "+ salary;
		}
		return info;
	}
	
	public String getSupervisorName(){
		if(Supervisor!=null) return Supervisor.getName();
		else return "";
	}
	
	public double getSalary(){
		return this.salary;
	}
	public void setSalary(double newsalary){
		this.salary = newsalary;
	}
	
	public static int getHowManyWorkers(){
		return howManyWorkers;
	}
}
