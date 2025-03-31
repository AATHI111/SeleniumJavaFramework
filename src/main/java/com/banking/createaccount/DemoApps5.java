package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(1000);
		WebElement upi=driver.findElement(By.xpath("//input[@value='upi']"));
		Thread.sleep(1000);
		WebElement home=driver.findElement(By.xpath("//input[@id='willing5']"));
		Thread.sleep(1000);
		if(upi.isDisplayed()&&home.isDisplayed())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}

}
