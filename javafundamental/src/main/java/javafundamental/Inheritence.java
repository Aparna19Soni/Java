package javafundamental;

public class Inheritence {
	int seat = 150;
	int passenger = 1;
	public void addOnePassenger()
	{
		if(hasSeat())
		
			passenger+=1;
			else
				handleTooMany();
		
	}
	private boolean hasSeat()
	{
		return passenger > seat;
	}
	private String handleTooMany()
	{
		return "Many Passengers";
	}

}
