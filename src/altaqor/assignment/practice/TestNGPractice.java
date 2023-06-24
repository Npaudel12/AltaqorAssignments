package altaqor.assignment.practice;
/*TestNG Installation and adding libraries
 * Go to help -MarketPlace- Search TestNG- install and accept - Next 
 * Libraries
 * Go to project and right click - properties-java Build path-libraries- click on class path
 * - add library- TestNG Next - apply and close
 * 
 */

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("@BeforeSuite: This will run at the begining before satrting any test");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass: this is in 3rd priority");
	}
		@BeforeTest
	public static void  beforeTest1() {
			System.out.println("@BeforeTest: This is on 2nd priority");
		
	}
		@BeforeMethod
		public static void beforeMethod() {
			
			System.out.println("@Before method:  this is on 4th priority");
			
	}
		@Test 
		public static void test() {
		System.out.println("@Test: This will run after before method");
			
		}

}
