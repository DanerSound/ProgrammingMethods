package base;

public class BinaryExp {
	
	private Costant opsx;
	private Costant opdx;

	public BinaryExp(Costant exp1, Costant exp2) {
		super();
		this.opsx = exp1;
		this.opdx = exp2;
	}

	public Costant getExp1() {
		return opsx;
	}

	public void setExp1(Costant exp1) {
		this.opsx = exp1;
	}

	public Costant getExp2() {
		return opdx;
	}

	public void setExp2(Costant exp2) {
		this.opdx = exp2;
	}

	public static int getValutation(int exp1, int exp2) {
		return exp1+exp2;
	}

}
