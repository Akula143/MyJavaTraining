package testngp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNgParameters {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "broswer", "url", "username", "password" })
	public void beforeMethod(String browser, String url, String username, String password) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}

	@Test
	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		String actHeading = driver.findElement(By.xpath("//p[contains(text(),'Add New Customer')]")).getText();
		System.out.println(actHeading);
		Assert.assertTrue(actHeading.contains("Add New Customer"), "add new customer page validation failed");
	}

	@Test
	public void deleteCustomer() {
		driver.findElement(By.linkText("Delete Customer")).click();
		String actHeading = driver.findElement(By.xpath("//p[contains(text(),'Delete Account Form')]")).getText();
		System.out.println(actHeading);
		Assert.assertTrue(actHeading.contains("Delete Customer"), "delete customer page validation failed");
	}

	@Test
	public void editCustomer() {
		driver.findElement(By.linkText("Edit Customer")).click();
		String actHeading = driver.findElement(By.xpath("//p[contains(text(),'Edit Customer Form')]")).getText();
		System.out.println(actHeading);
		Assert.assertTrue(actHeading.contains("Edit Customer"), "edit customer page validation failed");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
