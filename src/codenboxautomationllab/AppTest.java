package codenboxautomationllab;

import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class AppTest {
	
	String URL ="https://codenboxautomationlab.com/practice/"; 
	WebDriver driver = new ChromeDriver(); 
	Random rand = new Random(); 
	@BeforeTest
	public void mySetup() {
		driver.get(URL); 
		driver.manage().window().maximize(); 
	}
	
	@Test (priority = 1 , enabled = false ) 
	public void RadioButtonTest() {
		
		List<WebElement> RadioButtons = driver.findElements(By.className("radioButton")); 
		int RadioButtonsSize = RadioButtons.size(); 
		int RandomButtonIndex = rand.nextInt(RadioButtonsSize); 
		RadioButtons.get(RandomButtonIndex).click(); 
		
	}
	
	@Test (priority = 2 ) 
	public void DynamicDropDownTest() throws InterruptedException {
		
		 String[] countryPrefixes = {
		            "Af", // Afghanistan
		            "Al", // Albania
		            "Al", // Algeria
		            "An", // Andorra
		            "An", // Angola
		            "An", // Antigua and Barbuda
		            "Ar", // Argentina
		            "Ar", // Armenia
		            "Au", // Australia
		            "Au"  // Austria
		        };
		int RandomCountryIndex = rand.nextInt(countryPrefixes.length); 
		WebElement DynamicDropDownInput = driver.findElement(By.id("autocomplete"));
		DynamicDropDownInput.sendKeys(countryPrefixes[RandomCountryIndex]); 
		Thread.sleep(2000); 
		DynamicDropDownInput.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
		
		
	}
}
