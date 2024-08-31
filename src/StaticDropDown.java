import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//drop down with select tag //if the tagname is select it is a static dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Using Select
		
		//Assnmt 2 UI after 64
		
		/*System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("Sampath");
		driver.findElement(By.name("email")).sendKeys("a.sam@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234567890");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("09/09/1997");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-success")).getText());*/
		
		
		
		//Assnmt 3 sync with explicit wait after 82
		
		/*System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i=0;i<products.size();i++)
		{
         products.get(i).click();
		}
        
		driver.findElement(By.partialLinkText("Checkout")).click();*/
		
		
	}







		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


