import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

    public PageObjectClass(SelfHealingDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "searh")
    WebElement searchBox;


    @FindBy(xpath = "//button[contains(@class,'btn-default')]")
    WebElement searchIcon;


    public void clickSearchBox(String searchWord){
        searchBox.sendKeys(searchWord);
        searchIcon.click();
    }
}
