package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
	
	@Test
	public void positiveInput(){
		assertFactorial(3, 6);
	}
	@Test
	public void negativeInput() {
		assertFactorial(-3, 0);
	}
	@Test
	public void zeroInput() {
		assertFactorial(0, 1);
	}
	private void assertFactorial(int input, int expected) {
		assertEquals(expected, Factorial.fact(input));
	}
	

}