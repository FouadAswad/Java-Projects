package assignment3;
public class Person {
	private Name personName;
	Person spouse;
	private double salary = 0.0;
	
	
	
	public Person(String fullName){
		personName = new Name(fullName);
		
	}
	
	public String getName(){
		return personName.toString();
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSpouse(Person spouse){
		this.spouse = spouse;
		spouse.spouse = this;
	}
	
	public double getFamilyIncome() {
        if(spouse!=null) {
            return this.getSalary() + spouse.getSalary();
        }
        else{
        	return this.getSalary();
        }
    }
	
	
	public String toString(){
		
		
		if(spouse == null){
			return "Name is " + personName.toString();
		}else{
			return "Name is " + personName.toString() + ", Married to " + spouse.personName.toString();
		}
	}
}
