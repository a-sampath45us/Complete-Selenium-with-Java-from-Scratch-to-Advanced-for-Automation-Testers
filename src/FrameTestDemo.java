import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameTestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to find no of frames in a web page
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); //finding frame using WebElement
		//driver.switchTo().frame(0); //finding frame using index
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver); //using actions class to drag and drop WebElements
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//switches back to default content from frames
		
		
		//Assnmt 5 frames assnmt after 92
		/*System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());*/
        
        
		//Give me the count of links on the page
		//every link on a page has a tagname "a"
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count the no of links on the page in the footer section
		//here we limit the WebDriver scope and create a mini driver to access that particular part of the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//count no of links of a column in a footer section on a footer page
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column and check if pages are opening
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
			
		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();	
		
		while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}*/
		
		//Assnmt 6 Dynamics Practice after 97
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String label = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(label);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String text=  driver.switchTo().alert().getText();

	     if(text.contains(label))

	     {

	    System.out.println("Alert message success");

	     }

	     else
	     {

	    System.out.println("Something wrong with execution");

	     }	
	     driver.switchTo().alert().accept();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
