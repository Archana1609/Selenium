package task1;


//day7-->task 2
import org.junit.Assert;
import org.testng.annotations.Test;



public class calculator {
	int a=10,b=2,c;
  @Test
  public void add() {
	  c=a+b;
	  Assert.assertEquals(12,c);
  }
  @Test
  public void subtract() {
	  c=a-b;
	  Assert.assertEquals(8,c);
  }
  @Test
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(20,c);
	  
  }
  @Test
  public void divide() {
	  c=a/b;
	  Assert.assertEquals(5,c);
	  
  }
}
