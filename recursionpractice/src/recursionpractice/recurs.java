package recursionpractice;

public class recurs {
	public int willitblend(int num){
		if(num==0) return 1;
		if(num==1) return 1;
		else return num*willitblend(num-1);
	}
}
