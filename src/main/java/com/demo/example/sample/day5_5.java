package com.demo.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_5 {
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
		 WebDriver edgedriver=new EdgeDriver();
	    
	     ChromeOptions co=new ChromeOptions(); 
	       co.addArguments("--remote-allow-origins=*");

		WebDriver chromedriver = new ChromeDriver(co);
	   
		edgedriver.get("https://www.google.com/");
	    chromedriver.get("https://www.google.com/");
	   edgedriver.manage().window().maximize();
	   chromedriver.manage().window().maximize();
	   edgedriver.findElement(By.xpath("")).sendKeys("",Keys.ENTER);
	   chromedriver.findElement(By.xpath("")).sendKeys("",Keys.ENTER);
	   String chromeid=chromedriver.getWindowHandle();
	   String edgeid=edgedriver.getWindowHandle();
	   System.out.println("Edge"+edgeid);
	   System.out.println("chrome"+chromeid);
	   edgedriver.quit();
	   chromedriver.quit();
	}
}
