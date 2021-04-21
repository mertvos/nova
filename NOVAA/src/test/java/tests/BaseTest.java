package tests;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BaseTest {
    public WebDriver driver;
    protected WebDriverWait wait;


    @BeforeClass
    public void setup () throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        //this is for headless. if you need browser you should comment below line after disable comment driver.manage line.
        firefoxOptions.setHeadless(true);
        driver = new FirefoxDriver(firefoxOptions);
        //driver.manage().window().maximize();
        //Thread.sleep(1500);
        wait = new WebDriverWait(driver, 30);




    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }

}
