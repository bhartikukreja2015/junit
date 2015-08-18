package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	
	
	@Test
	public void testAdd() 
	{
		Calculator cRef=new Calculator();
		assertEquals(10, cRef.add(4,6));
		
	}

	@Test
	public void testSub() 
	{
		Calculator cRef=new Calculator();
		assertEquals(10, cRef.sub(1,6));
	}

	@Test
	public void testMul() 
	{
		Calculator cRef=new Calculator();
		assertEquals(10, cRef.mul(1,6));
	}

	
}
