package sweets;

public class Zephyr extends Sweets {

	private String type;
	private int number;
	
	public Zephyr(String name, double weight, double price, String type, int number) {
		super(name, weight, price);
		this.type = type;
		this.number = number;
	}

    public String getType() {
    	return type;
    }
    
    public int getNumber() {
    	return number;
    }
    public void print() {
		System.out.println ("Zephyr: "+getName()+" , "+getWeight()+" гр, "+getPrice()+" руб, "+getType()+", "+getNumber()+" шт");
	}
}