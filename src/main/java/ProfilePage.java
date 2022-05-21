import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//a[contains(@href, '/questions/new')]")
    private WebElement newQuestions;

    @FindBy(xpath="//a[contains(text(),'Лента')]")
    private WebElement feed;

    @FindBy(xpath="//input")
    private WebElement searchField;

    @FindBy(xpath="//button/i")
    private WebElement searchButton;

    @FindBy(xpath="//*[@id=\"content_layout\"]/div[2]/div[1]/h1")
    private WebElement feedPlace;
    public boolean isFeedExist() {
        return feedPlace != null;
    }
    public void inputSearch(String passwd) {
        feed.sendKeys(passwd); }
    public void clickSearchBtn() {
        searchButton.click(); }
    public void clickFeed() {
        feed.click(); }
    public void getQuestion() {
        newQuestions.click(); }
}
