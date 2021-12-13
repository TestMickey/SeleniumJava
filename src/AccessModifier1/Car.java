package AccessModifier1;

public class Car {
	String car;
	public String color;
	protected int price;
	private int licenceNumber;

	public static void main(String[] args) {
		Car c= new Car();
		c.car = "Audi";
		c.color= "Red";
		c.price = 10000;
		c.licenceNumber= 555;
		
		final int i = 10;

	}

}
