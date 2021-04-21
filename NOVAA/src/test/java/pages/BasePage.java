package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    protected WebDriverWait wait;




    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }


    //Click Method
    public void click (By elementBy) throws Exception {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();

    }

    //Write Text
    public void writeText (By elementBy, String text) throws Exception {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
        Thread.sleep(1000);
        driver.findElement(elementBy).clear();
        Thread.sleep(1000);
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);

    }
}
