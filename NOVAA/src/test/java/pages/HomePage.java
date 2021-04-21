package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//import sun.rmi.runtime.Log;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) { super(driver); }

    //*********Page Variables*********
    String baseURL = "http://10.98.42.82:32500/login";

    //*********Web Elements*********

    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToTestNova (){

            driver.get(baseURL);
            //cause of certificate problem
            //driver.findElement(By.id("details-button")).click();
            //driver.findElement(By.id("proceed-link")).click();

            return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        return new LoginPage(driver);
    }

}
