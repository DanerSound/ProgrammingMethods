package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BadCodeTest {

	@Test
	public void mantra() {		
			controloLenght(BadCode.getMantra(),45);	
	}
	
	private void controloLenght(String Mantra,int controlLenght) {
		assertEquals(Mantra.length(), controlLenght);
	}

}
