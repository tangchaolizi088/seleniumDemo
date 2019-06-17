/**
 * Created by wangdx on 2017/11/22.
 */
import common.LogListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest {


    WebDriver driver;
    EventFiringWebDriver eventDriver;

    private String url = "http://www.baidu.com";

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) throws Exception{
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            eventDriver = new EventFiringWebDriver(driver);
        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            eventDriver = new EventFiringWebDriver(driver);
        }

        LogListener logListener = new LogListener();
        eventDriver.register(logListener);
//        eventDriver.manage().window().maximize();
        eventDriver.get(url);
        Thread.sleep(3000);
    }

    @Test
    public void testSearch() throws Exception{
        //定位百度文本框 并输入搜索关键字
        eventDriver.findElement(By.name("wd")).sendKeys("测试");
        //定位百度一下按钮，并点击
        eventDriver.findElement(By.id("su")).click();
        //等待3秒
        Thread.sleep(3000);
        //获取页面标题
        String titile = eventDriver.getTitle();
        //输出页面标题
        System.out.print("Page title is: " + eventDriver.getTitle());
        //验证页面标题中是否包含测试关键字
        Assert.assertTrue(titile.contains("测试"));
    }

    @AfterClass
    public void tearDown(){
        eventDriver.quit();
    }

}
