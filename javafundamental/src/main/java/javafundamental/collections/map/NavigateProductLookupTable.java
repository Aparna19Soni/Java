package javafundamental.collections.map;

import java.util.ArrayList;
import java.util.List;

import javafundamental.collections.map.Product;

public class NavigateProductLookupTable implements ProductLookupTable {
	private List<Product> ps = new ArrayList<Product>();

	public Product lookupById(int id) {
		for(Product product : ps)
		{
			if(product.getId()==id)
			{
				return product;
			}
		}
		return null;
	}

	public void addProduct(Product productToAdd) {
		for(Product product : ps)
		{
			if(product.getId() == productToAdd.getId())
			{
				throw new IllegalArgumentException("Unable to Add product"+productToAdd);
			}
		}
		ps.add(productToAdd);
		
	}

	public void clear() {
		ps.clear();
		
	}

	

	
}
