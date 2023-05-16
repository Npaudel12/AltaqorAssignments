package altaqor.assignments.assignment16;

public class Question4 {
	/*Write a Java program that takes a list of strings as input and uses a "for each" loop to search for 
	 * a specific string in the list. 
	 * If the string is found, print "Found," otherwise print "Not found."
	 * 
	 */
	public static void main(String[] args) {
		 String [] nameList = {"Narayan", "Ganesh", "Umesh", "Suresh"};
		  String name = nameList[0];
		 
		 for (String data: nameList) {
			 
			 if(name=="Narayan") {
			System.out.println("Found the name");
			break;
			
			 }
			
			 else {
				 System.out.println("Not Found");
			 }
			 
			
		 } 
		 
		 
		
	}

}
