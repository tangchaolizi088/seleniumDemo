/**
 * Created by wangdx on 2017/11/22.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {


    WebDriver driver;
    private String url = "http://www.baidu.com";

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
    }

    @Test
    public void testSearch() throws Exception{
        //定位百度文本框 并输入搜索关键字
        driver.findElement(By.name("wd")).sendKeys("测试");
        //定位百度一下按钮，并点击
        driver.findElement(By.id("su")).click();
        //等待3秒
        Thread.sleep(3000);
        //获取页面标题
        String titile = driver.getTitle();
        //输出页面标题
        System.out.print("Page title is: " + driver.getTitle());
        //验证页面标题中是否包含测试关键字
        Assert.assertTrue(titile.contains("测试"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
