package lab7;

import java.util.*;

public class Time implements Addable{
	
		private int hours = 0;
		private int minutes = 0;
		private static int numberOfTimeObjects = 0;
		StringTokenizer myTokens;
		public Time(String timeString){
		/*
		* timeString gives a time period as “n hours m minutes” with any
		* number of spaces in before and after n and m.
		* Examples:
		* " 2 hours 45 minutes "
		* "3 hours 04 minutes"
		* "2 hours 35 minutes "
		*/
		String token;
		myTokens = new StringTokenizer(timeString, " ");
		token = myTokens.nextToken(); // This gives the number of
		 // hours as a string
		hours = Integer.parseInt(token);
		myTokens.nextToken();
		token = myTokens.nextToken(); // This gives the number of
		 // minutes as a string
		minutes = Integer.parseInt(token);
		myTokens.nextToken();
		numberOfTimeObjects++;
		}
		
		public void returntime(){
			System.out.println(this.hours + " " + this.minutes);
		}
		
		public int getHour(){
			return this.hours;
		}
		public int getMin(){
			return this.minutes;
		}
		public String toString(){
		if (minutes < 10){
		return hours + ":0" + minutes ;
		} else {
		return hours + ":" + minutes ;
		}
		}

		
		public Time add(Addable x) {
			int newHour = this.getHour() + ((Time)x).getHour();
			int newMin = this.getMin() + ((Time)x).getMin();
			if(newMin > 60){
				newMin = newMin -60;
				newHour++;
			}
			
			return new Time(newHour + " hours " + newMin + " minutes");
			}
		}
