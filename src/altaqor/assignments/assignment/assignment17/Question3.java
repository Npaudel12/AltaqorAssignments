package altaqor.assignment.assignment17;
/*Write a Java program that takes two strings as input and compares them lexicographically.
 *  If the first string is lexicographically greater than the second string, print "First string is greater"; 
 * if the first string is lexicographically smaller, print "First string is smaller"; otherwise, print "Strings are equal".
 * 
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "Parbat";
		String word2 = "Pokhara";
		int result = word1.compareTo(word2);
		if (result> 0) {
			System.out.println("First  string is greater");

	}
		else if(result < 0) {
			System.out.println("First string is smaller");
		
	}else{
		System.out.println("Strings are equal");
		
	}

	}

}
