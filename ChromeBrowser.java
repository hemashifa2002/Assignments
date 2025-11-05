package org.testleaf;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//span[text() = 'Flight Bookings']"));

		driver.findElement(By.className("truncate")).click();
		 String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Verified");
		}
			else {
			System.out.println("Not verified");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.amazon.in");
		
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();

		
		}
		
	}

