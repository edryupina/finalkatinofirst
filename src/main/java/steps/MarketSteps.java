package steps;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    @Step("Выбран раздел - Электроника")
    public void stepSelectElectronic(){
        new MarketPage().selectElectronic();
    }

    @Step("Выбран раздел - Телевизоры")
    public void stepSelectTV(){
        new MarketPage().selectTv();
    }
}
