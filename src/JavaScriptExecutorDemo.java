import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); //we have to write a javascript in the console of the browser dev tools
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //here we are writing a javascript for a whole component(to scroll the whole component) in a webpage
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		//driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
		//Assnmt 7 Web Tables Assnmt after 103
		/*System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); //we have to write a javascript in the console of the browser dev tools
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr")).size()); //we can do this either using By.tagname
		System.out.println(driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[1]/th")).size());
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td[3]")).getText());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
