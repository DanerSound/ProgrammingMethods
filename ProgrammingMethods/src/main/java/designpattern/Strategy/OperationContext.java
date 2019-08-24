package designpattern.Strategy;

public class OperationContext {
	
	private OperationStrategy strategy;

	public OperationContext(OperationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeOperationStrategy( int firstOp, int secondOp){
		return strategy.doOperation(firstOp, secondOp);
	}
}
