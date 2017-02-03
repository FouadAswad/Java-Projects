package ass7;

public class bread extends Carbohydrates{
	private double amountBought;
	private double sugarContent = 16.0;
	private static double onHandAmount = 1000.0;
	private double price = 0.5;
	
	public bread(double amountBought){
		this.amountBought = amountBought;
		onHandAmount = onHandAmount - amountBought;
		
	}
	
	public bread(){
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
		// TODO Auto-generated method stub
		return "bread - quantity available = " + getQuantity()+"\n";
	}
}
