package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BadCode {

	@Test
	public void mantra() {
		assertEquals("c", "c", Mantra.getMantra());
	}

}
