package oldText.Novembre18PI;

public class Text implements Element {

	private int Id;
	private String content;

	public Text(int id, String content) {
		this.Id = id;
		this.content = content;
	}

	@Override
	public void accept(Visitor v) {
		v.resetText(this);

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
