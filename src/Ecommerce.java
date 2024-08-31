import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait applies globally that means for every step
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));//explicit wait implementation has 2 methods 1.webdriver wait method 2.fluent wait 
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"}; // created an array
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//implicit wait implemented once //implicit wait applies to a specific test case
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));//implicit wait implemented twice
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
		
		
		
		

	}
	


	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			//Brocolli - 1 kg //split the string using "-"
			//Brocolli, 1kg 
			//name[0] Brocolli, name[1] 1kg
			String[] name =products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			
			
			//format it to get actual vegetable name
			//check whether name you extracted is present in array or not-
			//convert array into array list for easy search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//click on ADD to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); // xpath(parent to child tag name) for add to cart button for all 30 products
				//3times 
				if(j==itemsNeeded.length)
				{
					break;
				}
					
				
				
				
				
			}
			
			
			
			
			
		}
	}
	}
	
	


