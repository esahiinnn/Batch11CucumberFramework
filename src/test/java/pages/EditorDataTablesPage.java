package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablesPage {

    public EditorDataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@tabindex='0'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstNameText;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastNameText;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement positionText;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement officeText;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement extensionText;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement startDateText;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement salaryText;

    @FindBy(xpath = "(//button[@tabindex='0'])[4]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "(//td[@class])[2]")
    public WebElement result;
}
