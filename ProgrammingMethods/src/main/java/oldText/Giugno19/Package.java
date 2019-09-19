package oldText.Giugno19;

import java.util.ArrayList;

public class Package extends Item {

	private int id;
	private ArrayList<Item> group;

	public Package(int id) {
		this.id = id;
		this.group = null;
	}

	@Override
	public double getPrice() {
		double actualPrice = 0;

		for (int index = 0; index < group.size(); index++) {
			actualPrice = actualPrice + group.get(index).getPrice();
		}
		return actualPrice;
	}

	@Override
	public void add(Item i) throws Exception {
		if (group == null) {
			group = new ArrayList<>();
			group.add(i);
		} else {
			group.add(i);
		}

	}

	@Override
	public boolean equals(Object obj) {

		if (this.id == ((Package) obj).id) {
			return true;
		} else {
			return false;
		}

	}

}
