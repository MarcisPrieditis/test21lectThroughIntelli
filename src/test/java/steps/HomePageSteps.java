package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @And("Open Homepage")
    public void openHomepage() {
        homePage.openHomePage();
    }

    @When("^Open (Dogs|Cars) tab$")
    public void openDogsTab(String tab) {
        homePage.openSpecificTab(tab);
    }
}
