import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.udemy.com/");
		 Actions a = new Actions(driver); //created object for actions class
		 WebElement move = driver.findElement(By.id("popper-trigger--5")); //stored the WebElement in a variable
		 //keydown,keys.SHIFT - for using keyboard, doubleClick is for double clicking
		 a.moveToElement(driver.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();//moveToElement- hovers the mouse over a object/WebElement
		 //moves to specific element
		 a.moveToElement(move).build().perform();
		 a.moveToElement(move).contextClick().build().perform(); //context click is for right click
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
