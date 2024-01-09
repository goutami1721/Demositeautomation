package demositeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8'] //textarea[@ng-model='Adress']")).sendKeys("This is demo site");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("1234567894");
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@value='FeMale']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@value='FeMale']")).isSelected());
		driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@value='FeMale']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@value='FeMale']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@value='FeMale']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.id("checkbox1")).isSelected());
		System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
		driver.findElement(By.id("checkbox1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkbox1")).isSelected());
		System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
		driver.findElement(By.id("checkbox2")).click();	
		WebElement ele=driver.findElement(By.id("Skills"));
		Select s1=new Select(ele);
		s1.selectByVisibleText("C");
		driver.findElement(By.id("select2-country-container")).click();
		driver.findElement(By.xpath("//span[title='Bangladesh']")).click();
		
	}

}
