package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadraticEquationSolverTest {

	int a=2;
	int b=4;
	int c=0;
	@Test(expected=NumberFormatException.class)
	public void testRoots() {
	       double root1 = (-b +  (Math.sqrt(b * b - 4 * a * c))) / (2*a) ;
	       double root2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2*a) ;
	   		
	}

}
