package composite.example;

public class Multipication extends BinaryExpression {

	public Multipication(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int getValutation() {
		return leftExpression * rightExpression;
	}
}
