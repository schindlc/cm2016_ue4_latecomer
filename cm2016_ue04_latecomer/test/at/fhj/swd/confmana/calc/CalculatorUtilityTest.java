/**
 * 
 */
package at.fhj.swd.confmana.calc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author cschindler
 *
 */
public class CalculatorUtilityTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#add(double, double)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(0.0d, CalculatorUtility.add(0d, 0d), 0.0001);
		assertEquals(0.0d, CalculatorUtility.add(-1d, 1d), 0.0001);
		assertEquals(1.0d, CalculatorUtility.add(1d, 0d), 0.0001);
		assertEquals(1.3d, CalculatorUtility.add(-1.5d, 2.8d), 0.0001);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#sub(double, double)}.
	 */
	@Test
	public void testSub() {
		assertEquals(0.0d, CalculatorUtility.sub(0d, 0d), 0.0001);
		assertEquals(0.0d, CalculatorUtility.sub(-1d, -1d), 0.0001);
		assertEquals(1.3d, CalculatorUtility.sub(2.0d, 0.7d), 0.0001);
		assertEquals(0.0d, CalculatorUtility.sub(2.3d, 2.30001d), 0.0001);
		assertEquals(4.38d, CalculatorUtility.sub(1.5d, -2.880d), 0.0001);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#mul(double, double)}.
	 */
	@Test
	public void testMul() {
		assertEquals(0.0, CalculatorUtility.mul(0.0d, 1.0), 0.0001);
		assertEquals(1.0, CalculatorUtility.mul(1.0d, 1.0), 0.0001);
		assertEquals(-1.0, CalculatorUtility.mul(-1.0d, 1.0), 0.0001);
		assertEquals(-1.0, CalculatorUtility.mul(1.0d, -1.0), 0.0001);
		assertEquals(4.0, CalculatorUtility.mul(2.0d, 2.0), 0.0001);
		assertEquals(-4.0, CalculatorUtility.mul(2.0d, -2.0), 0.0001);
		assertEquals(4.0, CalculatorUtility.mul(8.0d, 0.5), 0.0001);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#div(double, double)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDivByZero() {
		CalculatorUtility.div(1.2d, 0.0d);
		
	}
	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#div(double, double)}.
	 */
	@Test
	public void testDiv() {
		assertEquals(1.0d, CalculatorUtility.div(12.3743d,12.3743),0.0001d);
		assertEquals(-12.3743d, CalculatorUtility.div(12.3743d,-1.0d),0.0001d);
		assertEquals(2.0d,CalculatorUtility.div(1.2d, 0.6d), 0.0001d);
		assertEquals(4.0d,CalculatorUtility.div(2.0d, 0.5d), 0.0001);
	}
	

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#pow2(double)}.
	 */
	@Test
	public void testPow2() {
		assertEquals(1.0d, CalculatorUtility.pow2(1.0),0.0001d);
		assertEquals(0.0d, CalculatorUtility.pow2(0.0),0.0001d);
		assertEquals(1.0d, CalculatorUtility.pow2(-1.0),0.0001d);
		assertEquals(0.25d, CalculatorUtility.pow2(0.5),0.0001d);
	}


	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#sqrt(double)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSqrtNeg() {
		CalculatorUtility.sqrt(-1.0);
	}
	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#sqrt(double)}.
	 */
	@Test
	public void testSqrt() {
		assertEquals(1.0d, CalculatorUtility.sqrt(1.0),0.0001d);
		assertEquals(0.0d, CalculatorUtility.sqrt(0.0),0.0001d);
		assertEquals(0.7071d, CalculatorUtility.sqrt(0.5),0.0001d);
	}

	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#powN(double, double)}.
	 */
	@Test
	public void testPowN() {
		assertEquals(1.0d, CalculatorUtility.powN(4711d,0.0d),0.0001d);
		assertEquals(4711.0d, CalculatorUtility.powN(4711d,1.0d),0.0001d);
		assertEquals(9.0d, CalculatorUtility.powN(3.0d,2.0d),0.0001d);
		assertEquals(27.0d, CalculatorUtility.powN(3.0d,3.0d),0.0001d);
		assertEquals(3.0d, CalculatorUtility.powN(9.0d,0.5d),0.0001d);
		assertEquals(3.0d, CalculatorUtility.powN(27d,1/3.0d),0.0001d);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#rtN(double, double)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testRtNIllegal() {
		CalculatorUtility.rtN(-1, 2);
	}

	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#rtN(double, double)}.
	 */
	@Test
	public void testRtN() {
		assertEquals(1.0d,CalculatorUtility.rtN(1.0d, 3),0.0001);
		assertEquals(3.0d,CalculatorUtility.rtN(27d, 3),0.0001);
		assertEquals(0.3333d,CalculatorUtility.rtN(27d, -3),0.0001);
		assertEquals(9.0d,CalculatorUtility.rtN(3.0d, 0.5),0.0001);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#sin(double)}.
	 */
	@Test
	public void testSin() {
		assertEquals(0d,CalculatorUtility.sin(0d),0.0001);
		assertEquals(1d,CalculatorUtility.sin(Math.PI/2),0.0001);
		assertEquals(-1d,CalculatorUtility.sin(3*Math.PI/2),0.0001);
		assertEquals(0d,CalculatorUtility.sin(Math.PI),0.0001);
		assertEquals(0.7071d,CalculatorUtility.sin(Math.PI/4),0.0001);
		assertEquals(0.7071d,CalculatorUtility.sin(3*Math.PI/4),0.0001);
		assertEquals(-0.7071d,CalculatorUtility.sin(5*Math.PI/4),0.0001);
		assertEquals(-0.7071d,CalculatorUtility.sin(7*Math.PI/4),0.0001);
	}
	

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#cos(double)}.
	 */
	@Test
	public void testCos() {
		assertEquals(1d,CalculatorUtility.cos(0d),0.0001);
		assertEquals(0d,CalculatorUtility.cos(Math.PI/2),0.0001);
		assertEquals(0d,CalculatorUtility.cos(3*Math.PI/2),0.0001);
		assertEquals(-1d,CalculatorUtility.cos(Math.PI),0.0001);
		assertEquals(0.7071d,CalculatorUtility.cos(Math.PI/4),0.0001);
		assertEquals(-0.7071d,CalculatorUtility.cos(3*Math.PI/4),0.0001);
		assertEquals(-0.7071d,CalculatorUtility.cos(5*Math.PI/4),0.0001);
		assertEquals(0.7071d,CalculatorUtility.cos(7*Math.PI/4),0.0001);
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#numToString(double)}.
	 */
	@Test
	public void testNumToString() {
		assertTrue(CalculatorUtility.numToString(4711).contains("4711"));
		assertTrue(CalculatorUtility.numToString(-4711).contains("-4711"));
	}

	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#numToInt(double)}.
	 */
	@Test
	public void testNumToInt() {
		assertEquals(4711, CalculatorUtility.numToInt(4711.45347979d));
		assertEquals(-4711,CalculatorUtility.numToInt(-4711.123712893));
	}
	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#randomize(double,double)}.
	 */
	@Test
	public void testRandomize() {
		int lb = 12;
		int ub = 14;
		double randomNum = CalculatorUtility.randomize(lb, ub);
		double offset = Math.abs(ub-lb)*CalculatorUtility.getLastRandomNumber();
		assertEquals(lb+offset,randomNum, 0.00000000001d);

		lb = 20;
		ub = 5;
		randomNum = CalculatorUtility.randomize(lb, ub);
		offset = Math.abs(ub-lb)*CalculatorUtility.getLastRandomNumber();
		assertEquals(ub+offset,randomNum, 0.00000000001d);
		
	}
	
	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#intRotateRight(int)}.
	 */
	@Test
	public void testIntRotateRight() {
		assertEquals(1471, CalculatorUtility.intRotateRight(4711));
		assertEquals(1147, CalculatorUtility.intRotateRight(1471));
		assertEquals(7114, CalculatorUtility.intRotateRight(1147));
		assertEquals(4711, CalculatorUtility.intRotateRight(7114));
		
		// rotate negative ints as well
		assertEquals(-1471, CalculatorUtility.intRotateRight(-4711));
		assertEquals(-1147, CalculatorUtility.intRotateRight(-1471));
		assertEquals(-7114, CalculatorUtility.intRotateRight(-1147));
		assertEquals(-4711, CalculatorUtility.intRotateRight(-7114));
		
	}
	
	/**
	 * Test method for
	 * {@link at.fhj.swd.confmana.calc.CalculatorUtility#intRotateLeft(int)}.
	 */
	@Test
	public void testIntRotateLeft() {
		assertEquals(7114, CalculatorUtility.intRotateLeft(4711));
		assertEquals(1147, CalculatorUtility.intRotateLeft(7114));
		assertEquals(1471, CalculatorUtility.intRotateLeft(1147));
		assertEquals(4711, CalculatorUtility.intRotateLeft(1471));
		
		// rotate negative ints as well
		assertEquals(-7114, CalculatorUtility.intRotateLeft(-4711));
		assertEquals(-1147, CalculatorUtility.intRotateLeft(-7114));
		assertEquals(-1471, CalculatorUtility.intRotateLeft(-1147));
		assertEquals(-4711, CalculatorUtility.intRotateLeft(-1471));
		
	}
	
}
