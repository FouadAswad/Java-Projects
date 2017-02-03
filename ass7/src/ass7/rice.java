package ass7;

public class rice extends Carbohydrates{
	private double amountBought;
	private double sugarContent = 36.0;
	private static double onHandAmount = 1000.0;
	private double price = 2.5;
	
	public rice(double amountBought){
		this.amountBought = amountBought;
		onHandAmount = onHandAmount - amountBought;
		
	}
	
	public rice(){
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
		
		return "rice - quantity available = " + getQuantity()+"\n";
	}
}
