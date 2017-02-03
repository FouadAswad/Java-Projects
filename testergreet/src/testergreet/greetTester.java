package testergreet;

public class greetTester {
	public static void main(String args[]){
		Object people[] = new Object[4]; // create an array to save 4 objects
		String greeting;
		
		
		people[0] = new Canadian("Mary");
		people[1] = new German("Johan");
		people[2] = new Indian("Rupa");
		people[3] = new Canadian("John");
		
		for (Object person:people){// iterate for everyone in array people
			if (person instanceof Canadian){ // ugly code!!
				greeting = ((Canadian)person).greet();
				System.out.println(greeting);
			} else if (person instanceof German){
				greeting = ((German)person).greet();
				System.out.println(greeting);
			} else if (person instanceof Indian){
				greeting = ((Indian)person).greet();
				System.out.println(greeting);
			}
		}
	}
	}
