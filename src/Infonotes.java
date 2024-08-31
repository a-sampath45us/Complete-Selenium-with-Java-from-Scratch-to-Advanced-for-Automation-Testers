import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Infonotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// //button[text()='ADD TO CART'] //xpath using text 
        System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		// to format the whole use Ctrl + shift + F
		// Class Name = Tableexercises Variable Name = totalSumValue
		//Implicit Wait giving the wait globally like wait for 5 secs for every step it consists of 100steps 
		//if the page loads in 3 secs then it comes out of wait time
		
		System.setProperty("Webdriver.edge.driver", "D:\\Java Selenium\\Edge Driver\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver(); 
		
	

	}

}
