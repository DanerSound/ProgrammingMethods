package composite.example;

public class Sum extends BinaryExpression {

	public Sum(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int getValutation() {	
		return leftExpression+rightExpression;
	}
}
