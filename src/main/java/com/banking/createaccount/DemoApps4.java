package com.banking.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/ui/checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='domain2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mode3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mode6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[text()='Successfully Submitted!']"));
		System.out.println(e.getText());
		driver.quit();
	}

}
