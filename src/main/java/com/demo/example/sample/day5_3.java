package com.demo.example.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_3 {
	 public static void main( String[] args )
	    {
	     WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401",Keys.ENTER);
	     Alert alert=driver.switchTo().alert();
	     alert.dismiss();
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
	     alert.accept();
	     String msg=alert.getText();
	     System.out.println(msg);
	     alert.accept();
	    }
}
