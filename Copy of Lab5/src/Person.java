import assignment3.Name;

public class Person {
	private Name personName;
	Person spouse;
	
	
	
	public Person(String fullName){
		personName = new Name(fullName);
		
	}
	
	public String getName(){
		return personName.toString();
	}
	
	public void setSpouse(Person spouse){
		this.spouse = spouse;
		spouse.spouse = this;
	}
	
	public double getFamilyIncome() {
        if(this instanceof NewWorker) {
            if(this.spouse == null){
                return ((NewWorker)this).getSalary();
            }
            else {
                return ((NewWorker)this).getSalary() + ((NewWorker)this.spouse).getSalary();
            }
        }
        if(this instanceof Person){
        	return ((NewWorker)this.spouse).getSalary();
        }
        return 0.0f;
    }
	
	
	public String toString(){
		
		
		if(spouse == null){
			return "Name is " + personName.toString();
		}else{
			return "Name is " + personName.toString() + ", Married to " + spouse.personName.toString();
		}
	}
}
