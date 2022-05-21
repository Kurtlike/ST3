import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeedTest {
    public static ProfilePage profilePage;
    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void feedTest() {
        loginPage.clickLoginBtn();
        loginPage.inputLogin("264456");
        loginPage.inputPass("kurtlike");
        loginPage.clickSignInBtn();
        profilePage.clickFeed();
        assertTrue(profilePage.isFeedExist());
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}