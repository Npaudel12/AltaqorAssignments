package altaqor.assignments.assignment23;
// Write a program to check whether two arrays are equal or not.
public class Question2 {

	public static void main(String[] args) {
		//1st array
		int[] firstArray = {1,2,3,4,5,6};
		//2nd array
		int[] secondArray = {4,5,6,7,8,9,10};
		// finding size
		int size1 = firstArray.length;
		int size2 = secondArray.length;
		// comparing two arrays
		if (size1 == size2) {
			System.out.println("Two arrays are equal.");
		}else {
			System.out.println("Two arrays are not equal.");
		}
		
		
	}

}
