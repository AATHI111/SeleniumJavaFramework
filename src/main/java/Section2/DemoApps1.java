package Section2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoApps1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 10);
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		String dateStamp=sdf.format(d);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys(dateStamp);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\AATHI 12\\AathiApplication\\com.banking.createaccount\\Screenshot\\img.png");
		Files.copy(src, dest);
	}

}
