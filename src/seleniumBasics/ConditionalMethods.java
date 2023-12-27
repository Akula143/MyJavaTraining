package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		/*3 types of conditional method
		 * 
		 * 1.isDisplayed
		 * 2.isEnabled
		 * 3.isSelected
		 */
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Swhizz");
		boolean generatebtn=driver.findElement(By.xpath("//button[@id='createTxt']")).isEnabled();
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		System.out.println("generate btn is enbled " +generatebtn);
		if (generatebtn) {
			System.out.println("generated button is enbled " +generatebtn);
		}
		else {
			System.out.println("in default the generate button is disabled " +generatebtn);
		}
		boolean download=driver.findElement(By.xpath("//a[@id='link-to-download']")).isDisplayed();
		System.out.println("download link is displayed " +download);
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
	}

}
