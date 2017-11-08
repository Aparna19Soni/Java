package javafundamental;

public class Flight {

	private int passenger=10;
	private int seat =40;
	
	public boolean hasRoom(Flight f2)
	{
		int total = passenger + f2.passenger;
		return total <= seat; 
	}
	public Flight createNewFlight(Flight f2)
	{
		Flight newFlight = new Flight();
		newFlight.seat=seat;
		newFlight.passenger = passenger + f2.passenger;
		return newFlight;
		
	}
	public static void main(String[] args) {
		Flight f11 = new Flight();
		Flight f12 = new Flight();
		Flight f13;
		if(f11.hasRoom(f12))
		{
			f13 = f11.createNewFlight(f12);
			System.out.println(f13.passenger);
		}
	}
}
