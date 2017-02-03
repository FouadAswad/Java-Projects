package assignment3;
import java.util.StringTokenizer;

public class Name {
	private String firstName, middleName, lastName;
	
	public Name(String inputname){
		StringTokenizer mytokenizer = new StringTokenizer(inputname);
		if(mytokenizer.countTokens() == 3){
			firstName = mytokenizer.nextToken();
			middleName = mytokenizer.nextToken();
			lastName = mytokenizer.nextToken();
		}else{
			firstName = mytokenizer.nextToken();
			lastName = mytokenizer.nextToken();
			middleName = null;
		}
	}
	
	public String firstname(){
		return this.firstName;
	}
	public String middlename(){
		return this.middleName;
	}
	public String lastname(){
		return this.lastName;
	}
	
	public Name(Name copy){
		this.firstName = copy.firstname();
		this.middleName = copy.middlename();
		this.lastName = copy.lastname();
	}
	
	public void setName(String firstname, String middlename, String lastname){
		this.firstName = firstname;
		this.middleName = middlename;
		this.lastName = lastname;
	}
	
	public String toString(){
		String formattedname;
		if(middleName!= null){
			formattedname = lastName + ", " + firstName + " " + middleName.substring(0,1)+ ".";
		}else{
			formattedname = lastName + ", " + firstName;
		}
		
		
		return formattedname;
	}
	
}
