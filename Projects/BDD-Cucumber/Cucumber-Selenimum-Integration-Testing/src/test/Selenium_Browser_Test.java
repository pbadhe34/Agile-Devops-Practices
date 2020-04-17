package test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium_Browser_Test {
	
		private static WebDriver driver = null;
		
		static Scanner input;
		
		
	public static void main(String[] args) throws InterruptedException {
		
		input = new Scanner(System.in);
		
		//assign browser capabilities for IE
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);

	
		// Create a new instance of the Server driver specific for browser

      //  driver = new FirefoxDriver();
        
        driver = new ChromeDriver();
        
      //  driver = new InternetExplorerDriver(caps);
        
        //driver = new PhantomJSDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the app login page in browser

        driver.get("http://localhost:8080/WebLoginApp/LoginPage.html");
        Thread.sleep(2000);
        
        System.out.println("Check the page in browser and hit Enter key..: ");          
    	String s = input.nextLine();      
        
        

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

        driver.findElement(By.id("uName")).sendKeys("viju"); 

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("uPass")).sendKeys("SeKreT100");
        
        driver.findElement(By.id("remem")).sendKeys("yes");
        
        Thread.sleep(2000);
        System.out.println("View the user login details in browser and hit Enter key..: ");          
        input.nextLine();
        

        // Now submit the form. WebDriver will find the form for us from the element 

        driver.findElement(By.id("login")).click();

        // Print a Log In message to the screen

        System.out.println("Login Successfully");
        Thread.sleep(3000);
        
        System.out.println("Do some watch and hit Enter key to logout");       
        input.nextLine();
        

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();

        // Print a Log In message to the screen

        System.out.println("LogOut Successfully");

        // Close the driver

        driver.quit();

	}

}