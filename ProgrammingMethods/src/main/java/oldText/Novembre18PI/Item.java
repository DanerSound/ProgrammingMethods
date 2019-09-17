package oldText.Novembre18PI;

public abstract class Item {

	public void accept(Visitor v);

	public boolean itemEquals(Object obj);

}
