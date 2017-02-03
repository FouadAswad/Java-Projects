package assignment3;

public class lab6Tester {
	public static void main(String[] args){
		NewWorker w1, w2, w3;
		Child c1, c2, c3;
		Household myFamily;
		c1 = new Child("Edward Teller", "Massey");
		c2 = new Child("Liz Powell", "Kennedy");
		c3 = new Child("Tom Porter", "Riverside");

		w1 = new NewWorker("Robert William Hunter", 
				"23/10/2009", 35000.00);
		w2 = new NewWorker("Mary Jane Hull", "06/09/2012");
		w3 = new NewWorker("Liz Mary Hull", "09/12/2014", 20000.00);

		w2.setSalary(40000.00);

		myFamily = new Household();

		myFamily. insertNewHouseholdMember(c1);
		myFamily. insertNewHouseholdMember(c2);
		myFamily. insertNewHouseholdMember(c3);
		myFamily. insertNewHouseholdMember(w1);
		myFamily. insertNewHouseholdMember(w2);
		myFamily. insertNewHouseholdMember(w3);

		w1.setSpouse(w2);
		w2.setSpouse(w1);

		System.out.println("Total income of Robert and Mary "
				+ w1.getFamilyIncome());
		System.out.println("\nDescription of the family is\n "
				+ myFamily);
	}
}
