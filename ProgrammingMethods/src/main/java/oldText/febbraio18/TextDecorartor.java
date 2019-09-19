package oldText.febbraio18;

public class TextDecorartor extends WidgetDecorartor {

	private int newHeight;
	private Text textToDecore;

	public TextDecorartor(Text toDecoreText, int newHeight) {
		this.textToDecore = toDecoreText;
		this.newHeight = newHeight;

	}

	public void reduce() {
		textToDecore.setHeight(newHeight);
		System.out.println("Text: Ciao il testo si è ridotto di " + newHeight);
	}

}
