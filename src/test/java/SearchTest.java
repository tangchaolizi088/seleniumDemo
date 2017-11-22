/**
 * Created by wangdx on 2017/11/22.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {


    WebDriver driver;
    private String url = "http://www.baidu.com";

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
    }

    @Test
    public void testSearch() throws Exception{

        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys("测试");
        element.submit();
        System.out.print("Page title is: " + driver.getTitle());
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("测试");
            }
        });
        System.out.println("Page title is: " + driver.getTitle());

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }

}
