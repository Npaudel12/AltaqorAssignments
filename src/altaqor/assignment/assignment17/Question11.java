package altaqor.assignment.assignment17;
// Write a Java program that takes a string as input and finds the longest word in the string
public class Question11 {
	
 public static void main(String[] args) {
	 String str = " Hello everyone how is your days going on";
	 String  [] str1 =  str.split("\\s+"); 
	 String lngWord = "";
	 
	 for(String data: str1) {
		 if (data.length()> lngWord.length()) {
			 lngWord = data;
			 
		 }
		
	 }
	 System.out.println("The longest word is :" + lngWord);
}
}
