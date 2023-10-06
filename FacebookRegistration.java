package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("CharmilaMa");
		driver.findElement(By.name("lastname")).sendKeys("Mathialagan");
		driver.findElement(By.name("reg_email__")).sendKeys("7708583705");
		driver.findElement(By.id("password_step_input")).sendKeys("ABCD1234");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByValue("4");

		WebElement month = driver.findElement(By.id("month"));
		Select s1= new Select(month);
		s1.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2= new Select(year);
		s2.selectByIndex(2);
		
//		driver.findElement(By.linkText("Female")).click();--->Throwing error, not working
	driver.findElement(By.tagName("label")).click();
		
//		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		
	}

}
