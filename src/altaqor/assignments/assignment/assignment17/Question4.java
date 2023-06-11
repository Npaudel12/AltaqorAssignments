package altaqor.assignment.assignment17;
/*Write a Java program that takes a string as input and checks if it is a valid email address.
 *  If the string is a valid email address, print "String is a valid email address"; otherwise, 
 *  print "String is not a valid email address".
 * 
 */

public class Question4 {

	public static void main(String[] args) {
		
		String emailAddress = "narayanpaudel@gmail.com";
		
		 if (emailAddress.equalsIgnoreCase("narayanpaudel@gmail.com")){
			 System.out.println("String is a Valid email address");
		 }else {
			 System.out.println(" Strimg is not valid eamil address");
		 }
	}

}
