package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryExpTest {
	
	@Test
	public void sumCorrectness() {
		assertEquals(8,BinaryExp.getValutation(3,5));
	}

}
