package com.tellyouiam.selenium;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CrawlTwitterImage {
	
	public static void main(String[] args) throws InterruptedException { //https://www.geeksforgeeks.org/login-twitter-using-python-selenium/
		List<String> list = new ArrayList<>();
//		list.add("Pitbull");
//		list.add("Avril Lavigne");
//		list.add("Enrique Iglesias");
//		list.add("Lil Wayne");
//		list.add("AKON");
//		list.add("Jennifer Lopez");
//		list.add("Miley Cyrus");
//		list.add("Usher");
//		list.add("Chris Brown");
//		list.add("Black Eyed Peas");
//		list.add("Wiz Khalifa");
//		list.add("Coldplay");
//		list.add("Maroon 5");
//		list.add("Britney Spears");
//		list.add("Justin Timberlake");
//		list.add("Demi Lovato");
//		list.add("One Direction");
//		list.add("Drake");
//		list.add("Snoop Dogg");
//		list.add("50 Cent");
//		list.add("Nicole Kidman");
//		list.add("Hugh Jackman");
//		list.add("Cate Blanchett");
//		list.add("Rose Byrne");
//		list.add("The Rock");
//		list.add("David Beckham");
//		list.add("Ronaldinho Gaúcho");
//		list.add("James Rodriguez");
//		list.add("Mesut Özil");
//		list.add("Gareth Bale");
//		list.add("Andrés Iniesta");
//		list.add("Zlatan Ibrahimović");
//		list.add("Iker Casillas");
//		list.add("Wayne Rooney");
//		list.add("David Luiz");
//		list.add("Sergio Ramos");
//		list.add("Karim Benzema");
//		list.add("Roman Reigns");
//		list.add("Marcelo Vieira");
//		list.add("Gerard Piqué");
//		list.add("Randy Orton");
//		list.add("Rafa Nadal");
//		list.add("Robin van Persie");
//		list.add("Rey Mysterio");
//		list.add("Marco Reus");
//		list.add("Mohamed Salah");
//		list.add("Toni Kroos");
//		list.add("Triple H");
//		list.add("Cleveland Cavaliers");
//		list.add("Detroit Pistons");
//		list.add("Indiana Pacers");
//		list.add("Milwaukee Bucks");
//		list.add("Atlanta Hawks");
//		list.add("Charlotte Hornets");
//		list.add("Miami Heat");
//		list.add("Orlando Magic");
//		list.add("Washington Wizards");
//		list.add("Denver Nuggets");
//		list.add("Minnesota Timberwolves");
//		list.add("Oklahoma City Thunder");
//		list.add("Portland Trail Blazers");
//		list.add("Utah Jazz");
//		list.add("Golden State Warriors");
//		list.add("Los Angeles Clippers");
//		list.add("Los Angeles Lakers");
//		list.add("Phoenix Suns");
//		list.add("Sacramento Kings");
//		list.add("Dallas Mavericks");
//		list.add("Houston Rockets");
//		list.add("Memphis Grizzlies");
//		list.add("New Orleans Pelicans");
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
		
		Map<String, String> images = new HashMap<>();
 	
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("--no-sandbox");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		
		driver.get("http://www.twitter.com/login");
//		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input")).sendKeys("contact.hoducanh@gmail.com"); //right click elemt -> copy xpath
		String userNamePath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input";
		String passwordPath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input";
		String loginPath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div";
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath(userNamePath)).sendKeys("username"); //right click elemt -> copy xpath
		driver.findElement(By.xpath(passwordPath)).sendKeys("password");
		driver.findElement(By.xpath(loginPath)).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		for (String key : list) {
			String keyword = key + " filter:verified";
			
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div[2]/input"))
					.sendKeys(keyword, Keys.ENTER);
			
			TimeUnit.SECONDS.sleep(1);
			
			driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/div[3]/a"))
					.click();
			
			TimeUnit.SECONDS.sleep(2);
			String firstE = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]";
			driver.findElement(By.xpath(firstE))
					.click();
			
			TimeUnit.SECONDS.sleep(1);
			String avatarImg = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/a/div[1]/div[2]/div/img";
			String backgroundImg = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/a/div/div[2]/div/img";
			String followersPath = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[2]/a/span[1]/span";
			
			String avatarUrl = driver.findElement(By.xpath(avatarImg)).getAttribute("src");
			TimeUnit.MICROSECONDS.sleep(500);
			
			String backgroundUrl = null;
			try {
				backgroundUrl = driver.findElement(By.xpath(backgroundImg)).getAttribute("src");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			
			TimeUnit.MICROSECONDS.sleep(500);
			images.put(StringUtils.deleteWhitespace(key).toLowerCase() + "-avatar.png", avatarUrl);
			images.put(StringUtils.deleteWhitespace(key).toLowerCase() + "-background.png", backgroundUrl);
			System.out.println(key + " AVATAR: " + avatarUrl);
			System.out.println(key + " BACKGROUND: " + backgroundUrl);
			
			String followers = null;
			try {
				followers = driver.findElement(By.xpath(followersPath)).getText();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(key + " FOLLOWERS: " + followers);
			System.out.println("*********************\n");
			TimeUnit.MICROSECONDS.sleep(500);
		}
		
		images.forEach((k,v) -> {
			if (v != null) {
				try (InputStream in = new URL(v).openStream()) {
					Files.copy(in, Paths.get("/home/logbasex/Desktop/images-clone/" + k), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
