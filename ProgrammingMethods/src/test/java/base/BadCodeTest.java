package base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BadCodeTest {
	
	@Test
	public void CorrectString() {
		String Mantra="I'll not write bad code and also I'll use TDD";
		assertEquals(Mantra, BadCode.getMantra());
	}

	@Test
	public void StringLenght() {		
			controloLenght(BadCode.getMantra(),45);	
	}
	
	private void controloLenght(String Mantra,int controlLenght) {
		assertEquals(Mantra.length(), controlLenght);
	}

}
