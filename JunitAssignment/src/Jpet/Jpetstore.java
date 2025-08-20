package Jpet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Jpetstore {
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException
	{
		 driver.findElement(By.name("username")).clear();
         Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys("Harish");
         Thread.sleep(2000);
         driver.findElement(By.name("password")).clear();
         Thread.sleep(2000);
         driver.findElement(By.name("password")).sendKeys("Prathyusha123");
         Thread.sleep(2000);
         driver.findElement(By.name("signon")).click();
         Thread.sleep(2000);         
         driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[1]/img")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("FI-SW-01")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Add to Cart")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Proceed to Checkout")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("order.cardType")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("order.creditCard")).clear();
         Thread.sleep(2000);
         driver.findElement(By.name("order.creditCard")).sendKeys("999999999999999");
         Thread.sleep(2000);
         driver.findElement(By.name("order.expiryDate")).clear();
         Thread.sleep(2000);
         driver.findElement(By.name("order.expiryDate")).sendKeys("12/03");
         Thread.sleep(2000);
         driver.findElement(By.name("newOrder")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/a")).click();
         System.out.println("Clicked confirm button");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/a")).click();
        Thread.sleep(3000);
	}
	
	@Before
	public void start() throws InterruptedException
	{
		 System.setProperty("webdriver.edge.driver","C:\\selenium\\Edge\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=\"");
	     Thread.sleep(2000);
	}
	
	
	@After
public void end()
{
		driver.quit();
}
}
