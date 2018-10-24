package antiPatternsBase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExtendedTest {
	@Test
	public void setToFalse(){
		Extended ex = new Extended(true);
		assertFalse(ex.Operation2());
	}
	
	@Test
	public void setToTrue() {
		Extended ex = new Extended(false);
		assertTrue(ex.Operation2());
		
	}
}
