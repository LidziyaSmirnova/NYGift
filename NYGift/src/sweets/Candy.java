package sweets;

public class Candy extends Sweets {

	private String type;
	private String producer;
	
	public Candy(String name, double weight, double price, String type, String producer) {
		super(name, weight, price);
		this.type = type;
		this.producer = producer;
	}

    public String getType() {
    	return type;
    }
    
    public String getProducer() {
    	return producer;
    }

	@Override
	public void print() {
		System.out.println ("Candy: "+getName()+", "+getWeight()+" гр, "+getPrice()+" руб, "+getType()+", производитель "+getProducer());
	}
}