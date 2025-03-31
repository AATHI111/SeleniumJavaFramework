package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(1000);
		WebElement passwordTextfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordTextfield.sendKeys("admin123");
		passwordTextfield.submit();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		Thread.sleep(1000);
		if(e.isDisplayed())
		{
			System.out.println("dashboard page is displayed");
		}
		else
		{
			System.out.println("dashboard page is not displayed");
		}
		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Username']//../following-sibling::div/input")).sendKeys("1AykMu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("TZgRvZq XKyRloQ NzkVix");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
