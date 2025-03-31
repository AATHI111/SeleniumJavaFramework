package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		String fromCity="Mumbai";
		String toCity="Bangaluru";
		String expectedMonth="May 2025";
		String expectedDate="10";
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
		int flag=0;
		while(flag==0)
		{
			if(month.getText().equals(expectedMonth))
			{
				flag=1;
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='"+expectedMonth+"']/../following-sibling::div[@class='DayPicker-Body']//p[text()='"+expectedDate+"']"));
	
	}

}
