import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver delegate;
    SelfHealingDriver driver;
    PageObjectClass page;

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\healenium\\HealeniumScratch\\driver\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.get("https://demo.opencart.com/");
        page = new PageObjectClass(driver);
        Thread.sleep(2000);
    }

    @AfterClass
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        page.clickSearchBox("phone");
    }
}
