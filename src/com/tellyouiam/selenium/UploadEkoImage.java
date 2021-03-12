package com.tellyouiam.selenium;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class UploadEkoImage {
	
	public static void main(String[] args) throws InterruptedException, IOException { //https://www.geeksforgeeks.org/login-twitter-using-python-selenium/
		List<String> list = new ArrayList<>();
		list.add("Pitbull");
		list.add("Avril Lavigne");
		list.add("Enrique Iglesias");
		list.add("Lil Wayne");
		list.add("AKON");
		list.add("Jennifer Lopez");
		list.add("Miley Cyrus");
		list.add("Usher");
		list.add("Chris Brown");
		list.add("Black Eyed Peas");
		list.add("Wiz Khalifa");
		list.add("Coldplay");
		list.add("Maroon 5");
		list.add("Britney Spears");
		list.add("Justin Timberlake");
		list.add("Demi Lovato");
		list.add("One Direction");
		list.add("Drake");
		list.add("Snoop Dogg");
		list.add("50 Cent");
		list.add("Nicole Kidman");
		list.add("Hugh Jackman");
		list.add("Cate Blanchett");
		list.add("Rose Byrne");
		list.add("The Rock");
		list.add("David Beckham");
		list.add("Ronaldinho Gaúcho");
		list.add("James Rodriguez");
		list.add("Mesut Özil");
		list.add("Gareth Bale");
		list.add("Andrés Iniesta");
		list.add("Zlatan Ibrahimović");
		list.add("Iker Casillas");
		list.add("Wayne Rooney");
		list.add("David Luiz");
		list.add("Sergio Ramos");
		list.add("Karim Benzema");
		list.add("Roman Reigns");
		list.add("Marcelo Vieira");
		list.add("Gerard Piqué");
		list.add("Randy Orton");
		list.add("Rafa Nadal");
		list.add("Robin van Persie");
		list.add("Rey Mysterio");
		list.add("Marco Reus");
		list.add("Mohamed Salah");
		list.add("Toni Kroos");
		list.add("Triple H");
		list.add("Cleveland Cavaliers");
		list.add("Detroit Pistons");
		list.add("Indiana Pacers");
		list.add("Milwaukee Bucks");
		list.add("Atlanta Hawks");
		list.add("Charlotte Hornets");
		list.add("Miami Heat");
		list.add("Orlando Magic");
		list.add("Washington Wizards");
		list.add("Denver Nuggets");
		list.add("Minnesota Timberwolves");
		list.add("Oklahoma City Thunder");
		list.add("Portland Trail Blazers");
		list.add("Utah Jazz");
		list.add("Golden State Warriors");
		list.add("Los Angeles Clippers");
		list.add("Los Angeles Lakers");
		list.add("Phoenix Suns");
		list.add("Sacramento Kings");
		list.add("Dallas Mavericks");
		list.add("Houston Rockets");
		list.add("Memphis Grizzlies");
		list.add("New Orleans Pelicans");
		list.add("San Antonio Spurs");
		list.add("Gold Coast");
		list.add("Greater Western Sydney");
		list.add("Hawthorn");
		list.add("Melbourne");
		list.add("North Melbourne");
		list.add("Port Adelaide");
		list.add("Richmond");
		list.add("St Kilda");
		list.add("Sydney");
		list.add("West Coast");
		list.add("Western Bulldogs");
		list.add("Everton");
		list.add("Leicester City");
		list.add("Liverpool");
		list.add("Manchester City");
		list.add("Manchester United");
		list.add("Newcastle United");
		list.add("Norwich City");
		list.add("Sheffield United");
		list.add("Southampton");
		list.add("Tottenham Hotspur");
		list.add("Watford");
		list.add("West Ham United");
		list.add("Wolverhampton Wanderers");
		
		List<String> emails = list.stream().map(name -> {
			String normalizeName = StringUtils.deleteWhitespace(name).toLowerCase();
			return String.format("%s%s", normalizeName, "@test.com");
		}).collect(Collectors.toList());
		
//		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("--no-sandbox");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://localhost:5151/portal/app/login");
		
		for (String userEmail : emails) {
			String usernamePath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/div[1]/div/input";
			String passwordPath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/div[2]/div/input";
			String loginPath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/button";
			
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath(usernamePath)).sendKeys(userEmail); //right click elemt -> copy xpath
			driver.findElement(By.xpath(passwordPath)).sendKeys("12345678");
			driver.findElement(By.xpath(loginPath)).click();
			TimeUnit.SECONDS.sleep(2);
			
			String openDropdown = "/html/body/div[1]/div/div/div[3]/a";
			driver.findElement(By.xpath(openDropdown)).click();
			TimeUnit.MICROSECONDS.sleep(2000);
//			String editProfile = "/html/body/div[2]/div/div/div[2]/ul/li[1]/span";
//			driver.findElement(By.xpath(editProfile)).click();
//			TimeUnit.MICROSECONDS.sleep(500);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			Actions actions = new Actions(driver);
			//click drop down
			WebElement dropDownElement = driver.findElement(By.cssSelector("li[class='ant-menu-item']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", dropDownElement);
//			actions.moveToElement(dropDownElement).click();
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li[class='ant-menu-item']"))).click();
			
			TimeUnit.MICROSECONDS.sleep(2000);
//			String uploadAvatar = "div[class='file-upload']";
			String uploadAvatar = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/div/div";
			TimeUnit.MICROSECONDS.sleep(2000);
//			((JavascriptExecutor) driver).executeScript("document.getElementById('ID').style.display='block';");
			//https://stackoverflow.com/questions/49864965/org-openqa-selenium-elementnotinteractableexception-element-is-not-reachable-by
			WebDriverWait waitAvatar = new WebDriverWait(driver,20);
//			WebElement until = waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath(uploadAvatar)));
//			WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(uploadAvatar)));
			((JavascriptExecutor)driver).executeScript("document.querySelector('.css-25nxdc > div:nth-child(1) > input:nth-child(1)').style.display='block';");
			((JavascriptExecutor)driver).executeScript("document.querySelector('.css-127kq4m > div:nth-child(1) > input:nth-child(1)').style.display='block';");
			
			//path after make display block, not path when display none
			String back = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div/div/div/div/div/input";
			String avatar = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/div/div/input";
			
			Wait<WebDriver> fluentWait = new FluentWait<>(driver)
					.withTimeout(Duration.ofMinutes(1))
					.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
			
			String avatarImg = "/home/logbasex/Desktop/images/" + StringUtils.remove(userEmail, "@test.com")
					.concat("-avatar.png");
			
			if (Files.exists(Paths.get(avatarImg))) {
				waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath(avatar)))
						.sendKeys(avatarImg);
			}
			
			String backgroundImg = "/home/logbasex/Desktop/images/" + StringUtils.remove(userEmail, "@test.com")
					.concat("-background.png");
			
			if (Files.exists(Paths.get(backgroundImg))) {
				waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath(back)))
						.sendKeys(backgroundImg);
			}
			
			TimeUnit.SECONDS.sleep(10);
			waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/button"))).click();
			//https://stackoverflow.com/questions/32741087/wait-for-upload-to-finish-or-for-success-message-to-pop-out
			
			//bug obscure it
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/a"))).click();
			
//			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/a")));
			
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath(openDropdown)).click();
			TimeUnit.SECONDS.sleep(2);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".ant-menu-light > li:nth-child(4)")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/main/section/div[2]/div/div/a[2]"))).click();
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(" Upload avatar : " + avatarImg + " and background : " + backgroundImg + " for account : >> " + userEmail);
		}
	}
}
