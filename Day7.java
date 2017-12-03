package second;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class Day7{
	public static WebDriver driver;

	@BeforeClass public void setUp() {
   // code that will be invoked when this test is instantiated
		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/resources/demos/selectmenu/default.html");

 }
 
 @Test(groups = { "fast" },priority = 1)
 public void aFastTest() {
   System.out.println("Fast test");
   
 }
 
 @Test(groups = { "slow" },priority =0)
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 
}