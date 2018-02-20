package car_dealership;

public class Vehicle {

	private String make;
	private String modle;
	private double price;
	

	public Vehicle(String make, String modle, double price) {
		super();
		this.make = make;
		this.modle = modle;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModle() {
		return modle;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", modle=" + modle + ", price=" + price + "]";
	}

}
