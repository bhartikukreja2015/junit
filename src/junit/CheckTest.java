package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckTest {

	int arr[]= {-1,-2,-3,-4,-5,-6};
	@Test
	public void testFindLarge() 
	{

		assertEquals(-1, Check.findLarge(arr));
	}

}
