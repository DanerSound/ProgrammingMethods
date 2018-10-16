package base;

public class Subtraction extends BinaryExpression {

	public Subtraction(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		return getLeftExpression()-getRightExpression();
	}

}
