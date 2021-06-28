package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CarsPage;

public class CarsPageSteps {

    CarsPage carsPage = new CarsPage();

    @Then("^Fill min price (.*) and max price (.*)$")
    public void fillMinPriceAndMaxPrice(String minPrice, String maxPrice) {
        carsPage.fillMinAndMaxPrice(minPrice, maxPrice);
    }

    @And("^Fill min year (.*) and max year (.*)$")
    public void fillMinYearAndMaxYear(String minYear, String maxYear) {
        carsPage.fillMinAndMaxYear(minYear, maxYear);
    }

    @And("^Select Engine type (Benzins|Hibrids)$")
    public void selectEngineTypeBenzins(String engineType) {
        carsPage.fillEngineType(engineType);
    }

    @And("^Select gear type (Automats|Manuals)$")
    public void selectGearTypeAutomats(String gearType) {
        carsPage.fillGearShift(gearType);
    }

    @And("^Select car type (Apvidus|Kupeja|Minivens)$")
    public void selectCarTypeSedans(String carBodyType) {
        carsPage.fillModelType(carBodyType);
    }

    @And("^Select color (Balta|Bruna|Dzeltena)$")
    public void selectColorWhite(String carsColor) {
        carsPage.fillCarsColor(carsColor);
    }

    @And("Press submit button")
    public void pressSubmitButton() {
        carsPage.pressSearchButton();
    }
}
