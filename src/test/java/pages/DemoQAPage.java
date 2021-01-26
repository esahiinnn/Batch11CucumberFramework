package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQAPage {

    public DemoQAPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@id])[12]")
    public WebElement alertsButton;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement appearInFiveSecAlert;


}
