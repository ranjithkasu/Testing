package first;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class auto {
	public WebDriver driver;
	//JavaScriptExecutor js;
	public void automate() {
		try {
			//System.setProperty("webdriver.gecko.driver", "/home/ranjith/Downloads/geckodriver");
			System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
			driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			//Thread.sleep(3000);
			driver.manage().window().maximize();
			//System.out.println(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("https://ums.lpu.in/lpuums");
			login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void login() {
		try {
			driver.findElement(By.id("txtU")).sendKeys("11403989");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#Txtpw")).sendKeys(" ");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#Txtpw")).sendKeys("@96");
			//js = (JavaScriptExecutor)driver;
			 //((Object) js).executeScript("scroll(1,800)");
			//driver.findElement(By.xpath(".//*[@id='ddlStartWith']/option[2]")).click();
			driver.findElement(By.cssSelector("#ddlStartWith > option:nth-child(2)")).click();
			driver.findElement(By.cssSelector("#iBtnLogins")).click();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	 
	public static void main(String args[]) throws InterruptedException
	{
 		auto myobj = new auto();
 		myobj.automate();
	}
  }