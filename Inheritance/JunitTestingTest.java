package Inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingTest {

	@Test
	public void test() {
		
		JunitTesting test = new JunitTesting();
		
		int Result = test.sum(5, 16);
		
		assertEquals(21, Result);
	}
	
	

}
