package base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CostantTest {
	
	Costant cons;
	
	@Before
	public void initConst() {
		cons= new Costant(0);
	}
	
	@Test
	public void returnValue() {
		int expectedNumber=0;
		assertEquals(expectedNumber,cons.getValutation());;
	}
	
}
