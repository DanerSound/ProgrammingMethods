package oldText.Settembre19;

public class DEMOemployee {

	public static void main(String[] args) throws Exception {
		
		Worker w = new Worker("mario", 10);
		Worker w2 = new Worker("rossi", 10);
		Advisor ad = new Advisor("DIO");
		
		Partner p = new Partner(1);
		
		p.add(w);
		p.add(w2);
		p.add(ad);
			
		System.out.println(p.getFixCost());
		
		Visitor v = new EmployeeVisitor(5);
		v.visit(w);
		
		

	}

}
