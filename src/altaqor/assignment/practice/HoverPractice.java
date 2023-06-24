package altaqor.assignment.practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HoverPractice {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
	     driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
		
	}
	
	@Test(priority = 1)
	public void verifyHeading() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Account";
		assertEquals(actualTitle, expectedTitle, "Two title are not matched");

	
	}
	@Test(priority = 2)
	public void topHeadingTest() {
	WebElement hdTag = 	driver.findElement(By.tagName("h1"));
	Actions actions = new Actions(driver);
	actions.moveToElement(hdTag).build().perform();
	try {
		Thread.sleep(5000);
	}catch(Exception e ) {
		
	}
	
	driver.findElement(By.className("//body[contains(@class,'auth-no-skin ap-locale-en_US')]")).click();
	String actualTitle = driver.getTitle();
	String expectedTitle = "Amazon Sign-In";
	assertEquals(actualTitle, expectedTitle, "Two title are not matched");

	}
	@AfterMethod
	public void shutDown() {
		
		driver.close();
		
	}

}
