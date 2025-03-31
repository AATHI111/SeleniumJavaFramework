package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	private static final String CurrentUrl = null;
	private static WebElement dropdown;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedUrl="dashboard";
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000) ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(1000);
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Dashboard page is displayed");
		}
		else
		{
			System.out.println("Dashboard page is not displayed");
		}
		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		Thread.sleep(1000);
		Select select=new Select(dropdown);
		select.selectByVisibleText("Admin");
		select.selectByVisibleText("ESS");
		select.selectByValue("Admin");
		select.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("aathimurugan01");
		
	}

}
