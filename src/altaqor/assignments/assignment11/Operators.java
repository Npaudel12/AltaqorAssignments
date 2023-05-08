package altaqor.assignments.assignment11;

public class Operators {
	
	// declaration of the variables
	public int a = 40;
	public int b = 20;
	public int c = 50;
	
	// non static method for arithmetic operations
	public void arthOperators() {
		
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a/b;
		int result4 = a%b;
		int result5 = a*b;
		
		System.out.println("Sum of 20 and 40 (+): " + result1);
		System.out.println("Diiference  of 20 and 40 (-): " + result2);
		System.out.println("Division of 40 by 20 is (/): " + result3);
		System.out.println("Reminder when 40 didvide 20 (%): " + result4);
		System.out.println("Multiplication  of 20 and 40 (*): " + result5 + "\n");
				
	}
	
	// method for assign operations
	public  void  assignOperators() {
		
		int result1 = a = a+b;  // a += b => a = a+b = 60;
		int result2 = a  = a- b;  // a -= b => a = a-b =40;
		int result3 = a = a*b;   // a *= b => a = a*b = 800
		int result4 = a = a/b;  // a/=b => a/b = 40;
		int result5 = a = a%b; // a%=b => a = a%b = 0
		
		System.out.println("Result of += operator: " + result1);
		System.out.println("Result of -= operator: " + result2);
		System.out.println("Result of *= operator: " + result3);
		System.out.println("Result of /= operator: " + result4);
		System.out.println("Result of %= operator: " + result5 + "\n");
		
	}
	  // method for relational operators 
	 public void relationalOperators() {
		 boolean  result6 = a == b; // false i.e a<b , a= 0 from line 34 b =20
		 boolean result7 = a != b;  // true 
		 boolean result8 =  a > b ; // false
		 boolean result9 = a < b; // true
		 boolean result10  = a >= b; //false
		 boolean result11 = a <= b; // true
		
		 	System.out.println("Result of == operator: " + result6);
			System.out.println("Result of != operator: " + result7);
			System.out.println("Result of > operator: " + result8);
			System.out.println("Result of < operator: " + result9);
			System.out.println("Result of >= operator: " + result10);
			System.out.println("Result of = operator: " + result11 + "\n");
		
		
	}
	 
	 public void logicalOperator() {
		 boolean result1 = a>b && b> c;  // true && false  => false
		 boolean result2 = a < b | b<c ; // false | true => true
		 boolean result3 = !(c>a); // !(true) => false
		 
		 	System.out.println("Result of true && false : " + result1);
			System.out.println("Result of false | true: " + result2);
			System.out.println("Result of !(true): " + result3);
		 
	 }

	public static void main(String[] args) {
		
		// object of the class operators
		Operators op = new Operators();
		
		// calling different method
		op.arthOperators();
		op.assignOperators();
		op.relationalOperators();
		op.logicalOperator();
		
	}

}
