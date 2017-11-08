package javafundamental;

public class equals {
	private int flightNumber;
	private int flightClass;

	public static void main(String[] args) {
		equals eq = new equals();
		eq.compare();

		equals eq1 = new equals();
		equals eq2 = new equals();
		if (eq1 == eq2) {
			System.out.println("both objects are equal");
		}  if (eq1.equals(eq2)) {
			System.out.println("both objects are equal");
		} else {
			System.out.println("Not equal");

		}

	}

	public void compare() {
		String a = "Hi";
		String b = "Hi";
		if (a == b) {
			System.out.println("String is equal");
		}
		if (a.equals(b)) {
			System.out.println("String is equal by equal method");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equals other = (equals) obj;
		if (flightClass != other.flightClass)
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}

}
