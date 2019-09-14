package oldText.Gennaio19;

public class DEMOPair {

	public static void main(String[] args) {
		
		IntPair intp = new IntPair(1, 2);
		
		StrPair strp = new StrPair("HOLA","CIAO");
		
		DoublePair doublep = new DoublePair(intp, strp);
		
		Visitor vi = new VisitorInPair(intp);
		
		vi.checkOrdInt();
		
		Visitor vs = new VisitorStrPair(strp);
		vs.checkOrdStr();
		
		Visitor vd = new VisitorDoublePair(doublep);
		vd.checkOrdDouble();		
		

	}

}
