import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;


public class MiscSelWeb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Chrome Options Class
		//HTTPS Certificate/Security Certi, proxies, plugins, paths
		/*ChromeOptions options = new ChromeOptions(); //these are options you can use to customize and configure a ChromeDriver session
		options.setAcceptInsecureCerts(true);
		//options.addExtensions(null); //here we can add chrome extensions then chrome browser is invoked with this extension added
		//Proxy proxy = new Proxy(); //for some internal websites we have to use proxy to invoke the browser with that webpage
		//proxy.setHttpProxy("ip-address:port-number");
		//options.setCapability("proxy", proxy);
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking")); //we use this to disable all pop ups when invoking a browser
		//Map<String, Object> prefs = new HashMap<String, Object>(); //using this we can set download directory path when invoking a browser(for example when we click on links some files will get downloaded)
		//prefs.put("download.default_directory", prefs);
		//options.setExperimentalOption("prefs", prefs);
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
		//Maximizing Window and Deleting Cookies
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed();*/
		
		//How to take a Screenshot in Selenium
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		Files.copy(src, new File("D:\\Java Selenium\\screenshot.png"));*/
		
		//Broken Link 404 Not Found
		//Step 1. Is to get all URL's(In tagname "a" attribute "href" has URL) tied up to the links using Selenium
		//Step 2. Java Methods will call URL's and gets you the status code
		//Step 3. if status code >400 then that url is not working --> link which tied to url is broken
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Java Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			a.assertTrue(respCode<400 , "The Link with Text "+link.getText()+" is broken with status code " +respCode);
			
		}
		
		a.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
