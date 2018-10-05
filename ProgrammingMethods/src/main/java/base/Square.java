package base;

public class Square {

	public static int AreaCalculator(int parameter) {
		if(parameter<=0) {
			System.out.println("Can't Calculate Area() with NEGATIVE parameter");
			return 0;
		}
		return(int)Math.pow(parameter,2);
	}
	

}
