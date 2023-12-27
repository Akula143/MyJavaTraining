package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();//maximize the window
		//email
		int inputs=driver.findElements(By.tagName("input")).size();
		System.out.println(inputs);
		 WebElement email=driver.findElement(By.name("email"));
		 email.sendKeys("admin@admin.com");
		// password
		 driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		String actTitle=driver.findElement(By.className("title")).getText();
		System.out.println(actTitle);
		if (actTitle.equalsIgnoreCase("welcome")) {
			System.out.println("System logged in successfully");
			
		} else {
			System.out.println("System logged in failed ");
		}
		driver.close();
	}

}
 