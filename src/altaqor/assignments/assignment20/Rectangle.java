package altaqor.assignments.assignment20;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	
	@Override
	public double calculateArea() {
		double area = length*width;
		return area;
	}

	
}
