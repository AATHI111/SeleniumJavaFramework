package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement Search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Search.sendKeys("IPhone 16");
		Search.submit();
		
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/descendant::div[@class='PYKUdo']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/following::div[@class='PYKUdo']"));

		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.clickAndHold(e).perform();
		act.dragAndDropBy(e, 100, 0).perform();
		act.release().perform();
		Thread.sleep(2000);
		
		act.clickAndHold(e1).perform();
		act.dragAndDropBy(e1, -100, 0).perform();
		act.release().perform();
		Thread.sleep(1000);
	}

}
