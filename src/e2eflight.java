import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eflight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // clicking on FROM
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click(); // xpath for Delhi FROM
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); // selecting TO chennai
		// One Way is Fixed & selecting current date
		 //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); 
		  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
			{
				System.out.println("Its enabled");
				Assert.assertTrue(true);
			}
			/*else
			{
				Assert.assertTrue(false);
			}*/
			//selecting check box senior citizen
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			//selecting 5 passengers
			driver.findElement(By.id("divpaxinfo")).click();
		    Thread.sleep(2000L);
			int i = 1;
			while(i<5)
			{
				driver.findElement(By.id("hrefIncAdt")).click(); // clicks 4 times in passengers drop down
				i++;
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			// selecting drop down currency USD
			WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(3);
			// clicking on Search
			driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
			
		// ctrl + shift + F is for formatting
	    // naming convention examples Class Name- Javaclass, Variable name & Method Name- rowCount
	}

}
