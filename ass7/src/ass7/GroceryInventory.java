package ass7;
import java.util.StringTokenizer;

public class GroceryInventory {
	public static void main(String args[]){
		
		Food[] items = new Food[5];
		
		String customerline = "apple:3.5,orange:3.5,rice:3.5,chicken:5.5,bread:50.0";
		
		StringTokenizer myTokenizer = new StringTokenizer(customerline, " ,:");
		
		String[] className = new String[5];
		
		double para[] = new double[5];
		
		
			className[0] = myTokenizer.nextToken();
			para[0] = Double.parseDouble(myTokenizer.nextToken());
			className[1] = myTokenizer.nextToken();
			para[1] = Double.parseDouble(myTokenizer.nextToken());
			className[2] = myTokenizer.nextToken();
			para[2] = Double.parseDouble(myTokenizer.nextToken());
			className[3] = myTokenizer.nextToken();
			para[3] = Double.parseDouble(myTokenizer.nextToken());
			className[4] = myTokenizer.nextToken();
			para[4] = Double.parseDouble(myTokenizer.nextToken());
		
		int cntr = 0;
		int cntr2 = 0;
		System.out.println("Store has ");
		for(int i = 0; i < className.length; i++){
			
			if(className[i].matches("apple")){
				items[cntr2] = new apple();
				items[cntr2] = new apple(para[cntr]);
				cntr++;
				cntr2++;
			}
			if(className[i].matches("orange")){
				items[cntr2] = new orange();
				items[cntr2] = new orange(para[cntr]);
				cntr++;
				cntr2++;
			}
			if(className[i].matches("bread")){
				items[cntr2] = new bread();
				items[cntr2] = new bread(para[cntr]);
				cntr++;
				cntr2++;
			}
			if(className[i].matches("chicken")){
				items[cntr2] = new chicken();
				items[cntr2] = new chicken(para[cntr]);
				cntr++;
				cntr2++;
			}
			if(className[i].matches("rice")){
				items[cntr2] = new rice();
				items[cntr2] = new rice(para[cntr]);
				cntr++;
				cntr2++;
			}
			
		}
		
		System.out.println("\nAfter purchasing " + customerline);
		
		System.out.println("\nStore now has");
		
		for(int q = 0; q < items.length; q++){
			System.out.print(items[q].toString());
		}
		
	}
}
