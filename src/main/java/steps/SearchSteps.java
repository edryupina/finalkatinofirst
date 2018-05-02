package steps;
import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.Step;
import static org.junit.Assert.assertEquals;

public class SearchSteps {

    @Step("Установлен фильтр")
    public void stepSetPrice() {
        new SearchPage().filterApply();
    }

    @Step("Выполнено нажатие на кнопку - Применить")
    public void stepClickButton() {
        new SearchPage().clickButtonApply();
    }

    @Step("Выполнена проверка количества элементов на странице")
    public void stepShowTwelve(String expectedShowElements) {
        String actualShowElements = new SearchPage().showTwelve.getText();
        assertEquals(String.format("Количество элементов на странице: [%s]. Ожидалось - [%s]", actualShowElements, expectedShowElements), expectedShowElements, actualShowElements);
    }

    @Step("Выполнен поиск первого элемента")
    public void stepFirstElementSeach() {
        new SearchPage().searchFirstElement();
    }

    @Step("Выполнена проверка на соответсвие наименования товара искомому")
    public void stepComareElements() {
       String tovar =  new SearchPage().tovar.getText();
       String header = new SearchPage().headerSearch.getAttribute("value");
        assertEquals("Найденный товар не соответствует поиску",header,tovar);
    }
}
