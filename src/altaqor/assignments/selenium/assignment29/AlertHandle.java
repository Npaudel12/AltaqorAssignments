package altaqor.assignments.selenium.assignment29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*Automate the login page functionality without entering any values using the following steps: 
Open the url https://www.rediffmailpro.com/cgi-bin/login.cgi
Click on Login button
Automate all the Alert message using selenium "Alert" interface
 * 
 */
public class AlertHandle {

	public static void main(String[] args) {
		
		// Note : I think on the new version we dont need to set property
		
		//chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		// object of chromedriver
		WebDriver driver = new ChromeDriver(options);
		
		// open URL
		driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
		
		// loginpage click
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		 try {
			 Thread.sleep(5000);
			 
		 }catch(Exception e) {
			 
		 }
		
	    Alert alert = driver.switchTo().alert();
	    String alertMessage = alert.getText();
	    System.out.println("Alert Message: " + alertMessage);
	    try {
			 Thread.sleep(5000);
			
		 }catch(Exception e) {
			 
		 }
	    // allert accept
	    alert.accept();
	    driver.close();
	    
		
	}

}
