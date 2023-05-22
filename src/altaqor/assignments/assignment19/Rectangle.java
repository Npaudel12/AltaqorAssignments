package altaqor.assignments.assignment19;

public class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle( double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = length * breadth;
		System.out.println("Area of the Rectangle:" + area);
		return  area;
		
	}
	
}