package day_9;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class task1 {
  @Test(dataProvider = "dp",priority=1)
  public void add(int num1,int num2,int expected) {
	  int actual=num1+num2;
	  Assert.assertEquals(expected, actual);
  }
  @Test
  public void sub(int num1,int num2,int expected) {
	  int actual=num1-num2;
	  Assert.assertEquals(actual,expected);
  }
  @Test
  public void multiply(int num1,int num2,int expected) {
	  int actual=num1*num2;
	  Assert.assertEquals(actual,expected);
  }
  @Test
  public void divide(int num1,int num2,int expected) {
	  int actual=num1/num2;
	  Assert.assertEquals(actual,expected);
  }
  @DataProvider
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {1,2,3},
		  new Object[] {2,3,5},
		  new Object[] {4,2,6}
	  };
  }
  
}
