package composite.exampleTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import composite.example.Costant;

public class CostantTest {

	@Test
	public void returnValue() {
		int expectedNumber=0;
		Costant cons = new Costant(0);
		assertEquals(expectedNumber,cons.getValutation());
	}
}
