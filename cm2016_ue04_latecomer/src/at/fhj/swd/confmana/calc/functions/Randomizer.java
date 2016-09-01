package at.fhj.swd.confmana.calc.functions;

/**
 * Randomizer is a class to generate a random number
 * between lower and upper bounds.
 * @author cschindler
 *
 */
public class Randomizer {
	
	private double lastRandomNumber = 0;

	public double rand(int lowerBound, int upperBound){
		
		if (lowerBound > upperBound){
			int temp = lowerBound;
			lowerBound = upperBound;
			upperBound = temp;
		} 
		
		// insert meaningful code here and adopt dummy return
		return 0;
	}

	public double getLastRandomNumber() {
		return lastRandomNumber;
	}
}
