package altaqor.assignments.assignment20;
/*
 Populate the array with instances of both subclasses and iterate over the array, 
 calling the calculateArea() method for each object and displaying the calculated area.
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
