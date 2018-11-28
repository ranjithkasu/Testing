package com.testcases;
// for selenium webdriver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//for handling excel data
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main extends Constants {

	public static WebDriver driver;


	// method for initializing and launching the driver
	@BeforeSuite
	public void initDriver()

	{
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C://Users//kasur//Desktop//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// method for login into tronx
	@Test
	public void login() throws Exception {
		driver.get("https://mayavi-staging.smartron.com/");
		WebElement userid = driver.findElement(By.xpath(email));
		userid.sendKeys("kasu.ranjith@smartron.com");
		WebElement password = driver.findElement(By.xpath(pwd));
		password.sendKeys("Kamala@96");
		WebElement loginbtn = driver.findElement(By.xpath(login));
		loginbtn.click();
	}

	// method for giving input in chatbot and writing the result in excel sheet
	@Test
	public void maintest() throws Exception {
		Thread.sleep(5000);
		WebElement input1 = driver.findElement((By.id(input)));
		input1.sendKeys("hello");
        driver.findElement(By.xpath(go)).click();
	}
	
	@Parameters({"excel data"})
	@Test
	public void read(String data){
		  
		  try {
		  File src=new File("C://Users//kasur//eclipse-workspace//Mayavi//src//com//data//Testcases3.xls.xls");
		 
		   FileInputStream fis=new FileInputStream(src);
	        XSSFWorkbook wb=new XSSFWorkbook(fis);
		      XSSFSheet sh1= wb.getSheetAt(0);
		 int rowcount = sh1.getLastRowNum()-sh1.getFirstRowNum();
		 
		  // getRow() specify which row we want to read.
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		 
		 for(int i=0;i<rowcount+1;i++) {
			 Row row = sh1.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                   
		        }
			 
		 }
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
		  
		 }
	

}