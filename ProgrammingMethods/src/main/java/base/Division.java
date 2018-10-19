package base;

public class Division extends BinaryExpression {

	public Division(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		return leftExpression/rightExpression;
	}

}
