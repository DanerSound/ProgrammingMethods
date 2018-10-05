package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ShapeTDDTest {
	
	@Test
	public void positiveParameterArea() {
		int parameter=4;
		assertEquals(16,Square.AreaCalculator(parameter));
	}
	
	@Test
	public void negativeParameterArea() {
		int parameter=-4;
		assertEquals(16,Square.AreaCalculator(parameter));
	}

}
