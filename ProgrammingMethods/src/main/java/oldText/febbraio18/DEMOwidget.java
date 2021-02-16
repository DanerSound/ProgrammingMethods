package oldText.febbraio18;

public class DEMOwidget {

	public static void main(String[] args) {
		Text t = new Text(10, "CIAO");
		t.draw();
		
		TextDecorartor t2 = new TextDecorartor(t, 5);
		//t2.reduce();
		
		BorderDecorartor t3 = new BorderDecorartor(t2);
		t3.addBorder();

	}

}
