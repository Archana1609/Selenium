package com.demo.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	     driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Jeslin");
	     driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("jeslin26@gmail.com");
	     driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Archana");
	     driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Archana16@gmail.com");
	     driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy birthday Jeslin");
	     driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("500");
	}

}
