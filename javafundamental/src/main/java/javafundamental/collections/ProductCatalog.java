package javafundamental.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalog implements Iterable<Product> {
private  Set<String> expSet=new HashSet();;
public static void main(String[] args) {
	ProductCatalog pc = new ProductCatalog();
	pc.addValue();
	pc.iterator();
}

public void addValue()
{
	
	expSet.add("Aparna");
	expSet.add("Soni");
	expSet.add("Mishra");
	expSet.add("Soni");//here same elemnt is added in set
	
}
	public Iterator<Product> iterator() {
		 Iterator<String> itr=expSet.iterator();  
		 while(itr.hasNext())
		System.out.println(itr.next());//here set will return only unique element.
		return null;
	}
	

}
