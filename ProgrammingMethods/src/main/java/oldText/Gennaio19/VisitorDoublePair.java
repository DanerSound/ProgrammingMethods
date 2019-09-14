package oldText.Gennaio19;

public class VisitorDoublePair implements Visitor{

	private DoublePair doublepair;

	public VisitorDoublePair(DoublePair doublepair) {
		this.doublepair=doublepair;
	}
	
	@Override
	public boolean checkOrdDouble() {
		System.out.println("non so come si fa");
		return false;
	}

	@Override
	public boolean checkOrdInt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOrdStr() {
		// TODO Auto-generated method stub
		return false;
	}



}
