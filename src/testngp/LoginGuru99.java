package testngp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginGuru99 {
	WebDriver driver;
 
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
  }
  @Test(priority=1, groups="Valid Login")
  public void loginTestCaseValid() {
	  driver.findElement(By.name("uid")).sendKeys("mngr543442");
	  driver.findElement(By.name("password")).sendKeys("dagevUj");
	  driver.findElement(By.name("btnLogin")).click();
	 String successMessage= driver.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")).getText();
	 Assert.assertTrue(successMessage.contains("Welcome"),"System login failed");
  }
  @Test(priority=2, groups="InValid Login")
  public void loginTestCaseInValid1() {
	  driver.findElement(By.name("uid")).sendKeys("manager");
	  driver.findElement(By.name("password")).sendKeys("dagevUj");
	  driver.findElement(By.name("btnLogin")).click();
	Alert alert = driver.switchTo().alert();
	String alertmessage=alert.getText();
	System.out.println(alertmessage);
	alert.accept();
	Assert.assertTrue(alertmessage.contains("not valid1"), "System in logged in with invalid credentials");
  }
  @Test(priority=3,dependsOnMethods="loginTestCaseInValid1", groups="InValid Login")
  public void loginTestCaseInValid2() {
	  driver.findElement(By.name("uid")).sendKeys("manager");
	  driver.findElement(By.name("password")).sendKeys("password");
	  driver.findElement(By.name("btnLogin")).click();
	Alert alert = driver.switchTo().alert();
	String alertmessage=alert.getText();
	alert.accept();
	Assert.assertTrue(alertmessage.contains("not valid"), "System in logged in with invalid credentials");
  }
  @Test(priority=4,dependsOnMethods="loginTestCaseInValid1", groups="InValid Login")
  public void loginTestCaseInValid3(){
	  driver.findElement(By.name("uid")).sendKeys("mngr543442");
	  driver.findElement(By.name("password")).sendKeys("password");
	  driver.findElement(By.name("btnLogin")).click();
	Alert alert = driver.switchTo().alert();
	String alertmessage=alert.getText();
	alert.accept();
	Assert.assertTrue(alertmessage.contains("not valid"), "System in logged in with invalid credentials");
	
  }
	 
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 // Thread.sleep(1000);
	 driver.close();
  }

}
