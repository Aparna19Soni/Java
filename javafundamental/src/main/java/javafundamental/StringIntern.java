package javafundamental;
/**
 * intern is used when larger string in compared to make cost less
 * @author Aparna
 *
 */
public class StringIntern {
	public static void main(String[] args) {
		String s1 = "I Love";
		s1 += " Java";
		String s2 = "I";
		s2 += " Love Java";
		if (s1 == s2) {
			System.out.println("s1 and s2 are equal by ==");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 are equal by equal method");
		}

		String s3 = s1.intern();
		String s4 = s2.intern();
		if (s3 == s4) {

			System.out.println("s3 and s4 are equal by intern");
		}
	}

}
