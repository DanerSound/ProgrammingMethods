package oldText.Novembre2018;

public class Education extends PromotionDecorartor {

	private double percent;

	public Education(AbstractStdCard cardToDecorared, double percent) {
		super(cardToDecorared);
		this.percent = percent;
	}

	@Override
	public double getMax() {
		double current = super.getMax();
		return ((current * percent) + current);
	}

}
