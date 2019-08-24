package designpattern.Strategy;

public class OperationAdd implements OperationStrategy{

	@Override
	public int doOperation(int op1, int op2) {		
		return op1+op2;
	}

}
