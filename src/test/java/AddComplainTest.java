import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddComplainTest {
    public static ProfilePage profilePage;
    public static LoginPage loginPage;
    public static AnswerPage answerPage;
    public static WebDriver driver;
    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        answerPage = new AnswerPage(driver);
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
        profilePage.getQuestion();
        answerPage.addComplain();
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}