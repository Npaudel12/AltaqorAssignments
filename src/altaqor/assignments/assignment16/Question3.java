package altaqor.assignments.assignment16;

public class Question3 {
	/*Create a Java program that uses a “for each” loop to iterate over a list 
	 * of Strings and count the number of vowels (a, e, i, o, u) present in each string.
	 * 
	 */
 public static void main(String[] args) {
	 
	 String [] name  = {"narayan", "ganesh", "umesh", "suresh", "hari", };
	 
	
	 for(String str: name) {
	 System.out.println(str);
	 int count = 0;
	 int i =0;
	  String s = name[i];
	  char ch = s.charAt(i);
	  if (ch == 'a'|| ch == 'e' || ch =='i' || ch == 'o'|| ch == 'u') {
		  count++;
	  }
	  System.out.println(count);
	 }
 }
} 

 /* need help with this problem*/

	 
	
