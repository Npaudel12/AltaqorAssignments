package altaqor.assignments.selenium.assignment25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//How do you use Selenium WebDriver to launch a URL in the browser programmatically?

public class Question1 {

	public static void main(String[] args) {
		
		// setting property
	    System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		// Chrome options
		ChromeOptions  options= new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		// instance of chrome driver
		
		WebDriver driver = new ChromeDriver();

		// lunching browser
		driver.get("https://www.guru99.com/");
		driver.close();
		
	}

}
