package oldText.Febbraio19;

public class Location implements AbsLocation {
	
	private String id;
	private int value;

	public Location(String id, int value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public int getValue() {
		return value;
	}

}
