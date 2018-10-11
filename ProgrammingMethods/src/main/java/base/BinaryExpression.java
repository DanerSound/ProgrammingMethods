package base;

public class BinaryExpression {

	private int leftExpression;
	private int rightExpression;

	public BinaryExpression(int leftExpression, int rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	public int getLeftExpression() {
		return leftExpression;
	}

	public void setLeftExpression(int leftExpression) {
		this.leftExpression = leftExpression;
	}

	public int getRightExpression() {
		return rightExpression;
	}

	public void setRightExpression(int rightExpression) {
		this.rightExpression = rightExpression;
	}

	public static int getValutation(int currentLeft, int currentRight) {
		return currentLeft + currentRight;
	}

}
