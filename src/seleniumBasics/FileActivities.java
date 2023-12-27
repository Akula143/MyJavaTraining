package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		 driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		 driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.name("submit")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Courses List')]")).click();
		 driver.findElement(By.xpath("//*[@id=\"right-panel\"]/header/div/div/div/a")).click();
		 driver.findElement(By.name("userfile")).sendKeys("C:\\Users\\user\\eclipse-workspace\\MyJavaTraining\\image\\wp9237277-alone-pc-wallpapers.jpg");
	}

}
