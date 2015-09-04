package Inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingChar {

	@Test
	public void test() {
		
		JunitTesting test = new JunitTesting();
	     
		int result = test.countA("Baba");
		
		assertEquals(2, result);
		
		
	}

}
