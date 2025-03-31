package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedHomePageTitle="Myntra";
		String expectedPLPPageUrl="puma-shoes ";
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String actualHomePageTitle=driver.getTitle();
		if(actualHomePageTitle.contains(expectedHomePageTitle))
		{
			System.out.println("Myntra home page is displayed");
		}
		else
		{
			System.out.println("Myntra home page is not displayed");
		}
		WebElement searchBar=driver.findElement(By.className("desktop-searchBar"));
		searchBar.sendKeys("puma shoes");
		Thread.sleep(1000);
		WebElement searchIcon=driver.findElement(By.className("desktop-submit"));
		searchIcon.click();
		String actualPLPPageUrl=driver.getCurrentUrl();
		if(actualPLPPageUrl.contains(expectedPLPPageUrl))
		{
			System.out.println("Product page is displayed");
		}
		else
		{
			System.out.println("Product page is not displayed");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
