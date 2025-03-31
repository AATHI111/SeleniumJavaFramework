package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("IPhone 16",Keys.ENTER);
		String parentId = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
		Thread.sleep(3000);
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds)
		{
			driver.switchTo().window(id);
			driver.close();
		Thread.sleep(3000);
		}

	}

}
