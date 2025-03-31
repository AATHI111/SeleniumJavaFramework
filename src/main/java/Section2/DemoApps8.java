package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoApps8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='select1']"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		
		WebElement ele1=driver.findElement(By.xpath("//select[@id='select2']"));
		Select sel1=new Select(ele1);
		sel1.selectByValue("male");
		
		WebElement ele2=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel2=new Select(ele2);
		sel2.selectByVisibleText("India");
		

	}

}
