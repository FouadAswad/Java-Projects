package assignment3;


public class Worker {
	private static int howManyWorkers = 0;
	private static int workerNumber = 1;
	private int permworkernum;
	Name workerName;
	MyDate dateJoiningCompany;
	private double salary ;
	Worker Supervisor;
	
	public Worker(String name, String datejoined, double Salary){
		dateJoiningCompany = new MyDate(datejoined);
		workerName = new Name(name);
		this.salary = Salary;
		howManyWorkers++;
		permworkernum = workerNumber;
		workerNumber++;
	}
	
	public Worker(String name, String datejoined){
		this.salary = 0.0;
		workerName = new Name(name);
		dateJoiningCompany = new MyDate(datejoined);
		permworkernum = workerNumber;
		howManyWorkers++;
		workerNumber++;
	}
	
	public void setSupervisor(Worker ob2){
		Supervisor = ob2;
	}
	
	
	public String toString(){
		String info = "Worker Number: " + this.permworkernum + " " + workerName.toString() + "\n" + "Joined the company on: " + dateJoiningCompany.toString();
		if(Supervisor == null){
			info = info + " has no supervisor" +"\nSalary: "+ salary;
		}else{
			info = info + "\nName of supervisor: " + Supervisor.workerName.toString()+"\nSalary: "+ salary;
		}
		return info;
	}
	
	public String getSupervisorName(){
		return  Supervisor.workerName.toString();
	}
	
	public void setSalary(double newsalary){
		this.salary = newsalary;
	}
	
	public static int getHowManyWorkers(){
		return howManyWorkers;
	}
}
