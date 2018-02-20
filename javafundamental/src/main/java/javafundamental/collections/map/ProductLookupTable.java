package javafundamental.collections.map;

import javafundamental.collections.map.Product;

public interface ProductLookupTable {
	
	Product lookupById(int id);
	void addProduct(Product productToAdd);
	void clear();
}
