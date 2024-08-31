import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Sel4NewFea {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Relative locators/Friendly locators (above, below, toLeft, toRight)
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		/*WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']")); //css for name box
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();		
		WebElement rdb = driver.findElement(By.id("inLineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());*/
		
		//Invoking Multiple Windows/Tabs from Selenium
		//Invoking a Window/Tab
		driver.switchTo().newWindow(WindowType.TAB);	
		//Grabbing the indexes of all windows/tabs opened by Selenium
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//Taking WebElement Partial Screenshot with Selenium
		//File file = name.getScreenshotAs(OutputType.FILE);
		//Files.copy(file, new File("D:\\Java Selenium\\nameEditBoxScSt.png"));
		//driver.quit();
		
		//Capturing Height and Width of WebElement for UX Validation
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
