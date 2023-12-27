package testngp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;

public class Facebook {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
  }
  @Test
  public void loginTheFacebook() {
	  	driver.findElement(By.name("email")).sendKeys("chandusunilkumarakula@gmail.com");
	  	driver.findElement(By.name("pass")).sendKeys("Kumar@143");
	  	driver.findElement(By.name("login")).click();
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
