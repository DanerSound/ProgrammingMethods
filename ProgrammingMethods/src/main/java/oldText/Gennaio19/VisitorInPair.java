package oldText.Gennaio19;

public class VisitorInPair implements Visitor{
	
	private IntPair intPair;
	
	public VisitorInPair(IntPair intPair) {
		this.intPair=intPair;
	}

	@Override
	public boolean checkOrdInt() {
		if(intPair.getFirst()<intPair.getSnd()){
			System.out.println("La Pair data è ben Ordinata");
			return true;
		}
		System.out.println("La Pair data non è ben ordinata");
		return false;
	}

	@Override
	public boolean checkOrdStr() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOrdDouble() {
		// TODO Auto-generated method stub
		return false;
	}

}
