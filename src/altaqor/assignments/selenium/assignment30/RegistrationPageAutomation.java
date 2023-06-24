package altaqor.assignments.selenium.assignment30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Write the test cases for registration page. (Create at least 15 test cases)
https://ecommerce-playground.lambdatest.io/index.php?route=account/register
Use Selenium with TestNG to automate all of the test cases. 
 * 
 */
public class RegistrationPageAutomation {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	}
	
	@Test(priority =1)
	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register Account";
		Assert.assertEquals(actualTitle, expectedTitle, "Page title is not Matched");
	}
	@Test(priority =2)
	public void verifyPageHeading() {
		WebElement pageHead = driver.findElement(By.xpath("//h1[@class='page-title h3']"));
		Assert.assertEquals(pageHead.isDisplayed(), true, "Page Heading is not Displayed.");
		Assert.assertEquals(pageHead.getText(),"Register Account", "Page Heading not Matched");
		
	}
	@Test(priority = 3)
	public void verifyAllLabel() {
		//label Name
	WebElement labelFname =	driver.findElement(By.xpath("//label[@for='input-firstname']"));
	Assert.assertEquals(labelFname.isDisplayed(), true, "First name is not Displayed.");
	Assert.assertEquals(labelFname.getText(),"First Name", " first Name Label not Matched");
	// label lastname
	WebElement labelLname =	driver.findElement(By.xpath("//label[@for='input-lastname']"));
	Assert.assertEquals(labelLname.isDisplayed(), true, "Last name is not Displayed.");
	Assert.assertEquals(labelLname.getText(),"Last Name", " last name Label is not Matched");
	// label email
	WebElement labelemail =	driver.findElement(By.xpath("//label[@for='input-email']"));
	Assert.assertEquals(labelemail.isDisplayed(), true, "Email label is not Displayed.");
	Assert.assertEquals(labelemail.getText(),"E-Mail", " Email Label is not Matched");
	// Label Telephone
	WebElement labelTelephone =	driver.findElement(By.xpath("//label[@for='input-telephone']"));
	Assert.assertEquals(labelTelephone.isDisplayed(), true," Telephone label is not Displayed.");
	Assert.assertEquals(labelTelephone.getText(),"Telephone", " Telephone Label is not Matched");
	// password
	WebElement labelPassword =	driver.findElement(By.xpath("//label[@for='input-password']"));
	Assert.assertEquals(labelPassword.isDisplayed(), true," Password label is not Displayed.");
	Assert.assertEquals(labelPassword.getText(),"Password", " Password Label is not Matched");
	// confirm password
	WebElement labelCPassword =	driver.findElement(By.xpath("//label[@for='input-confirm']"));
	Assert.assertEquals(labelCPassword.isDisplayed(), true," C label is not Displayed.");
	Assert.assertEquals(labelCPassword.getText(),"Password Confirm", "Confirm password Label is not Matched");
	
	}
	@Test(priority = 4)
	public void verifyallTextField() {
		// first Name Text field
		WebElement fnameTextField = driver.findElement(By.id("input-firstname"));
		Assert.assertEquals(fnameTextField.isDisplayed(), true, "First Name Text Field is not Present");
		//last name Text Field
		WebElement lnameTextField = driver.findElement(By.id("input-lastname"));
		Assert.assertEquals(lnameTextField.isDisplayed(), true, "Last  Name Text Field is not Present");
		//email text field
		WebElement emailTextField = driver.findElement(By.id("input-email"));
		Assert.assertEquals(emailTextField.isDisplayed(), true, "email Text Field is not Present");
		// telephone text
		WebElement tphoneTextField = driver.findElement(By.id("input-telephone"));
		Assert.assertEquals(tphoneTextField.isDisplayed(), true, "Telephone Text Field is not Present");
		
		// password text field
		WebElement pwordTextField = driver.findElement(By.id("input-password"));
		Assert.assertEquals(pwordTextField.isDisplayed(), true, "passwordText Field is not Present");
		//c password text field
		WebElement cpwdTextField = driver.findElement(By.id("input-confirm"));
		Assert.assertEquals(cpwdTextField.isDisplayed(), true, "Confirm password Text Field is not Present");
	}
	@Test(priority = 5, invocationCount = 6)
	public void  registerwithValidData() {
		driver.findElement(By.id("input-firstname")).sendKeys("Binam");
		driver.findElement(By.id("input-lastname")).sendKeys("Paudel");
		driver.findElement(By.id("input-email")).sendKeys("binma12@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("402320467");
		driver.findElement(By.id("input-password")).sendKeys("Binma21245");
		driver.findElement(By.id("input-confirm")).sendKeys("Binma21245");
	}
	@Test(priority = 6)
	public void checkAcceptContinue() {
		driver.findElement(By.xpath("//label[text()='No']")).click();
		driver.findElement(By.xpath("//label[@for='input-agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@AfterMethod
	public void shutDownBr() {
		try {
		Thread.sleep(500);
		}catch (Exception e) {
			
		}
		driver.close();
		
	}
		
	}
	


