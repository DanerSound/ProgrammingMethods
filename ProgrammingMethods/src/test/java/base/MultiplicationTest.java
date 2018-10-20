package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void MultionCorrectness() {
		BinaryExpression mul = new Multipication(6, 5);
		assertEquals(30, mul.getValutation());
	}

	@Test
	public void MultiCorrectnessZeroInputsLeft() {
		BinaryExpression mul = new Multipication(0, 5);
		assertEquals(0, mul.getValutation());
	}
	
	@Test
	public void MultiCorrectnessZeroInputsRight() {
		BinaryExpression mul = new Multipication(5,0);
		assertEquals(0, mul.getValutation());
	}

}
