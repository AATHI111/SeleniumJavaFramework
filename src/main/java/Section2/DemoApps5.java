package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement e1=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(e,e1).perform();
		Thread.sleep(1000);
		
		WebElement e2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.dragAndDrop(e2,e1).perform();
		Thread.sleep(1000);
		
		WebElement e4=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement e5=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(e4,e5).perform();
		Thread.sleep(1000);
		
		WebElement e6=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		act.dragAndDrop(e6,e5).perform();
		Thread.sleep(1000);
		

	}

}
