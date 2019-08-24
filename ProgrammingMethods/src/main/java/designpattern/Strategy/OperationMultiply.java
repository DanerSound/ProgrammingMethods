package designpattern.Strategy;

public class OperationMultiply implements OperationStrategy {

	@Override
	public int doOperation(int op1, int op2) {
		return op1*op2;
	}

}
