package first;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class windowHandle {
	public static  WebDriver driver;
	public static void main(String []args) throws InterruptedException {
 		System.setProperty("webdriver.chrome.driver", "/home/ranjith/Downloads/chromedriver");
	   	driver = new ChromeDriver();
	   	driver.get("https://naukri.com");
        driver.manage().window().maximize();		
        String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            java.util.Set<String> s1=driver.getWindowHandles();		
        java.util.Iterator<String> i1=s1.iterator();
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	
                    Thread.sleep(1000);
                    if(driver.getCurrentUrl().equals("https://companies.naukri.com/synchronyfinancial-jobs/jobs/")) 
                    {
                    driver.manage().window().maximize();
//                    driver.findElement(By.cssSelector("#Sug_kwdsugg")).sendKeys("java");
//                    Thread.sleep(2000);
//                    driver.findElement(By.cssSelector("#s_form")).click();
                    }	                    
                    //driver.close();		
	}   
  }
       // driver.switchTo().window(MainWindow);				
 }
}