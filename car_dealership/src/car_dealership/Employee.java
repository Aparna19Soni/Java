package car_dealership;

public class Employee {
	private String name;
	
		public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void handleCustome(Customer cust,boolean finance, Vehicle vehicle)
	{
		if(finance == true)
		{
			double loanAmount = vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		}else if(vehicle.getPrice() <= cust.getCashOnHand())
		{
			processTransaction( cust, vehicle);
		}else
		{
			System.out.println("Custome need  More money");
		}
	}


	private void processTransaction(Customer cust, Vehicle vehicle) {
	System.out.println("Customer has purchased the vehicle "+vehicle+" for price "+vehicle.getPrice());
		
	}


	private void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for custome...");
		System.out.println("Customer has been approved to purchase vehicle");
		
		
	}

}
