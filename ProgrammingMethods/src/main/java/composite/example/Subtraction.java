package composite.example;

public class Subtraction extends BinaryExpression {

	public Subtraction(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int getValutation() {
		return leftExpression-rightExpression;
	}
}
