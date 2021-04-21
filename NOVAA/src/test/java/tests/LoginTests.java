package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {



    @Test (priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws Exception {



        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        //*************PAGE METHODS********************
        homePage.goToTestNova();
                homePage.goToLoginPage()
                .loginToTestNova("12312312312", "123123123123")
                .verifyLoginUserName(("Hatalı kullanıcı adı veya şifre."));



    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword () throws Exception {


        //*************PAGE INSTANTIATIONS*************
             HomePage homePage = new HomePage(driver);


        //*************PAGE METHODS********************
        //homePage.goToTestNova();
               homePage.goToLoginPage()
                .loginToTestNova("","")
                .verifyLoginUserName("Lütfen kullanıcı adı ve şifre alanlarını doldurunuz.");



    }
}