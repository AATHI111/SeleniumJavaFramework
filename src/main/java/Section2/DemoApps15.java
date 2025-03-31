package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		Thread.sleep(2000);
		
		WebElement First=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(First);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
