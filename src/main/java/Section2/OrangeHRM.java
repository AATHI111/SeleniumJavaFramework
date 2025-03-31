package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB, "admin123", Keys.ENTER);
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		if(e.isDisplayed())
		{
			System.out.println("Dashboard page is displayed");
		}
		else
		{
			System.out.println("Dashboard page is not displayed ");
		}

	}

}
