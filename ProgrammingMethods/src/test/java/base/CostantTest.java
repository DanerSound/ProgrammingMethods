package base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CostantTest {
	
	private Constant Cons;
	
	@Before
	public void initConst() {
		 Cons= new Constant();	
	}
	
	@Test
	public void positiveConst() {
		assertEquals(1,Cons.evalutation());
	}

}
