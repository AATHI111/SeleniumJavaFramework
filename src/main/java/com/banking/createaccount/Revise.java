package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		e.sendKeys("One Plus Mobile 5G");
		e.submit();
		Thread.sleep(4000);
		WebElement el=driver.findElement(By.xpath("//span[text()='1-16 of over 20,000 results for']"));
		Thread.sleep(1000);
		if(el.isDisplayed())
		{
			System.out.println("Product page is displayed");
		}
		else
		{
			System.out.println("Product page is not displayed");
		}
		Thread.sleep(1000);
		List<WebElement> AddToCompareProduct=driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for(int i=0;i<AddToCompareProduct.size();i++)
		{
			if(i==1||i==2||i==4||i==AddToCompareProduct.size()-1)
			{
				AddToCompareProduct.get(i).click();
				Thread.sleep(1000);
			}
		}
	}

}
