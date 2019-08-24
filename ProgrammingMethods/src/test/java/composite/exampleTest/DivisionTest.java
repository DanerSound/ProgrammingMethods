package composite.exampleTest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import composite.example.BinaryExpression;
import composite.example.Division;

public class DivisionTest {

	@Test
	public void divCorrectnessPositiveInputs() {
		BinaryExpression div = new Division(4, 2);
		assertEquals(2, div.getValutation());	
	}
	
	@Test
	public void divCorrectnessRightExpressionZero(){
		BinaryExpression div = new Division(4,0);
		assertEquals(0,div.getValutation());
	}

	@Test
	public void divCorrectnessleftExpressionZero() {
		BinaryExpression div = new Division(0,4);
		assertEquals(0, div.getValutation());
	}
	
	@Test
	public void divCorrectnesstExpressionZeroBoth() {
		BinaryExpression div = new Division(0,0);
		assertEquals(0, div.getValutation());
	}
}
