package javafundamental.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConecpt {
	public static void main(String[] args) {
		Product door = new Product("WoddenDoor",35);
		Product floorPanel = new Product("FloorPanel",20);
		Product window = new Product("GlassWindow",35);
		
		Collection<Product> products = new ArrayList<Product>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		//printing all collection element
		//System.out.println(products);
		
		//printing them one at atime
		/*for(Product product : products)
		{
			System.out.println(product);
		}*/
		
		//printing using iterator
		final Iterator<Product> productIterator = products.iterator();
		while(productIterator.hasNext())
		{
			Product product = productIterator.next();
			if(product.getWeight() > 20)
			{
				System.out.println(product);
			}
			else
			{
				productIterator.remove();
			}
		}
		System.out.println(products);
	}

}
