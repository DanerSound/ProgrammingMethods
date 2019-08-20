package designpattern.Composite;

public class Line extends Graphic {

	@Override
	void draw() {
		System.out.println("Drawing Line");
	}

	@Override
	void add(Graphic gr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void remove(Graphic gr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Graphic getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
