package oldText.febbraio18;

public class Text implements Widget {

	private int height;
	private String value;

	public Text(int height, String value) {
		this.height = height;
		this.value = value;
	}

	@Override
	public void draw() {
		System.out.println("La stringa del testo ha dimensione " + getHeight());
	}

	@Override
	public void insert(Widget w) throws Exception {
		System.out.println("in" + this.getClass() + "not implemented yet");
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
