package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

	WebDriver driver;

	//文本框
	By inputText = By.name("wd");
	//搜索按钮
	By searchButton = By.id("su");
	//下一页按钮
	By nextPage = By.xpath("//div[@id=\"page\"]/a[10]");

	public SearchResultPage(WebDriver driver){
		this.driver = driver;
	}

	//输入关键字
	public void setKeyWords(String keyWords){

		driver.findElement(inputText).sendKeys(keyWords);

	}

	//点击搜索按钮
	public void clickSearchButton(){

		driver.findElement(searchButton).click();

	}
	//获取标题
	public String getTitleText(){
		return driver.getTitle();
	}

	//翻页
	public void clickNextPage(){

		driver.findElement(nextPage).click();


	}
}
