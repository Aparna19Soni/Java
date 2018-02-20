package javafundamental.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> mapExp = new HashMap();
		mapExp.put("1", "Soni");
		mapExp.put("2", "Shali");
		mapExp.put("3", "Jahnavi");
		mapExp.put("1", "Aparna");
		mapExp.put(null, null);// map will null ask q?
		//System.out.println(mapExp);
		for (Map.Entry m : mapExp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());//to retrive the key one by one.

		}

	}
}
