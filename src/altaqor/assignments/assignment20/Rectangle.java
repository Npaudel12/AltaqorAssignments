package altaqor.assignments.assignment20;
/*Create a class called Shape with an abstract method calculateArea(). 
 * Create two subclasses called Circle and Rectangle that inherit from the Shape class.
 *  Implement the calculateArea() method in both subclasses to calculate and return the
 *   area of a circle and rectangle respectively.Create an array of Shape objects that can 
 *   store both circles and rectangles.
 * 
 */

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
