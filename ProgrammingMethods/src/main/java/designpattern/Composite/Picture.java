package designpattern.Composite;

import java.util.ArrayList;

public class Picture extends Graphic {

	private ArrayList<Graphic> pixels;

	public Picture() {
		pixels = new ArrayList<>();
	}

	@Override
	void draw() {
		System.out.println("Drawing a pixture");
		for (Graphic graphic : pixels) {
			graphic.draw();
		}
	}

	@Override
	void add(Graphic gr) {
		pixels.add(gr);
	}

	@Override
	void remove(Graphic gr) {
		pixels.remove(gr);
	}

	@Override
	Graphic getChild(int index) {
		return pixels.get(index);
	}

}
