package base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CostantTest {
	
	
	Constant cons;
	
	@Before
	public void initConst() {
		cons= new Constant(cons.value);
	}
	
	@Test
	public void returnValue() {
		cons.getValue();
	}
	
}
