package base;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
	
	public void MultiplicationCorrectness() {
		
			BinaryExpression mul = new Multipication(6,5);
			assertEquals(30, mul.getValutation());
		}

}
