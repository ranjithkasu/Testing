package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class auto3 {
	
	//public static  WebDriver driver;
	@Test
	public void main() throws InterruptedException {
// 		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
//		driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame(2);
        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
  }
//	public static void Explicit(WebDriver driver, Sting text) {
//		new
//	}
}