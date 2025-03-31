package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Living Room Furniture']"));
		act.moveToElement(ele1).perform();
		Thread.sleep(1000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//a[@class='_3490ry']"));
		for(WebElement option:allOptions)
		{
			if(option.getText().startsWith("S"))
			{
				System.out.println(option.getText());
				
			}
		}
		

	}

}
