
public class Test {
	public static void main(String a[]){
			int result[];
			result = extractValidNumbers(a);
			for (int i = 0; i < result.length; i++){
				System.out.println("result[" + i + "] =" + result[i]);
			}
		}
	
	private static int[] extractValidNumbers(String[] a){
		int cntr2 = 0;
		for(int i =0; i < a.length; i++){
			if(a[i].matches("[0-9]+|\\+[0-9]+|\\-[0-9]+")) cntr2++;
		}
		
		int[] validnum = new int[cntr2];
		
		int cntr =0;
		for(int i =0; i < a.length; i++){
			if(a[i].matches("[0-9]+") | a[i].matches("\\+[0-9]+|\\-[0-9]+")){
				if(a[i].matches("[0-9]+")){
					validnum[cntr] = Integer.parseInt(a[i]);
					cntr++;
					continue;
				}else if(a[i].matches("\\+[0-9]+")){
					validnum[cntr] = Integer.parseInt(a[i].substring(1));
					cntr++;
					continue;
				}else if(a[i].matches("\\-[0-9]+")){
					validnum[cntr] = Integer.parseInt(a[i].substring(1)) * -1;
					cntr++;
					continue;
				}
			}else{continue;}
		}
		return validnum;
	}
}