package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumTest {

	@Test
	public void sumCorrectness() {
		BinaryExpression sum= new Sum(3, 5);
		assertEquals(8, sum.getValutation());
	}
}
