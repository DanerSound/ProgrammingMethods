package oldText.Novembre18PI;

public interface Item {
	
	public void accept(Visitor v);
	
	public boolean itemEquals(Object obj);

}
