package first;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 public class Day5 {
	public static WebDriver driver;
//	public static void main(String args[]) throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
////		draggable();
////		dropable();
////		resizable();
////		selectable();
////		//sortable();
////		mouseHover();
// 	}
	@BeforeClass
	public void k() {
		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 @Test(timeOut = 3000,priority = 3)
    public void draggable() throws InterruptedException{
	    driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		ele.click();
		Actions builder = new Actions(driver);
		Action action = builder.dragAndDropBy(ele, 150, 90).build();
		action.perform();
   }
	 @Test(priority = 1)
    public void dropable() throws InterruptedException{
 	   driver.get("https://jqueryui.com/droppable/");
	   driver.switchTo().frame(0);
	   WebElement source = driver.findElement(By.id("draggable"));       
	   WebElement dest = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		Action action = builder.clickAndHold(source).moveToElement(dest).release(dest).build();
        action.perform(); 
   }
	 @Test(priority = 0)
    public void resizable() throws InterruptedException{
    	driver.get("https://jqueryui.com/resizable/");
 	   driver.switchTo().frame(0);
      WebElement resize = driver.findElement(By.cssSelector("div.ui-resizable-handle:nth-child(4)"));	
 	  Actions builder = new Actions(driver);
      Action action = builder.clickAndHold(resize).moveToElement(resize, 150, 100).build();
      action.perform();
    }
	 @Test(priority = 2)
    public void selectable() throws InterruptedException{
        driver.get("https://jqueryui.com/selectable/");
 	    driver.switchTo().frame(0);
 	      WebElement select1  = driver.findElement(By.cssSelector("li.ui-widget-content:nth-child(1)"));	
 	      WebElement select6  = driver.findElement(By.cssSelector("li.ui-widget-content:nth-child(6)"));
 	      //select.click();
 	     Actions builder = new Actions(driver);
 	     Action action = builder.clickAndHold(select1).moveToElement(select6).release().build();
 	     action.perform();
    }
//    public static void sortable() throws InterruptedException{
//        driver.get("https://jqueryui.com/sortable/");
// 	    driver.switchTo().frame(0);
//	    WebElement select2  = driver.findElement(By.cssSelector("li.ui-state-default:nth-child(2)"));	
//	    WebElement select4  = driver.findElement(By.cssSelector("li.ui-state-default:nth-child(4)"));	
//	    Actions builder = new Actions(driver);
//	     Action action = builder.clickAndHold(select2).moveToElement(select4).release().build();
//	     action.perform();
//    	}
	 @AfterClass
    public void mouseHover() throws InterruptedException{
//    	driver.get("http://demo.guru99.com/selenium/newtours/");
//    	WebElement mouse = driver.findElement(By.linkText("Home"));
//    	WebElement hover = driver.findElement(By.xpath("//html/body/div"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr"));
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Actions builder = new Actions(driver);
//        Action action = builder.moveToElement(mouse).build();
//        String  s = hover.getCssValue("background-color");
//        System.out.println("Before hover: " +s);        
//        action.perform();
//        s = hover.getCssValue("background-color");
//        System.out.println("After hover: " +s);        
       driver.get("https://themeforest.net/");
   	   WebElement mouse = driver.findElement(By.linkText("HTML"));
       Actions builder = new Actions(driver);
       Action action = builder.moveToElement(mouse).build();
       String  s = mouse.getCssValue("background-color");
       System.out.println("Before hover: " +s);        
       action.perform();
       s = mouse.getCssValue("background-color");
       System.out.println("After hover: " +s);        
      }
   
 }
