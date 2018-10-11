package base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryExpressionTest {

	BinaryExpression expression;

	@Before
	public void initExpression() {
		expression = new BinaryExpression(3, 5);
	}

	@Test
	public void sumCorrectness() {
		assertEquals(8, BinaryExpression.getValutation(3, 5));
	}

}
