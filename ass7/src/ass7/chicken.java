package ass7;

public class chicken extends MeatOrFish{
	private double amountBought;
	private double fatContent = 5.0;
	private static double onHandAmount = 1000.0;
	private double price = 15.5;
	
	public chicken(double amountBought){
		this.amountBought = amountBought;
		onHandAmount = onHandAmount - amountBought;
		
	}
	
	public chicken(){
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
		return "chicken - quantity available = " + getQuantity()+"\n";
	}
}
