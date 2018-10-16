package base;

public class Sum {

	private int leftExpression;
	private int rightExpression;

	public Sum(int leftExpression, int rightExpression) {
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

	public int getValutation(int currentLeft, int currentRight) {
		return currentLeft + currentRight;
	}

}
