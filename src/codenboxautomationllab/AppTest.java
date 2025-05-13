package codenboxautomationllab;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
	
	@Test (priority = 2 , enabled = false) 
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
	
	@Test(priority = 3 ,enabled = false) 
	public void StaticDropDownTest() {
		
		WebElement StaticDropDown = driver.findElement(By.id("dropdown-class-example")); 
		Select select = new Select(StaticDropDown); 
		List<WebElement> options = select.getOptions(); 
		int numberOfOptions = options.size();
		int randIndex = rand.nextInt(1,numberOfOptions); 
		select.selectByIndex(randIndex); 
	
	}
	
	@Test (priority = 4 , enabled = false ) 
	public void CheckBoxTest() {
		
		WebElement CheckBoxField = driver.findElement(By.id("checkbox-example")); 
		List<WebElement> CheckBoxes = CheckBoxField.findElements(By.tagName("input"));
		int RandCheckBox = rand.nextInt(CheckBoxes.size()); 
		CheckBoxes.get(RandCheckBox).click();
		
	}
	
	@Test (priority = 5 , enabled = false )
	public void SwitchWnidows() throws InterruptedException {
		
		WebElement NewWindowButton = driver.findElement(By.id("openwindow")); 
		NewWindowButton.click(); 
		
		Set<String> WindowHandles = driver.getWindowHandles(); 
		List<String> WindowList = new ArrayList<>(WindowHandles); 
		driver.switchTo().window(WindowList.get(1)); 
		Thread.sleep(1000);
		System.out.println(driver.getTitle()); 
		
		driver.switchTo().window(WindowList.get(0)); 
		Thread.sleep(1000);

		System.out.println(driver.getTitle());
		
		
		
	}
	
	@Test (priority = 6 , enabled = false)
	public void SwitchTab() throws InterruptedException {
		
		WebElement NewTabButton = driver.findElement(By.id("opentab"));
		NewTabButton.click();
		
		Set<String> TabHandle = driver.getWindowHandles(); 
		List<String> TabList = new ArrayList<>(TabHandle); 
		driver.switchTo().window(TabList.get(1));
		Thread.sleep(1000);
		System.out.println(driver.getTitle()); 
		driver.switchTo().window(TabList.get(0)); 
		Thread.sleep(1000);
		System.out.println(driver.getTitle()); 
		
	}
	
	@Test  (priority = 7 , enabled = false)
	public void AlertTag() throws InterruptedException {
		
		WebElement AlertTagInput = driver.findElement(By.id("name")); 
		AlertTagInput.sendKeys("eman");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys("eman");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		

		
	}
	
	@Test (priority = 8 , enabled  = false )
	public void TableTest() {
		WebElement ProductTable =driver.findElement(By.id("product")); 
		List<WebElement> TableData = ProductTable.findElements(By.tagName("tr")); 
		for(int i =1 ;i < TableData.size() ; i=i+1) {
			
			System.out.println(TableData.get(i).getText()); 
				
		}
		
	}
	
	@Test (priority = 9 , enabled =true )
	public void HideTest() throws InterruptedException {
		
		WebElement HideButton = driver.findElement(By.id("hide-textbox")); 
		HideButton.click();
		Thread.sleep(1000);
		WebElement DisplayedTextInput = driver.findElement(By.id("displayed-text"));
		Assert.assertEquals(DisplayedTextInput.isDisplayed(), false);

	
	}
	
	@Test(priority = 10 , enabled = true)
	public void ShowTest() throws InterruptedException {
		
		WebElement ShowButton = driver.findElement(By.id("show-textbox"));
		ShowButton.click(); 
		Thread.sleep(1000);
		WebElement DisplayedTextInput = driver.findElement(By.id("displayed-text"));
		Assert.assertEquals(DisplayedTextInput.isDisplayed(), true);
		
		
	}
}
