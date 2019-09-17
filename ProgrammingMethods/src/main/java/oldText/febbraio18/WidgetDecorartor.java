package oldText.febbraio18;

public abstract class WidgetDecorartor implements Widget {

	private Widget toDecore;

	@Override
	public void draw() {
		toDecore.draw();
	}

	public void insert(Widget w) throws Exception {
		toDecore.insert(w);
	}

}
