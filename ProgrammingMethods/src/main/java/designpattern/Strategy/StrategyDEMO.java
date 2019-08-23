package designpattern.Strategy;

public class StrategyDEMO {

	public static void main(String[] args) {
		
		OperationContext somma= new OperationContext(new OperationAdd());
		System.out.println("10+5 ="+somma.executeOperationStrategy(10, 5));
		
		OperationContext sub= new OperationContext(new OperationSubstract());
		System.out.println("10-5 ="+sub.executeOperationStrategy(10, 5));
		
		OperationContext mult= new OperationContext(new OperationMultiply());
		System.out.println("10*5 ="+mult.executeOperationStrategy(10, 5));
		
	}

}
