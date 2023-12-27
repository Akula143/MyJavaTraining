package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		 driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		 driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.name("submit")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Upcoming Batches')]")).click();
		//tbody/tr[1]/td[1]
		 int rows=driver.findElements(By.xpath("//tbody/tr")).size();
		 int cols=driver.findElements(By.xpath("//tbody/tr[1]/td")).size();
		 System.out.println("no of rows are "+rows +"no of cols are "+cols);
		 for (int i = 1; i <=rows ; i++) {
			 for (int j = 1; j < cols; j++) {
			String data=driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(data+"  ");
			if ("Hyderabad".equals(data)) {
				driver.findElement(By.xpath("//tbody/tr["+i+"]/td[8]/a[1]/i[1]")).click();
				driver.switchTo().alert().dismiss();
			}
			}
			System.out.println();
		}
	}

}
