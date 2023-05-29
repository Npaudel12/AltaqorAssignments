package altaqor.assignments.assignment20;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius ) {
		this.radius = radius;
	}

	public double calculatearea() {
		double area = Math.PI * radius* radius;
		return area;
	}

	@Override
	public double calculateArea() {
		double area = Math.PI * radius* radius;
		return area;
	}

}
