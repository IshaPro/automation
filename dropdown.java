package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();

driver.get("https://blazedemo.com/");

Thread.sleep(2000);
		
driver.manage().window().maximize();

		
Thread.sleep(2000);	

String url=driver.getCurrentUrl();

System.out.println("url of the page is "+url);
String title=driver.getTitle();

System.out.println("title of the page "+title);

WebElement ele=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));

Select drp=new Select(ele);

drp.selectByValue("Boston");

Thread.sleep(2000);
WebElement ele1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
Select drp1=new Select(ele1);

drp1.selectByValue("London");

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
Thread.sleep(4000);

driver.get("https://blazedemo.com/register");

Thread.sleep(2000);
driver.manage().window().maximize();

Thread.sleep(2000);

WebElement ele2=driver.findElement(By.id("name"));
Thread.sleep(2000);


ele2.sendKeys("Isha Mishra");
Thread.sleep(2000);

WebElement ele3=driver.findElement(By.id("company"));

Thread.sleep(2000);

ele3.sendKeys("XYZ");
Thread.sleep(2000);

WebElement ele4=driver.findElement(By.id("email"));
Thread.sleep(2000);
ele4.sendKeys("isha@123");
Thread.sleep(2000);


WebElement ele5=driver.findElement(By.id("password"));
Thread.sleep(2000);

ele5.sendKeys("123");
Thread.sleep(2000);


WebElement ele6=driver.findElement(By.id("password-confirm"));
Thread.sleep(2000);

ele6.sendKeys("123");
Thread.sleep(2000);


driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();

Thread.sleep(4000);

driver.get("https://blazedemo.com/login");
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

WebElement ele7=driver.findElement(By.id("email"));
Thread.sleep(2000);

ele7.sendKeys("isha@123");
Thread.sleep(2000);

WebElement ele8=driver.findElement(By.id("password"));
Thread.sleep(2000);

ele8.sendKeys("123");

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")).click();

Thread.sleep(4000);
driver.close();
	}

}
