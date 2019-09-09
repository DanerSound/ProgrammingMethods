package oldText.Gennaio19;

public class Gennaio19DEMO {

	public static void main(String[] args) {
		
		Pair<Integer> num1 = new IntPair<Integer>(1, 2);
		System.out.println(num1.whatIs());
		
		Pair<Integer> num2 = new IntPair<Integer>(1, 2);
		System.out.println(num1.whatIs());
		
		Pair<Pair<Integer>> num4 = new DoublePair<Pair<Integer>>(num1, num2);
		System.out.println(num4.whatIs());
		
		Pair<String> num3 = new IntPair<String>("ABC","DDD");
		System.out.println(num3.whatIs());
		
		


	}

}
