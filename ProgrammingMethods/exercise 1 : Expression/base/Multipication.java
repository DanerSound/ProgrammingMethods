package base;

public class Multipication extends BinaryExpression {

	public Multipication(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		return leftExpression * rightExpression;
	}
}
