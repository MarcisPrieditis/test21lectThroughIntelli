package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CarsPage;
import pages.CatsPage;

import static com.codeborne.selenide.Selenide.*;

public class SelenideDemo {

    CatsPage catsPage = new CatsPage();
    CarsPage carsPage = new CarsPage();
    @Test
    public void kakeni() {
        Configuration.startMaximized =true;
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.lv");
        $(By.id("mtd_301")).scrollTo().click();

        catsPage.fillMinAgeAndMaxAge("1", "2");
        catsPage.fillMinPriceAndMaxPrice("10","1000");
        catsPage.changeRegion("Riga");
        catsPage.pressSearchButton();
        sleep(5000);
        catsPage.changeRegion("Jurmala");

    }

    @Test
    public void cars() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.lv");
        $(By.id("mtd_97")).click();
        carsPage.fillMinAndMaxPrice("500", "10000");
        carsPage.fillMinAndMaxYear("2000", "2020");
        carsPage.fillEngineType("Benzins");
        carsPage.enginePowerMinAndMax("1.0","3.0");
        carsPage.fillGearShift("Automats");
        carsPage.fillCarsColor("Balta");
        carsPage.fillModelType("Minivens");

    }

}
