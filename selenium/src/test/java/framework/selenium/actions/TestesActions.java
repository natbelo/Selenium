package framework.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestesActions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		TesteClickAndHold();
	}
	
	public static void TesteTeclado() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement elementoEmail = driver.findElement(By.id("email"));
		WebElement elementoPass = driver.findElement(By.id("pass"));
		WebElement elementoFirstName = driver.findElement(By.name("firstname"));
		WebElement elementoLastName = driver.findElement(By.name("lastname"));
		
		Actions act = new Actions(driver);
		
		//sendkeys
		act.sendKeys(elementoEmail, "natalia@email.com").build().perform();
		act.sendKeys(elementoPass, "123456").build().perform();
		
		//KeyDown e KeyUp
		
		act.keyDown(elementoFirstName, Keys.SHIFT).build().perform();
		act.sendKeys(elementoFirstName, "natalia");
		
		act.keyDown(elementoLastName, Keys.SHIFT).build().perform();
		act.sendKeys(elementoLastName, "belo");
		
	}
	
	public static void TestesActionsMouse() {
		
		//https://the-internet.herokuapp.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement inputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement inputSenha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));
		
		act.sendKeys(inputUsername, "tomsmith11111").build().perform(); //digita incorreto
		act.doubleClick(inputUsername).build().perform(); //double click para selecionar o conteudo
		act.sendKeys(inputUsername, "tomsmith").build().perform(); //digita incorreto
		act.sendKeys(inputSenha, "SuperSecretPassword!").build().perform();
		act.click(butEntrar).build().perform(); //click para entrar
			
	}
	
	public static void TesteContextClick() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement botao = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		act.contextClick(botao).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();//seta para baixo
		act.sendKeys(Keys.ENTER).build().perform();
			
	}
	
	public static void TesteClickAndHold() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		driver.manage().window().maximize();
		
		WebElement inputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement inputSenha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(inputUsername, "tomsmith").build().perform();
		act.sendKeys(inputSenha, "SuperSecretPassword! ").build().perform();
		
		act.clickAndHold(butEntrar).build().perform();
	}

}
