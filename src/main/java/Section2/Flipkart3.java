package Section2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("IPhone 16");
		search.submit();
		//Using Keyboard Actions
		//Robot r=new Robot();
		//for(int i=0;i<5;i++)
		//{
			//r.keyPress(KeyEvent.VK_PAGE_DOWN);
			//r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			//Thread.sleep(1000);
		//}
		
		//Using Mouse Actions
		//WebElement ele=driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Pro Max (White Titanium, 256 GB)']"));
		//Actions act = new Actions(driver);
		//act.scrollToElement(ele).perform();
		
		//Using JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500);");
		
		
	}

}
