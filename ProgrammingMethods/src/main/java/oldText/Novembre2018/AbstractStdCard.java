package oldText.Novembre2018;

public abstract class AbstractStdCard implements Card {
	
	abstract double getMax();
	
	@Override
	public void charge (double amount) throws Exception {
		if(amount>getMax()) { 
			System.out.println("Error stdCard: non ci sono soldi");
			throw new Exception("Error PrePaid: not enought credit");	
		}else {
			System.out.println("OK");			
		}
	}

}
