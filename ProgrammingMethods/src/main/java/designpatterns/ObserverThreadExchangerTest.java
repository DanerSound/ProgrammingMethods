package designpatterns;

public class ObserverThreadExchangerTest {

	public static void main(String[] args) {
		ThreadExchanger th = new ThreadExchanger(true);
		
		ThreadObserver to= new ThreadObserver();
		
		th.addObverser(to);
		
		th.notifica();
		
		th.setState(false);
		
		th.setState(true);
				
	}

}
