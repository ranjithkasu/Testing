package first;
//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Radio {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/checkboxradio/");
//        driver.switchTo().frame(0);
        //radios();
        //checkBox();
        dropDown();
//        Thread.sleep(1000);
//    	driver.close();

	  }
	public static void radios() throws InterruptedException {
  		WebElement radio= driver.findElement(By.cssSelector("label.ui-checkboxradio-radio-label:nth-child(2)"));
        WebElement radio1= driver.findElement(By.cssSelector("label.ui-checkboxradio-radio-label:nth-child(4)"));
        WebElement radio2= driver.findElement(By.cssSelector("label.ui-checkboxradio-radio-label:nth-child(6)"));
        radio.click();
        Thread.sleep(2000);
        if (radio.isEnabled()) {
        	System.out.println(radio.getText()+" is enabled");
            radio1.click();
            Thread.sleep(2000);
          }
        if(radio1.isEnabled()) {
    	System.out.println(radio.getText()+" is disabled");
    	System.out.println("after that "+radio1.getText()+" is enabled");
              radio2.click();
              Thread.sleep(2000);
        }
        if(radio2.isEnabled()) {
        	System.out.println(radio1.getText()+" is disabled");
        	System.out.println("after that "+radio2.getText()+" is enabled");
        }
	  }
    public static void checkBox() throws InterruptedException{
	    WebElement check1 = driver.findElement(By.cssSelector(".widget > fieldset:nth-child(5) > label:nth-child(2)"));
	    WebElement check2 = driver.findElement(By.cssSelector(".widget > fieldset:nth-child(5) > label:nth-child(4)"));
 	   
	 for(int i=0;i<2;i++) {
		 check1.click();
		 System.out.println("check1 status is "+check1.isSelected());
//		 check2.click();
//		 System.out.println("check2 status is "+check2.isSelected());
	 }
	 check2.click();

	 if(check2.isSelected()) {
		   System.out.println(check2.getText()+" is selected");
		   check2.click();
	   }
     }
    public static void dropDown() throws InterruptedException{
        //driver.switchTo().defaultContent();
//	 WebElement drop1 = driver.findElement(By.linkText("Selectmenu"));
//	 drop1.click();
     //driver.switchTo().frame(0);
	
      driver.get("https://jqueryui.com/resources/demos/selectmenu/default.html");
 	 //driver.findElement(By.cssSelector("#speed > option:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      Select sel = new Select(driver.findElement(By.id("speed")));
  	sel.selectByIndex(2);
    }
	
}
