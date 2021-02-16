package oldTextNuovoNovembre18;

public abstract class Item<T, K> {

	private T value1;
	private K value2;

	public Item(T value1, K value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public boolean equals(Object obj) {
		
		Item i = (Item)obj;
		
		if (value2 == i.value2) {
			return true;
		} else {
			return false;
		}
		
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public K getValue2() {
		return value2;
	}

	public void setValue2(K value2) {
		this.value2 = value2;
	}

}
