import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnswerPage {
    public WebDriver driver;
    public AnswerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//a[contains(text(),'Ответить')]")
    private WebElement answerButton;

    @FindBy(xpath="xpath=//textarea")
    private WebElement answerArea;

    @FindBy(xpath="//div[2]/div[4]/button")
    private WebElement addAnswerButton;

    @FindBy(xpath="//div[3]/div/div[4]/div")
    private WebElement answerDiv;

    @FindBy(xpath="//a[contains(text(),'×')]")
    private WebElement qDelButton;

    @FindBy(xpath="(//a[contains(@href, '#')])[11]")
    private WebElement addComplainButton;

    @FindBy(xpath="//button[contains(.,'Пожаловаться')]")
    private WebElement complainButton;

    public void addComplain(){
        answerDiv.click();
        addComplainButton.click();
        complainButton.click();
    }
    public void addAnswer(){
        answerButton.click();
        answerArea.sendKeys("ок");
        addAnswerButton.click();
    }
    public void deleteQuestion(){
        answerDiv.click();
        qDelButton.click();
    }
}
