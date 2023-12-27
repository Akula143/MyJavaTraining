package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Actions act=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		WebElement target=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		//act.dragAndDrop(target, destination).build().perform();
		//act.clickAndHold(target).moveToElement(destination).build().perform();
		act.doubleClick(destination).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
	}

}
