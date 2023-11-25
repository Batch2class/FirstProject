package testCases;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginTest extends CommonMethods {

    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.userNameBox.sendKeys(ConfigReader.getPropertiesValue("userName"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertiesValue("password"));
        loginPage.submitBtn.click();
    }
}
