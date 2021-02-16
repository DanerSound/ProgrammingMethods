package oldText.Gennaio19;

public class StrPair extends Pair {

	private String first, snd;

	public StrPair(String first, String snd) {
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

	};

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSnd() {
		return snd;
	}

	public void setSnd(String snd) {
		this.snd = snd;
	}

}
