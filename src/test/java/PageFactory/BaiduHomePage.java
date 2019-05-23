package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaiduHomePage {

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

	public BaiduHomePage(WebDriver driver){
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
}
