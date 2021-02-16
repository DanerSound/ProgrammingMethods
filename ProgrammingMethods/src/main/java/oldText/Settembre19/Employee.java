package oldText.Settembre19;

public interface Employee {
	
	public int getFixCost();
	public void accept( Visitor v);
	public void add(Employee emp) throws Exception;


}
