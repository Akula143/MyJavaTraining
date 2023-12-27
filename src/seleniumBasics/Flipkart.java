package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8919650107");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[3]/button")).click();
			driver.findElement(By.id("SEzYemhAGCmxttn")).click();

	}

}
