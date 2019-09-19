package oldText.Settembre19;

import java.util.ArrayList;

public class Partner implements Employee {

	private ArrayList<Employee> group;
	private int id;

	public Partner(int id) {
		this.group = null;
		this.id = id;
	}

	@Override
	public int getFixCost() {
		int counter=0;
		
		for( int index=0; index <group.size();index++) {
			if(group.get(index).getFixCost()!=0) {
				counter++;
			}
		}
		return counter;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

	@Override
	public void add(Employee emp) throws Exception {
		if (group == null) {
			group = new ArrayList<>();
			group.add(emp);
		} else {
			group.add(emp);
		}

	}

	public ArrayList<Employee> getGroup() {
		return group;
	}

	public void setGroup(ArrayList<Employee> group) {
		this.group = group;
	}

}
