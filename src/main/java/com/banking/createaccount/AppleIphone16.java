package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleIphone16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone16");
		Thread.sleep(1000);
		WebElement searchIcon=driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchIcon.click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Plus (Black, 256 GB)']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	}

