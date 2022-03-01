package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EjSelenium {
	public static WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
	  }
	  
	  @Test
	  public void googleTest() {
		  
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/"); 
			driver.manage().window().maximize();
			
			//Ejercicio 1
			
			// Validation - Hard Assertion
			//Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
			
			//Ejercicio 2
			String validPage = driver.getCurrentUrl();
			Assert.assertEquals(validPage,"https://es-la.facebook.com/");
			
			//Ejercicio 3 - Locators
			
			//*[@id="email"] ,  //*[@name="email"] --> 1
	//		(//input[contains(@class, 'input')])[2] --> 2
			//*[@id="u_0_h_xH"] , (//button[contains(@class,"_42")])  --> 3
			//*[@id="u_0_e_m9"]/div[3]/a  --> 4
			//*[@class="_58mk"] --> 5
			
			
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
