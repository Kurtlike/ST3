import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//div[@id='combspr_div_country_id']/div")
    private WebElement country;

    @FindBy(xpath="//div[@id='combspr_div_country_id']/div/input")
    private WebElement countryInput;

    @FindBy(xpath="//a[contains(text(),'Россия')]")
    private WebElement countryName;

    @FindBy(xpath="//a[contains(text(),'Санкт-Петербург')]")
    private WebElement cityName;

    @FindBy(xpath="//label[2]/div/ins")
    private WebElement sex;

    @FindBy(xpath="//div[7]/div/div/b")
    private WebElement interestsField;

    @FindBy(xpath="//a[contains(text(),'музыка')]")
    private WebElement interests;

    @FindBy(xpath="//button[contains(.,'Искать')]")
    private WebElement searchButton;
    @FindBy(xpath="//html/body/div[7]/div[3]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]/a")
    private WebElement firstPerson;
    public void setCountry() {
        country.click();
        countryInput.click();
        countryName.click();
        cityName.click();
    }
    public void setSex() {
        sex.click();
    }
    public void findSex() {
        sex.click();
        searchButton.click();
    }
    public void setInterests() {
        interestsField.click();
        interests.click();
    }
    public void findAll() {
        setCountry();
        setSex();
        setInterests();
        searchButton.click();
    }
    public void getFirst() {
        firstPerson.click();
    }
}
