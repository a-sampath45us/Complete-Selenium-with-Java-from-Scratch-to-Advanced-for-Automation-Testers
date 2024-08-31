import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// adding code 2nd time for checking boxes
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //assert is part of TestNG Framework it is for validation
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); //-->*(Star) it takes attribute which has those letters present in it
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count the number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		    Thread.sleep(2000L);
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // clicks 4 times in passengers dropdown
			i++;
		}
		/*for(int i=1,i<5,i++) //other way using for loop instead while loop 
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
		}*/
		    
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//adding the code 3rd time for Round Trip is enabled & validating UI Elements are disabled or enabled with attributes
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		/*else
		{
			Assert.assertTrue(false);
		}*/
		
		
		
		
		
		
		
		
		
	}

}
