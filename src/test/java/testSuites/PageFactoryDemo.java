package testSuites;

import PageFactory.BaiduHomePage;
import PageFactory.SearchResultPage;
import common.LogListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

/**
 * Created by wangdx on 2019/5/23.
 */
public class PageFactoryDemo {
	WebDriver driver;

	BaiduHomePage homePage;

	SearchResultPage resultPage;

	@BeforeClass
	public void setUp() throws Exception{
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
		driver = new EventFiringWebDriver(new InternetExplorerDriver()).register(new LogListener());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.baidu.com");
	}
	@Test
	public void testSearch() throws InterruptedException {
		//创建首页对象
		homePage = new BaiduHomePage(driver);
		//输入搜索关键字
		homePage.setKeyWords("测试");
		//点击搜索按钮
		homePage.clickSearchButton();
		//创建搜索结果页对象
		resultPage = new SearchResultPage(driver);
		Thread.sleep(3000);
		//获取搜索页标题
		String titleText = resultPage.getTitleText();
		System.out.println(titleText);
		//验证页面标题中是否包含测试关键字
		Assert.assertTrue(titleText.contains("测试"));
	}

	@AfterClass
	public void tearDown(){

		driver.quit();
	}
}
