package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractionTest {
	
	@Test
	public void subtractionCorrectness() {
		BinaryExpression sub = new Subtraction(6,5);
		assertEquals(1, sub.getValutation());
	}
}
