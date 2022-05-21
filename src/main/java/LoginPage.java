import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//a[contains(text(),'Войти')]")
    private WebElement loginButton;

    @FindBy(xpath="//div[@id='signin_div']/form/div/div[2]/input")
    private WebElement loginField;

    @FindBy(xpath="//div[@id='signin_div']/form/div[2]/div[2]/input")
    private WebElement passField;

    @FindBy(xpath="//button[contains(.,'Войти')]")
    private WebElement singInButton;

    @FindBy(xpath="//*[@id=\"nav_opt_link\"]")
    private WebElement menuButton;

    public boolean isMenuExist() {
        return menuButton != null;
    }
    public void clickLoginBtn() {
        loginButton.click(); }
    public void inputLogin(String login) {
        loginField.sendKeys(login); }
    public void inputPass(String passwd) {
        passField.sendKeys(passwd); }
    public void clickSignInBtn() {
        singInButton.click(); }
}
