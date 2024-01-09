package demositeautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/iframes/");
		driver.manage().window().maximize();
		List<WebElement> ciframe=driver.findElements(By.tagName("iframe"));
		System.out.println("count is " +ciframe.size());
		driver.switchTo().frame(0);
		String gettext=driver.findElement(By.xpath("//h2[text()='Latest Stories']")).getText();
		System.out.println("Text in iframe1 is " +gettext);
		driver.switchTo().defaultContent();
		String maintext=driver.findElement(By.xpath("//p[text()='I’m an iframe']")).getText();
		System.out.println("Text on main page is "+maintext);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.switchTo().defaultContent();
		String maintext2=driver.findElement(By.xpath("//p[text()='Me too!']")).getText();
		System.out.println("Text on main page is " +maintext2);
		
		
		

	}

}
