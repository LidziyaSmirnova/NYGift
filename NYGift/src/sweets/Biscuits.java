package sweets;

public class Biscuits extends Sweets {

	private int number;
		
	public Biscuits(String name, double weight, double price, int number) {
		super(name, weight, price);
		this.number = number;
	}

    public int getNumber() {
    	return number;
    }
    public void print() {
		System.out.println ("Biscuits: "+getName()+", "+getWeight()+" гр, "+getPrice()+" руб, "+getNumber()+" шт");
	}
}