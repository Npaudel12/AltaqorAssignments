package altaqor.assignments.assignment19;
/*Create a Java class named "StringManipulator" with overloaded methods for counting occurrences,
 *  including int countOccurrences(String str, char ch) and int countOccurrences(String str, String substring).
 *   Write a program to demonstrate the usage of these overloaded methods, showcasing their ability to count the 
 *   occurrences of a character or substring in a string while utilizing method overloading in Java.

 * 
 */

public class Question4 {

	public static void main(String[] args) {
		
		StringManupulator stm = new StringManupulator();
        int count =  stm.countOccurences(" My name is Nrayan Paudel", 'a');
        
        System.out.println("Number character 'a' in a given string: " + count);
	}

}
