package Section2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoApps9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("India");
		Thread.sleep(2000);

		WebElement ele1=driver.findElement(By.xpath("//select[@id='select5']"));
		Select state=new Select(ele1);
		List<WebElement> options=state.getOptions();
		ArrayList<String> stateOptions=new ArrayList<String>();
		for(WebElement list:options)
		{
			stateOptions.add(list.getText());
		}
		Collections.sort(stateOptions);
		
		for(String list:stateOptions)
		{
			System.out.println(list);
		}

	}

}
