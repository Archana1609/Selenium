package task1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 driver.manage().window().maximize();
	  }
	  @Test
	  public void Login() throws InterruptedException {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
		  String url = driver.getCurrentUrl();
		  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  Thread.sleep(3000);
		  System.out.println("logged in successfully");
	  }
  @Test(dependsOnMethods= {"Login"})
  public void Logout() throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  System.out.println("Logout");
  }
  }

