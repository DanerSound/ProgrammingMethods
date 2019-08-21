package composite.exampleTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import composite.example.BinaryExpression;
import composite.example.Subtraction;

public class SubtractionTest {
	
	@Test
	public void subtractionCorrectness() {
		BinaryExpression sub = new Subtraction(6,5);
		assertEquals(1, sub.getValutation());
	}
}
