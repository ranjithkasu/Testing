
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trail {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasur\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://cloudgit.smartron.com/snippets/118");
		driver.manage().window().maximize();
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
		login.sendKeys("kasu.ranjith@smartron.com");
		driver.findElement(By.id("user_password")).sendKeys("Kamala@96");
		driver.findElement(By.cssSelector("#new_user > div.submit-container.move-submit-down > input")).click();
		Thread.sleep(3000);
		// String user =
		// driver.findElement(By.xpath("//*[@id=\"content-body\"]/div[3]/article/div[3]/div/div/p[1]")).getText();
		// System.out.println(user);

		List<WebElement> elements = driver
				.findElements(By.xpath("//*[@id=\"content-body\"]/div[3]/article/div[3]/div/div/p[1]"));
		System.out.println(elements.size());
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
		// java.util.Iterator<WebElement> i = elements.iterator();
//    while(i.hasNext()) {	
//        WebElement element = i.next();
//        if (element.isDisplayed()) {
//           System.out.println(element.getText());
//    }else {
//        System.out.println("nothing");
//    }
//}

		// List<WebElement> elements =
		// driver.findElements(By.xpath("//*[@id=\"content-body\"]/div[3]/article/div[3]/div/div/p[1]/code"));
//     int count = elements.size();
//     System.out.println(count);

	}

}