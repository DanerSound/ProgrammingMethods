package base;

public class Division extends BinaryExpression {

	public Division(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		if ((leftExpression == 0) && (rightExpression == 0)) {
			System.out.println("INPUT ERROR : YOU CANT DO THAT");
		} else if (rightExpression == 0) {
			System.out.println("MATH ERROR: CAN'T DO THAT");
		} else {
			return leftExpression / rightExpression;
		}
		return 0;
	}
}
