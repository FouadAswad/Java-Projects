package midterm2;

import java.util.*;

public class test {
	public static void main(String args[]){
		String[] things = {“jack”,”taco","fried","watermelon"};
		
		List<String> list1 = new <String>ArrayList();
		
		List<String> list2 = new <String>ArrayList();
		String[] morethings = {"fried","warermelon"};
		for(String x:morethings) list2.add(x);
		for(String y:things){
			list1.add(y);
		}
		for(int i = 0; i < list1.size();i++) System.out.println(list1.get(i));
		editlist(list1,list2);
		System.out.println("now");
		for(int i = 0; i < list1.size(); i++){
			System.out.println(list1.get(i));
		}
	}
	
	public static void editlist(Collection<String> l1, Collection<String> l2){
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()){
			if(l2.contains(it.next())){
				it.remove();
			}
			
		}
	}
}
