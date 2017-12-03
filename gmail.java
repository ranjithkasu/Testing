package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
public  WebDriver driver;
public class gmail {
	
	@BeforeSuite
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	@Test
	public void main()throws Exception{
 		
		//driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("kasuranjith2");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("9866208699");
		driver.findElement(By.id("passwordNext")).click();
		System.out.println(driver.getTitle());
	}
	 
}

