import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class SearchTest {
    public static ProfilePage profilePage;
    public static LoginPage loginPage;
    public static SearchPage searchPage;
    public static WebDriver driver;
    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void searchTest() {
        loginPage.clickLoginBtn();
        loginPage.inputLogin("264456");
        loginPage.inputPass("kurtlike");
        loginPage.clickSignInBtn();
        profilePage.inputSearch("Александр");
        profilePage.clickSearchBtn();
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}