package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchTextBox;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//span[@dir='auto'])[3]")
    public WebElement searchResult;

}
