package shapes;

public class ShapeController {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
		
		Circle circle = (Circle) shape;
		circle.draw();
	}
}
