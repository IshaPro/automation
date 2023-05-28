package login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class itera {

	public static  void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://itera-qa.azurewebsites.net/");
		Thread.sleep(2000);
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("The url of the page"+url);
		
		String title=driver.getTitle();
		
		System.out.println("The title of the page"+title);
		
driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");

Thread.sleep(2000);
		
	WebElement ele=driver.findElement(By.id("FirstName"));
	
	ele.sendKeys("Isha");
	
	Thread.sleep(2000);
	
	WebElement ele1=driver.findElement(By.id("Surname"));
	ele1.sendKeys("Mishra");
	
	Thread.sleep(2000);
	
	
	WebElement ele2=driver.findElement(By.id("E_post"));
	ele2.sendKeys("abc");
	
	Thread.sleep(2000);
	
	WebElement ele3=driver.findElement(By.id("Mobile"));
	ele3.sendKeys("1234");
	Thread.sleep(2000);	
		
	WebElement ele4=driver.findElement(By.id("Username"));
	ele4.sendKeys("isha@123");
	Thread.sleep(2000);	
	
	
	WebElement ele5=driver.findElement(By.id("Password"));
	ele5.sendKeys("9304");
	Thread.sleep(2000);	
	
	
	
	WebElement ele6=driver.findElement(By.id("ConfirmPassword"));
	ele6.sendKeys("9304");
	Thread.sleep(2000);	
		
driver.findElement(By.id("submit")).click();	
		
Thread.sleep(2000);


driver.get("https://itera-qa.azurewebsites.net/Login");
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

WebElement ele7=driver.findElement(By.id("Username"));
ele7.sendKeys("isha@123");
Thread.sleep(2000);


WebElement ele8=driver.findElement(By.id("Password"));
ele8.sendKeys("9304");
Thread.sleep(2000);


driver.findElement(By.xpath("/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]")).click();
Thread.sleep(4000);	

WebElement ele9=driver.findElement(By.id("searching"));
ele9.sendKeys("SPD");
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td[7]/a[2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/p/a[1]")).click();

Thread.sleep(2000);

driver.findElement(By.id("Name")).clear();
WebElement ele10=driver.findElement(By.id("Name"));
ele10.sendKeys("Isha Mishra");
Thread.sleep(2000);

driver.findElement(By.id("Company")).clear();
WebElement ele11=driver.findElement(By.id("Company"));
ele11.sendKeys("xyz");
Thread.sleep(2000);

driver.findElement(By.id("Address")).clear();
WebElement ele12=driver.findElement(By.id("Address"));
ele12.sendKeys("Ghaziabad");
Thread.sleep(2000);

driver.findElement(By.id("City")).clear();
WebElement ele13=driver.findElement(By.id("City"));
ele13.sendKeys("Ghaziabad");
Thread.sleep(2000);

driver.findElement(By.id("Phone")).clear();
WebElement ele14=driver.findElement(By.id("Phone"));
ele14.sendKeys("1234");
Thread.sleep(2000);
driver.findElement(By.id("Email")).clear();
WebElement ele15=driver.findElement(By.id("Email"));
ele15.sendKeys("isha@1223");
Thread.sleep(2000);


driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).click();

Thread.sleep(4000);














/*driver.get("https://itera-qa.azurewebsites.net/home/automation");
driver.manage().window().maximize();
Thread.sleep(2000);

WebElement ele16=driver.findElement(By.id("name"));
ele16.sendKeys("Isha Mishra");
Thread.sleep(2000);


WebElement ele17=driver.findElement(By.id("phone"));
ele17.sendKeys("1234");
Thread.sleep(2000);


WebElement ele18=driver.findElement(By.id("email"));
ele18.sendKeys("isha@123");
Thread.sleep(2000);


WebElement ele19=driver.findElement(By.id("password"));
ele19.sendKeys("9304");
Thread.sleep(2000);

WebElement ele20=driver.findElement(By.id("address"));
ele20.sendKeys("Ghaziabad");
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();

Thread.sleep(4000);*/














		
		
		
		
		
		
		
		
driver.close();		
		
	}

}
