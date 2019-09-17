package oldText.febbraio18;

public class BorderDecorartor extends WidgetDecorartor {

	private String border = "Border";
	private TextDecorartor borderedText;

	public BorderDecorartor(TextDecorartor textToDecorared) {
		this.borderedText = textToDecorared;
	}

	public void addBorder() {
		System.out.println(border);
		System.out.println(border);
		borderedText.reduce();
		System.out.println(border);
		System.out.println(border);
	}
}
