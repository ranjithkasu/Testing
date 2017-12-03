package second;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Day6{
 
	public static void main(String[] args) throws InterruptedException {
	    //Create FireFox Profile object
		FirefoxProfile profile = new FirefoxProfile();

		System.setProperty("webdriver.gecko.driver", "/home/ranjith/Downloads/geckodriver");
  		profile.setPreference("browser.download.dir", "/home/ranjith/Desktop");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");        
		profile.setPreference( "browser.download.manager.showWhenStarting", false );
		profile.setPreference( "pdfjs.disabled", true );
		FirefoxOptions options = new FirefoxOptions().setProfile(profile);
			WebDriver driver = new FirefoxDriver(options);    
		driver.get("http://www.sample-videos.com/download-sample-pdf.php");
  		driver.findElement(By.linkText("Click")).click();
        

}}
 