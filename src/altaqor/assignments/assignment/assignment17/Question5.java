package altaqor.assignment.assignment17;
//Write a Java program that takes a string as input and removes all the vowels from it

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str  = "Narayan";
		 String rmv = str.replaceAll("[aeiouAEIOU]", "");
		 System.out.println("Word after removing Vowels::" + rmv);
	}

}
