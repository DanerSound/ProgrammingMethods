package oldText.Novembre2018;

public class CardDEMO {

	public static void main(String[] args) throws Exception {
		
		StudentCard std = new StudentCard(1, 300);
		std.charge(290);
	//	std.charge(305);
		
		Education promation = new Education(std,0.2);
		promation.charge(290);
		promation.charge(305);

	}

}
