package javafundamental;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {
	public static void main(String[] args) {
		int val = 4;
		int factorial = 1;
		Logger logger = LoggerFactory.getLogger(Factorial.class);
		while (val > 1) {
			factorial *= val;// 4*1,3*4,2*12,1*24
			val = val - 1;

		}
		logger.debug("factorial is {}", factorial);
	}
}
