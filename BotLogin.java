package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BotLogin {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasur\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mayavi-staging.smartron.com/");
		driver.manage().window().maximize();

	}
//login page for bot
}
