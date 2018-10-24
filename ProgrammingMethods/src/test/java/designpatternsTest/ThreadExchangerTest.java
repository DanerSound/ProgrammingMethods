package designpatternsTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import designpatterns.ThreadExchanger;

public class ThreadExchangerTest {
	
	
	@Test
	public void ControlTrueState() {
		ThreadExchanger th= new ThreadExchanger(true);
		assertTrue(th.isState());
	}
	@Test
	public void ControlFalseState() {
		ThreadExchanger th=new ThreadExchanger(false);
		assertFalse(th.isState());
	}

}
