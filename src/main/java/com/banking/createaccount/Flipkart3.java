package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedTitle="Iphone16";
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		e.sendKeys("iphone16");
		e.submit();
		Thread.sleep(1000);
		String actualTitle=driver.getTitle();
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Product page is displayed");
		}
		else
		{
			System.out.println("Product page is not displayed");
		}
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(1000);
		List<WebElement>productNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement>productPrices=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for(int i=0;i<productNames.size();i++)
		{
			System.out.println("Product: "+ productNames.get(i).getText()+"-->Price: "+productPrices.get(i).getText());
		}

	}

}
