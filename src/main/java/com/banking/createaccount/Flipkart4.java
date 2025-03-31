package com.banking.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		e.sendKeys("oneplus mobile 5G");
		e.submit();
		Thread.sleep(1000);
		WebElement el=driver.findElement(By.xpath("//span[contains(text(),'Showing 1 – 24 ')]"));
		if(el.isDisplayed())
		{
			System.out.println("product page is displayed");
		}
		else
		{
			System.out.println("product page is not displayed");
		}
		List<WebElement> addToCompareCheckbox=driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<addToCompareCheckbox.size();i++)
		{
			if(i==0||i==2||i==4||i==addToCompareCheckbox.size()-1)
			{
				addToCompareCheckbox.get(i).click();
				Thread.sleep(1000);
			}
		}
			addToCompareCheckbox.get(addToCompareCheckbox.size()-2).click();
			Thread.sleep(1000);
			WebElement me=driver.findElement(By.xpath("//div[@class='eIDgeN"));
			if(me.isDisplayed())
			{
				System.out.println("message is displayed");
			}
			else
			{
				System.out.println("message is not displayed");
			}
			System.out.println(me.getText());	
		}
	}


