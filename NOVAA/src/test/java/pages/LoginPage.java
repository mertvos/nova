package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements*********
    By usernameBy = By.name("username");
    By passwordBy = By.name("password");
    By loginButtonBy = By.id("loginBtn");
    By errorMessageUsernameBy = By.xpath("//div[@id='root']/div/div/div/div");
    By errorMessagePasswordBy = By.xpath("//div[@id='root']/div/div/div/div");

    //*********Page Methods*********

    public LoginPage loginToTestNova (String username, String password) throws Exception{
        //Enter Username(Email)
        writeText(usernameBy,username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);
        //waitVisibility(By.xpath("//div[@id='root']/div/div/div/div"));
        return this;
    }





    //Verify Username Condition
    public LoginPage verifyLoginUserName (String expectedText) {
        assertEquals(errorMessageUsernameBy, expectedText);
        return this;
    }

    //Verify Password Condition
    public LoginPage verifyLoginPassword (String expectedText) {
        assertEquals(errorMessagePasswordBy, expectedText);
        return this;
    }
}