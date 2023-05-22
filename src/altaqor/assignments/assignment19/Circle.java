package altaqor.assignments.assignment19;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}

	@Override
	public double calculateArea() {
		double area1 = Math.PI* radius* radius;
		System.out.println("Area of the Rectangle:" + area1);
		return area1;
	}
	
	
}

