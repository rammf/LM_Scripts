package net;


import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


import static junit.framework.TestCase.assertTrue;

public class SeleniumTest {


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

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

	   // System.setProperty("webdriver.chrome.driver", "/home/demo/chromedriver/2.35/chromedriver");
	    
	    
	    System.setProperty("webdriver.chrome.driver", "C:\chrome");

          WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("MSN");
		
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);

        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();

        String title_name = driver.getTitle();

        System.out.println("The title is    :" + title_name);

        assertTrue(driver.getTitle().contains("MSN"));

        driver.quit();

    }
}
