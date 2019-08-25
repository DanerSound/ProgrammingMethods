package oldText.Gennaio19;

public class Pair<T> {
	private T first, snd;

	public Pair(T first, T snd) {
		this.first = first;
		this.snd = snd;
	}

//	public String whatIs() {
//		String types = this.getClass().toString();
//		T element = getFirst();
//
//		while (element.getClass().equals(this.getClass())) {
//			// while(this.getFirst().getClass().equals(this.getClass())) {
//			types += " " + this.getFirst().getClass().toString();
//			element = (T) this.getFirst().getClass();
//
//		}
//		Pair<T> element2 = (Pair<T>)element;
//		Pair<T> node = element2;
//		types +=" "+  node.getFirst().getClass().toString() + node.getSnd().getClass().toString();
//		
//		return types;
//	}

	public String whatIs(Pair<T> elem) {
		String node = elem.getClass().toString();
		T support = getFirst();
		//if (node.getClass().equals(elem.getClass())) {
		if(elem.getClass().equals(elem.getFirst().getClass())) {
			String subElem = support.getClass().toString();
			node = node + " "+  subElem;
			Pair<T> subFirst = (Pair<T>)this.getFirst();
			node += " "+ whatIs(subFirst);

		} else {
			node +=" "+getFirst().getClass().toString() + getSnd().getClass().toString();
		}
		return node;
	}

	public Pair<T> getPair() {
		return this;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSnd() {
		return snd;
	}

	public void setSnd(T snd) {
		this.snd = snd;
	}

}