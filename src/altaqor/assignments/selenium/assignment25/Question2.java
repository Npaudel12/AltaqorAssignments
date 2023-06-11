package altaqor.assignments.selenium.assignment25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question2 {

	public static void main(String[] args) {
		
		// system property setup
	 System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe" );
	 
	 //chrome options
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("start-maximized");
	 options.addArguments("-remote-allow-origins=*");
	 
	 // instance of Chromedriver
	 WebDriver driver = new ChromeDriver(options);
	 
	 // lunch URL
	 driver.get("https://www.selenium.dev/");
	 
	 // switching window
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	 
	 try {
		Thread.sleep(4000);
		// close current window
		driver.close();
		Thread.sleep(3000);
		////close all the window
		driver.quit();
	 }catch(Exception e) {
		 
	 }
	}

}
