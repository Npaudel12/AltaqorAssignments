package altaqor.assignment.assignment17;
//Write a Java program that takes a string as input and counts the number of uppercase letters in it.


public class Question8 {
	
	public static void main(String[] args) {
		
		String str = "Narayan Paudel BenningtoN Nebraska";
		
		int count = 0;
		for (   int i = 0; i < str.length();  i++) {
			if (Character.isUpperCase(str.charAt(i))){
			 count++;
				
			}
					
	}
		
		System.out.println(" Number of uppercase letter in a given string: " + count);
}
}
