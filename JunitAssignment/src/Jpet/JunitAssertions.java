package Jpet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.assertEquals;


public class JunitAssertions {
	WebDriver driver;
@Test
public void test1() throws InterruptedException
{
//	String expectedTitle= "Swag Labs";
//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]"));
//	
	String expectedTitle = "Swag Labs";
    String actualTitle = driver.getTitle();
    assertEquals("Title should match", expectedTitle, actualTitle);

   // Assertions.assertEquals(expectedTitle, actualTitle, "Title should match");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    Thread.sleep(2000);
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(1000);
    String expectedurl="https://www.saucedemo.com/inventory.html";
	String actualurl=driver.getCurrentUrl();
	assertEquals("sameurl", actualurl, expectedurl);
	 driver.findElement(By.className("inventory_item_img")).click();
     Thread.sleep(1000);
     
     String expectedTitle1="Sauce Labs Backpack"; 
     String actualTitle1=driver.getTitle();
     assertEquals("Title should match",expectedTitle,actualTitle);
        
     
     driver.findElement(By.id("add-to-cart")).click();
     Thread.sleep(1000);
     driver.findElement(By.className("shopping_cart_link")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("continue-shopping")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
     Thread.sleep(2000);
     driver.findElement(By.className("shopping_cart_link")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("checkout")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("first-name")).sendKeys("harish"); 
     Thread.sleep(2000);
     driver.findElement(By.id("last-name")).sendKeys("Warrier");
     Thread.sleep(2000);
     driver.findElement(By.id("postal-code")).sendKeys("695013");
     Thread.sleep(2000);
     driver.findElement(By.id("continue")).click();
     Thread.sleep(2000);
     
     String expectedurl1="https://www.saucedemo.com/checkout-step-two.html";
     String actualurl1=driver.getCurrentUrl();
     assertEquals("same URL",actualurl1,expectedurl1);
     
     driver.findElement(By.id("finish")).click();
     Thread.sleep(2000);
     
     String expectedTitle2="Thank you for your order!";
     String actualTitle2=driver.getTitle();
	assertEquals("Title should match",expectedTitle,actualTitle);
}

@Before
public void start() throws InterruptedException
{
	 System.setProperty("webdriver.edge.driver","C:\\selenium\\Edge\\msedgedriver.exe");
	 driver=new EdgeDriver();
	 driver.get("https://www.saucedemo.com/");
     Thread.sleep(2000);
}
@After

public void end()
{
	driver.quit();
	
}
}
