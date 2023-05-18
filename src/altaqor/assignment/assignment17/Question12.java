package altaqor.assignment.assignment17;
//Write a Java program that takes a string as input and determines if it is a valid email address
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailAdd = "narayanpaudel@gmail.comn";
		 boolean emailCheck = emailAdd.contains("@gmail.com");
		 boolean emailCheck2 = emailAdd.contains("@yahoo.com");
		 if (emailCheck == true || emailCheck2 ==true) {
			 System.out.println("This is a valid eamil address");
		 }
		 System.out.println("This is not valid ");

	}

}
