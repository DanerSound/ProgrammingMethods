package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BadCode {

	@Test
	public void mantra() {
		int spectedLenght =45;
		int currentLenght =45;
		assertEquals(Mantra.getMantra(),spectedLenght,currentLenght);
	}

}
