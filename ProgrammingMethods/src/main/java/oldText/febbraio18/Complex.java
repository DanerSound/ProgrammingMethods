package oldText.febbraio18;

import java.util.ArrayList;

public class Complex implements Widget {

	private ArrayList<Widget> widgetGroup;
	private int Num;

	public Complex(ArrayList<Widget> widgetGroup, int num) {
		this.widgetGroup = widgetGroup;
		Num = num;
	}

	@Override
	public void draw() {
		System.out.println("Complex è formato da"+getNum()+"componenti e queste sono:");
		for (int index=0;index<widgetGroup.size();index++) {
			widgetGroup.get(index).draw();
		}

	}

	@Override
	public void insert(Widget w) throws Exception {
		if(widgetGroup==null) {
			widgetGroup = new ArrayList<>();
			widgetGroup.add(w);
			setNum(widgetGroup.size());
		}else {
			widgetGroup.add(w);
		}
			

	}

	public ArrayList<Widget> getWidgetGroup() {
		return widgetGroup;
	}

	public void setWidgetGroup(ArrayList<Widget> widgetGroup) {
		this.widgetGroup = widgetGroup;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

}
