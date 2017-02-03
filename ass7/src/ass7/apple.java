package ass7;

public class apple extends Fruits{

	private double amountBought;
	private double sugarContent = 16.0;
	private static double onHandAmount = 1000.0;
	private double price = 3.5;
	
	
	public apple(double amountBought){
		this.amountBought = amountBought;
		onHandAmount = onHandAmount - amountBought;
		
	}
	
	public apple(){
		System.out.print(this.toString());
	}
	
	
	@Override
	public double getFat() {
		
		return fatContent*amountBought;
	}

	@Override
	public double getSugar() {
		
		return sugarContent * amountBought;
	}

	@Override
	public double getQuantity() {
		
		return onHandAmount;
	}

	@Override
	public double getPrice() {
		
		return amountBought * price;
	}


	@Override
	public String toString() {
		
		return "apple - quantity available = " + getQuantity()+"\n";
	}

}
