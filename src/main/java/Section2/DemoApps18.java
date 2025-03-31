package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement nameTextField = driver.findElement(By.xpath("//input[@id='name']"));
		jse.executeScript("document.querySelector(\"#name\").removeAttribute('disabled');");
		nameTextField.sendKeys("AATHI");
		Thread.sleep(2000);
		
		WebElement emailTextField = driver.findElement(By.xpath("//input[@id='email']"));
		jse.executeScript("document.querySelector(\"#email\").removeAttribute('disabled');");
		emailTextField.sendKeys("aathimurugan010@gmail.com");
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@type='password']"));
		jse.executeScript("document.querySelector(\"#password\").removeAttribute('disabled');");
		//jse.executeScript("arguments[0].removeAttribute('disabled');", passwordTextField);
		passwordTextField.sendKeys("aath@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
