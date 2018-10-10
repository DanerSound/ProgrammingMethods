package base;

public class BinaryExp implements Exp{
	
	private Costant opSX;
	private Costant opDX;

	public BinaryExp(Costant exp1, Costant exp2) {
		super();
		this.opSX = exp1;
		this.opDX = exp2;
	}

	public Costant getExp1() {
		return opSX;
	}

	public void setExp1(Costant exp1) {
		this.opSX = exp1;
	}

	public Costant getExp2() {
		return opDX;
	}

	public void setExp2(Costant exp2) {
		this.opDX = exp2;
	}

	public static int getValutation(int exp1, int exp2) {
		return exp1+exp2;
	}

	public int valutation() {
		return opSX.getValue()+opDX.getValue();
	}

}
