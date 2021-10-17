package framework.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocator {

	static WebDriver driver;

	public static void main(String[] args) {

		TesteText();

	}

	public static void TesteFacebook() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

//		driver.findElement(By.id("email")).sendKeys("natalia@email.com");
//		driver.findElement(By.id("pass")).sendKeys("123456");
//		driver.findElement(By.name("login")).click();

		driver.findElement(By.linkText("Create New Account")).click();

	}

	public static void TesteTagName() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Quantidade de links: " + links.size());

		for (WebElement webElement : links) {

			System.out.println(webElement.getText());

		}
	}

	public static void TesteClassName() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.trivago.com.br");

		driver.manage().window().maximize();
		
		driver.findElement(By.className("siteheader__control")).click();

		
	}
	
	public static void TesteText() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot Password?")).click();

		
	}

}
