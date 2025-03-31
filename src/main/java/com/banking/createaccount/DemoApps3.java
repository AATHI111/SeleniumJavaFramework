package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedUrl="checkbox";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='cod']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(1000);
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Successfully submitted");
		}
		else
		{
			System.out.println("not submitted");
		}
		driver.findElement(By.xpath("//input[@id='mode6']")).click();
		Thread.sleep(1000);
		

	}

}
