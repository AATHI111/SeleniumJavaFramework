package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(1000);
		String productName=driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).getText();
		String productPrice=driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']")).getText();
		Thread.sleep(1000);
		System.out.println(productName+" --> "+productPrice);
		//div[text()='Apple iPhone 16 (White, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']

	}

}
