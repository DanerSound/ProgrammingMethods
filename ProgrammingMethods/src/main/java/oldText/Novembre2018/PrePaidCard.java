package oldText.Novembre2018;

public class PrePaidCard implements Card {
	
	private String id;
	private double credit;
	

	public PrePaidCard(String id, double credit) {
		this.id = id;
		this.credit = credit;
	}

	@Override
	public void charge(double amount) throws Exception {
	
			if(credit>amount) { 
				credit = credit-amount;
				setCredit(credit);
				System.out.println("OK");
			}else {
				System.out.println("Error stdCard: non ci sono soldi");
				throw new Exception("Error PrePaid: not enought credit");
			}
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}


}
