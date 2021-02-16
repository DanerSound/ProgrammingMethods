package oldText.Novembre2018;

public abstract class PromotionDecorartor extends AbstractStdCard {
	
	private AbstractStdCard cardToDecorared;

	public PromotionDecorartor(AbstractStdCard cardToDecorared) {
		this.cardToDecorared = cardToDecorared;
	}
	
	@Override
	public double getMax(){
		return cardToDecorared.getMax();
	}

}
