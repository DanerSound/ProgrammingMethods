package base;

public class Sum extends BinaryExpression {

	public Sum(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {	
		return getLeftExpression()+getRightExpression();
	}

}
