package altaqor.assignments.assignment12;

import java.util.Scanner;

public class LogicPractice {
	
	public static int i;
	public static int j;
	
	public void compare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your First Numnber: ");
		i = sc.nextInt();
		System.out.println(" Please enter your Second number: ");
		j = sc.nextInt();
		
		if (i>j) {
			System.out.println("Your first number  " + i + " is greter than second number " + j);
		}
		else
		System.out.println("Your second number  " + j + " is greter than first number " + i);
	}
	public void checkCharecter() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any one character : ");
		char ch = sc.next().charAt(0);
		if ( ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
			
			System.out.println(" Letter   " + ch + "  you enter is vowels");
		}
		else
		System.out.println(" Letter   " + ch + "  you enter is constant");
		
	}
	 public void checkPostiveNeagative() {
		      Scanner sc = new Scanner(System.in);
			 System.out.println("Please enter any number negative or positive  : ");
			 double  a = sc.nextDouble();
			
		  if ( a > 0) {
			  System.out.println(" Number you enter " + a + " is positive");
		  }
		  else if (a < 0) {
			  System.out.println(" Number you enter " + a + " is Negative");
	 }
		  else {
			  System.out.println(" Number you enter " + a + "  is zero");
		  }
	 }
	 
	 public void checkForVote() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter your age  : ");
		 int  b  = sc.nextInt();
		 if ( b >= 18) {
			 System.out.println("You are eligible for voting");
		 }
		 else {
			 System.out.println("You are ineligible for voting");
		 }
			 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LogicPractice lgp = new LogicPractice();
      lgp.compare();
      lgp.checkCharecter();
      lgp.checkPostiveNeagative();
      lgp.checkForVote();
	}

}
