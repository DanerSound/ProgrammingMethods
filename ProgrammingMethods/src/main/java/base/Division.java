package base;

public class Division extends BinaryExpression {

	public Division(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		if(rightExpression==0) {
			System.out.println("Math error : you can't devide by 0" );
			return 0;
		}else{
			if(leftExpression==0){
			return 0;	
			}
		}
		return leftExpression/rightExpression;
	}

}
