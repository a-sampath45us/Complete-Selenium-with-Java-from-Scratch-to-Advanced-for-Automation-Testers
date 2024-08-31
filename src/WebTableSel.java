import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Web Table Elements taking them into list and sorting them & comparing this list to webpage sorted list to check both are equal or not using Java Streams & Selenium
		
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click(); //xpath for clicking on sort on the column field
		//capture all WebElements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]")); //xpath for to grab all name column WebElements
		//capture text of all WebElements into new(Original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list of step 3   -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		//scan the name column with getText   ->Wheat ->print the price of the Beans
		//here we used automating pagination scenarios and also used do-while loop
		List<String> price;
		do
		{
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]")); //xpath for to grab all name column WebElements	
		price = rows.stream().filter(s->s.getText().contains("Wheat"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click(); //css for clicking on next
		}
		
		}
		while(price.size()<1);
		
		
		//Search Filter - we will search an item in search box & compare with populated result
		/*driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]")); //xpath for to grab all name column WebElements
		//1 result
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		//1 result 
		Assert.assertEquals(veggies.size(), filteredList.size());*/
		
		
		
		
		
		
		
	
	
	
	
	
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText(); //not driver. bcoz it will start from first //if we use s. then it starts form wherever we left before
		return pricevalue;
	}

}
