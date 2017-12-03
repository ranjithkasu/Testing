package second;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Eval1 {
	public static WebDriver driver;
	public static void main(String args[] )throws Exception{
//		System.setProperty("webdriver.gecko.driver", "/home/ranjith/Downloads/geckodriver");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		register();
		details();
		verifiy();
		fillpassenger();
	}
	public static void register() throws InterruptedException {
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("ranjith");
		driver.findElement(By.name("lastName")).sendKeys("kasu");
 		driver.findElement(By.name("phone")).sendKeys("88686868");
 		driver.findElement(By.id("userName")).sendKeys("kasuranjith.kumar@clicklabs.co");
 
		driver.findElement(By.name("address1")).sendKeys("pal dhaba");
 		driver.findElement(By.name("address2")).sendKeys("Madhyamarg");
 		driver.findElement(By.name("city")).sendKeys("chandigarh");
 		driver.findElement(By.name("state")).sendKeys("Punjab");
 		driver.findElement(By.name("postalCode")).sendKeys("100021");
 		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
 		driver.findElement(By.id("email")).sendKeys("kasu@96");
 		driver.findElement(By.name("password")).sendKeys("8699977158");
 		driver.findElement(By.name("confirmPassword")).sendKeys("8699977158");
 		driver.findElement(By.name("register")).click();
 		driver.findElement(By.linkText("sign-in")).click();
		
		
	}
	
	private static void details()throws Exception{
		//driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		driver.findElement(By.name("userName")).sendKeys("kasu@96");
		driver.findElement(By.name("password")).sendKeys("8699977158");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
      WebElement radio = driver.findElement(By.cssSelector("input[value='oneway']"));
	  radio.click();
	  Select sel1,sel2,sel3,sel4,sel5,sel6;
	  sel1 = new Select(driver.findElement(By.name("passCount")));
		sel1.selectByVisibleText("3");
		 sel2 = new Select(driver.findElement(By.name("fromPort")));
			sel2.selectByVisibleText("New York");
			 sel3 = new Select(driver.findElement(By.name("fromMonth")));
				sel3.selectByVisibleText("December");
				 sel4 = new Select(driver.findElement(By.name("fromDay")));
					sel4.selectByVisibleText("26");
					 sel5 = new Select(driver.findElement(By.name("toPort")));
						sel5.selectByVisibleText("London");
					      driver.findElement(By.cssSelector("input[value='Business']")).click();
						 sel6 = new Select(driver.findElement(By.name("airline")));
							sel6.selectByVisibleText("Unified Airlines");
							 driver.findElement(By.name("findFlights")).click();
							 //Thread.sleep(2000);
	}
public static void verifiy()throws Exception{
	
	String deptime="09:17";
	String rettime="14:30";
	WebElement e;
	int i=3;
	while(i!=11)
	{
		e= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child("+i+") > td.data_center_mono > font"));
		if(e.getText().equals(deptime))
		{
			driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child("+i+") > td.frame_action_xrows > input[type=\"radio\"]")).click();
		}
		i=i+2;
	}
	
	int j=3;
	while(j!=11)
	{
		e= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child("+j+") > td.data_center_mono > font"));
		if(e.getText().equals(rettime))
		{
			driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child("+j+") > td.frame_action_xrows > input[type=\"radio\"]")).click();
		}
		j=j+2;
	}
 }
	public static void fillpassenger()throws Exception{
        Select sel1,sel2,sel3,sel4,sel5,sel6,sel7;

	    driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).sendKeys("salman");
        driver.findElement(By.name("passLast0")).sendKeys("khan");
        sel1 = new Select(driver.findElement(By.name("pass.0.meal")));
		sel1.selectByVisibleText("Hindu");
        driver.findElement(By.name("passFirst1")).sendKeys("shahrukh");
        driver.findElement(By.name("passLast1")).sendKeys("khan");
        sel2 = new Select(driver.findElement(By.name("pass.0.meal")));
		sel2.selectByVisibleText("Muslim");
        driver.findElement(By.name("passFirst2")).sendKeys("amir");
        driver.findElement(By.name("passLast2")).sendKeys("khan");
        sel3 = new Select(driver.findElement(By.name("pass.0.meal")));
		sel3.selectByVisibleText("Vegetarian");
		
        sel4 = new Select(driver.findElement(By.name("creditCard")));
		sel4.selectByVisibleText("Visa");
 		driver.findElement(By.name("creditnumber")).sendKeys("26263636");
 		 sel5 = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
 		sel5.selectByVisibleText("10");
 		sel6 = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
 		sel6.selectByVisibleText("2010");
		driver.findElement(By.name("cc_frst_name")).sendKeys("ranjith");
		driver.findElement(By.name("cc_mid_name")).sendKeys("kumar");
		driver.findElement(By.name("cc_last_name")).sendKeys("kasu");

		driver.findElement(By.name("billAddress1")).sendKeys("h.no.123, hyderabad");
		driver.findElement(By.name("billCity")).sendKeys("Hyderabad");
		driver.findElement(By.name("billState")).sendKeys("Telangana");
		driver.findElement(By.name("billZip")).sendKeys("500002");
		sel7 = new Select(driver.findElement(By.name("billCountry")));
 		sel7.selectByVisibleText("INDIA");
 	    driver.findElement(By.name("ticketLess")).click();
	    driver.findElement(By.name("buyFlights")).click();
	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	    Files.copy(src, new File("/home/ranjith/Desktop/booking.png"));
	    }

	    catch (IOException e)
	     {
	      System.out.println(e.getMessage());

	     }
	}
}
