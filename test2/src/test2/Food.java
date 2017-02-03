package test2;

public abstract class Food {
	private int itemNumber;
	private static int nextItemNumber = 1;
	private static double totalWeightOfAllFruit = 0.0;
	private String itemName;
	private double pricePerKilo;
	public double amountPurchased;
	
	public Food(String itemName, double PricePerKilo, double amountPurchased){
		this.itemName = itemName;
		this.pricePerKilo = PricePerKilo;
		this.amountPurchased = amountPurchased;
	}
}
