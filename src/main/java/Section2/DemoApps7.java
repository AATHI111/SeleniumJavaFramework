package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		WebElement DragMe=driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.doubleClick(DragMe).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(DragMe, -100, 250).perform();
		act.release(DragMe);
	}

}
