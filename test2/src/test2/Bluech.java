package test2;

public class Bluech implements Sortable{
	
	public int[] Sort(int a[]){
		int[] b = new int[a.length];
		int temp, max;
		
		for(int i = 0; i < a.length; i++){
			max = a[i];
			for(int q=i+1; q<a.length;q++){
				
			}
		}
		
		return a;
	}
	
	public static void main(String args[]){
		int[] a = {1,2,3,4,5,6};
		
		Bluech hey = new Bluech();
		int[] b = hey.Sort(a);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
