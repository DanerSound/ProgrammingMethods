package oldText.Novembre2018;

public class StudentCard extends AbstractStdCard {

	private int number;
	private double max;

	public StudentCard(int number, double max) {
		this.number = number;
		this.max = max;
	}
	
	@Override
	public double getMax() {
		return max;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setMax(double max) {
		this.max = max;
	}

}
