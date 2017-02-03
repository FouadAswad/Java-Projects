package ass7;

public class orange extends Fruits{
	private double amountBought;
	private double sugarContent = 55.0;
	private static double onHandAmount = 1000.0;
	private double price = 8.5;
	
	public orange(double amountBought){
		this.amountBought = amountBought;
		onHandAmount = onHandAmount - amountBought;
		
	}
	
	public orange(){
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
		
		return "orange - quantity available = " + getQuantity()+"\n";
	}
}
