package first;

import java.util.concurrent.TimeUnit;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class auto2 {
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException{

		//System.setProperty("webdriver.gecko.driver", "/home/ranjith/Downloads/geckodriver");
 		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
 		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ranjithkasu111@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(" ");
		//driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).click();
		Select sel = new Select(driver.findElement(By.cssSelector("#month")));
		sel.selectByIndex(3);
		//sel.selectByValue(6);
		//sel.selectByVisibleText("june");
	}
	
}
