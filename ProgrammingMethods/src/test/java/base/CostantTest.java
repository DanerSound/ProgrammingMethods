package base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CostantTest {
	
	@Test
	public void positiveConst() {
		assertEquals(1,Constant.evalutation());
	}
	
	@Test
	public void negativeConst() {
		assertEquals(-1,Constant.evalutation());
	}

}
