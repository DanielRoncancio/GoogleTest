package prueba.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://www.google.com")
public class pruebaPageObject extends PageObject {


    @FindBy(xpath = "//input[@class='gLFyf gsfi' and @title='Buscar']")
    WebElementFacade browse;

    @FindBy(xpath = "//*[@value='Buscar con Google' and @type='submit']")
    WebElementFacade btnBuscar;

    @FindBy(xpath = "(//h3[contains(@class,'LC20lb')])[1]")
    WebElementFacade firstLink;

    @FindBy(xpath = "//li[@data-view-type='1' and @jsaction='click:.CLIENT;mouseover:.CLIENT'][1]")
    WebElementFacade firstSuggestion;

    public void searchURL(String pageURL) {
        browse.click();
        browse.type(pageURL);

    }

    public void clicButton() {
        btnBuscar.click();

    }

    public void selectFirstResult() {
        firstLink.click();

    }

    public void clicSuggeestion() {
        firstSuggestion.click();

    }
}
