package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedUrl="dashboard";
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		WebElement passwordTextfield=driver.findElement(By.name("password"));
		passwordTextfield.sendKeys("admin123");
		Thread.sleep(1000);
		passwordTextfield.submit();
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("dashboard page is displayed");
		}
		else
		{
			System.out.println("dashboard page is not displayed");
		}
		

	}

}
