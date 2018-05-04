package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    SearchSteps searchSteps = new SearchSteps();

    @When("Выбран - Маркет")
    public void stepSelectMarket() {
        mainSteps.stepSelectMarket();
    }

    @Then("Выбран раздел - Электроника")
     public void stepSelectElectronic() {     marketSteps.stepSelectElectronic();    }

     @Then("Выбран раздел - Телевизоры")
     public void stepSelectTV() {     marketSteps.stepSelectTV(); }

    @When("Выбраны настройки фильтра")
    public void stepFilterApply() {
        searchSteps.stepSetPrice();
    }

    @Then("Выполнено нажатие на кнопку - Применить")
    public void stepButtonApply() {
        searchSteps.stepClickButton();
    }

    @When("^Выполнена проверка количества элементов на странице - \"(.+)\"$")
    public void checkTitle(String showElement) {
        searchSteps.stepShowTwelve(showElement);
    }

    @Then("Найден первый элемент из списка")
    public void stepFirstElementSeach() {
        searchSteps.stepFirstElementSeach();
    }

    @When("Выполнен поиск по первому элементу")
    public void stepSearchPasteSearchFirstElement(){
        searchSteps.stepSearchPasteSearchFirstElement();
    }

    @Then("Выполнена проверка соответствия полученного товара и искомого")
    public void stepComareElements() {
        searchSteps.stepComareElements();
    }
}
