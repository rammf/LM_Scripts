package net;


import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import static junit.framework.TestCase.assertTrue;

public class SeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

      //  driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
   //     driver.quit();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void demoseltest() throws Exception {

	    //System.setProperty("webdriver.chrome.driver", "/home/demo/chromedriver/2.35/chromedriver");

       // System.setProperty("webdriver.chrome.driver", "/home/demo/chromedriver");
	    
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

          WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("MSN");
		
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);

        driver.findElement(By.xpath("//FORM[@id=\"tsf\"]/DIV[2]/DIV[1]/DIV[3]/CENTER[1]/INPUT[1]")).click();

		//Button googleSearchButton = browser.describe(Button.class, new XPathDescription("//FORM[@id=\"tsf\"]/DIV[2]/DIV[1]/DIV[3]/CENTER[1]/INPUT[1]"));

     //   driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[1]/CITE[1]")).click();

        String title_name = driver.getTitle();

        System.out.println("The title is    :" + title_name);

        assertTrue(driver.getTitle().contains("MSN"));

        driver.quit();

    }
}
