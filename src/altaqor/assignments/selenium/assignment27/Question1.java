package altaqor.assignments.selenium.assignment27;
//Automate the register account page with all the labels, text fields, radio button, checkbox, and button using different 
//combinations of CSS selectors. 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1 {

	public static void main(String[] args) {
	
		// property set up
				System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
				
				// chromeoptions
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--remote-allow-origins=*");
				
				// instance of chrome
				WebDriver driver = new ChromeDriver(options);
				
				// lunching URL
				driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
				
				// title check
				 String actualTitle = driver.getTitle();
				String expectedTitle = "Register Account";
				
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("TestCase 1 : Passed");
					
				}
				// testing label
				driver.findElement(By.cssSelector("[ for ='input-firstname']"));
				driver.findElement(By.cssSelector("[ for ='input-lastname']"));
				driver.findElement(By.cssSelector("[ for ='input-email']"));
				driver.findElement(By.cssSelector("[ for ='input-telephone']"));
				driver.findElement(By.cssSelector("[ for ='input-password']"));
				driver.findElement(By.cssSelector("[ for ='input-confirm']"));
				
			
				// testing text field
				driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Binam");
				driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Paudel");
				driver.findElement(By.cssSelector("[id ='input-email']")).sendKeys("Binam@mmm.com");
				driver.findElement(By.cssSelector("[id='input-telephone']")).sendKeys("40234021116");
				driver.findElement(By.cssSelector("[id ='input-password']")).sendKeys("Paudel12");
				driver.findElement(By.cssSelector("[id ='input-confirm']")).sendKeys("Paudel12");
				driver.findElement(By.cssSelector("[for='input-newsletter-no']")).click();
				driver.findElement(By.cssSelector("[for='input-agree']")).click();
				driver.findElement(By.cssSelector("[value ='Continue']")).click();
				
				
				// close
				try {
					Thread.sleep(5000);
					driver.close();
				}catch(Exception e ) {
					
				}
				

	}

}
