package com.banking.createaccount;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizingAndRelocating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Dimension d=new Dimension(400,600);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p=new Point(400,600);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
	}

}
