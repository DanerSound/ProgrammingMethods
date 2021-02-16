package oldText.Gennaio19;

public class DEMOPair {

	public static void main(String[] args) {
		
		IntPair intp = new IntPair(1, 2);
		
		StrPair strp = new StrPair("HOLAA","CIAO");
		
		DoublePair doublep = new DoublePair(intp, strp);
		
		Visitor vi = new OrderVisitor();
		
		vi.visit(intp);
		vi.visit(strp);
		vi.visit(doublep);

	}

}
