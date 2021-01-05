package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CrystalKeyHotelsPage {

    public CrystalKeyHotelsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement logInButtonHomePage;

    @FindBy(css = "input[type='text']")
    public WebElement usernameTextBox;

    @FindBy(css = "input[type='password']")
    public WebElement passwordTextBox;

    @FindBy(css = "input[type='submit']")
    public WebElement logInButtonLogInPage;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement managerDropDrown;

    @FindBy(xpath = "//*[text()=' Log out ']")
    public WebElement logOut;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girilemedi;

}
