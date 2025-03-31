package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("IPhone 16",Keys.ENTER);
		WebElement el=driver.findElement(By.xpath("//span[contains(text(),'Showing 1 – 24 ')]"));
		if(el.isDisplayed())
		{
			System.out.println("Product page is displayed");
		}
		else
		{
			System.out.println("Product page is not displayed");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
		
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String id:allIds)
		{
			if(!id.equals(parentId))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		WebElement ee=driver.findElement(By.xpath("//a[text()='Apple iPhone 16 (Black, 128 GB)']"));
		if(ee.isDisplayed())
		{
			System.out.println("Add to cart the same product is displayed");
		}
		else
		{
			System.out.println("Add to cart the same product is not displayed");
		}
		driver.quit();
	}

}
