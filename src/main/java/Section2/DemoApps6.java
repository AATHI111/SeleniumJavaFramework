package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//button[@id='btn30']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		act.contextClick(e).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		WebElement e1=driver.findElement(By.xpath("//button[@id='btn31']"));
		act.moveToElement(e1).perform();
		act.contextClick(e1).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		WebElement e2=driver.findElement(By.xpath("//button[@id='btn32']"));
		act.moveToElement(e2).perform();
		act.contextClick(e2).perform();
		driver.findElement(By.xpath("//div[text()='2']")).click();
		

	}

}
