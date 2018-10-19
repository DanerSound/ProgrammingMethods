package base;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class DivisionTest {

	@Test
	public void divCorrectnessPositiveInputs() {
		BinaryExpression div = new Division(4, 2);
		assertEquals(2, div.getValutation());	
	}
	
	@Test
	public void divCorrectnessLeftGreaterRight(){
		BinaryExpression div = new Division(2,4);
		assertEquals(0, div.getValutation());	
	}
	
	@Test
	public void divCorrectnessNegativeInputs() {
		BinaryExpression div = new Division(-4,-2);
		assertEquals(2, div.getValutation());
	}
	
	@Test
	public void divCorrectnessLeftGreaterRightNegative(){
		BinaryExpression div = new Division(-2,-4);
		assertEquals(0, div.getValutation());	
	}
	
	@Test
	public void divCorrectnessMixedInputs() {
		BinaryExpression div = new Division(-4,2);
		assertEquals(-2, div.getValutation());
	}
	
}
