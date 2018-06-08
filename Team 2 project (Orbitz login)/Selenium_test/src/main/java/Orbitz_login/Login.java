package Orbitz_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//Open the web browser
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessy\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	
	//Navigate to the web application
	
	driver.get("https://www.orbitz.com");
	
	//verifying logo
	String tittle = driver.getTitle();
	System.out.println("This page name is : " + tittle);
	
	
	// Clicking account
	driver.findElement(By.xpath("//*[@class='nav-tab trigger-link menu-trigger btn-text theme-standard pin-right '][1]")).click();
	//driver.findElement(By.xpath("//*[@class='btn-secondary btn-action'])")).click();
	driver.findElement(By.xpath("//*[@id=\"header-account-signin-button\"]")).click();
	
	//Enter email address
	driver.findElement(By.xpath("//*[@name='signin-loginid']")).sendKeys("jessy_rozario@hotmail.com");
	
	//Enter Password
	driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("439940");
			
	// Click login
	driver.findElement(By.xpath("//*[@class='btn-primary btn-action']")).click();
	

	}

}
