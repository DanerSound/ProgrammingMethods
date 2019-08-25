package oldText.Gennaio19;

public class Gennaio19DEMO {

	public static void main(String[] args) {

//		Pair<Integer> nume = new Pair<Integer>(1,2);
//		System.out.println(nume.whatIs());
//		System.out.println(nume.getFirst().getClass());
		
		Pair<Pair<Integer>> num = new Pair<Pair<Integer>>(new Pair<Integer>(1, 2), new Pair<Integer>(3, 4));
		System.out.println(num.whatIs(num));	
		
		
//		System.out.println(num.getFirst().getFirst().getClass());

//		Pair<Pair <Integer>> numeri = new Pair<Pair <Integer>>(new Pair<Integer>(7, 42), new Pair<Integer>(4, 3));
//		numeri.whatIs();

	}

}
