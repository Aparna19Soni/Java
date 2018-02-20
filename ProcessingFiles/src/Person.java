
public class Person {
	Car c1;
	public static void main(String[] args) {
		Person p1 = new Person();
		/*p1.c1= new Car();
		p1.c1.setModel("2017");
		p1.c1.setName("BMW");*/
		p1.set();
		p1.fetch();
		System.out.println("Moel is"+p1.c1.getModel());
	}
	public void set()
	{
		c1= new Car();
		c1.setModel("2017");
		c1.setName("BMW");
	}
	
	public void fetch()
	{
		System.out.println("Moel is"+c1.getModel());
		System.out.println("Name is "+c1.getName());
	}

}
