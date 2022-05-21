import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProfilePage {

    public WebDriver driver;
    public TestProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="/html/body/div[7]/div[3]/div[1]/div[1]/div[2]/div/button")
    private WebElement subButton;
    @FindBy(xpath="//button[contains(.,'Отписаться')]")
    private WebElement unsubButton;
    public void subscribe() {
        subButton.click();
    }
    public void unscribe() {
        unsubButton.click();
    }
}