package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(1000);
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		Thread.sleep(1000);

		Set<String> allId=driver.getWindowHandles();
		for(String id:allId)
		{
			if(!id.equals(parentId))
			{
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aathi",Keys.TAB,"aathi@123",Keys.TAB,"aathi@123",Keys.ENTER);
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		Thread.sleep(1000);
		String childId=driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String id1:allIds)
		{
			if(!id1.equals(childId))
			{
				driver.switchTo().window(id1);
			}
		}
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("murugan",Keys.TAB,"murugan000",Keys.TAB,"murugan000",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
