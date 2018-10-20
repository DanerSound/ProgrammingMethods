package base;

public class Division extends BinaryExpression {

	public Division(int leftExpression, int rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	int getValutation() {
		if((leftExpression == 0)&&(rightExpression == 0))  {
			System.out.println("MATH ERROR : OPERATION NOT DEFINE");
		}else{
			if(rightExpression==0){
			System.out.println("MATH ERROR");
			return 0;	
			}
		}
		return leftExpression/rightExpression;
	}

}
