package car_dealership;

public class DealerShip {
	public static void main(String[] args) {
		Customer  cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything st.");
		cust1.setCashOnHand(3000000);
		Vehicle vech = new Vehicle("BMW","2017",3000000);
		Employee emp = new Employee();
		emp.setName("Aparna");
		cust1.purchaseCar(vech,emp,false);
		
	}

}
