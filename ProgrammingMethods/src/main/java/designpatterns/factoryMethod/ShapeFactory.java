package designpatterns.factoryMethod;

public class ShapeFactory {


	public Shape getShape(String shapeType) {
		Shape resultShape=null;
		
		switch (shapeType) {
		case "CIRCLE": resultShape= new Circle();
		break;
		case "SQUARE": resultShape= new Square();
		break;
		case "RECTANGLE": resultShape = new Rectangle();
		break;
		}
		
		return resultShape;
	}
}