package automationScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class testSelenium2 {
	
@Test	
public void createAccount() throws InterruptedException{
	
System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"geckodriver.exe");
WebDriver drv = new FirefoxDriver();                //Launch the browser

drv.get("http://automationpractice.com/index.php");  //Open the url in the browser
drv.manage().window().maximize();

String homepageTitle = drv.getTitle();              //Get the current window title
System.out.println("The Title of the homepage:" + homepageTitle);   //Print the window title

String currentUrl = drv.getCurrentUrl();            //Get the current URL
System.out.println("The Url of the current page:" +currentUrl);  //Print the current URL

WebElement signInLink = drv.findElement(By.xpath("//a[@class='login']"));   //Find the element SigninLink and stores it
signInLink.click();                     //Click the sign in link element

Thread.sleep(3000);                     //Will wait for 3 seconds

WebElement username = drv.findElement(By.xpath("//input[@name='email_create']"));
username.sendKeys("srilakshmig55556@gmail.com");

drv.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
Thread.sleep(3000);

drv.findElement(By.xpath("//input [@value='2']")).click();

WebElement firstname = drv.findElement(By.xpath("//input [@name='customer_firstname']"));
firstname.sendKeys("Srilakshmi");

WebElement lastname = drv.findElement(By.xpath("//input [@name='customer_lastname']"));
lastname.sendKeys("G");

Thread.sleep(1000);

WebElement Email = drv.findElement(By.xpath("//input [@name='email']"));    //Find the element Username and stores it

drv.findElement(By.xpath("//input [@type='password']")).sendKeys("star3592");
Thread.sleep(3000);

WebElement Company = drv.findElement(By.xpath("//input [@name='company']"));
Company.sendKeys("Unilog");
Thread.sleep(3000);

WebElement Address  = drv.findElement(By.xpath("//input [@name='address1']"));
Address.sendKeys("2023 Westport Center Drive");

String text = Address.getText();

drv.findElement(By.xpath("//input [@name='city']")).sendKeys("St. Louis");
Thread.sleep(3000);


Select stat=new Select(drv.findElement(By.id("id_state")));

stat.selectByIndex(24);
Thread.sleep(3000);

stat.selectByValue("25");
Thread.sleep(3000);

stat.selectByVisibleText("Missouri");
Thread.sleep(3000);


drv.findElement(By.xpath("//input [@name='postcode']")).sendKeys("63146");
drv.findElement(By.xpath("//input [@name='phone_mobile']")).sendKeys("314-569-3122");
drv.findElement(By.xpath("//button[@id='submitAccount']")).click();

drv.quit();

}



@Test
public void signin(){
	
	String text1 = "An account using this email address has already been registered. Please enter a valid password or request a new one";
	String text2 = null;
	
	//Assert.assertEquals("srilakshmig", text1);
	//Assert.assertEquals("shreelakshmi", text1);
	
	Assert.assertNotNull(text2);
	
	
}
}
