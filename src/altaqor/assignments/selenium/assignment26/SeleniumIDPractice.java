package altaqor.assignments.selenium.assignment26;
/*Open the register url using Selenium WebDriver. 
Find all the text fields and password field on the webpage using their corresponding ids. 
Enter a suitable value for each field using Selenium WebDriver.
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIDPractice {

	public static void main(String[] args) {
		// property setup
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		// ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		// instance of ChromeDriver
		WebDriver driver = new ChromeDriver(options);
		
		// URL LUNCH
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		 String actualTitle =driver.getTitle();
		 String expectedTitle = "Register Account";
		 
		 if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			 System.out.println("Test case 1 is Passed");
		 }
		// sending values in text fields
		driver.findElement(By.id("input-firstname")).sendKeys("Binam");
		driver.findElement(By.id("input-lastname")).sendKeys("Paudel");
		driver.findElement(By.id("input-email")).sendKeys("Binam@mmm.com");
		driver.findElement(By.id("input-telephone")).sendKeys("40234021116");
		driver.findElement(By.id("input-password")).sendKeys("Paudel12");
		driver.findElement(By.id("input-confirm")).sendKeys("Paudel12");
		
		// close
		try {
			Thread.sleep(5000);
			driver.close();
		}catch(Exception e ) {
			
		}
		

	}

}
