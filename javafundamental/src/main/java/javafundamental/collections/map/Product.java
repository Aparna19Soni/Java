package javafundamental.collections.map;

public class Product {
	private final int id;
	private final String name;
	private final int weight;
	
	public Product(String name, int weight,int id) {
		this.name = name;
		this.weight = weight;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	
	
	
}
