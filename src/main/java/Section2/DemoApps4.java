package Section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DemoApps4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='zoom-button ']"));
		Actions act=new Actions(driver);
		act.clickAndHold(e).perform();
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("D:\\AATHI 12\\AathiApplication\\com.banking.createaccount\\Screenshot\\Demo2.png");
		 Files.copy(src, dest);
		
		 Thread.sleep(1000);
		 act.release(e).perform();
		 
		 driver.quit();
		

	}

}
