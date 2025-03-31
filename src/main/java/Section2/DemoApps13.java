package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
		Thread.sleep(2000);
		
		String expectedTitle ="https://demoapps.qspiders.com/ui/browser/Login";
		String parentId = driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String id:allIds)
		{
			driver.switchTo().window(id);
			String actualTitle = driver.getCurrentUrl();
			if(actualTitle.equals(expectedTitle))
			{
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("aathi",Keys.TAB,"aathi123");
			}
		Thread.sleep(2000);
		driver.close();
		}
		
	}

}
