package orangehrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class AmazonPrice {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(30));
	driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Mobiles" + Keys.ENTER);
    List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    for(int i=0; i<prices.size(); i++) {
    	String price = prices.get(i).getText().trim();
    	String price1 = price.replaceAll(",", "");
    	System.out.println(price1);
    }
    
}
}
