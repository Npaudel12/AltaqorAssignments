package altaqor.assignments.selenium.assignment28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Automate the register account page with all the labels, text fields, radio button, checkbox, and button using different 
//combinations of XPath locators. 
public class XpathPractice {

	public static void main(String[] args) {
		
		//systemproperty
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		//chromeoptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		// chrome object
		WebDriver driver = new ChromeDriver(options);
		
		//URL lunch
		
		driver.get(" https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register Account";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Testcase1: Passed");
			
			// testing label
			driver.findElement(By.xpath("//label[text()='First Name']"));
			driver.findElement(By.xpath("//label[@for ='input-lastname']"));
			driver.findElements(By.xpath("//label[@for = 'input-email']"));
			driver.findElements(By.xpath("//label[text() ='Telephone']"));
			driver.findElements(By.xpath("//label[text()='Password']"));
			driver.findElements(By.xpath("//label[@for='input-confirm']"));
			
			// testing text, checkbox and radio bottton field
			driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Ganesh");
			driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("Paudel");
			driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("Paudel@mmm.com");
			driver.findElement(By.xpath("//input[@placeholder='Telephone']")).sendKeys("4023204123");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Omaha@1223");
			driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys("Omaha@1223");
			driver.findElement(By.xpath("//label[text()='Yes']")).click();
			driver.findElement(By.xpath("//label[@for='input-agree']")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			
			
			
		}
		try {
			Thread.sleep(5000);
			driver.close();
		}catch(Exception e ) {
			
		}
		
		

	}

}
