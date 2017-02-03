 package assignment3;

import java.util.StringTokenizer;
public class MyDate {
	private int day , month, year;
	
	public MyDate(String date){
		StringTokenizer mytokenizer = new StringTokenizer(date,"/");
		this.day = Integer.parseInt(mytokenizer.nextToken());
		this.month = Integer.parseInt(mytokenizer.nextToken());
		this.year = Integer.parseInt(mytokenizer.nextToken());
		
	}
	String[] montharray = {" ","January", "February", "March", "April","May","June","July","August","September","October","November","December"};
	
	MyDate(MyDate copy){
		this.day = copy.day();
		this.month = copy.month();
		this.year = copy.year();
	}
	
	public String toString(){
		String last2 = String.valueOf(year);
		last2 = last2.substring(2, 4);
		String dateformatted = montharray[month]+" "+day+", '" + last2;
		return dateformatted;
	}

	public int day(){
		return this.day;
	}
	public int month(){
		return this.month;
	}
	public int year(){
		return this.year;
	}
	public boolean lessThan(MyDate ob1){
		if(this.year < ob1.year()){
			return true;
		}else if(this.year == ob1.year() && this.month < ob1.month()){
			return true;
		}else if(this.year == ob1.year() && this.month == ob1.month() && this.day < ob1.day()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean equals(MyDate ob2){
		if(this.day == ob2.day() && this.month == ob2.month() && this.year == ob2.year()){
			return true;
		}else{
			return false;
		}
	}
	
}
