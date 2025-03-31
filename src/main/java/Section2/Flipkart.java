package Section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipkart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		WebElement sb=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		sb.sendKeys("IPhone 16");
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src=sb.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\AATHI 12\\AathiApplication\\com.banking.createaccount\\Screenshot\\img1.png");
		Files.copy(src, dest);
	}

}
