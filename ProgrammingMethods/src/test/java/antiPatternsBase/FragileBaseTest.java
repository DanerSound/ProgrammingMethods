package antiPatternsBase;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class FragileBaseTest {
	@Test
	public void operationCorrectness(){	
			Base b = new Base(true);
			assertFalse(b.operation1());
	}
}
