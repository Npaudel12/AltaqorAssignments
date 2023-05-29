package altaqor.assignments.assignment20;
/*Create a class called Shape with an abstract method calculateArea(). 
 * Create two subclasses called Circle and Rectangle that inherit from the Shape class.
 *  Implement the calculateArea() method in both subclasses to calculate and return the
 *   area of a circle and rectangle respectively.Create an array of Shape objects that can 
 *   store both circles and rectangles. Populate the array with instances of both subclasses
 *  and iterate over the array, calling the calculateArea() method for each object and displaying the calculated area.

 * 
 */

public class Question1 {


	public static void main(String[] args) {
	// array object of a class shape	
	Shape [] shapes = new Shape[2];
	shapes [0] = new Circle(5.0);
	shapes[1] = new Rectangle(4.0, 5.0);
	
	for(Shape shape: shapes) {
		System.out.println("Area : "+ shape.calculateArea());
	}
	

	}

}
