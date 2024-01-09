package demositeautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertpopupdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/popups/");
		driver.manage().window().maximize();
		/*try
		{
			//driver.findElement(By.id("cookie-law-info-again")).getText();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();		
		}
		catch(Exception e)
		{
			System.out.println("Unexpected alert not present");
		}*/
		//Alert pop-up
		driver.findElement(By.xpath("//b[text()='Alert Popup']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//confirm pop-up
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='Confirm Popup']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		//prompt pop-up
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//b[text()='Prompt Popup']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);
		Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Test user");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	}

}
