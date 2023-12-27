package testngp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class GuruLoginWithDataProvider {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.demo.guru99.com/V4/");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
	  }
  @Test(dataProvider = "testData")
  public void f(String username, String password, String Expresults) {
		  driver.findElement(By.name("uid")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("btnLogin")).click();
		  if (Expresults.equals("Welcome")) {
			  String successMessage= driver.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")).getText();
				 Assert.assertTrue(successMessage.contains("Welcome"),"System login failed");
		} else {
			Alert alert = driver.switchTo().alert();
			String alertmessage=alert.getText();
			System.out.println(alertmessage);
			alert.accept();
			Assert.assertTrue(alertmessage.contains("not valid"), "System in logged in with invalid credentials");
		}
		 
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  public Object[][] getData() throws IOException {
	 XLUtility reader=new XLUtility(".\\excelsheets\\Test case.xlsx");
	int rows= reader.getRowCount("gurusheet1");
	 int cols= reader.getCellCount("gurusheet1", 1);
	 System.out.println("no of rows "+rows+ "no of columns "+cols);
	 Object[][] data= new Object[rows][cols];
	 for (int i = 2; i < rows; i++) {
		 for (int j = 0; j < cols; j++) {
			 data[i-2][j]=reader.getCellData("gurusheet1", i, j);
			 
			
		}
		
	}
	 return data;
  }

  @DataProvider
  public Object[][] testData() throws IOException {
	return getData();
    
  }
}
