package altaqor.assignment.assignment17;
/*Write a Java program that takes a string as input and checks if it ends with a specific suffix. 
 * If the string ends with the suffix, print "String ends with the suffix"; otherwise, print 
 * "String does not end with the suffix".
 * 
 */

public class Question2 {

	public static void main(String[] args) {
		
		String name = "Narayan";
		boolean suffixCheck = name.endsWith("yan");
		
		if(suffixCheck== true) {
			System.out.println("String end with suffix 'yan'");
		}else
		{
			System.out.println("String doenot end with suffix 'yan' ");
		}
		
	}
}
