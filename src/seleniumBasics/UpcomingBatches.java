package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpcomingBatches {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		 driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		 driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.name("submit")).click();
		 driver.findElement(By.xpath("/html/body/div/section/div/div/aside/nav/ul[1]/li[4]/a/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"right-panel\"]/header/div/div/div/a")).click();
		 new Select(driver.findElement(By.xpath("//select[@name='course_id']"))).selectByVisibleText("software testing");
		 new Select(driver.findElement(By.xpath("//select[@name='traning_type']"))).selectByVisibleText("0ffline/Online");
		 new Select(driver.findElement(By.xpath("//select[@name='country_id']"))).selectByValue("88");
		// new Select(driver.findElement(By.xpath("//select[@name='city_id']"))).selectByVisibleText("Bhopal");
		 driver.findElement(By.xpath("/html/body/div/section/div/div/section/form/div/div[1]/div[1]/div[3]/select")).click();
		 new Select(driver.findElement(By.xpath("/html/body/div/section/div/div/section/form/div/div[1]/div[1]/div[3]/select"))).selectByValue("687");
		 driver.findElement(By.name("course_date")).sendKeys("20/11/2023");
		 driver.findElement(By.name("course_time")).sendKeys("2/2/2024");
		 driver.findElement(By.name("price")).sendKeys("35000");
		 driver.findElement(By.name("duration")).sendKeys("3 Months");
		 driver.findElement(By.name("no_of_registartions")).sendKeys("1");
		 driver.findElement(By.xpath("//input[@value='save']")).click();
		 String actMessage=driver.findElement(By.xpath("/html/body/div/section/div/div/section/div/div/div[1]")).getText();
		 if (actMessage.contains("success")) {
			System.out.println("Schedule added successfully" +actMessage);
		} else {
			System.out.println("Schedule not added");

		}

	}

}
