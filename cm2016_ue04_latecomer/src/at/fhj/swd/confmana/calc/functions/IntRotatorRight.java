package at.fhj.swd.confmana.calc.functions;

/**
 * rotates the given int digit-wise to the right 
 * but ignores the sign
 * e.g., -4711 will become -1471
 * @author cschindler
 *
 */
public class IntRotatorRight {
	public int intRotateRight(int number){
		boolean negative = (number<0)? true:false;
		
		StringBuffer sb = new StringBuffer().append(Math.abs(number));
		
		char lastChar = sb.charAt(sb.length()-1);
		// insert meaningful code here and adopt dummy return
		return 0;
	}
}
