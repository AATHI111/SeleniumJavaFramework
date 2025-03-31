package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement a=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		a.sendKeys("iphone16");
		a.submit();
		Thread.sleep(1000);
		List<WebElement>productsName=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement link:productsName)
		{
			System.out.println(link.getText());
			Thread.sleep(1000);
		}
		
	

	}

}
