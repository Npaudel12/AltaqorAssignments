package altaqor.assignments.assignment19;

public class StringManupulator {
	
	// method 
	public static int countOccurences(String str, char ch) {
		 
		  int count = 0;
	     for (int i =0; i< str.length(); i++) {
	    	 if (str.charAt(i)==ch) {
	    		 count++;
	    		 
	    	 }
	     }
	     
		return count;
		
	}

}
