package javafundamental.collections;

import java.util.ArrayList;

import javafundamental.CargoFlight;

public class ArrayListExample {
	public static void main(String[] args) {
		//String args[] = new String[10];//Array declaration
		ArrayList<String> name=new ArrayList();//Creating arraylist  
		ArrayList<String> name2=new ArrayList();//Creating arraylist  
		name.add("Ravi");//Adding object in arraylist  
		name.add("Aparna");
		for(Object o : name)
		{
			System.out.println(name);
		}
		CargoFlight cr = new CargoFlight();
		name.add(cr.getClass().toString());//As Array List was of type String that is why had to do toString
		name2.addAll(name);
		System.out.println(name.size());
		
	}
}
	 


