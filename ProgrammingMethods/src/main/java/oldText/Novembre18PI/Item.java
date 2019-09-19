package oldText.Novembre18PI;

public interface Item {

	public void accept(RebootVisitor v);

	public boolean equals(Object obj);

}
