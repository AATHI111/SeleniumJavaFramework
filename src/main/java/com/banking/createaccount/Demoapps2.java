package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("AATHI");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aathimurugan010@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aathi@7003");
		Thread.sleep(1000);
		WebElement passwordTextfield=driver.findElement(By.xpath("//button[text()='Register']"));
		passwordTextfield.submit();
		Thread.sleep(1000);		

	}

}
