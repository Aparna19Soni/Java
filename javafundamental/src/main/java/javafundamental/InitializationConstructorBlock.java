package javafundamental;

/**
 * 
 * @author Aparna:below code shows the order of belocks.
 * 1.Field Initialization
 * 2.Initialization block
 * 3.constructer block
 *
 */
public class InitializationConstructorBlock {
	private int theField = 1;//field initialization
	
	public int getTheField() {
		return theField;
	}

	public InitializationConstructorBlock()
	{
		//custructor block
		theField = 3;
	}
	
	{
		//Initialization block
		theField = 2;
	}

	public static void main(String[] args) {
		InitializationConstructorBlock ib = new InitializationConstructorBlock();
		System.out.println("Field is:" +ib.getTheField());
	}

}
