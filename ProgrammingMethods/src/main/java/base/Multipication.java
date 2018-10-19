package base;

public class Multipication extends BinaryExpression {

	public Multipication(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		if((leftExpression==0)||(rightExpression==0))
			return 0;
		else {
			return leftExpression*rightExpression;
			}
		}
}
