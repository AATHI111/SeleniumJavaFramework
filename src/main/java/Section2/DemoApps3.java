package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		
		WebElement clickYES=driver.findElement(By.xpath("//button[@id='btn20']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.doubleClick(clickYES).perform();
		WebElement clickNO=driver.findElement(By.xpath("//button[@id='btn23']"));
		act.doubleClick(clickNO).perform();
		WebElement click4=driver.findElement(By.xpath("//button[@id='btn27']"));
		act.doubleClick(click4).perform();
		Thread.sleep(1000);
		
		
		WebElement meYes=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println("Select Yes option:" + meYes.getText());
		if(meYes.isDisplayed())
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Is not displayed");
		}
		WebElement meNO=driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println("Select No option:" + meNO.getText());
		if(meNO.isDisplayed())
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Is not displayed");
		}
		WebElement me4=driver.findElement(By.xpath("//span[text()='You selected \"4\"']"));
		System.out.println("Select 4 option:"+ me4.getText());
		if(me4.isDisplayed())
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Is not displayed");
		}
		driver.quit();
	}

}
