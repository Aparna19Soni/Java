package javafundamental.collections;

public class EqualMethodTest {

	String Key;
	String value;
	
	public static void main(String[] args) {
		EqualMethodTest t = new EqualMethodTest(Key, value);
	}
	
	private EqualMethodTest(String key, String value) {
		
		Key = key;
		this.value = value;
	}
	
	
}
