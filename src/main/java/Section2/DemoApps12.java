package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Scroll']/following-sibling::section[@class='ps-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Thread.sleep(2000);
		
		String parentId=driver.getWindowHandle();
		Set<String> next=driver.getWindowHandles();
		for(String id:next)
		{
			if(!id.equals(parentId))
			{
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(4000);
		//Using JavascriptExecutor
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(2500,0);");
				
				Thread.sleep(4000);
				driver.quit();
	}

}
