package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("url of the page is "+url);
		
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		Thread.sleep(2000);
		
	WebElement ele=	driver.findElement(By.id("user-name"));
	ele.sendKeys("standard_user");
	Thread.sleep(2000);
	
	WebElement ele1=	driver.findElement(By.id("password"));
	ele1.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	
	WebElement ele2=driver.findElement(By.id("first-name"));
	Thread.sleep(2000);
	ele2.sendKeys("Isha");
	
	WebElement ele3=driver.findElement(By.id("last-name"));
	Thread.sleep(2000);
	ele3.sendKeys("Mishra");
	
	WebElement ele4=driver.findElement(By.id("postal-code"));
	
	
	ele4.sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("finish")).click();
	Thread.sleep(4000);
	
	
	
	
		
		driver.close();
		
		

	}

}
