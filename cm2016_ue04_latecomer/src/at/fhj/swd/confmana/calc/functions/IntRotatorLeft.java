package at.fhj.swd.confmana.calc.functions;

/**
 * rotates the given int digit-wise to the LEFT but ignores the sign
 * e.g., -4711 will become -7114
 * 
 * @author cschindler
 *
 */
public class IntRotatorLeft {
	public int intRotateLeft(int number) {
		boolean negative = (number < 0) ? true : false;

		StringBuffer sb = new StringBuffer().append(Math.abs(number));

		char firstChar = sb.charAt(0);
		
		// insert meaningful code here and adopt dummy return
		return 0;
	}
}
