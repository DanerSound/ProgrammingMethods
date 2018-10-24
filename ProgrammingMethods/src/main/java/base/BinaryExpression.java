package base;

public abstract class BinaryExpression {

	protected int leftExpression;
	protected int rightExpression;

	public BinaryExpression(int leftExpression, int rightExpression) {
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

	abstract int getValutation();
}