package javafundamental;
/**
 * 
 * @author Aparna
 *Here seat field is present in both Inheritence and CargoFlight Class
 *So field work with refrence type(left side of =) but method works with (right side of =)new object
 *Field hides base class fields with same name but methods overrides base class method with same signature.
 */
public class CargoFlight extends Inheritence {
	int seat = 12;

	public static void main(String[] args) {
		Inheritence in = new Inheritence();//150
		System.out.println(in.seat);
		
		CargoFlight Cg = new CargoFlight();//12
		System.out.println(Cg.seat);
		
		Inheritence Ic = new CargoFlight();//150 v.v.i
		System.out.println(Ic.seat);
	}

}
