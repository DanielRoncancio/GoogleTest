package prueba.steps;
import prueba.pageobjects.pruebaPageObject;
import net.thucydides.core.annotations.Step;

public class pruebaSteps {

    pruebaPageObject pruebaPageObject;

    @Step
    public void openBrowser() {
        pruebaPageObject.open();

    }
    @Step
    public void typeurl(String pageURL) {
        pruebaPageObject.searchURL(pageURL);

    }
    @Step
    public void searchButton() {
        pruebaPageObject.clicButton();

    }
    @Step
    public void openFirstResult() {
        pruebaPageObject.selectFirstResult();

    }

    @Step
    public void suggestion() {
        pruebaPageObject.clicSuggeestion();
    }
}
