package helpers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static ChromeDriver driver;

    public void startChrome() {
        String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    public void stopChrome() {
        driver.quit();
    }
}
