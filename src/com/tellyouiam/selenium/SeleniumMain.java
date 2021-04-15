package com.tellyouiam.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

public class SeleniumMain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("http://www.twitter.com/login");
		String twitterUserNamePath = "session[username_or_email]";
		String twitterPasswordPath = "session[password]";
		String twitterLoginPath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div";
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name(twitterUserNamePath)).sendKeys("username");
		driver.findElement(By.name(twitterPasswordPath)).sendKeys("password");
		driver.findElement(By.xpath(twitterLoginPath)).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		String key = "Cristiano Ronaldo";
		String keyword = key + " filter:verified";
		
		String searchXpath = "/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div[2]/input";
		driver.findElement(By.xpath(searchXpath)).sendKeys(keyword, Keys.ENTER);
		
		TimeUnit.SECONDS.sleep(1);
		
		String searchPeopleResultPath = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/div[3]/a";
		driver.findElement(By.xpath(searchPeopleResultPath)).click();
		
		TimeUnit.SECONDS.sleep(2);
		String firstResult = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]";
		driver.findElement(By.xpath(firstResult)).click();
		
		TimeUnit.SECONDS.sleep(1);
		String avatarImgPath = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/a/div[1]/div[2]/div/img";
		String backgroundImgPath = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/a/div/div[2]/div/img";
		
		String avatarUrl = driver.findElement(By.xpath(avatarImgPath)).getAttribute("src");
		TimeUnit.MICROSECONDS.sleep(500);
		String backgroundUrl = driver.findElement(By.xpath(backgroundImgPath)).getAttribute("src");
		
		String avatarImg = "/home/logbasex/Desktop/avatar.png";
		String backgroundImg = "/home/logbasex/Desktop/background.png";
		
		try (InputStream avatarIS = new URL(avatarUrl).openStream();
		     InputStream backgroundIS = new URL(backgroundUrl).openStream()) {
			
			Files.copy(avatarIS, Paths.get(avatarImg), StandardCopyOption.REPLACE_EXISTING);
			Files.copy(backgroundIS, Paths.get(backgroundImg), StandardCopyOption.REPLACE_EXISTING);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TimeUnit.SECONDS.sleep(5);
		
		driver.get("http://localhost:5000/login");
		
		String usernamePath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/div[1]/div/input";
		String passwordPath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/div[2]/div/input";
		String loginPath = "/html/body/div[1]/main/div/div[2]/div/div[1]/form/button";
		
		TimeUnit.SECONDS.sleep(2);
		String userEmail = "me@gmail.com";
		driver.findElement(By.xpath(usernamePath)).sendKeys(userEmail); //right click elemt -> copy xpath
		driver.findElement(By.xpath(passwordPath)).sendKeys("12345678");
		driver.findElement(By.xpath(loginPath)).click();
		TimeUnit.SECONDS.sleep(2);
		
		String openDropdown = "/html/body/div[1]/div/div/div[3]/a";
		driver.findElement(By.xpath(openDropdown)).click();
		TimeUnit.MICROSECONDS.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TimeUnit.SECONDS.sleep(1);
		WebElement dropDownElement = driver.findElements(By.cssSelector("li[class='ant-menu-item']")).stream()
				.filter(webElement -> webElement.getText().contains("Edit Profile"))
				.findFirst().orElseThrow(RuntimeException::new);
		
		dropDownElement.click();
		
		TimeUnit.MICROSECONDS.sleep(4000);
		//https://stackoverflow.com/questions/49864965/org-openqa-selenium-elementnotinteractableexception-element-is-not-reachable-by
		
		WebDriverWait waitAvatar = new WebDriverWait(driver,20);
		((JavascriptExecutor)driver).executeScript("document.querySelector('.css-25nxdc > div:nth-child(1) > input:nth-child(1)').style.display='block'");
		((JavascriptExecutor)driver).executeScript("document.querySelector('.css-127kq4m > div:nth-child(1) > input:nth-child(1)').style.display='block'");
		
		//path after make display block, not path when display none
		String back = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div/div/div/div/div/input";
		String avatar = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/div/div/input";
		
		
		if (Files.exists(Paths.get(avatarImg))) {
			waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath(avatar)))
					.sendKeys(avatarImg);
		}
		
		if (Files.exists(Paths.get(backgroundImg))) {
			waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath(back)))
					.sendKeys(backgroundImg);
		}
		
		TimeUnit.SECONDS.sleep(10);
		waitAvatar.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/button"))).click();
		
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath(openDropdown)).click();
		TimeUnit.SECONDS.sleep(2);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".ant-menu-light > li:nth-child(3)")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/main/section/div[2]/div/div/a[2]"))).click();
		
		driver.quit();
	}
}
