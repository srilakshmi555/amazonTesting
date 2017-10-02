package automationScripts;

import org.testng.annotations.Test;
import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testSelenium1 {
	
	@Test
	public void createAccount2() throws InterruptedException{
	
System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"geckodriver.exe");

    WebDriver drv = new FirefoxDriver();                //Launch the browser

    drv.get("http://automationpractice.com/index.php");  //Open the url in the browser

    String homepageTitle = drv.getTitle();              //Get the current window title
    System.out.println("The Title of the homepage:" + homepageTitle);   //Print the window title

    String currentUrl = drv.getCurrentUrl();            //Get the current URL
    System.out.println("The Url of the current page:" +currentUrl);  //Print the current URL

    WebElement signInLink = drv.findElement(By.xpath("//a[@class='login']"));   //Find the element SigninLink and stores it
    signInLink.click();                     //Click the sign in link element

    Thread.sleep(3000);                     //Will wait for 3 seconds

    WebElement username = drv.findElement(By.xpath("//input[@id='email']"));    //Find the element Username and stores it
    username.sendKeys("sriharsha.b.88@gmail.com");          //Enter the Username text

    drv.findElement(By.xpath("//input[@id='passwd']")).sendKeys("harsha@88");    //Enter the password in the Password field

    drv.findElement(By.xpath("//button[@id='SubmitLogin']")).click();   //Click the Signin link

    drv.quit();             //Quit the browser process


	}

}






