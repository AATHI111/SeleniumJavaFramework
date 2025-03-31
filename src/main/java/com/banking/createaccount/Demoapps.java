package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("aathi");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("aathi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("aathi123");
		Thread.sleep(2000);
		WebElement passwordTextfield=driver.findElement(By.name("password"));
		passwordTextfield.submit();
	}

}
