package base;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
	
	public void subtractionCorrectness() {
		BinaryExpression sub = new Subtraction(6,5);
		assertEquals(1, sub.getValutation());
	}

}
