package designpatterns.factoryMethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		ShapeFactory fac = new ShapeFactory();
		
		Shape result=fac.getShape("CIRCLE");
		
		System.out.println(result.getClass());
		
		result.draw();
		
		
		result=fac.getShape("SQUARE");
		
		System.out.println(result.getClass());
		
		result.draw();
		
		result=fac.getShape("RECTANGLE");
		
		System.out.println(result.getClass());
		
		result.draw();
		
		

	}

}
