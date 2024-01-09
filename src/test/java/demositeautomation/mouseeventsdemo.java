package demositeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseeventsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
//Mouse Hover
Actions a=new Actions(driver);
WebElement ele=driver.findElement(By.xpath("//a[@title='Login']"));
a.moveToElement(ele).build().perform();
Thread.sleep(3000);

//Enter in capital letters and select the entered text
WebElement ele1=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
a.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

//Right click
a.moveToElement(ele1).contextClick().build().perform();


	}

}
