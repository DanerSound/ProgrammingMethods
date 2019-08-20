package designpattern.Composite;

public abstract class Graphic {
	abstract void draw();

	abstract void add(Graphic gr);

	abstract void remove(Graphic gr);

	abstract Graphic getChild(int index);
}
