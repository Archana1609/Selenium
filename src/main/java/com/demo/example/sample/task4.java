package com.demo.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
 public static void main(String[]args)throws InterruptedException {
	 WebDriverManager.edgedriver().setup();
     WebDriver driver=new EdgeDriver();
     driver.navigate().to("https://j2store.net/free/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div")).click();
     driver.navigate().back();
     driver.navigate().forward();
     Thread.sleep(5000);
     driver.navigate().refresh();
 }
}
