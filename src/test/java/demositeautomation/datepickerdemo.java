package demositeautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datepickerdemo {
	@Test
	public void datepickerd()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(int i=0;i<ele.size();i++)
		{
			String text=driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
	}

}
