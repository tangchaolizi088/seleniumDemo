package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by wangdx on 2019/5/23.
 */
public class SearchResultPage {

	/*
	*
	* 当前页面中的所有元素都使用@FindBy注解
	*
	* */

	WebDriver driver;

	//文本框
	@FindBy(name = "wd")
	WebElement inputText;
	//搜索按钮
	@FindBy(id = "su")
	WebElement searchButton;
	//下一页按钮
	@FindBy(xpath = "//div[@id=\"page\"]/a[10]")
	WebElement nextPage;

	public SearchResultPage(WebDriver driver){

		this.driver = driver;
		//初始化当前页面类的所有元素
		PageFactory.initElements(driver,this);
	}

	//输入关键字
	public void setKeyWords(String keyWords){

		inputText.sendKeys(keyWords);

	}

	//点击搜索按钮
	public void clickSearchButton(){

		searchButton.click();

	}
	//获取标题
	public String getTitleText(){

		return driver.getTitle();
	}

	//翻页
	public void clickNextPage(){

		nextPage.click();


	}
}
