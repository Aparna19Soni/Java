package javafundamental.interfaceCode;

public class InterfaceImpl implements JavaInterface,JavaInterface1 {
	public static void main(String[] args) {
		
		JavaInterface1 we = new InterfaceImpl();
		System.out.println("Value is:"+we.x);
		System.out.println(JavaInterface.x);
		System.out.println(JavaInterface1.x);
		
	}

	public void add() {
		
		
	}

	public void add(int x) {
		// TODO Auto-generated method stub
		
	}

	public int sub() {//here we are getting error as we had  method with same name and have diffrent return type.
		
		return 0;
	}

	

	
}
