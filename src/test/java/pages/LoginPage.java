package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


    public class LoginPage extends CommonMethods {

        @FindBy(xpath = "//input[@name='name']")
        public WebElement userNameBox;

        @FindBy(id = "Psw")
        public WebElement passwordBox;

        @FindBy(xpath = "//input[@class='login']")
        public WebElement submitBtn;

        public LoginPage (){
            PageFactory.initElements(driver, this);
        }
    }

