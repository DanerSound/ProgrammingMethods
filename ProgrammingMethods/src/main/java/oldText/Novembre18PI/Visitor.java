package oldText.Novembre18PI;

public abstract class Visitor {

	abstract void visit(Number number);

	abstract void visit(Text text);

	abstract void visit(Twice twice);

}
