package at.fhj.swd.confmana.calc;

import at.fhj.swd.confmana.calc.functions.Adder;
import at.fhj.swd.confmana.calc.functions.Cosine;
import at.fhj.swd.confmana.calc.functions.Divider;
import at.fhj.swd.confmana.calc.functions.IntRotatorLeft;
import at.fhj.swd.confmana.calc.functions.IntRotatorRight;
import at.fhj.swd.confmana.calc.functions.Multiplier;
import at.fhj.swd.confmana.calc.functions.NumToInt;
import at.fhj.swd.confmana.calc.functions.NumToString;
import at.fhj.swd.confmana.calc.functions.PowerOfN;
import at.fhj.swd.confmana.calc.functions.PowerOfTwo;
import at.fhj.swd.confmana.calc.functions.Randomizer;
import at.fhj.swd.confmana.calc.functions.RootN;
import at.fhj.swd.confmana.calc.functions.Sine;
import at.fhj.swd.confmana.calc.functions.SquareRoot;
import at.fhj.swd.confmana.calc.functions.Subtractor;

public class CalculatorUtility {

	/**
	 * Functions of calculator
	 * only created on demand.  
	 */
	
	private static Adder adder;
	private static Subtractor subtractor;
	private static Multiplier multiplier;
	private static Divider divider;
	private static PowerOfTwo powerOfTwo;
	private static SquareRoot squareRoot;
	private static PowerOfN powerOfN;
	private static RootN rootN;
	private static Sine sine;
	private static Cosine cosine;
	private static NumToString numToString;
	private static NumToInt numToInt;
	private static Randomizer randomizer;
	private static IntRotatorLeft intRotatorLeft;
	private static IntRotatorRight intRotatorRight;
	
	/**
	 * creates the adder when first called and adds the two parameters 
	 * @param first  first addend 
	 * @param second second addend
	 * @return sum of first and second addend
	 */
	public static double add(double first, double second){
		if (adder == null){
			adder = new Adder();
		}
		return adder.add(first, second);
	}
	
	public static double sub(double first, double second){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double mul(double first, double second){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double div(double first, double second){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double pow2(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double sqrt(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double powN(double first, double power){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double rtN(double first, double root){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double sin(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}

	
	public static double cos(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static String numToString(double first){
		// insert meaningful code here and adopt dummy return
		return null;
	}
	
	public static int numToInt(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double randomize(int lowerBound, int upperBound){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double getLastRandomNumber(){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static int intRotateLeft(int number){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static int intRotateRight(int number){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
}
