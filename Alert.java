package first;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
	public static WebDriver driver;

	public static void main(String args[]) { try {
			System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("file:///home/ranjith/Desktop/projects/funtion.html");
//			driver.findElement(By.cssSelector("body > form:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)")).sendKeys("kasu");
// 		    driver.findElement(By.cssSelector("input[type='submit']")).click(); 
//			String x= driver.switchTo().alert().getText();
//			System.out.println(x);
//			Thread.sleep(1000);
			String y=driver.switchTo().alert().getText();
			System.out.println(y);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			//alrt();
			driver.switchTo().alert().sendKeys("Text");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.navigate().back();
			//acept();
			System.out.println("its working");
			Thread.sleep(1000);
			}
	 catch (Exception e) {
 		e.printStackTrace();
	}}
//  public static void alrt() throws InterruptedException {
//	  boolean breakLoop = false;
//      while (!breakLoop) {
//          for(int i = 0; i <7; i++) {
//  			driver.switchTo().alert().sendKeys("Text");
//  			driver.switchTo().alert().accept();
//  			Thread.sleep(1000);
//           if (i>=7) {
//              breakLoop = true;
//          }
//          }
//      }
//
//	}
//public static void acept() throws InterruptedException {
//	for(int j=0;j<9;j++) {
//	driver.switchTo().alert().accept();
////	String z=driver.switchTo().alert().getText();
////	System.out.println(z);
//	Thread.sleep(1000);
//}
//}
  
  //added newly on jan8th
}
