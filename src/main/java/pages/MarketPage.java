package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MarketPage {

    @FindBy(xpath = "//li/a[text()='Электроника']")
    WebElement electronics;

    @FindBy(xpath = "//div[@class='catalog-menu__list']/a[text()='Телевизоры']")
    WebElement tv;

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void selectElectronic() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(electronics)).click();
    }

    public void selectTv(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(tv)).click();
    }
}
