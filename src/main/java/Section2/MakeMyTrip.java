package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Mumbai");
		from.sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		WebElement To=driver.findElement(By.xpath("//input[@placeholder='To']"));
		To.sendKeys("Bengaluru");
		Thread.sleep(2000);
		To.sendKeys(Keys.DOWN,Keys.ENTER);
		
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		driver.findElement(By.xpath("(//p[text()='1'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='infants-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='travelClass-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();

	}

}
