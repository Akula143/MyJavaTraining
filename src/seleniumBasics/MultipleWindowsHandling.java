package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.keralartc.com/");
		boolean booknowbt=driver.findElement(By.xpath("//div[contains(text(),'Book Now')]")).isDisplayed();//book now
		driver.findElement(By.xpath("//div[contains(text(),'Book Now')]")).click();
		System.out.println("book now button is clicked" +booknowbt);
		//driver.findElement(By.xpath("//div[contains(text(),'Tenders')]")).click();//Tenders
		//driver.findElement(By.xpath("")).click(); //Tour Packages


	}

}
