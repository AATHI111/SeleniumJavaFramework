package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//button[@id='buttonAlert2']")).click();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[@id='buttonAlert5']")).click();
		
		al.dismiss();
		WebElement e=driver.findElement(By.xpath("//p[text()='You selected Cancel']"));
		if(e.isDisplayed())
		{
			System.out.println("Message is displyed");
		}
		else
		{
		System.out.println("Message is not displyed");	
		}

	}

}
