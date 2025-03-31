package com.banking.createaccount;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedUrl="login";
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Random r=new Random();
		int num=r.nextInt(1000);
		String name="aathi";
		String email="aathi"+num+"@gmail.com";
		String password="aathi"+num;
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		WebElement passwordTextfield=driver.findElement(By.name("password"));
		passwordTextfield.submit();
		Thread.sleep(1000);		
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Registration successfully");
		}
		else
		{
			System.out.println("Registration not success");
		}


	}

}
