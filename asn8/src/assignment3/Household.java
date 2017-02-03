package assignment3;

public class Household {
	Person[] houseMembers;
	private static int totalmems = 0;
	
		Household(){
			houseMembers = new Person[10];
			
		}
	
	public void insertNewHouseholdMember(Person ob2){
		houseMembers[totalmems++] = ob2;
	}
	public String toString(){
		double totincome = 0.0;
		for(int i = 0; i < totalmems; i++){
			totincome = totincome + houseMembers[i].getSalary();
		}
		String hey = "\n";
		for(int i = 0; i < totalmems; i++){
			hey = hey +"\n"+ houseMembers[i].toString();
		}
		return "Total family income: " + totincome + hey;
	}
	
}
