package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClas {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
	//	driver.findElement(By.partialLinkText("Exempted Es"));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Exempted Es"))).build().perform();
		//act.contextClick(driver.findElement(By.partialLinkText("Exempted Es"))).build().perform();
		act.moveToElement(driver.findElement(By.partialLinkText("Exempted Es"))).contextClick().build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'List of Exempted Establishment')]")).click();
	}

}
