package altaqor.assignment.assignment17;
//Write a Java program that takes a string as input and prints the reverse of the string.


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Narayan Paudel";
		for ( int i = name.length(); i > 0; i-- ) {
			System.out.print(name.charAt(i-1));
		}

	}

}
