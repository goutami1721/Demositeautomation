package demositeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/other/drag_and_drop");
		driver.manage().window().maximize();
		Actions c=new Actions(driver);
		WebElement source=driver.findElement(By.id("drag1"));
		WebElement target=driver.findElement(By.id("div1"));
		c.dragAndDrop(source,target).build().perform();
	}

}
