package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BadCode {

	@Test
	public void mantra() {
		int controlLenght =45;
		assertEquals(Mantra.getMantra(),Mantra.getMantra().length(),controlLenght);
	}

}
