package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayCheckTest {

	int arr1[]={1,2,3,4,5,6};
	int arr2[]={6,1,2,3,4,5};
	int arr3[]={6,7,9,2,3,4,5};
	@Test
	public void testRotate() 
	{
	assertArrayEquals(arr2, ArrayCheck.rotate(arr1));	
	}

		@Test
	public void testMedian() 
	{
		assertEquals(3.5, ArrayCheck.median(arr1),0.0001);
		assertEquals(5, ArrayCheck.median(arr3),0.0001);
	}

}
