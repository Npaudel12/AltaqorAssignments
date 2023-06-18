package altaqor.assignments.selenium.assignment29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/*1. Open the url : https://www.hyperlinkinfosystem.com/contact.html in your browser. 
  2. Identify all the web elements of contact us page.
  3. Automate the functionality of contact us page. 
 * 
 */
public class ContactPageAutomation {

	public static void main(String[] args) {
		
		// system property setup
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		//chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		// object of chromedriver
		WebDriver driver = new ChromeDriver(options);
		
		// open URL
		driver.get(" https://www.hyperlinkinfosystem.com/contact.html");
		
		// checking contact us page
		
		   String actualTitle = driver.findElement(By.xpath("//h1[text()='Contact Us']")).getText();
		   String expectedTitle = "Contact Us";
		   
		   if(actualTitle.equals(expectedTitle)) {
			   System.out.println(" Test Case1: Passsed ");
			   
		   }else {
			   
			System.out.println("Fails");
		   }
		// 	testing text field
		   driver.findElement(By.cssSelector("[aria-label = 'Your Full Name']")).sendKeys("Ganesh Paudel");
		   driver.findElement(By.cssSelector("[name = 'email']")).sendKeys("binam@mmm.com");
		   driver.findElement(By.xpath("//*[@id='phone1']")).sendKeys("407098712");
		   driver.findElement(By.xpath("//input[@placeholder='WhatsApp']")).sendKeys("4023457889");
		   driver.findElement(By.id("skype-id")).sendKeys("Ndahal123");
		  driver.findElement(By.xpath("//input[@placeholder='Your address / location']")).sendKeys("13121 S 69th Ave Apt 8 Omaha NE");
		  
		  // upload file
		  WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']")); 
		  chooseFile.sendKeys("C:\\Users\\npaud\\Desktop\\Dashain 2021\\IMG_5836 - Shortcut.lnk");
		  try {
			 Thread.sleep(5000);
		  }catch (Exception e){
			  
		  }
		  
		  // slide bar handle
		 WebElement sliderBar = driver.findElement(By.cssSelector("span.irs-bar"));
		 Actions actions = new Actions(driver);
		 actions.dragAndDropBy(sliderBar, 200, 0).click().build().perform();
		 
		 // Need to fix, how to send the sum
		 driver.findElement(By.cssSelector("[name ='captcha']")).sendKeys("8");
		 
		 //Note : might be bug on the page, it doesnot pup up alert when we lunch the browser directly
		 //but shows when we automate the page
		// driver.findElement(By.xpath("//button[text()='Send']")).click();
		 
		  try {
				 Thread.sleep(5000);
				 driver.quit();
			  }catch (Exception e){
				  
			  }
	}

}
