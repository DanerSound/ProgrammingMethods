package oldText.Gennaio19;

public class DoublePair extends Pair{
	
	private Pair first,snd;

	public DoublePair(Pair first, Pair snd) {
		this.first = first;
		this.snd = snd;
	}
	
	@Override
	public String whatIs() {
		return first.getClass().toString() + " " + snd.getClass().toString();

	}

	@Override
	public void acceptVisitor(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	public Pair getFirst() {
		return first;
	}

	public void setFirst(Pair first) {
		this.first = first;
	}

	public Pair getSnd() {
		return snd;
	}

	public void setSnd(Pair snd) {
		this.snd = snd;
	}



}
