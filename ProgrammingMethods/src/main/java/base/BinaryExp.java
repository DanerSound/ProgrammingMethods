package base;

public class BinaryExp {
	
	private Costant exp1;
	private Costant exp2;

	public BinaryExp(Costant exp1, Costant exp2) {
		super();
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	public Costant getExp1() {
		return exp1;
	}

	public void setExp1(Costant exp1) {
		this.exp1 = exp1;
	}

	public Costant getExp2() {
		return exp2;
	}

	public void setExp2(Costant exp2) {
		this.exp2 = exp2;
	}

	public static int getValutation(int exp1, int exp2) {
		return exp1+exp2;
	}

}
