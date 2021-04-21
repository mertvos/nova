package tests;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    protected WebDriverWait wait;


    @BeforeClass
    public void setup () throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(1500);
        wait = new WebDriverWait(driver, 30);




    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }

}
